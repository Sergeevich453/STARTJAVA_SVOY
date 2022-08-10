public class VeriablesTheme {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ № 1 \nСоздание переменных и вывод их значений на консоль\n");
        String name = "My computer";
        byte core = 8;
        short hdd = 68;
        long byt = 72_865_644_374L;
        int folder = 130739;
        float file = 430071.0F;
        double life = 6.2;
        char os = 'W';
        boolean my = true;
            System.out.println("Представляю вам: " + name + "\n" + "И он действительно мой: " + my + "\n" + "Его характеристики: " + "\n" + "Количество ядер: " + core + "\n" + "Емкость HDD: " + hdd + "\n" + "Емкость HDD в байтах: " + byt + "\n" + "Количество папок на HDD: " + folder + "\n" + "Количество файлов во всех папках: " + file + "\n" + "ОС: " + os + "\n" + "Срок службы устройства: " + life + " года");
            
                System.out.println("");
                System.out.println("\t" + "ЗАДАНИЕ № 2 \nРасчет стоимости товара со скидкой\n");
                int productX = 100;
                int productY = 200;
                double discount = 0.11;
                double sum = (productX * discount) + (productY * discount);
                double cost = ((productX + productY) - sum);
                    System.out.println("Сумма скидки на оба товара составляет: " + sum + " рубля" + "\n" + "Общая стоимость товаров со скидкой составляет: " + cost + " рубля");
                    
                    System.out.println("");
                    System.out.println("\t" + "ЗАДАНИЕ 3 \nВывод на консоль слова JAVA\n");
                    System.out.println("   J    a  v     v  a" + "\n"  + "   J   a a  v   v  a a" + "\n" + "J  J  aaaaa  V V  aaaaa" + "\n" +" JJ  a     a  V  a     a");
                        
                        System.out.println("");
                        System.out.println("\t" + "ЗАДАНИЕ 4 \nОтображение min и max значений числовых типов данных\n");
                        byte a = 127;
                        byte a1 = ++a;
                        byte a2 = --a;
                        short b = 32767;
                        int c = 2147483647;
                        long d = 9223372036854775807L;
                        System.out.println(a + " " + a1 + " " + a2 + "\n" + b + " " + (++b) + " " + (--b) + "\n" + c + " " + (++c) + " " + " " + (--c) + "\n" + d + " " + (++d) + " " + (--d));
                            
                            System.out.println("");
                            System.out.println("\t" + "ЗАДАНИЕ 5 \nПерестановка значений переменных\n");
                            double e = 1.1;
                            double f = 2.2;
                            double g;
                            double e1;
                            double f1;
                            g = e;
                            e = f;
                            f = g;
                            System.out.println("Перестановка с помощью третьей переменной: " + "\n" + "Исходное значение переменных: " + g + " и " + e + "\n" + "Новое значение переменных: " + e + " и " + f);

                            System.out.println("");
                            System.out.println("Исходные значения переменных: " + e + " " + f);
                            e = e + f;
                            f = e - f;
                            e = e - f;
                            System.out.println("\n" + "Перестановка с помощью арифметической операции:" + "\n" + "Новое значение переменных: " + e + " " + f);
                            System.out.println("");
                            System.out.println("Исходные значения переменных: " + e + " " + f);
                            e = e - f;
                            f = e + f;
                            e = f - e;
                            System.out.println("");
                            System.out.println("\n" + "Перестановка с помощью побитовой операции вариант 1: " + e + " " + f);
                            System.out.println("");
                            System.out.println("исходной значение числа e: " + e);
                            System.out.println("исходной значение числа f: " + f);
                            double o = 1;
                            double v = 1;
                            o = e%o;
                            v = f%v;
                            System.out.println("остаток дробной части от e: " + o + "\n" + "остаток дробной части от f: " + v);
                            int h = (int)e;
                            int k = (int)f;
                            
                            //System.out.println("Исходные значения переменных: " + h + " " + k);
                            h = h ^ k;
                            k = h ^ k;
                            h = h ^ k;
                            System.out.println("");
                            System.out.println("\n" + "Перестановка с помощью побитовой операции вариант 2: " + " значение числа e: " + (h + v) + " значение числа f: " + (k + o)); //ХАЛТУРА СОБСТВЕННОЙ ПЕРСОНЫ :-)))
                                
                                System.out.println("");
                                System.out.println("\t" + "ЗАДАНИЕ 6 \nВывод символов и их кодов\n");
                                int num1 = 35;
                                int num2 = 38;
                                int num3 = 64;
                                int num4 = 94;
                                int num5 = 95;
                                System.out.println("код символа: " + num1 + " символ данного кода: " + (char)num1 + "\nкод символа: " + num2 + " символ данного кода: " + (char)num2 + "\nкод символа: " + num3 + " символ данного кода: " + (char)num3 + "\nкод символа: " + num4 + " символ данного кода: " + (char)num4 + "\nкод символа: " + num5 + " символ данного кода: " + (char)num5);
                                    System.out.println("");
                                    System.out.println("\t" + "ЗАДАНИЕ 7 \nПроизведение и сумма цифр числа\n");
                                    int total = 345;
                                    int digit1 = total / 100;
                                    int digit2 = total / 10 % 10;
                                    int digit3 = total % 10;
                                    System.out.println("Сумма цифр числа " + total + " = " + (digit1 + digit2+ digit3) + "\nПроизведение цифр числа " + total + " = " + (digit1*digit2*digit3));
                                    
                                    System.out.println("");
                                    System.out.println("\t" + "ЗАДАНИЕ 8 \nВывод на консоль ASCII-арт Дюка\n");
                                    char duke0 = 32; // " "
                                    char duke1 = 40; // (
                                    char duke2 = 41; // )
                                    char duke3 = 47; // /
                                    char duke4 = 92; // \
                                    char duke5 = 95; // _
                                    System.out.println("\n"+ duke0 + duke0 + duke0 + duke0 + duke0 + duke3 + duke4 + "\n"+ duke0 + duke0 + duke0 + duke0 + duke3 + duke0 + duke0 + duke4 + "\n"+ duke0 + duke0 + duke0 + duke3 + duke5 + duke1 + duke0 + duke2 + duke4 + "\n" + duke0 + duke0 + duke3 + duke0 + duke0 + duke0 + duke0 + duke0 + duke0 + duke4 + "\n" + duke0 + duke3 + duke5 + duke5 + duke5 + duke5 + duke3 + duke4 + duke5 + duke5 + duke4);

                                        System.out.println("");
                                        System.out.println("\t" + "ЗАДАНИЕ 9 \nОтображение количества сотен, десятков и единиц числа\n");
                                        int total1 = 123;
                                        int digit4 = total1 / 100;
                                        int digit5 = total1 / 10 % 10;
                                        int digit6 = total1 % 10;
                                        System.out.println("Число " + total1 + " содержит: \n" + digit4 + " сотен\n" + digit5 + " десятков\n" + digit6 + " единиц");

                                        System.out.println("");
                                        System.out.println("\t" + "ЗАДАНИЕ 10 \nПреобразование секунд\n");
                                        int total2 = 86399;
                                        int common = 60;
                                        int minutes1 = (total2 / common) % common;
                                        int hour1 = total2 / common / common;
                                        int second1 = total2 % common;
                                        System.out.println( hour1 + ":" + minutes1  + ":" + second1);
    }
}