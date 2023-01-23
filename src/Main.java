public class Main {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задание1");
        int wanted = 2_459_000;
        int salary = 15000;
        int total = 0;
        int mouth = 1;
        while (total < wanted) {
            total = total + salary;
            System.out.println("«Месяц " + mouth + ", сумма накоплений равна " + total + " рублей» .");
            mouth++;
        }
        System.out.println();


        //Задача2
        System.out.println("Задание2");
        int number = 0;
        while (number <= 9) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }


        //Задача3
        System.out.println("задание3");
        int population = 12_000_000;
        int coeff = 1000;
        int life = 17;
        int death = 8;
        int years = 10;
        int diferenci = life - death;
        for (int year = 1; year <= years; year++) {
            population = population + population * diferenci / coeff;
            System.out.println("«Год " + year + " численность населения составляет " + population);

        }

        //Задача4
        System.out.println("задание4");
        int wanted1 = 12_000_000;
        int contribution = 15_000;
        int mauth = 1;
        double percent = 0.07;
        while (contribution < wanted1) {
            contribution = contribution + (int) (contribution * percent);
            System.out.println("Месяц " + mauth + " сумма накоплений " + contribution + " равна ");
            mauth++;
        }

        //Задача5
        System.out.println("задание5");
        wanted1 = 12_000_000;
        contribution = 15_000;
        mauth = 6;
        percent = 7 / 100D;
        while (contribution < wanted1) {
            contribution = contribution + (int) (contribution * percent);
            if (mauth % 6 == 0) {
                System.out.println("Месяц " + mauth + " сумма накоплений " + contribution + " равна ");
            }
            mauth++;
        }

        //Задача6
        System.out.println("задание6");
        contribution = 15_000;
        int moiths = 9 * 12;
        percent = 7 / 100D;
        mauth = 6;
        for (int month = 1; month <= moiths; month++) {
            contribution = contribution + (int) (contribution * percent);
            if (mauth % 6 == 0) {
                System.out.println("Месяц " + mauth + " сумма накоплений " + contribution + " равна ");
            }
            mauth++;
        }

        //Задача7
        System.out.println("задание7");
        int ferstFriday = 6;
        for (int friday = ferstFriday; friday <= 31; friday++) {
            System.out.println("«Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет».");
        }

        //Задача8
        System.out.println("Задание8");
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int fersTimeAccared = 0;
        for (int year = start; year <= end; year++) {
            if (year % period == fersTimeAccared) {
                System.out.println(year);
            }
        }
        for (int year = fersTimeAccared; year <= end; year += period) {
            if (year >= start ) {
                System.out.println(year);
            }
        }
    }
}