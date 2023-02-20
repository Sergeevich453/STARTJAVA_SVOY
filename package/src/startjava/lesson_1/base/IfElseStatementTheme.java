package src.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String [] args) {
        System.out.println("\n\t" + "ЗАДАНИЕ 1 \nПеревод псевдокода на язык Java\n");
        String name = "Ilya";
        int age = 39;
        boolean gender = true;
        double height = 1.82;
        int firstLetterName = name.charAt(0);
        if (age < 20) {
            System.out.println("Возрастом младше 20 лет и составляет: " + age + " лет");
        } else {
            System.out.println("Возрастом старше 20 лет и составляет: " + age + " лет");
        }
        if (!gender) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }
        if (height < 1.8) {
            System.out.println("Ростом ниже 1 метр 80 см, а именно: " + height + " метра");
        } else {
            System.out.println("Ростом выше 1 метр 80 см, а именно: " + height + " метра");
        }
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается на букву 'M': " + name);
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается на букву 'I': " + name);
        } else {
            System.out.println("Имя не начинается на буквы 'M' и 'I': " + name);
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 2 \nПоиск max и min числа\n");
        int num1 = 47;
        int num2 = 49;
        System.out.println("Первое число: " + num1 + "\nВторое число: " + num2);
        if (num1 < num2) {
            System.out.println("Максимальным из чисел является второе число: " + num2);
        } else if (num1 > num2) {
            System.out.println("Максимальным из чисел является первое число: " + num1);
        } else {
            System.out.println("Числа равны: " + num1 + " = " + num2);
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 3 \nРабота с числом\n");
        num1 = -77;
        if (num1 == 0) {
            System.out.println("Заданное число равно: " + num1);
        } else {
            if (num1 % 2 == 0) {
                System.out.println("Заданное число: " + num1 + " четное");
            } else {
                System.out.println("Заданное число: " + num1 + " нечетное");
            }
            if (num1 > 0) {
                System.out.println("Заданное число: " + num1 + " положительное");
            } else {
                System.out.println("Заданное число: " + num1 + " отрицательное");
            }
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 4 \nПоиск одинаковых цифр в числах\n");
        num1 = 658;
        num2 = 103;
        String noRegister = "";
        int hundredsRegister = 0;
        int tensRegister = 0;
        int onesRegister = 0;
        int hundred1 = num1 / 100;
        int ten1 = num1 / 10 % 10;
        int one1 = num1 % 10;
        int hundred2 = num2 / 100;
        int ten2 = num2 / 10 % 10;
        int one2 = num2 % 10;
        System.out.println("Исходные числа: " + hundred1 + " " + ten1 + " " + one1 + "\n\t\t" + hundred2
                + " " + ten2 + " " + one2);
        System.out.print("Одинаковые в них цифры: ");
        if (hundred1 == hundred2) {
            hundredsRegister = 1;
            System.out.print(hundred2 + "; ");
        }
        if (ten1 == ten2) {
            tensRegister = 2;
            System.out.print(ten2 + "; ");
        }
        if (one1 == one2) {
            onesRegister = 3;
            System.out.print(one2 + "; ");
        }
        if ((hundred1 != hundred2) && (ten1 != ten2) && (one1 != one2)) {
            noRegister = "совпадений нет";
            System.out.print(noRegister);
        }
        System.out.println("\nРегистры совпавших чисел: " + hundredsRegister + " " + tensRegister + " "
                + onesRegister + " " + noRegister);

        System.out.println("\n\n\t" + "ЗАДАНИЕ 5 \nОпределение буквы, числа или символа по их коду\n");
        char someSymbol = '\u0057';
        System.out.println("Символ кода: " + someSymbol);
        if (someSymbol >= 'A' && someSymbol <= 'Z') {
            System.out.println("Заглавная буква");
        } else if (someSymbol >= 'a' && someSymbol <= 'z') {
            System.out.println("Прописная буква");
        } else if (someSymbol >= '0' && someSymbol <= '9') {
            System.out.println("Число");
        } else {
            System.out.println("Не буква и не число");
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 6 \nОпределение суммы вклада и начисленных банком %\n");
        double deposit = 300001;
        double percent = 0.0;
        if (deposit < 100000) {
            percent = 5;
        } else if (deposit <= 300000) {
            percent = 7;
        } else if (deposit > 300000) {
            percent = 10.8;
        }
        double accruedInterest = (percent / 100)*deposit;
        System.out.println("Сумма вклада: " + deposit + "\nСумма начисления " + percent
                + "% процентов, составляет: " + (float) accruedInterest + "\nИтоговая сумма: "
                + (deposit + accruedInterest));

        System.out.println("\n\t" + "ЗАДАНИЕ 7 \nОпределение оценки по предметам\n");
        int historyPercent = 86;
        int historyPoints = 0; 
        int programmingPercent = 91;
        int programmingPoints = 0; 
        if (historyPercent <= 60) {
            historyPoints = 2;
        } else if (historyPercent <= 72) {
            historyPoints = 3;
        } else if (historyPercent <= 90) {
            historyPoints = 4;
        } else if (historyPercent <=100) {
            historyPoints = 5;
        } else{
            System.out.println("Процент введен некорректно");
        }
        if (programmingPercent <= 60) {
            programmingPoints = 2;
        } else if (programmingPercent <= 72) {
            programmingPoints = 3;
        } else if (programmingPercent <= 90) {
            programmingPoints = 4;
        } else if (programmingPercent <= 100) {
            programmingPoints = 5;
        } else {
            System.out.println("Процент введен некорректно");
        }
        System.out.println(historyPoints + " - Оценка по истории; " + "\n" + programmingPoints
                + " - Оценка по программированию;" + "\n" + ((historyPoints + programmingPoints) / 2)
                + " - Средний балл оценок по предметам;" + "\n" + ((historyPercent + programmingPercent) / 2)
                + " - Средний процент по предметам;");

        System.out.println("\n\t" + "ЗАДАНИЕ 8 \nРасчет прибыли\n");
        int rent = 5000;
        int costPrice = 9000;
        int income = 3000;
        int profitYear = (income - (costPrice + rent))*12;
        if (profitYear > 0) {
            System.out.println("Прибыль за год: +" + profitYear);
        } else {
            System.out.println("Прибыль за год: " + profitYear);
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 9 \nПодсчет количества банкнот\n");
        int sumATM = 567;
        int hundredDollars = 100;
        int tensDollars = 10;
        int unitsDollars = 1;
        int banknotesHundred = 0;
        int banknotesTens = 50;
        int banknotesUnits = 0;
        int requiredHundred = 0; 
        int requiredTens = 0;
        int requiredUnits = 0;
        int requiredHundredOstatoc = 0;
        int requiredTensOstatoc = 0;
        int requiredUnitsOstatoc = 0;
        int dobavitTens = 0;
        int dobavitUnits = 0;
        System.out.println("Номиналы банкнот в банкомате: " + "\n" + hundredDollars + " долларов;" + "\n"
                + tensDollars + " долларов;" + "\n" + unitsDollars + " доллар;");
        //Разбиваем на сотни, десятки, единицы
        int hundred = sumATM / 100 * 100;
        int tens = (sumATM - hundred ) / 10 * 10;
        int units = sumATM - hundred - tens;
        //проверка остатка при нехватке купюр
        if (hundred * banknotesHundred == banknotesHundred) {
            requiredHundred = hundred / 100;
        } else {
            requiredHundred = banknotesHundred / 100;
            requiredHundredOstatoc = hundred - banknotesHundred;
            tens = tens + requiredHundredOstatoc;
        }
        if (tens * banknotesTens == banknotesTens) {
            requiredTens = tens / 10;
        } else {
            requiredTens = banknotesTens / 10;
            requiredTensOstatoc = tens - banknotesTens;
            units = units + requiredTensOstatoc; 
        }
        if (units * banknotesUnits == banknotesUnits) {
            requiredUnits = units / 1;
        } else {
            requiredUnits = banknotesUnits / 1;
            requiredUnitsOstatoc = units - banknotesUnits;
        }
        // проведем проверку правильности выданных сумм банкоматом
        if (sumATM == ((requiredHundred * 100) + (requiredTens * 10) + requiredUnits)) {
                System.out.println("Банкомат выдал запрошенную сумму корректно: " + sumATM + " долларов"
                + "\nВыданные купюры номиналом 100 долларов: " + requiredHundred
                + "\nВыданные купюры номиналом 10 долларов: " + requiredTens
                + "\nВыданные купюры номиналом 1 доллар: " + requiredUnits);
        } else {
            System.out.println("Банкомат выдал сумму некорректно: \nЗапрошено: " + sumATM + "\nВыдано: "
                    + ((requiredHundred * 100) + (requiredTens * 10) + requiredUnits));
        }
    }
}
