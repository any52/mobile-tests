# Проект по автоматизации тестирования для инвестиционной компании  "Фридом Финанс"
<a target="_blank" href="https://cifra-broker.ru/">Вэб сайт "Фридом Финанс"</a>

## :pushpin: Содержание:

- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Реализованные тесты](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Интеграция с Allure TestOps](#earth_africa-Интеграция-с-Allure-TestOps)
- [Интеграция с Jira](#earth_africa-Интеграция-с-Jira)
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
</p>

## :scroll: Реализованные тесты

- ✓ Проверить ссылку на раздел "Банк" в главном меню.
- ✓ Проверить ссылку на раздел "Бизнесу" в главном меню.
- ✓ Проверить ссылку на открытие страницы логина".
- ✓ Проверить ссылку на раздел "Аналитика".
- ✓ Проверить ссылку на раздел "Тарифы".
- ✓ Проверить секцию "Контакты".
- ✓ Проверить лог консоли на отсутствие ошибок.
- ✓ Проверить ссылку на раздел "Обучение"(ручная проверка).
- ✓ Проверить ссылку на раздел "О нас"(ручная проверка).

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/017-any_mois-cifra-broker-tests/5/">Сборка в Jenkins</a>
<p align="center">
<img src="images/jenkins_job.png" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:

- BROWSER (браузер, по умолчанию chrome)
- VERSION (версия браузера, по умолчанию 100.0)
- SIZE (размер окна браузера, по умолчанию 1920x1080)
- URL (логин, пароль и адрес удаленного сервера selenoid)

## :computer: Запуск тестов из терминала

Локальный запуск:
```bash
gradle clean ui_test
```

Удаленный запуск:
```bash
clean ui_test
-Dbrowser=${BROWSER}
-Dversion=${VERSION}
-DbrowserSize=${SIZE}
-DremoteUrl=${URL}
```

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/017-any_mois-cifra-broker-tests/allure/">Allure report</a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_main.png">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/allure_tests.png">
</p>

### Гафики

<p align="center">
<img title="Allure Graphics" src="images/allure_graphics.png">
</p>

## <img src="images/Allure_EE.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/launch/19377">Allure TestOps</a>

### Дашборд

<p align="center">
<img title="Allure TestOps Dashboard" src="images/testOps_main.png">
</p>

### Тест-кейсы

<p align="center">
<img title="Allure TestOps Tests" src="images/testOps_tests.png">
</p>

## <img src="images/Jira.svg" width="25" height="25"  alt="Allure"/></a>Интеграция с трекером задач <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-543">Jira</a>

<p align="center">
<img title="Jira" src="images/jira_task.png">
</p>

## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомление в Telegram при помощи бота

<p align="center">
<img title="Allure Overview Dashboard" src="images/allure_telegram.png">
</p>

### <img src="images/Selenoid.svg" width="25" height="25"  alt="Allure"/></a> Примеры видео о прохождении тестов

<p align="center">
<img title="Selenoid Video" src="images/video1.gif" width="250" height="153"  alt="video"> 
</p>

