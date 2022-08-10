public class IfElseStatementTheme{
    public static void main(String [] args){
        System.out.println("\t" + "ЗАДАНИЕ 1 \nПеревод псевдокода на язык Java\n");
        String name = "Ilya";
        int age = 39;
        String gender = "мужской";
        double height = 1.82;
        int firstLetterName;
        if( age < 20 ){
            System.out.println("Возрастом младше 20 лет и составляет: " + age + " лет");
        } else{
            System.out.println("Возрастом старше 20 лет и составляет: " + age + " лет");
        }if( gender != "мужской" ){
            System.out.println("Пол женский");
        }
        if( height < 1.8 ){
            System.out.println("Ростом ниже 1 метр 80 см, а именно: " + height + " метра");
        } else{
            System.out.println("Ростом выше 1 метр 80 см, а именно: " + height + " метра");
        }
        firstLetterName = name.charAt(0);
        if( firstLetterName == 'M'){
            System.out.println("Имя начинается на букву 'M': " + name);
        } else if( firstLetterName == 'I'){
            System.out.println("Имя начинается на букву 'I': " + name);
        } else{
            System.out.println("Имя не начинается на буквы 'M' и 'I': " + name);
        }

            System.out.println("");
            System.out.println("\t" + "ЗАДАНИЕ 2 \nПоиск max и min числа\n");
            int number1 = 47;
            int number2 = 47;
                System.out.println("Первое число: " + number1 + "\nВторое число: " + number2);
            if( number1 < number2 ){
                System.out.println("Максимальным из чисел является второе число: " + number2);
            } else if( number1 > number2 ){
                    System.out.println("Максимальным из чисел является первое число: " + number1);
            } else{
                    System.out.println("Числа равны: " + number1 + " = " + number2);

                System.out.println("");
                System.out.println("\t" + "ЗАДАНИЕ 3 \nРабота с числом\n");
                double number = 46;
                if(number == 0){
                
                } else if( number%2 == 0){
                    System.out.println("Заданное число: " + number + " четное");
                } else if( number%2 != 0){
                    System.out.println("Заданное число: " + number + " нечетное");
                } else{} 
                if( number > 0){
                    System.out.println("Заданное число: " + number + " положительное");
                }  else if( number < 0){
                    System.out.println("Заданное число: " + number + " отрицательное");
                } else{}
                }

                    System.out.println("");
                    System.out.println("\t" + "ЗАДАНИЕ 4 \nПоиск одинаковых цифр в числах\n");
                    int num = 658;
                    int num1 = 638;
                    int numNumber1 = num/100;
                    int numNumber2 = num/10%10;
                    int numNumber3 = num%10;
                    int num1Number1 = num1/100;
                    int num1Number2 = num1/10%10;
                    int num1Number3 = num1%10;
                    System.out.println(numNumber1 + " " + numNumber2 + " " + numNumber3 + "\n" + num1Number1 + " " + num1Number2 + " " + num1Number3);
                    switch(1) {
                    case 1:
                        if(numNumber1 == num1Number1 ){
                        int equality1 = num1Number1;
                        System.out.println("Совпавшая цифра из первого регистра заданных чисел: " + num1Number1);
                        };
                    case 2:
                        if(numNumber2 == num1Number2 ){
                        int equality2 = num1Number2;
                        System.out.println("Совпавшая цифра из второго регистра заданных чисел: " + num1Number2);
                        };
                    case 3:
                        if(numNumber3 == num1Number3 ){
                        int equality3 = num1Number3;
                        System.out.println("Совпавшая цифра из третьего регистра заданных чисел: " + num1Number3);
                        }; break;
                    default: System.out.println("совпадений нет "); break;
                    }

                        System.out.println("");
                        System.out.println("\t" + "ЗАДАНИЕ 5 \nОпределение буквы, числа или символа по их коду\n");
                        char letter = '\u0057';
                        switch(1){
                        case 1:
                            System.out.println(letter);
                        case 2:
                            if ( letter >= 65  & letter <= 90){
                            System.out.println("Заглавная буква");
                            } else if ( letter >= 97  & letter <= 122){
                            System.out.println("Прописная буква");
                            };
                        case 3:
                            if ( letter >= 48  & letter <= 57){
                            System.out.println("Цифра");
                            } else {}
                        case 4:
                            if( (letter >= 0 & letter <= 31) || (letter >= 32 & letter <= 42) || (letter >= 58  & letter <= 64) || (letter >= 91  & letter <= 96) || (letter >= 123  & letter <= 1000)){
                                System.out.println("Не является цифрой и буквой");
                            }
                        default: break;
                        }

                            System.out.println("");
                            System.out.println("\t" + "ЗАДАНИЕ 6 \nОпределение суммы вклада и начисленных банком %\n");
                            double deposit = 307000;
                            if( deposit < 100_000 ){
                                double percent1 = 5;
                                double accruedInterest = ((percent1/100)*deposit);
                                System.out.println("Сумма вклада: " + deposit + "\nНачисленный процент : " + accruedInterest + "\nИтоговая сумма: " + (deposit + accruedInterest));
                            } else if ( deposit >= 100_000 & deposit <= 300_000 ){
                                double percent2 = 7;
                                double accruedInterest = ((percent2/100)*deposit);
                                System.out.println("Сумма вклада: " + deposit + "\nНачисленный процент : " + accruedInterest + "\nИтоговая сумма: " + (deposit + accruedInterest));
                            } else if ( deposit > 300_000 ){
                                double percent3 = 10;
                                double accruedInterest = ((percent3/100)*deposit);
                                System.out.println("Сумма вклада: " + deposit + "\nНачисленный процент : " + accruedInterest + "\nИтоговая сумма: " + (deposit + accruedInterest));
                            }

                            System.out.println("");
                            System.out.println("\t" + "ЗАДАНИЕ 7 \nОпределение оценки по предметам\n");
                            int historyPercent = 59;
                            int historyPoints = 0; // Баллы
                            int programmingPercent = 91;
                            int programmingPoints = 0; // Балл 

                            if( historyPercent >= 0 & historyPercent <= 60 ){
                                historyPoints = 2;     
                            } else if( historyPercent > 60 ){
                                historyPoints = 3;
                            } else if( historyPercent > 73 ){
                                historyPoints = 4;
                            } else if( historyPercent > 91 & historyPercent <=100 ){
                                historyPoints = 5;
                            } else{
                                System.out.println("Процент введен некорректно");
                            }
                            
                              if( programmingPercent >= 0 & programmingPercent <= 60 ){
                                programmingPoints = 2;
                            } else if( programmingPercent > 60 ){
                                programmingPoints = 3;
                            } else if( programmingPercent > 73 ){
                                programmingPoints = 4;
                            } else if( programmingPercent > 91 & programmingPercent <=100 ){
                                programmingPoints = 5;
                            } else{
                                System.out.println("Процент введен некорректно");
                            }
                            System.out.println(historyPoints + " Оценка по истории\n" + programmingPoints + " Оценка по программированию" + 
                            "\nСредний балл оценок по предметам: " + (( historyPoints + programmingPoints ) / 2) + "\nСредний процент по предметам: " 
                                    + ((historyPercent + programmingPercent) / 2));

                                System.out.println("");
                                System.out.println("\t" + "ЗАДАНИЕ 8 \nРасчет прибыли\n");
                                double rent = 5000;
                                double costPrice = 9000;
                                double incomeMax = 16000;
                                double incomeMin = 12000;
                                double income1 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income2 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income3 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income4 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income5 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income6 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income7 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income8 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income9 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income10 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income11 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double income12 =(Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
                                double profitMonth1 = income1-(costPrice + rent);
                                double profitMonth2 = income2-(costPrice + rent);
                                double profitMonth3 = income3-(costPrice + rent);
                                double profitMonth4 = income4-(costPrice + rent);
                                double profitMonth5 = income5-(costPrice + rent);
                                double profitMonth6 = income6-(costPrice + rent);
                                double profitMonth7 = income7-(costPrice + rent);
                                double profitMonth8 = income8-(costPrice + rent);
                                double profitMonth9 = income9-(costPrice + rent);
                                double profitMonth10 = income10-(costPrice + rent);
                                double profitMonth11 = income11-(costPrice + rent);
                                double profitMonth12 = income12-(costPrice + rent);
                                double profitYear = (profitMonth1 + profitMonth2 + profitMonth3 + profitMonth4 + profitMonth5 + profitMonth6 + profitMonth7 + profitMonth8 + profitMonth9 + profitMonth10 + profitMonth11 + profitMonth12)/12;
                                if(profitYear > 0){
                                    System.out.println("Прибыль за год: +" + (int)profitYear);
                                } else {
                                    System.out.println("Прибыль за год: " + (int)profitYear);
                                }

                                    System.out.println("");
                                    System.out.println("\t" + "ЗАДАНИЕ 9 \nПодсчет количества банкнот\n");
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
                                    System.out.println("Номиналы банкнот в банкомате: " + "\n" + hundredDollars + " долларов;" + "\n" + tensDollars + " долларов;" + "\n" + unitsDollars + " доллар;");
                                    //Разбиваем на сотни, десятки, единицы
                                    int hundred = sumATM / 100 *100;
                                    int tens = (sumATM - hundred ) / 10 * 10;
                                    int units = sumATM - hundred - tens;
                                    //проверка остатка при нехватке купюр
                                    if(hundred * banknotesHundred == banknotesHundred){
                                        requiredHundred = hundred / 100;
                                    }else{
                                        requiredHundred = banknotesHundred / 100;
                                        requiredHundredOstatoc = hundred - banknotesHundred;
                                        tens = tens + requiredHundredOstatoc;
                                    }
                                    if(tens * banknotesTens == banknotesTens){
                                        
                                        requiredTens = tens / 10;
                                    }else{
                                        requiredTens = banknotesTens / 10;
                                        requiredTensOstatoc = tens - banknotesTens;
                                        units = units + requiredTensOstatoc; 
                                    }
                                    if(units * banknotesUnits == banknotesUnits){
                                        requiredUnits = units / 1;
                                    }else{
                                        requiredUnits = banknotesUnits / 1;
                                        requiredUnitsOstatoc = units - banknotesUnits;
                                    }
                                    // проведем проверку правильности выданных сумм банкоматом
                                    if(sumATM == ((requiredHundred * 100) + (requiredTens * 10) + requiredUnits)){
                                        System.out.println("Банкомат выдал запрошенную сумму корректно: " + sumATM + " долларов" + "\nВыданные купюры номиналом 100 долларов: " + requiredHundred + "\nВыданные купюры номиналом 10 долларов: " + requiredTens + "\nВыданные купюры номиналом 1 доллар: " + requiredUnits);
                                    }else{
                                        System.out.println("Банкомат выдал сумму некорректно: \nЗапрошено: " + sumATM + "\nВыдано: " + ((requiredHundred * 100) + (requiredTens * 10) + requiredUnits));
                                    }
        }
    }
