public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //Task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Task 2");
        //Task 2
        for (int w = 10; w >= 1; w--) {
            System.out.println(w);
        }
        System.out.println("Task 3");
        //Task 3
        for (int e = 0; e <= 17; e = e + 2) {
            System.out.println(e);
        }
        System.out.println("Task 4");
        //Task 4
        for (int r = 10; r >= -10; r--) {
            System.out.println(r);
        }
        System.out.println("Task 5");
        //Task 5
        int year = 1904;
        for (; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным.");
        }
        System.out.println("Task 6");
        //Task 6
        for (int t = 7; t <= 98; t = t + 7) {
            System.out.println(t);
        }
        System.out.println("Task 7");
        //Task 7
        for (int y = 1; y <= 512; y = y * 2) {
            System.out.println(y);
        }
        System.out.println("Task 8");
        //Task 8
        int moneyInTheJar = 0;
        for (int o = 1; o <= 12; o++) {
            moneyInTheJar = moneyInTheJar + 29000;
            System.out.println("Месяц " + o + " ,сумма накоплений равна " + moneyInTheJar + " рублей.");
        }
        System.out.println("Task 9");
        //Task 9
        int moneyInTheBank = 29000;
        int bankInterest = 0;
        for (int o = 1; o <= 12; o++) {
            bankInterest = bankInterest + bankInterest/100;
           bankInterest = moneyInTheBank + bankInterest;
            System.out.println("Месяц " + o + " ,сумма накоплений равна " + bankInterest + " рублей.");
        }
        System.out.println("Task 10");
        //Task 10
        int a = 0;
        for (int p = 1; p <= 10; p++) {
          a = 2 * p;
            System.out.println("2*"+p+"="+a);
        }
    }
}