@echo off

setlocal

::PRECONDITION: have run the csv updated for the history to increment minute
for /f "tokens=1-3 delims=," %%a in (eclipse_history_25_fixed.csv) do call downloader-eclipse.bat %%a %%b %%c >> main-eclipse.txt 2>&1