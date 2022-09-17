package lesson16;

public class App {
    public static void main(String[] args) {

        String s1 = new String("Hello String"); //всегда создает новый объект
        
        String s2 = new String("Good by String");

        String s3 = new String("Good by String"); //новый объек хоть и значение такое же как и s2

        String s4 = "Hello"; // создаеться объект в стринг пул

        String s5 = "Hello"; // S5 ссылается на тот же объект что и S4 в стринг пуле

        String s6 = new String("Privet");

        int s6length = s6.length(); //Метод length возвращает количество символов 
        System.out.println(s6length);

        char c1 = s6.charAt(3); // charAt возвращает символ по индексу
        System.out.println(c1);

        int i1 = s6.indexOf('t'); //выводит индекс на котором находится искомый символ
        System.out.println(i1);
        
        int i2 = s6.indexOf("vet"); //выводит индекс первого символа искомой части строки
        System.out.println(i2);

        String s7 = new String("abcdabcd");
        int i3 = s7.indexOf("a", 2); //начиная со 2 индекса проверяет строку и выводит индекс искомого символа
        System.out.println(i3);

        boolean b1 = s7.startsWith("abc"); //возвращает тру т.к. s7 начинается с abc
        System.out.println(b1);
                                        //startsWith and endsWith принимают только строку

        boolean b2 = s7.endsWith("abc"); //возвращает фолс т.к. s7 не заканчивается на abc
        System.out.println(b2);

        String s8substring = new String("asdfaasldfjkjal");

        String ss1 = s8substring.substring(7); //возвращает часть строки с указанного индекса
        System.out.println(ss1);

        String ss2 = s8substring.substring(4, 8); //возвращает часть строки с 4 символа не включая 8 индекса
        System.out.println(ss2);

        String t1 = new String("    alskf   a  ls  jdf     ");
        String t2 = t1.trim();  // убирает все пробелы по краям строки и возвращает новую строку
        System.out.println(t2);

        String r1 = new String("Privet");
        String rep1 = r1.replace('i', 'U'); // возвращает новую строку с измененным чаром
        System.out.println(rep1);
        String rep2 = r1.replace("iv", "OV"); // возвращает новую строку с изменной частью строки
        System.out.println(rep2);

        String con1 = "Privet, ";
        String con2 = "drug";
        System.out.println(con1.concat(con2)); //Стандартный метод конктенации обычно используеться знак "+" 
        System.out.println(con1 + con2); // результат будет тем же

        /*
         * int a = 8;
         * String s = a + 5;
         * Данный пример приводит к ошибке компиляции
         */

         
    }
}
