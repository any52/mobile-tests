# Проект по автоматизации мобильного тестирования  "Wikipedia"

## :pushpin: Содержание:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные тесты](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Интеграция с Allure TestOps](#earth_africa-Интеграция-с-Allure-TestOps)
- [Отчет в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

## :rocket: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://developer.android.com/studio/"><img alt="Android Studio" height="50" src="images/AndroidStudio.svg" width="50"/></a>
<a href="https://appium.io/"><img alt="Appium" height="50" src="images/Appium.svg" width="50"/></a>
<a href="https://https//www.browserstack.com/"><img alt="Browserstack" height="50" src="images/Browserstack.svg" width="50"/></a>
</p>

## :scroll: Реализованные тесты

- ✓ Checking 'java' in search of Wikipedia.
- ✓ Checking 'About' in settings.
- ✓ Checking com.browserstack.Sample.
- ✓ Checking onboarding screen.

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/017-any_mois-mobile-tests-unit21/16/">Сборка в Jenkins</a>
<p align="center">
<img src="images/jenkins_job.png" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

- PLATFORM (android или ios - для выбора платформы и запуска соответствующих тестов)

## :computer: Запуск тестов из терминала

Локальный запуск:
```bash
gradle clean emulator -Denv=emulator
gradle clean android -Denv=android
gradle clean ios -Denv=ios
```

Удаленный запуск:
```bash
clean ${PLATFORM} -Denv=${PLATFORM}
```
где PLATFORM принимает значение android или ios


## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/017-any_mois-mobile-tests-unit21/16/allure/">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.png">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/allure_tests.png">
</p>


## <img src="images/Allure_EE.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/22486">Allure TestOps</a>

### Дашборд

<p align="center">
<img title="Allure TestOps Dashboard" src="images/testOps_main.png">
</p>

### Тест-кейсы

<p align="center">
<img title="Allure TestOps Tests" src="images/testOps_tests.png">
</p>

## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_telegram.png">
</p>

### <img src="images/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Примеры видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video1.gif" width="250" height="153"  alt="video"> 
</p>

