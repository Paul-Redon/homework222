//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte dogs = 28;
        System.out.println("Собак " + dogs + " шт");
        short cockroaches = 119;
        System.out.println("Тараканов " +  cockroaches + " шт");
        int needles = 11999;
        System.out.println("Игл " + needles + " шт");
        long ants = 1238976512;
        System.out.println("Муравьев " + ants + " шт");
        float robots = 12.9f;
        System.out.println("Роботов " + robots + " шт");
        double bacteria = 47883.486;
        System.out.println("Бактерий " + bacteria + " шт");
        float a = 27.12F;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786F;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
        byte lyudmilaPavlovna = 23;
        short annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        long allTheTeachersPapers = 480;
        int allStudents = 80;
        long sheetForEachStudent = allTheTeachersPapers / allStudents;
        System.out.println("На каждого ученика " + sheetForEachStudent + " листов бумаги");
        byte boatles = 16;
        int machinePower20M = boatles * 10;
        System.out.println("За 20 минут машина произвела " + machinePower20M + " штук бутылок");
        byte boatlesIn1Min = 8;
        long machinePower1Day = boatlesIn1Min * 1440;
        System.out.println("За день машина произвела " + machinePower1Day + " штук бутылок");
        long boatlesIn3Days = boatlesIn1Min * 4320;
        System.out.println("За 3 дня машина произвела " + boatlesIn3Days + " штук бутылок");
        long machinePower1Month = machinePower1Day * 31;
        System.out.println("За месяц машина произвела " + machinePower1Month + " штук бутылок");
        long totalJaws = 120;
        byte whitePerClass = 2;
        short brownPerClass = 4;
        int classes = (totalJaws / (whitePerClass + brownPerClass));
        long whiteJaws = whitePerClass * classes;
        long whiteJaws = brownPerClass * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteJaws + " банок белой краски и " + brownJaws + " банок коричневой краски");
        byte bananas = 5;
        short bananaWeightG = 80;
        long bananasGrams = bananas * bananaWeightG;
        byte milkMl = 200;
        short gramsPer100Ml = 105;
        int milkUnits = milkMl / 100;
        long milkGrams = milkUnits * gramsPer100Ml;
        byte iceBricks = 2;
        short gramPerBrick = 100;
        long iceCreamGrams = iceBricks * gramPerBrick;
        byte eggs = 4;
        short gramPerEgg = 70;
        long eggsGrams = eggs * gramPerEgg;
        long totalGrams = bananasGrams + milkGrams + iceCreamGrams + eggsGrams;
        float totalKgF = totalGrams / 1000.0f;
        double totalKgD = totalGrams / 1000.0;
        System.out.println("Вес завтрка " + totalGrams + " граммов");
        System.out.println("Вес завтрака " + totalKgF + " кг");
        long totalLossGrams = 7000L;
        short lossPerDayLow = 250;
        short lossPerDayHigh = 500;
        short days250 = totalLossGrams / lossPerDayLow;
        short days500 = totalLossGrams / lossPerDayHigh;
        int days250Int = days250;
        int days500Int = days500;
        float meanDailyLoss = (lossPerDayLow + lossPerDayHigh) / 2.0f;
        double meanDailyLossD = meanDailyLoss;
        double averageDaysMeanDaily = totalLossGrams / meanDailyLossD;
        System.out.println("Дни при потере 250 г/сутки " + days250Int);
        System.out.println("Дни при потере 500 г/сутки " + days500Int);
        System.out.println("Среднее при среднем суточном снижении " + averageDaysMeanDaily);
        int mashaMonthly = 67760;
        int denisMonthly = 83690;
        int kristinaMonthly = 76230;
        float rateF = 0.10f;
        double rateD = 0.10;
        int mashaNewMonthly = Math.round(mashaMonthly * (1.0f + rateF));
        int denisNewMonthly = Math.round(denisMonthly * (1.0f + rateF));
        int kristinaNewMonthly = Math.round(kristinaMonthly * (1.0f + rateF));
        short monthsInYear = 12;
        long mashaAnnualBefore = mashaMonthly * monthsInYear;
        long mashaAnnualAfter  = mashaNewMonthly * monthsInYear;
        long denisAnnualBefore = denisMonthly * monthsInYear;
        long denisAnnualAfter  = denisNewMonthly * monthsInYear;
        long kristinaAnnualBefore = kristinaMonthly * monthsInYear;
        long kristinaAnnualAfter  = kristinaNewMonthly * monthsInYear;
        long mashaDiff = mashaAnnualAfter - mashaAnnualBefore;
        long denisDiff = denisAnnualAfter - denisAnnualBefore;
        long kristinaDiff = kristinaAnnualAfter - kristinaAnnualBefore;
        System.out.println("Маша теперь получает " + mashaNewMonthly + " рублей. Годовой доход вырос на " + mashaDiff + " рублей.");
        System.out.println("Денис теперь получает " + denisNewMonthly + " рублей. Годовой доход вырос на " + denisDiff + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewMonthly + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей.");











    }
    }
