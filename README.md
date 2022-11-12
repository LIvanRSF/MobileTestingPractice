<h2 align="center">Automated tests for the Wikipedia mobile app <a target="_blank" href="https://www.wikipedia.org/"></a> </h2>

<p align="center">
<img title="Wikipedia" src="images/screenshots/WikipediaLogo.png">
</p>

<a name="up"></a>

# :green_book: *Content*

+ [Technology stack](#Technology)
+ [Test cases](#TestCases)
+ [Jenkins build](#Jenkins)
+ [Launch from the terminal](#SystemProperty)
+ [Appium](#Appium)
+ [Android Studio. Mobile device emulator](#AndroidStudio)
+ [Allure Report integration](#AllureReport)
+ [Notifications on Telegram](#Telegram)
+ [Video examples from Browserstack](#Browserstack)



<h1 align="left">
<a name="Technology"><i>Technology stack</i></a>
</h1>


<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/technologies/intelij_idea.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/technologies/java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/technologies/github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/technologies/junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/technologies/gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/technologies/selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/technologies/allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://github.com/appium/appium-inspector/raw/main/docs/icon.png"><img src="images/technologies/AppiumInspectorIcon.png" width="50" height="50"  alt="Appium Inspector"/></a>  
<a href="https://avatars.githubusercontent.com/u/3221291?s=200&v=4"><img src="images/technologies/Appium.svg" width="50" height="50"  alt="Appium"/></a>  
<a href="https://cdn.worldvectorlogo.com/logos/android-studio-1.svg"><img src="images/technologies/android-studio-1.svg" width="50" height="50"  alt="AndroidStudio"/></a>  
<a href="https://www.jenkins.io/"><img src="images/technologies/jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
</p>


<h1 align="left">
<a name="TestCases"><i>Test cases</i></a>
</h1>

- :white_check_mark: Check search functional
- :white_check_mark: Check search of exact article
- :white_check_mark: Check exact article header

<h1 align="left">
<img src="images/technologies/jenkins.svg" width="25" height="25" alt="Jenkins"/>  <a name="Jenkins"><i>Jenkins build</i></a>
</h1>

<a target="_blank" href="https://jenkins.autotests.cloud/job/MobilePracticeWithRealDevice/1/">**build link**</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/qa_guru_diplom_Mobile_tests/"><img src="images/screenshots/JenkinsMobileTestsBuild.png" alt="Jenkins"/></a>  
</p>

<h1 align="left">
<img src="images/technologies/terminale.png" width="25" height="25" alt="SystemProperty"/><a name="SystemProperty"><i>Launch from the terminal</i></a>
</h1>


***Local run:***

```bash  
gradle clean androidTests -DdeviceHost=${DEVICE_HOST}
```

***Remote run with Jenkins:***

```bash  
clean androidTests -DdeviceHost=${DEVICE_HOST}
```
> `${DEVICE_HOST}` - test run device [ *browserstack* , *emulator* , *real*  ]

<a id="appium"></a>
## <img alt="Appium" height="50" src="images/technologies/Appium.svg" width="50"/>Appium</a>

> *Appium is an open source test automation framework for use with native, hybrid and mobile web apps.*

### *Appium Server*
<img src="images/screenshots/AppiumServer.png" alt="Appium">

### *Appium Inspector*
<img src="images/screenshots/AppiumInspector.png" alt="Appium">

<a id="AndroidStudio"></a>
## <img alt="AndroidStudio" height="50" src="images/technologies/android-studio-1.svg" width="50"/>AndroidStudio</a>

> *Mobile emulator*

<img src="images/screenshots/AndroidStudioMain.png" alt="Appium">

<h1 align="left">
<img src="images/technologies/allure.svg" width="25" height="25" alt="Allure_Report"/>  <a name="AllureReport"><i>Allure Report integration</i></a>
</h1>

<a target="_blank" href="https://jenkins.autotests.cloud/job/MobilePracticeWithRealDevice/1/allure/">**Allure report link**</a>
<p align="center">

### *Main page*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/AllureReportMainPage.png">  
</p>  

### *Test cases*

<p align="center">  
<img title="Allure Tests" src="images/screenshots/AllureReportTestSuits.png">  
</p>

### *Graphs*

 <p align="center">  
<img title="Allure Graphics" src="images/screenshots/AllureReportGraphs.png">  
</p>

<h1 align="left">
<img src="images/technologies/telegram.svg" width="25" height="25"  alt="Allure"/> <a name="Telegram"><i>Telegram notifications with Alert bot</i></a>
</h1>

<p align="center">  
<img title="Telegram notification" src="images/screenshots/TelegrammReport.png">  
</p>

<h1 align="left">
<img src="images/technologies/Browserstack.png" width="25" height="25" alt="Browserstack"/> <a name="Browserstack"><i>Test run on Browserstack</i></a>
</h1>

### *Video*

<p align="center"> 
<img title="Browserstack Video" src="images/gif/BrowserStackVideoTest.gif" width="450" height="450"  alt="video">   
</p>

### *Statistics*

 <p align="center">  
<img title="BrowserStack Graphics" src="images/screenshots/BrowserStackWikiGraphs.png">  
</p>

 <p align="center">  
<img title="BrowserStack Graphics" src="images/screenshots/BrowserStackWiki.png">  
</p>

[Up ⬆](#up)


