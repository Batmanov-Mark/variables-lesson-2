public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        int a =13_000_000;
        byte b = 120;
        short c =11_000;
        long d = 10_100_100_100_100L;
        float i =7.000111F;
        double f =8888.000111222333;
        System.out.println("значение переменной int " + a);
        System.out.println("значение переменной byte " +  b);
        System.out.println("значение переменной short " +  c);
        System.out.println("значение переменной long " +  d);
        System.out.println("значение переменной float " +  i);
        System.out.println("значение переменной double " +  f);


        //Task 2
        System.out.println("Task 2");
        float var1 = 27.12F;
        float var2= 2.786F;
        short var3= 569;
        short var4= -159;
        long var5= 987_678_965_549L;
        short var6= 27897;
        byte var7= 67;

        System.out.println(var1 + "= var float ");
        System.out.println(var2 + "= var float ");
        System.out.println(var3 + "= var short ");
        System.out.println(var4 + "= var short ");
        System.out.println(var5 + "= var long ");
        System.out.println(var6 + "= var short ");
        System.out.println(var7 + "= var byte ");


        //Task 3
        System.out.println("Task 3");
        short teacher1 = 23;
        short teacher2 = 27;
        short teacher3= 30;
        short paperTotal = 480;
        int sheetsForEach = paperTotal / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги");
        //Task 4
        System.out.println("Task 4");
        int Performance1Minute = 8;
        int Performance20Minute = 20 * Performance1Minute;
        int PerformanceDay = 60 * 24 * Performance1Minute;
        int Performance3Day = 3 * PerformanceDay;
        int PerformanceMonth = 30 * PerformanceDay;

        System.out.println("За 20 минут машина произвела " + Performance20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + PerformanceDay +  " штук бутылок");
        System.out.println("За 3 дня машина произвела " + Performance3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + PerformanceMonth + " штук бутылок");


        //Task 5
        System.out.println("Task 5");

        short totalCansPaint = 120;
        short paintWhite1class = 2;
        short paintBrown1class = 4;
        int totalClass = totalCansPaint / (paintWhite1class + paintBrown1class);
        int totalClassPaintWhite = totalClass * paintWhite1class;
        int totalClassPaintBrown = totalClass * paintBrown1class;

        System.out.println("В школе, где " + totalClass + " классов, нужно "
                + totalClassPaintWhite + " банок белой краски и "
                + totalClassPaintBrown + " банок коричневой краски");


        //Task 6
        System.out.println("Task 6");
        int Bananas = 80;
        int Milk = 105;
        int IceCreamSundae = 100;
        int RawEggs = 70;

        int byPrescriptionBananas = 5 * Bananas;
        int byPrescriptionMilk = 2 * Milk;
        int byPrescriptionIceCreamSundae = 2 * IceCreamSundae;
        int byPrescriptionRawEggs = 4 * RawEggs;

        int breakfastGrams = byPrescriptionBananas + byPrescriptionMilk + byPrescriptionIceCreamSundae + byPrescriptionRawEggs;
        float breakfastKilogram = breakfastGrams / 1000F;

        System.out.println("Вес спортзавтрака " + breakfastGrams + " в граммах");
        System.out.println("Вес спортзавтрака " + breakfastKilogram + " в килограммах");


                //Task 7
        System.out.println("Task 7");
        int loseWeight = 7 * 1000;
        int weightLossMinPerDay = 250;
        int weightLossMaxPerDay = 500;

        int maxDay = loseWeight / weightLossMinPerDay;
        int minDay = loseWeight / weightLossMaxPerDay;

        int averageDay = (maxDay+minDay)/2;
        System.out.println(averageDay + "дней потребоваться в среднем, чтобы добиться результата похудения");
        System.out.println(maxDay +"дней потребоваться если каждый день будет худеть на 250 грамм, чтобы добиться результата похудения");
        System.out.println(minDay +"дней потребоваться если каждый день будет худеть на 500 грамм, чтобы добиться результата похудения");


        //Task 8
        System.out.println("Task 8");
        int MashaNow = 67_760;
        int DenisNow= 83_690;
        int KristinaNow = 76_230;

        double MashaAfterMonth= MashaNow * 1.1;
        double DenisAfterMonth= DenisNow * 1.1;
        double KristinaAfterMonth = KristinaNow * 1.1;



        int MashaIncomeYear =(int) (MashaAfterMonth - MashaNow)*12;
        int DenisIncomeYear=(int) (DenisAfterMonth-DenisNow)*12;
        int KristinaIncomeYear =(int) (KristinaAfterMonth-KristinaNow)*12;
        System.out.println("Маша теперь получает " +MashaAfterMonth+ " рублей. Годовой доход вырос на " +MashaIncomeYear+ " рублей");
        System.out.println("Денис теперь получает " +DenisAfterMonth+ " рублей. Годовой доход вырос на " +DenisIncomeYear+ " рублей");
        System.out.println("Кристина теперь получает " +KristinaAfterMonth+ " рублей. Годовой доход вырос на " +KristinaIncomeYear+ " рублей");

    }
}