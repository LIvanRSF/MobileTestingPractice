<h2 align="center">Проект по мобильной автоматизации для приложения Wikipedia <a target="_blank" href="https://www.wikipedia.org/"></a> </h2>

<p align="center">
<img title="Wikipedia" src="images/screenshots/WikipediaLogo.png">
</p>

<a name="наверх"></a>

# :green_book: *Содержание*

+ [Технологии и инструменты](#Technology)
+ [Автоматизированные тест кейсы](#TestCases)
+ [Запуск тестов в Jenkins](#Jenkins)
+ [Команды для запуска из терминала](#SystemProperty)
+ [Отчет о результатах тестирования в Allure Report](#AllureReport)
+ [Уведомление в Telegram при помощи Alert bot](#Telegram)
+ [Выполнение теста на Browserstack](#Browserstack)

<h1 align="left">
<a name="Technology"><i>Технологии и инструменты</i></a>
</h1>


<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/technologies/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/technologies/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/technologies/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/technologies/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/technologies/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/technologies/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://github.com/appium/appium-inspector/raw/main/docs/icon.png"><img src="images/technologies/AppiumInspectorIcon.png" width="50" height="50"  alt="Appium Inspector"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/technologies/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://avatars.githubusercontent.com/u/3221291?s=200&v=4"><img src="images/technologies/Appium.svg" width="50" height="50"  alt="Appium"/></a>  
<a href="https://cdn.worldvectorlogo.com/logos/android-studio-1.svg"><img src="images/technologies/android-studio-1.svg" width="50" height="50"  alt="AndroidStudio"/></a>  
<a href="https://www.jenkins.io/"><img src="images/technologies/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
</p>


<h1 align="left">
<a name="TestCases"><i>Автоматизированные тест кейсы</i></a>
</h1>

- :white_check_mark: Проверка функционала поиска в Wikipedia
- :white_check_mark: Проверка поиска определенной статьи в приложении
- :white_check_mark: Проверка наличия определенного заголовка в статье

<h1 align="left">
<img src="images/technologies/Jenkins.svg" width="25" height="25" alt="Jenkins"/>  <a name="Jenkins"><i>Запуск тестов в Jenkins</i></a>
</h1>

<a target="_blank" href="https://jenkins.autotests.cloud/job/MobilePracticeWithRealDevice/1/">**Сборка в Jenkins**</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/qa_guru_diplom_Mobile_tests/"><img src="images/screenshots/JenkinsMobileTestsBuild.png" alt="Jenkins"/></a>  
</p>

<h1 align="left">
<img src="images/technologies/terminale.png" width="25" height="25" alt="SystemProperty"/><a name="SystemProperty"><i>Команды для запуска из терминала</i></a>
</h1>


***Локальный запуск:***

```bash  
gradle clean androidTests -DdeviceHost=${DEVICE_HOST}
```

***Удалённый запуск через Jenkins:***

```bash  
clean androidTests -DdeviceHost=${DEVICE_HOST}
```
> `${DEVICE_HOST}` - устройство для прогона тестов [ *browserstack* , *emulator* , *real*  ]

<a id="appium"></a>
## <img alt="Appium" height="50" src="images/technologies/appium.svg" width="50"/>Appium</a>

> *Обеспечение прогона автотестов на эмуляторе или реальном устройстве*

### *Appium Server*
<img src="images/screenshots/AppiumServer.png" alt="Appium">

### *Appium Inspector*
<img src="images/screenshots/AppiumInspector.png" alt="Appium">

<a id="AndroidStudio"></a>
## <img alt="AndroidStudio" height="50" src="images/technologies/android-studio-1.svg" width="50"/>AndroidStudio</a>

> *Эмулятор мобильных устройств*

<img src="images/screenshots/AndroidStudioMain.png" alt="Appium">

<h1 align="left">
<img src="images/technologies/Allure.svg" width="25" height="25" alt="Allure_Report"/>  <a name="AllureReport"><i>Отчет о результатах тестирования в Allure</i></a>
</h1>

<a target="_blank" href="https://jenkins.autotests.cloud/job/MobilePracticeWithRealDevice/1/allure/">**Allure отчёт в Jenkins**</a>
<p align="center">

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/AllureReportMainPage.png">  
</p>  

### *Тест кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshots/AllureReportTestSuits.png">  
</p>

### *Графики*

 <p align="center">  
<img title="Allure Graphics" src="images/screenshots/AllureReportGraphs.png">  
</p>

<h1 align="left">
<img src="images/technologies/Telegram.svg" width="25" height="25"  alt="Allure"/> <a name="Telegram"><i>Уведомление в Telegram при помощи Alert bot</i></a>
</h1>

<p align="center">  
<img title="Telegram notification" src="images/screenshots/TelegrammReport.png">  
</p>

<h1 align="left">
<img src="images/technologies/browserstack.png" width="25" height="25" alt="Browserstack"/> <a name="Browserstack"><i>Пример выполнения теста на Browserstack</i></a>
</h1>

### *Видео*

<p align="center"> 
<img title="Browserstack Video" src="images/gif/BrowserStackVideoTest.gif" width="450" height="450"  alt="video">   
</p>

### *Инфостатистика*

 <p align="center">  
<img title="BrowserStack Graphics" src="images/screenshots/BrowserStackWikiGraphs.png">  
</p>

 <p align="center">  
<img title="BrowserStack Graphics" src="images/screenshots/BrowserStackWiki.png">  
</p>

[Наверх ⬆](#наверх)


