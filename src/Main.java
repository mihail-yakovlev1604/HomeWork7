public class Main {
    public static void main(String[] args) {


        int accum = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + accum;
            month = month + 1;
            {
                System.out.println("Месяц" + month + ", сумма накоплений равна" + total + "рублей");
            }
            System.out.println();
        }

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println();


        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();


        int population = 12000000;
        int dead = 8;
        int reftility = 17;
        int populationGrowth = reftility - dead;
        for (int year = 1; year <= 10; year++) {
            reftility = population / 1000 * populationGrowth;
            population = reftility + population;
            System.out.println("Год " + year + " численность населония составляет" + population);
        }
        System.out.println();


        int money = 15000;
        total = 0;
        for (int b = 1; total <= 12_000_000; b++) {
            total = total + money / 100 * 7;
            total = total + money;
            System.out.println("За месяц" + b + "сумма накоплений равна" + total);
        }
        System.out.println();


        int capital = 15000;
        total = 0;
        for (int c = 1; total <= 12_000_000; c++) {
            total = total + money / 100 * 7;
            total = total + money;
            if (c % 6 == 0) {
                System.out.println("За месяц" + c + "сумма накоплений равна" + total);
            }

        }
        System.out.println();


        int capital1 = 15000;
        total = 0;
        for (int d = 1; d <= 18; d++) {
            total = total + money / 100 * 7;
            total = total + money;
            if (d % 6 == 0) {
                System.out.println("За месяц" + d + "сумма накоплений равна" + total);
            }

        }
        System.out.println();


        int day = 2;
        for (int m = day; m <= 31; m += 7) {
            System.out.println("Сегодня пятница," + m + "-е число.Необходимо подготовить отчет.");
        }
        System.out.println();


        int w = 1823;
        int z = 2123;
        for (int k = 0; k <= z; k += 79) {
            if ( k >= w) {
                System.out.println(k);


            }

        }
    }


}