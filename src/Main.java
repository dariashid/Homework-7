public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int money = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + money;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача 2");
        int n = 0;
        while (n < 10) {
            n = n + 1;
            System.out.print(n + " ");
        }
        System.out.println();
        while (n > 0) {
            System.out.print(n + " ");
            n = n - 1;
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12_000_000;
        int mortality = (population / 1000) * 8;
        int birthRate = (population / 1000) * 17;
        int populationChange = birthRate - mortality;
        for (int w = 1; w <= 10; w = w + 1) {
            population = population + populationChange;
            System.out.println("Год " + w + ", численность населения составляет " + population);
        }

        System.out.println("Задача 4");
        int contribution = 15000;
        for (int o = 1; contribution <= 12_000_000; o = o + 1) {
            contribution = contribution + ((contribution * 7) / 100);
            System.out.println("Месяц " + o + ", сумма накоплений равна " + contribution + " рублей");
        }

        System.out.println("Задача 5");
        int contribution2 = 15000;
        int p = 0;
        for (; contribution2 <= 12_000_000; p++) {
            contribution2 = contribution2 + (contribution2 / 100) * 7;
            if (p % 6 == 0) {
                System.out.println("Месяц " + p + " Итого " + contribution2);
            }
        }

        System.out.println("Задача 6");
        long contribution3 = 15000;
        for (int v = 1; v <= 108; v++) {
            contribution3 = contribution3 + (contribution3 / 100) * 7;
            if (v % 6 == 0) {
                System.out.println("Месяц " + v + " Итого " + contribution3);
            }
        }

        System.out.println("Задача 7");
        int FirstFridayOfTheMonth = 1;
        for (int day = FirstFridayOfTheMonth; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задача 8");
        int currentYear = 2023;
        int period = 79;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = 0; year <= end; year += period) {
            if (year >= start) {
                System.out.println(year);
            }
        }

    }
}


