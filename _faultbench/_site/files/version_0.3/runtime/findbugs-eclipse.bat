::Arguments: revision number, eclipse lib

@echo off

setlocal

set WORKSPACE=<eclipse workspace where subject will be downloaded to>
set HOME_DIR=<directory containing bat files>
set JAVA_HOME=<directory of Java 1.5 SDK>


set ECLIPSE_LIB=%2
set ECLIPSE_LIB=%ECLIPSE_LIB:"=%
echo %ECLIPSE_LIB%


::FindBugs
set FINDBUGS_HOME=<directory containing FindBugs>

call %FINDBUGS_HOME%\bin\findbugs.bat -textui -effort:max -low -xml:withMessages -output alerts\%1-org.eclipse.core.runtime-alerts.xml %ECLIPSE_LIB% %WORKSPACE%\org.eclipse.core.runtime
