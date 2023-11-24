# qa_java
QA Java Project

# Описание
Проект qa_java с Unit тестами для классов Cat.java, Animal.java, Feline.java, Lion.java
Используемые технологии: Java 11, JUnit 4, maven 3.6.3, jacoco-maven-plugin 0.8.7, mockito 5.2.0

# Проверка покрытия
Настроен pom.xml в папке target, открыть site и выбрать Файл - index.html 
нажать дважды ctrl и запустить команду - mvn clean verify 
После запуска классы будут проверены на покрытие и сформируется отчет по покрытию в папке проекта \target\site