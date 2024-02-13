

package package1.src.startjava.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ № 1 \nСоздание переменных и вывод их значений на консоль\n");
        String name = "My computer";
        byte core = 8;
        short hdd = 68;
        long bytes = 72_865_644_374L;
        int countFolder = 130739;
        float countFile = 430071.0F;
        double serviceLife = 6.2;
        char os = 'W';
        boolean my = true;
        System.out.println("Представляю вам: " + name + "\n" + "И он действительно мой: " + my + "\n"
                + "Его характеристики: " + "\n" + "Количество ядер: " + core + "\n" + "Емкость HDD: " + hdd
                + "\n" + "Емкость HDD в байтах: " + bytes + "\n" + "Количество папок на HDD: " + countFolder
                + "\n" + "Количество файлов во всех папках: " + countFile + "\n" + "ОС: " + os + "\n"
                + "Срок службы устройства: " + serviceLife + " года");

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ № 2 \nРасчет стоимости товара со скидкой\n");
        int bookPrice = 100;
        int penPrice = 200;
        double discount = 0.11;
        double sum = (bookPrice + penPrice) * discount;
        double discountPrice = ((bookPrice + penPrice) - sum);
        System.out.println("Сумма скидки на оба товара составляет: " + sum + " рубля" + "\n"
                + "Общая стоимость товаров со скидкой составляет: " + discountPrice + " рубля");

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 3 \nВывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a" + "\n"  + "   J   a a  v   v  a a" + 
                "\n" + "J  J  aaaaa  V V  aaaaa" + "\n" +" JJ  a     a  V  a     a");

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 4 \nОтображение min и max значений числовых типов данных\n");
        byte byteMax = 127;
        short sortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("byte первоначальное значение: " + byteMax + "\nЗначение после инкремента: "
                + (++byteMax) + "\nЗначение после декремента: " + (--byteMax));
        System.out.println("\n" + "short первоначальное значение: " + sortMax + 
            "\nЗначение после инкремента: " + (++sortMax) + "\nЗначение после декремента: " + (--sortMax));
        System.out.println("\n" + "int первоначальное значение: " + intMax + "\nЗначение после инкремента: "
                + (++intMax) + "\nЗначение после декремента: " + (--intMax));
        System.out.println("\n" + "long первоначальное значение: " + longMax + "\nЗначение после инкремента: "
                + (++longMax) + "\nЗначение после декремента: " + (--longMax));

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 5 \nПерестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        int tmp = num1;
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Исходное значение переменных: " + num1 + " и " + num2);
        num1 = num2;
        num2 = tmp;
        System.out.println("Измененное значение переменных: " + num1 + " и " + num2);
        System.out.println("\n" + "Перестановка с помощью арифметической операции");
        System.out.println("Исходное значение переменных: " + num1 + " и " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Измененное значение переменных: " + num1 + " и " + num2);
        System.out.println("\n" + "Перестановка с помощью побитовой операции");
        System.out.println("Исходное значение переменных: " + num1 + " и " + num2);
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("Измененное значение переменных: " + num1 + " и " + num2);
        
        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 6 \nВывод символов и их кодов\n");
        int codeChar1 = 35;
        int codeChar2 = 38;
        int codeChar3 = 64;
        int codeChar4 = 94;
        int codeChar5 = 95;
        System.out.println("код символа: " + codeChar1 + " символ данного кода: " + (char) codeChar1
                + "\nкод символа: " + codeChar2 + " символ данного кода: " + (char) codeChar2
                + "\nкод символа: " + codeChar3 + " символ данного кода: " + (char) codeChar3
                + "\nкод символа: " + codeChar4 + " символ данного кода: " + (char) codeChar4
                + "\nкод символа: " + codeChar5 + " символ данного кода: " + (char) codeChar5);

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 7 \nПроизведение и сумма цифр числа\n");
        int srcNum = 345;
        int digit1 = srcNum / 100;
        int digit2 = srcNum / 10 % 10;
        int digit3 = srcNum % 10;
        System.out.println("Сумма цифр числа " + srcNum + " = " + (digit1 + digit2 + digit3) 
                + "\nПроизведение цифр числа " + srcNum + " = " + (digit1 * digit2 * digit3));

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 8 \nВывод на консоль ASCII-арт Дюка\n");
        char space = ' ';
        char leftBracket = '(';
        char rightBracket = ')';
        char slash = '/';
        char backslash = '\\';
        char underlining = '_';
        System.out.println("\n"+ space + space + space + space + space + slash + backslash
                + "\n"+ space + space + space + space + slash + space + space + backslash
                + "\n"+ space + space + space + slash + underlining + leftBracket + space + rightBracket
                + backslash + "\n" + space + space + slash + space + space + space + space + space + space
                + backslash + "\n" + space + slash + underlining + underlining + underlining + underlining
                + slash + backslash + underlining + underlining + backslash);

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 9 \nОтображение количества сотен, десятков и единиц числа\n");
        srcNum = 123;
        int digit4 = srcNum / 100;
        int digit5 = srcNum / 10 % 10;
        int digit6 = srcNum % 10;
        System.out.println("Число " + srcNum + " содержит: \n" + digit4 + " сотен\n" + digit5 + " десятков\n"
                + digit6 + " единиц");

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 10 \nПреобразование секунд\n");
        int srcSeconds = 86399;
        int minutes = (srcSeconds / 60) % 60;
        int hour = srcSeconds / 60 / 60;
        int second = srcSeconds % 60;
        System.out.println(hour + ":" + minutes  + ":" + second);
    }
}
