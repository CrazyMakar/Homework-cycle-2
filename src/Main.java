public class Main {
    public static void main(String[] args) {
        {
            System.out.println();
            System.out.println("Задание №1");
            int contribution = 15_000;
            int accumulation = 0;
            int month = 1;
            while (accumulation <= 2_459_000) {
                accumulation = accumulation + accumulation / 100;
                accumulation = accumulation + contribution;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + accumulation + " рублей");
                month++;
            }
            System.out.println();
        }
        {
            System.out.println("Задание №2");
            int i = 0;
            while (i < 10) {
                i++;
                System.out.print(i + " ");
            }
            System.out.println();
            for (; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        {
            System.out.println();
            System.out.println("Задание №3");
            int population = 12_000_000;
            int fertility = 17;
            int mortality = 8;
            int year = 1;
            while (year <= 10) {
                population = population + (fertility - mortality) * population / 1000;
                System.out.println("Год " + year + ", численность населения составляет " + population);
                year++;
            }
            System.out.println();
        }
        {
            System.out.println("Задание №4");
            int contribution = 15_000;
            int month = 1;
            while (contribution <= 12_000_000) {
                contribution = contribution + contribution / 100 * 7;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + contribution + " рублей");
                month++;
            }
            System.out.println();
        }
        {
            System.out.println("Задание №5");
            int contribution = 15_000;
            int month = 1;
            while (contribution <= 12_000_000) {
                contribution = contribution + contribution / 100 * 7;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + contribution + " рублей");
                }
                month++;
            }
            System.out.println();
        }
        {
            System.out.println();
            System.out.println("Задание №6");
            int contribution = 15_000;
            int month = 1;
            while (month <= 108) {
                contribution = contribution + contribution / 100 * 7;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + contribution + " рублей");
                }
                month++;
            }
            System.out.println();

        }
        {
            System.out.println("Задание №7");
            int friday = 3;
            while (friday <= 31) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
            System.out.println();
        }
        {
            System.out.println("Задание №8");
            int yearNow = 2024;
            for (int year = yearNow - 200; year < yearNow + 100; year++) {
                if (year % 79 == 0) {
                    System.out.println(year);
                    System.out.println();
                }
            }
        }
    }
}