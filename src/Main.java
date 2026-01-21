//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("HW 1:");

        byte a1 = 126;
        short b1 = 30000;
        int c1 = 234567;
        long d1 = 567890123L;
        float e1 = 12.75f;
        double f1 = 12.754444443;

        System.out.println("Значение a=" + a1 + ";");
        System.out.println("Значение b=" + b1 + ";");
        System.out.println("Значение c=" + c1 + ";");
        System.out.println("Значение d=" + d1 + ";");
        System.out.println("Значение e=" + e1 + ";");
        System.out.println("Значение f=" + f1 + ";");


        System.out.println("HW 2:");

        float a2 = 27.12f;
        long b2 = 987678965549L;
        float c2 = 2.786f;
        short d2 = 569;
        short e2 = -159;
        short f2 = 27897;
        byte g2 = 67;

        System.out.println("Значение a=" + a2 + ";");
        System.out.println("Значение b=" + b2 + ";");
        System.out.println("Значение c=" + c2 + ";");
        System.out.println("Значение d=" + d2 + ";");
        System.out.println("Значение e=" + e2 + ";");
        System.out.println("Значение f=" + f2 + ";");
        System.out.println("Значение g=" + g2 + ";");


        System.out.println("HW 3:");

        byte studentsL = 23;
        byte studentsA = 27;
        byte studentsE = 30;
        short sheet = 480;
        int studentSheets = sheet / (studentsL + studentsA + studentsE);
        System.out.println("На каждого ученика рассчитано " + studentSheets + " листов бумаги;");


        System.out.println("HW 4:");

        byte minutes = 1;
        byte day = 1;
        byte month = 1;
        byte hour = (byte) ((byte) minutes * 60);
        int time = minutes * 2;
        int bottle = time * 8;
        System.out.println("За " + time + " минуты машина произвела " + bottle + " штук бутылок;");
        time = minutes * 20;
        bottle = time * 8;
        System.out.println("За " + time + " минуты машина произвела " + bottle + " штук бутылок;");
        time = hour * 24;
        bottle = day * time * 8;
        System.out.println("За " + day + " день машина произвела " + bottle + " штук бутылок;");
        byte days = (byte) ((byte) day * 3);
        bottle = days * time * 8;
        System.out.println("За " + days + " дня машина произвела " + bottle + " штук бутылок;");
        time = time * days * 10;
        bottle = month * time * 8;
        System.out.println("За " + month + " месяц машина произвела " + bottle + " штук бутылок;");


        System.out.println("HW 5:");

        byte needWhite = 2;
        byte needBrown = 4;
        byte jar = 120;
        byte classroom = (byte) (jar / (needWhite + needBrown));
        byte whiteJar = (byte) (classroom * needWhite);
        byte brownJar = (byte) (classroom * needBrown);
        System.out.println("В школе, где " + classroom + " классов, нужно " + whiteJar + " банок белой краски и " + brownJar + " банок коричневой краски.");


        System.out.println("HW 6:");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int weightGrams = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        int grPerKg = 1000;
        float weightKilo = (float) weightGrams / grPerKg;
        System.out.println("Вес завтрака в граммах - " + weightGrams + " гр. Вес завтрака в килограммах - " + weightKilo + " кг.");


        System.out.println("HW 7:");

        byte targetWeightGr = 7;
        short kgPerGr = 1000;
        short targetWeightKg = (short) (targetWeightGr * kgPerGr);
        short weightMax = 500;
        short weightMin = 250;
        byte dayMin = (byte) (targetWeightKg / weightMax);
        byte dayMax = (byte) (targetWeightKg / weightMin);
        byte dayAverage = (byte) (((dayMax - dayMin) / 2) + dayMin);
        System.out.println("Max day: " + dayMax + "; Min day: " + dayMin + "; Average day: " + dayAverage + ";");

        System.out.println("HW 8:");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float percentMasha = salaryMasha / 100f;
        float salaryMashaUp = percentMasha * 110f;
        float percentDenis = salaryDenis / 100f;
        float salaryDenisUp = percentDenis * 110f;
        float percentKristina = salaryKristina / 100f;
        float salaryKristinaUp = percentKristina * 110f;
        byte year = 12;
        int yearSalaryMasha = year * salaryMasha;
        int yearSalaryDenis = year * salaryDenis;
        int yearSalaryKristina = year * salaryKristina;
        float yearSalaryMashaUp = year * salaryMashaUp;
        float yearSalaryDenisUp = year * salaryDenisUp;
        float yearSalaryKristinaUp = year * salaryKristinaUp;
        float diffYearSalaryMasha = yearSalaryMashaUp - yearSalaryMasha;
        float diffYearSalaryDenis = yearSalaryDenisUp - yearSalaryDenis;
        float diffYearSalaryKristina = yearSalaryKristinaUp - yearSalaryKristina;
        System.out.println("Маша теперь получает " + salaryMashaUp + " рублей. Годовой доход вырос на " + diffYearSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisUp + " рублей. Годовой доход вырос на " + diffYearSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaUp + " рублей. Годовой доход вырос на " + diffYearSalaryKristina + " рублей.");


    }
}