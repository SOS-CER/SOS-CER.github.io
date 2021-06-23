::Arguments: revision number, revision date, revision time

@echo off

setlocal

set SERVER_NAME=:pserver:anonymous@dev.eclipse.org:/cvsroot/eclipse
set WORKSPACE=<eclipse workspace where subject will be downloaded to>
set HOME_DIR=<directory containing bat files>
set JAVA_HOME=<directory of Java 1.5 SDK>
set BUILD_STATUS=pass

::PRECONDITION: Have WORKSPACE created 

::Get data out of CVS and store in local directory
::PRECONDITION: Have cvs.exe under C:\
::PRECONDITION: Already logged into CVS repo with HOME set to C:\
echo Downloading projects from CVS for revision %1 on %2 %3
cd %WORKSPACE%
C:\cvs -d %SERVER_NAME% co -D "%2 %3" platform-runtime > cvs-eclipse.out 2>&1
C:\cvs -d %SERVER_NAME% co -D "%2 %3" org.eclipse.core.runtime.compatibility.auth > cvs-eclipse.out 2>&1
C:\cvs -d %SERVER_NAME% co -D "%2 %3" org.eclipse.equinox.app > cvs-eclipse.out 2>&1
C:\cvs -d %SERVER_NAME% co -D "%2 %3" org.apache.xerces > cvs-eclipse.out 2>&1
C:\cvs -d %SERVER_NAME% co -D "%2 %3" org.eclipse.core.boot > cvs-eclipse.out 2>&1

::Check projects exist - if they don't create them and add the .project file
if not exist org.eclipse.core.contenttype\.project echo contenttype && mkdir org.eclipse.core.contenttype & copy %HOME_DIR%\files\org.eclipse.core.contenttype.project org.eclipse.core.contenttype\.project

if not exist org.eclipse.core.expressions\.project echo expressions && mkdir org.eclipse.core.expressions & copy %HOME_DIR%\files\org.eclipse.core.expressions.project org.eclipse.core.expressions\.project

if not exist org.eclipse.core.jobs\.project echo jobs && mkdir org.eclipse.core.jobs & copy %HOME_DIR%\files\org.eclipse.core.jobs.project org.eclipse.core.jobs\.project

if not exist org.eclipse.core.runtime\.project echo runtime && mkdir org.eclipse.core.runtime & copy %HOME_DIR%\files\org.eclipse.core.runtime.project org.eclipse.core.runtime\.project

if not exist org.eclipse.core.runtime.compatibility\.project echo compatibility & mkdir org.eclipse.core.runtime.compatibility && copy %HOME_DIR%\files\org.eclipse.core.runtime.compatibility.project org.eclipse.core.runtime.compatibility\.project

if not exist org.eclipse.core.variables\.project echo variables && mkdir org.eclipse.core.variables & copy %HOME_DIR%\files\org.eclipse.core.variables.project org.eclipse.core.variables\.project

if not exist org.eclipse.equinox.common\.project echo common && mkdir org.eclipse.equinox.common & copy %HOME_DIR%\files\org.eclipse.equinox.common.project org.eclipse.equinox.common\.project

if not exist org.eclipse.equinox.preferences\.project echo preferences && mkdir org.eclipse.equinox.preferences & copy %HOME_DIR%\files\org.eclipse.equinox.preferences.project org.eclipse.equinox.preferences\.project

if not exist org.eclipse.equinox.registry\.project echo registry && mkdir org.eclipse.equinox.registry & copy %HOME_DIR%\files\org.eclipse.equinox.registry.project org.eclipse.equinox.registry\.project

if not exist org.eclipse.equinox.supplement\.project echo supplement && mkdir org.eclipse.equinox.supplement & copy %HOME_DIR%\files\org.eclipse.equinox.supplement.project org.eclipse.equinox.supplement\.project

if not exist org.eclipse.osgi\.project echo osgi && mkdir org.eclipse.osgi & copy %HOME_DIR%\files\org.eclipse.osgi.project org.eclipse.osgi\.project

