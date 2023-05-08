<!-- PROJECT LOGO -->
<a name="readme-top"></a>
<div align="center">

![REST Assured](stellarburgers.png)

</div>
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

## About The Project
Необходимо покрыть тестами предлагаемые классы: Bun, Burger, Ingredient, IngredientType. Процент покрытия должен быть не ниже 70%.

## Usage
Для подготовки отчета выполнить команды 
```
mvn clean verify
```

## Tests
* `BaseTest` - базовый тест
* `BunTest` - тест класса Bun
* `BurgerTest` - тест класса Burger
* `IngredientTest` - тест класса Ingredient
* `DatabaseTest` - тест класса Database

## Tech Stack
[![Java11][java]][javadoc-url]
[![JUnit4][junit]][junit-url]
[![Mockito][mockito]][mockito-url]
[![JaCoCo][jacoco]][jacoco-url]
[![Git][git]][git-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[javadoc-url]: https://docs.oracle.com/en/java/javase/11/docs/api/index.html
[java]: https://img.shields.io/badge/Java_11-FF2D20?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAOCAYAAAAfSC3RAAABEklEQVQokY3RvSv3URgG8M8RSQbvFCaZEGVhUSabDJIyiUEy+AueMvkjTPZnIyuTREopixhEiqe8JG895atTR33j+/vlqtN9Xq6r676vIyLLslJrNMuyrvzbFyqUxwJ6ihjlhNOowm4Rr5RwBkvYwSSqfyMcSS1uojnV198Ip3CNIdzipqilIKWaQz3m8IR5DOdMPkIIPxyjYBkd+Itn7KMbA/iD2S9yZU7YlOZrxyFacJre3jGBM6wXtdqAcTygFf+xgUWcYzuE8O+7Y8Q9+tCIl0SOia6WCmclOa2lFAfjNR6xl7K4jCmHEN7ywvgFY6jFMe5Qg070p/MWTkIIR0Uz9qIt7evSnLHGWQ9wEUK4gk/GbGLgemy9KAAAAABJRU5ErkJggg==

[mockito-url]: https://javadoc.io/static/org.mockito/mockito-core/4.6.1/index.html
[mockito]: https://img.shields.io/badge/Mockito_5.3-78A540?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAOCAYAAAAfSC3RAAACO0lEQVQokZ2R3WtSARjGHz1zmnryc5tzH2mWNilrI4p5M4KQFtRlVBeDaOyqi13E/oMgGs2KNsibBhVtFBEbFBRUCEMvSseQlvkRlTmnpzOPejxnes5OLNIb73ou3/f58b4Pjwz/NHd7HmVVBGtM5KDBqHrxW2RDhGdgQlqqYXH6iVPo3yf0nPGlfwUCf4G2BsjrPuEbnZ9kOdavLSpxWON9PmoYg+qKEsGF8HnSaolm3gcdAN7u+psXJ9+dvV4OM9OQ9mLqkr/qtLsqAEzxr6lqNk9lFJJUX3j8dH42cM+/65c3QCbGDGnq3bgx/gxOu0sNoBMAkUymySJFDZQqNc/duTtcw98E2bTtsrndd7OrU9MYgd4sQ+Bl2MjRMOp1IAiZsrFrZhw8dg5um8Mein/AVikP3/ELKNbLkOsJDB84CWuvBRsUM9QCapk89ih0yuW1+2jbMcNtH8Gj0Az6jPsx4vQiS+cg3yGIlldj6nUEvyzXSVEPg8aGWy+vYSX5Cu0EgWjiNbJ0BHWxkmsBQ8oEBNJEd5BHkK+mUNoSISVMyLEfkeHWQaq7YCItyZZXJ+QX0W3sSxYUcXS3uyFFSRwdFGA18iAlFzy9XkCsh1szHhoGt70dPeXwIBh5AxhSuDoxBb7CosxxYFh2VSbwqy1gj1gGz1dDWll/YXx0rCN+4geoUgU60gwzKUMx+/Nhjas1q2pKkiSIoojFpaXTK7HYZ1aQSnRVZL9vFuhoKjH7gKIwwzb7/08B+ANeWPJtT8rjXAAAAABJRU5ErkJggg==

[Git]: https://img.shields.io/badge/Git-F44D27?style=for-the-badge&logo=git&logoColor=white
[Git-url]: https://git-scm.com/

[jacoco-url]: https://www.eclemma.org/jacoco/
[jacoco]: https://img.shields.io/badge/jacoco-7A2D27?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAOCAYAAAAfSC3RAAABwklEQVQokZ2SPWsUURSGn/m4k5mdzBp1JYW4YqIQcEGwUhAEtY4QFLv8ABG0WBALEf+GjWUabYIIrijKagxYKMYq6CJxm0XXrBkzm/m4c2WuExOiVV64h3Mv9zmH88FuZRRc9/5x5Y+fwnNHdJgwiglEyuKbB5y9s27sjG0Y5VO/dUP1lFLzHyP1aGld/VKlXs2q9l2z8Nh+CpmFiTOJEUFFruLmq+i8UZ8wqXHmwiWe3XbUzqx2YTLTI8tgECU60tzzZS6ePox38jqYBuf9qX86ocE4t9gjJJOjFaqZjfTA+WmSu3XWAlhJ6zT+B3p+jU/vP9O8d42Fo2NMKOhIycTQ4Up3hIMbazzhsYplTjsMdX80GGWSAwOPhRNP4TJ0vgF7obMEU9N1ZtXK30znGo1tNWYGZlFcDBR/CnAA9CByHQbDP9dq0c083wI3lIUvgQqwH0iBMeA7VJJcuxYwujn4TTDNoBvE0KrBhyEkHogcwn20jgV8SSYxHYFwXcJy+Br80e9xZHqcd7deEySCzAYrB2lLvh6yWH77kKszTU3cLDdHg+2X87QXX+C4frlSCmXaCMvCES5VkcJMc9d7vSXgNwVhsXM+Jl0iAAAAAElFTkSuQmCC

[junit-url]: https://junit.org/junit4/
[junit]: https://img.shields.io/badge/JUnit_4-282C36?style=for-the-badge&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAOCAYAAAAfSC3RAAABKGlDQ1BBcHBsZSBSR0IAACiRlY89S8NQFIaf24qCQxEJbsLFQVzEj61j0pYiONQokmRrkksVbXK5uX508k/4IxxcHAX9BxUHwcmf4CaIg4NDhAwFi8/0nPfA4T1QW3PbXqe2AMPMGr/rySCM5Nwzs9QBoJ8U2u31dgGyPFNM8PmKAHhZd9teZ3L/J/OJNhb4BrZTVSQgNoH0wmoL4hpw4hNtQdwAjjnwWyAegMag9DHQiEt/AxomCCMQ74AzCMIIagBOXLoDOFZdWoBWrkfmeHBk5Vaz2ZRumsdK7o8Kq4aF3MmS3Ojc9K1KgbJf2dvV+lRJv+v98+FpBGEkS/vYQwBiaVxlFcmZOf9VIZ6mz9WN0SO4PszcV9nhF9xuwHK9ylZXYPEK7vQP8cBQPfXa6rwAAAAJcEhZcwAALiMAAC4jAXilP3YAAAcfaVRYdFhNTDpjb20uYWRvYmUueG1wAAAAAAA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA2LjAtYzAwMiAxMTYuMTY0NzY2LCAyMDIxLzAyLzE5LTIzOjEwOjA3ICAgICAgICAiPiA8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPiA8cmRmOkRlc2NyaXB0aW9uIHJkZjphYm91dD0iIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtbG5zOmRjPSJodHRwOi8vcHVybC5vcmcvZGMvZWxlbWVudHMvMS4xLyIgeG1sbnM6cGhvdG9zaG9wPSJodHRwOi8vbnMuYWRvYmUuY29tL3Bob3Rvc2hvcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RFdnQ9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZUV2ZW50IyIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgMjEuMiAoV2luZG93cykiIHhtcDpDcmVhdGVEYXRlPSIyMDIwLTA3LTE2VDExOjEyOjExKzAyOjAwIiB4bXA6TW9kaWZ5RGF0ZT0iMjAyMy0wNS0wOFQxMzo0NzowNyswMzowMCIgeG1wOk1ldGFkYXRhRGF0ZT0iMjAyMy0wNS0wOFQxMzo0NzowNyswMzowMCIgZGM6Zm9ybWF0PSJpbWFnZS9wbmciIHBob3Rvc2hvcDpDb2xvck1vZGU9IjMiIHBob3Rvc2hvcDpJQ0NQcm9maWxlPSJBcHBsZSBSR0IiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6YmNlMjUxZDMtYTU2Yi1jMTQxLWJlY2QtMzliZGQ3YTVkMjAwIiB4bXBNTTpEb2N1bWVudElEPSJhZG9iZTpkb2NpZDpwaG90b3Nob3A6NWE0ODY2Y2YtZjE5NS01ZTQ5LWI4NTEtZTdkMmFiNjFlZTVmIiB4bXBNTTpPcmlnaW5hbERvY3VtZW50SUQ9InhtcC5kaWQ6MjAyMjA3OWUtNjhkZi0wMTRlLTk2ZjEtYzY5Yjk0ZDJhZmFhIj4gPHhtcE1NOkhpc3Rvcnk+IDxyZGY6U2VxPiA8cmRmOmxpIHN0RXZ0OmFjdGlvbj0iY3JlYXRlZCIgc3RFdnQ6aW5zdGFuY2VJRD0ieG1wLmlpZDoyMDIyMDc5ZS02OGRmLTAxNGUtOTZmMS1jNjliOTRkMmFmYWEiIHN0RXZ0OndoZW49IjIwMjAtMDctMTZUMTE6MTI6MTErMDI6MDAiIHN0RXZ0OnNvZnR3YXJlQWdlbnQ9IkFkb2JlIFBob3Rvc2hvcCAyMS4yIChXaW5kb3dzKSIvPiA8cmRmOmxpIHN0RXZ0OmFjdGlvbj0iY29udmVydGVkIiBzdEV2dDpwYXJhbWV0ZXJzPSJmcm9tIGFwcGxpY2F0aW9uL3ZuZC5hZG9iZS5waG90b3Nob3AgdG8gaW1hZ2UvcG5nIi8+IDxyZGY6bGkgc3RFdnQ6YWN0aW9uPSJzYXZlZCIgc3RFdnQ6aW5zdGFuY2VJRD0ieG1wLmlpZDozN2ExNjM4Mi1hYWI4LThjNDgtYWMxZi1jZDIxOGI0Y2NjYjAiIHN0RXZ0OndoZW49IjIwMjAtMDctMTdUMTI6MDg6MzcrMDI6MDAiIHN0RXZ0OnNvZnR3YXJlQWdlbnQ9IkFkb2JlIFBob3Rvc2hvcCAyMS4yIChXaW5kb3dzKSIgc3RFdnQ6Y2hhbmdlZD0iLyIvPiA8cmRmOmxpIHN0RXZ0OmFjdGlvbj0ic2F2ZWQiIHN0RXZ0Omluc3RhbmNlSUQ9InhtcC5paWQ6YmNlMjUxZDMtYTU2Yi1jMTQxLWJlY2QtMzliZGQ3YTVkMjAwIiBzdEV2dDp3aGVuPSIyMDIzLTA1LTA4VDEzOjQ3OjA3KzAzOjAwIiBzdEV2dDpzb2Z0d2FyZUFnZW50PSJBZG9iZSBQaG90b3Nob3AgMjEuMiAoV2luZG93cykiIHN0RXZ0OmNoYW5nZWQ9Ii8iLz4gPC9yZGY6U2VxPiA8L3htcE1NOkhpc3Rvcnk+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+rgL30gAAAe1JREFUKJF1kktoE1EYhb9773TyahjQVG1Q0lopaIvLEjeuTdSC1U0RXLjQhY8goouCEaKtiAgWRFyKiAtBRfCJG12JOxcKotGmndRHoE0b85xkZlyEyDTgWZ+Pw/nPL7ITSbq0OWw5R8ywNnowucEB8UF33LtAwWuSXdBNwFRaz7T1pzQ5v2Qebrqta0rI38D0/8B3wAmhFMWfC/QPbeft8TvEghGKjTLAFPCiG7wBxAGcSgU74Cc2lWG3P4qh+WnYzY5/D5DugANACkAoRSP3nY2pc4hAEMo1XKUQa+tcAHZK4EA7W2LlTYzkOEZyP4tnT0IogJDdZ0AD9kpgFMC1LHBdopeuUrg1Sz37BQS4rtsNAgxKb1p/+jL1z58wz5xHBYIAfF39QbFeQlc9a0gJfLSLy4TG4hiJfQipGH71nE1XrgPwZnyGoyMJ5kq/vNycBB4LpSGkYuXRA6y8idB9ONUKAKVmjbrdRIl/XVvAM5GdSCKUNuvUKqetxTxCKezVFXqHdzDw9DXb7h/jWyHHSN9WrPYsF4GMBuDarZTQfWO+waE4gFatYfWt5+H8eyJ+g2o40oFeAplOx4520X45evUAy7USh56kWSgXMPQQwAyQ8G7i1Sngtu04k5rUtsTWRV0gZzvOPSDrNf4FFAGtvY6aedYAAAAASUVORK5CYII=