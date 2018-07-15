set projectpath=D:\PullRequest\Maa
cd %projectpath%
set classpath=%projectpath%\build\classes;%projectpath%\build\libs\*
java org.testng.TestNG %projectpath%\build\resources\test\testng.xml

