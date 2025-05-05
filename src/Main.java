//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int salary = 29000;
        int total = 0;
        /*for(int month = 1; month < 13; month++){
            total = total + (total / 100);
            total = total + salary;
            //System.out.println(total);
        }*/
        int Month = 0;
        int savingMonthly = 15000;
        while (total < 2_459_000) {
            Month = Month + 1;
            total = total + savingMonthly;
            System.out.println("Месяц " + Month + ", сумма накоплений равна " + total);
        }
        //Задание 2
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(" " + b);
        }
        //Задание 3
        System.out.println("Задание 3");
        int yPeople = 12_000_000;
        int yBorn = 17;
        int yDie = 8;
        int peopleGrowth;
        for (i = 0; i < 11; i++) {
            peopleGrowth = yPeople * (yBorn - yDie) / 1000;
            yPeople = yPeople + peopleGrowth;
            System.out.println("Год " + i + ", численность населения состовляет " + yPeople);
        }
        //Задание 4 и задание 5
        System.out.println("Задание 4");
        int saving = 15000;
        int total1 = 0;
        for (int b = 1; total1 < 12_000_000; b++) {
            int growth = total1 * 7 / 100;
            total1 = total1 + saving + growth;
            //System.out.println("Месяц "+ b + " сумма " +total1);
            // Задание 5
            if (b % 6 == 0) {
                System.out.println("Месяц " + b + " сумма " + total1);
            }
        }
        //Задание 6
        System.out.println("Задание 6");
        int saving1 = 15000;
        int time = 9 * 12;
        int total2 = 0;
        for (int c = 0; c < time; c++) {
            int growth1 = total2 * 7 / 100;
            total2 = total2 + growth1 + saving1;
            if (c % 6 == 0) {
                System.out.println("Месяц " + c + "  Василий собрал " + total2);
            }
        }
        // Задание 7
        System.out.println("Задание 7");
        int daysInMonth = 31;
        for (int day = 5; day <= daysInMonth; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
        }
        // Задание 7
        System.out.println("Задание 7");
        int yearBefore = 200;
        int yearAfter = 100;
        int currentYear = 2025;
        for(int l = 0; l < 2125; l = l + 79){
            if (l > currentYear - yearBefore && l < currentYear + yearAfter){
                System.out.println(l);
            }
        }
    }

}


