package Lesson1__1;

public class FirstApp {

    public static void main(String[] args) {

        System.out.println("Hello Java");
        System.out.println("Hello Java");

        int name = 10;
        float fValue = 14.56f;
        double doubleValue = 34.78695;
        long lValue = 149958L;
        int b = 100 + name;
        System.out.println("b = " + b);

        int v1 = 23;
        int v2 = 63;
        boolean result = v1>v2; // если v1>v2 то result = true
        System.out.println(result);

        info();
        info();

        //double doubleValue = 34.78695f; //смотри сноску ниже
        /*
        если в тип double  добавить в конце числа букву f то тип лонг превратится в тип флоат, аналогисно работает и
        с  long -> int
         */

        /*
        при приведении типов данных к одному типу происходит выбор в пользу более широкого типа, если тип не указан
        разработчиком явно: double + float = double
         */

        //2 типа данных - ссылочные(живут в куче в в в п) и примитивные(живут в стеке во время выполнения программы)
        //примитивные - числа и флажки, ссылочные - обьекты
        /*
        Числовые типы данных
        byte -128 -127
        short -2^15...2^15-1
        int -2^31...2^31-1 2(32)
        long 2^64
        Типы данных с плавающей запятой:
        float 2^32
        double 2^64
        булевы типы данных:
        boolean true or false - flags
        Символьный тип данных:
        char - один символ таблицы аски
        */

        /*JVM - JAVA VIRTUAL MACHINE - позволяет компилировать кросплатфомренный код,
        осуществляя принцип пиши один раз, запускай где угодно
        JRE - JAVA RUNTIME ENVIROMENT - СРКДСТВО ДЛЯ ЗАПУСКА ДЖАВА ПРИЛОЖЕНИЙ, СОДЕРЖИТ
        в себе JVM

        Но, разработчику нужен JDK - JAVA DEVELOPMENT KIT - в отличие от джре содержит в себе компилятор

        джава компилирует программу в байт код, этот код нужен для джвм, а джвм интерпретирует код(
         превращает его в нули и единицы) и выполняет его




         Создание репозитория:
         1. клик create new repository  в гите
         2. клик code, копируем ссылку
         3. идея - file - new project from version control -  вставляем ссылку в url - clone
         4/  ниже project  папка с названием нашего проекта -  add framework support - maven галочка  - ok - add file to
         git? - ok
         5. pom.xml - maven - reimport
         6. дописать в maven :
         <properties>

        <maven.compiler.sourse>20</maven.compiler.sourse>
        <maven.compiler.target>20</maven.compiler.target>
        </properties>
        в правом верхнем углу появляется кнопка М - нажать на нее, либо снова сделать реимпорт в мавене
        Чтобы узнать версию джавы - нажимаем на название проекта -  open module settings - project -

        7. в правом верхнем углу есть зеленая галочка(commit) нужно кликнуть на нее. В поле commit message пишем
        комментарий(название комментария) и нажимаем commit and push(залив на гитхаб) - в вылезшем окне еще раз
        жмем push
        8. в гите появляется файл pom.xml
        9. В идее внизу слева есть значок веточек master - new branch(новая ветка)  - пишем название lesson1-1 или что
        то вроде того - create. По итогу master меняется на lesson1-1
        10. синяя папка java - создает new package - называем так же lesson1-1\

        11. После написание кода нужно залитьновые изменения в гит, для этого нажимаем commit слева вверху зеленая
        галочка -> сommit and push -> сommit and push -> push
        12. In github -> compare and pull request -> create pull request
        13. копируем ссылку из URL и скидываем ее человеку который ментор чтобы у него была возможность писать
        комментарии
        14. rewiew changes -> aprove -> merge pull request(наша ветка которую мы ввели попадает в ветку мастера)

        15. Чтобы посмотреть ветку мастера нужно нажать на ветку внизу справа -> master -> checkout
        16. теперь чтобы вернуть изменения нужно нажать вверху Git -> pull...


         Если не горит run - клик название мэйна - run

         закончил смотреть видео на 1.53

         */

    }

    public static void info(){
        System.out.println("I am a function and myself get to display");
    }


}
