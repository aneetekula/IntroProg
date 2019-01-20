@ECHO OFF
title Folder Private
if EXIST "Control Panel.{21EC2020-3AEA-1069-A2DD-08002B30309D}" goto UNLOCK
if NOT EXIST Private goto MDLOCKER
:CONFIRM
echo Credits: Vibhu Gandikota is THE REAL G
echo Are you sure you want to lock the folder(Y/N)
set/p "cho=>"
if %cho%==Y goto LOCK
if %cho%==y goto LOCK
if %cho%==n goto END
if %cho%==N goto END
echo Invalid choice, Try Again...
goto CONFIRM
:LOCK
ren Private "Control Panel.{21EC2020-3AEA-1069-A2DD-08002B30309D}"
attrib +h +s "Control Panel.{21EC2020-3AEA-1069-A2DD-08002B30309D}"
echo Folder locked
echo Press 'Enter' to End Process
set/p "cho=>"
if %cho%==y goto end
goto End
:UNLOCK
echo Enter password to unlock folder
set/p "pass=>"
if NOT %pass%== nigger goto FAIL
attrib -h -s "Control Panel.{21EC2020-3AEA-1069-A2DD-08002B30309D}"
ren "Control Panel.{21EC2020-3AEA-1069-A2DD-08002B30309D}" Private
echo UNLOCKING>>???>>???
echo Press 'Enter' to End Process
set/p "cho=>"
if %cho%==y goto end
goto End
:FAIL
echo Invalid password, Try Again Later...
echo Press 'Enter' to End Process
set/p "cho=>"
if %cho%==y goto end
goto end
:MDLOCKER
md Private
echo Private created successfully
echo Press 'Enter' to End Process
set/p "cho=>"
if %cho%==y goto end
goto End
:End