<a name="readme-top"></a>
![REST Assured](stellarburgers.png)
<div align="center">
    <h3 align="center">Part I: Юнит-тесты</h3>
    <a href="http://site.mockito.org">
    </a>
    <p align="center">
        Первая часть дипломного проекта курса "qa-automation-engineer-java".
        <br/>
        <br/>
    </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#tests">Tests</a></li>
    <li><a href="#tech-stack">Tech Stack</a></li>
  </ol>
</details>

### About The Project

Необходимо покрыть тестами предлагаемые классы: Bun, Burger, Ingredient, IngredientType. Процент покрытия должен быть не ниже 70%.

### Usage

Для подготовки отчета в терминале выполнить команды `mvn clean` и `mvn verify`

### Tests
* `BaseTest` - базовый тест
* `BunTest` - тест класса Bun
* `BurgerTest` - тест класса Burger
* `IngredientTest` - тест класса Ingredient
* `DatabaseTest` - тест класса Database

### Tech Stack

[![Java11][java]][javadoc-url]
[![Mockito][mockito]][mockito-url]
[![JaCoCo][jacoco]][jacoco-url]
[![JUnit4][junit]][junit-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[javadoc-url]: https://docs.oracle.com/en/java/javase/11/docs/api/index.html
[java]: https://img.shields.io/badge/Java_11-FF2D20?style=for-the-badge&logo=openjdk&logoColor=white
[mockito-url]: https://javadoc.io/static/org.mockito/mockito-core/4.6.1/index.html
[mockito]: https://img.shields.io/badge/Mockito_5.3-78A540?style=for-the-badge&logoColor=white
[jacoco-url]: https://www.eclemma.org/jacoco/
[jacoco]: https://img.shields.io/badge/jacoco-860A00?style=for-the-badge
[junit-url]: https://junit.org/junit4/
[junit]: https://img.shields.io/badge/JUnit_4-20232A?style=for-the-badge
