package lesson35;

import java.util.ArrayList;

public class Application {

//    var v = 10; за пределами метода var нельзя использовать

    public static void main(String[] args) {
        TestVar tv = new TestVar(); //стандартное создание екземпляра класса

        //var - local variable type inference

        var testVar = new TestVar();    //Присваивание переменной ссылке tv1 new object TestVar

        var intVar = 10;    // int variable
        var floatVar = 1.6f;    //float variable
        var stringVar = "Local variable";   //String variable
        var stringNewVar = new String("New string variable");   //new String object
        var stringArray = new String[]{"a", "b"};   //new String array

//        var result = new Application().piReturn();
        var result = piReturn();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(stringVar);
        arrayList.add(stringNewVar);

        for (var v : arrayList) {
            System.out.println(v);
        }

//        var h; переменнути типа var нужно сразу присваивать значение
//        var n = null; переменной типа var нельзя присваить null - он не определен.
//        var array = {1, 2}; var не может быть создан без указанного типа массива
    }

    // boolean aBoolean(var b) {return b;} в параметрах метода нелья использвать var

    static double piReturn() {
        return 3.14;
    }
}

class TestVar {
}

/*
    Если в интерфейсе всего один абстрактный метод он считается
    функиональным интерфейсом, при этом в нем может быть сколько
    угодно default and static methods;
 */
interface TestInterface {
    void testMethod();

    default void test(){}
    default void test1(){}
    static void test2(){}
}