if not exist org.eclipse.osgi.services\.project echo services && mkdir org.eclipse.osgi.services & copy %HOME_DIR%\files\org.eclipse.osgi.services.project org.eclipse.osgi.services\.project

if not exist org.eclipse.osgi.util\.project echo util && mkdir org.eclipse.osgi.util & copy %HOME_DIR%\files\org.eclipse.osgi.util.project org.eclipse.osgi.util\.project

if not exist org.eclipse.core.runtime.compatibility.auth\.project echo auth & mkdir org.eclipse.core.runtime.compatibility.auth && copy %HOME_DIR%\files\org.eclipse.core.runtime.compatibility.auth.project org.eclipse.core.runtime.compatibility.auth\.project

if not exist org.eclipse.equinox.app\.project echo app && mkdir org.eclipse.equinox.app & copy %HOME_DIR%\files\org.eclipse.equinox.app.project org.eclipse.equinox.app\.project

if not exist org.apache.xerces\.project echo xerces && mkdir org.apache.xerces & copy %HOME_DIR%\files\org.apache.xerces.project org.apache.xerces\.project

if not exist org.eclipse.core.boot\.project echo boot && mkdir org.eclipse.core.boot & copy %HOME_DIR%\files\org.eclipse.core.boot.project org.eclipse.core.boot\.project

echo Done downloading projects
cd %HOME_DIR%

::Build projects
:: get path to equinox jar inside ECLIPSEHOME folder
set ECLIPSEHOME=C:\eclipse-3311
set VMARGS="-Xmx256m"
for /f "delims= tokens=1" %%c in ('dir /B /S /OD %ECLIPSEHOME%\plugins\org.eclipse.equinox.launcher_*.jar') do set EQUINOXJAR=%%c
 
:: start Eclipse w/ java
:build
echo Using %EQUINOXJAR% to start up Eclipse...
::org.eclipse.equinox.launcher.win32.win32.x86_1.0.2.R331_v20071019
::org.eclipse.equinox.launcher_1.0.1.R33x_v20070828.jar
java %VMARGS% -jar %EQUINOXJAR% -noupdate -application org.eclipse.ant.core.antRunner -data %WORKSPACE% -file eclipse_build.xml -Djavacfailonerror=true

if not exist "%WORKSPACE%\org.eclipse.core.runtime\bin" goto error

set TEMPCP=%CLASSPATH%

set CLASSPATH=C:\javancss29.50\lib\javancss.jar;C:\javancss29.50\lib\ccl.jar;C:\javancss29.50\lib\jhbasic.jar

:metrics
echo Starting metrics...
call C:\javancss29.50\bin\javancss -all -xml -out metrics\%1-org.eclipse.core.runtime-metrics.xml -recursive %WORKSPACE%\org.eclipse.core.runtime\src > eclipse-metrics-%1.out 2>&1
find "ParseException" eclipse-metrics-%1.out

if ERRORLEVEL ==0 set BUILD_STATUS=fail
if ERRORLEVEL ==1 set BUILD_STATUS=pass

if %BUILD_STATUS%==pass goto findbugs

:old_metrics
echo Starting metrics old...
call C:\javancss-21.41\bin\javancss -all -xml -out metrics\%1-org.eclipse.core.runtime-metrics.xml -recursive %WORKSPACE%\org.eclipse.core.runtime\src > eclipse-metrics-%1.out 2>&1

del eclipse-metrics-%1.out

:findbugs
set CLASSPATH=%TEMPCP%

cd bin
java edu.ncsu.csc.realsearch.collector.main.EclipseClassPathGenerator %1
cd ..

echo Calling FindBugs...
for /f "usebackq tokens=1 delims=" %%a in (classpath\%1-eclipse-classpath.txt) do call findbugs-eclipse.bat %1 %%a 
::call findbugs-eclipse.bat %1 

goto success

:error
echo %DATE% %TIME% %1 FAIL >> collector-eclipse.txt 
goto end

:success
echo %DATE% %TIME% %1 PASS >> collector-eclipse.txt
goto end

:end
echo Deleting projects...
cd bin
java edu.ncsu.csc.realsearch.collector.main.DeleteProjects
cd ..