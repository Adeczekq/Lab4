import java.util.Random;
import java.util.Scanner;

public class main {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
    public class Lab04_W65564 {
        public Lab04_W65564() {
        }

        public static void main(String[] args) {
            Zadanie1();
            Zadanie2();
            Zadanie3();
            Zadanie4();
            zadanie5();
            zadanie6();
            zadanie7();
        }

        public static void Zadanie1() {
            double[] tab = new double[10];
            double suma = 0.0;
            System.out.println("Elementy tablicy: ");

            for(int i = 0; i < tab.length; ++i) {
                tab[i] = Losuj();
                suma += tab[i];
                System.out.println(tab[i] + "\t");
            }

            System.out.println("Suma: " + suma + " srednia: " + suma / (double)tab.length);
            System.out.println("\n wersja foreach");
            suma = 0.0;
            double[] var10 = tab;
            int var6 = tab.length;

            for(int var7 = 0; var7 < var6; ++var7) {
                double data = var10[var7];
                System.out.println("" + tab + "\t");
                suma += data;
            }

            System.out.println("Suma: " + suma + " srednia: " + suma / (double)tab.length);
        }

        public static double Losuj() {
            Random rand = new Random();
            double Liczba = rand.nextDouble(26.0) - 10.0;
            return Liczba;
        }

        public static void Zadanie2() {
            int[] tab1 = new int[]{3, 5, 7, 9, 15, 17};
            int[] tab2 = new int[]{22, 14, 31, 43, 34, 55, 60};
            System.out.println("Tablica pierwsza:");

            int i;
            for(i = 0; i < tab1.length; i += 2) {
                System.out.println(tab1[i] + "\t");
            }

            System.out.println("Tablica druga:");

            for(i = 0; i < tab2.length; i += 2) {
                System.out.println(tab2[i] + "\t");
            }

        }

        public static void Zadanie3() {
            String[] tab = new String[]{"Kot", "DOM", "kajak", "rOwEr", "gLock"};
            String[] var1 = tab;
            int var2 = tab.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                String i = var1[var3];
                System.out.println(i.toUpperCase() + "\t");
            }

        }

        public static void Zadanie4() {
            String[] tab = new String[5];
            Scanner in = new Scanner(System.in);

            int i;
            for(i = 0; i < tab.length; ++i) {
                tab[i] = in.nextLine();
            }

            for(i = tab.length - 1; i >= 0; --i) {
                String reverse = (new StringBuffer(tab[i])).reverse().toString();
                System.out.println(reverse);
            }

        }

        public static void zadanie5() {
            int[] tab = new int[8];
            Scanner in = new Scanner(System.in);

            int x;
            for(x = 0; x < tab.length; ++x) {
                tab[x] = in.nextInt();
            }

            int j;
            for(int i = 0; i < tab.length - 1; ++i) {
                for(j = 0; j < tab.length - 1; ++j) {
                    if (tab[j] > tab[j + 1]) {
                        x = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = x;
                    }
                }
            }

            int[] var7 = tab;
            j = tab.length;

            for(int var5 = 0; var5 < j; ++var5) {
                int i = var7[var5];
                System.out.print("" + i + "\t");
            }

        }

        public static void zadanie6() {
            double[] tab = new double[5];
            Scanner in = new Scanner(System.in);

            for(int i = 0; i < tab.length; ++i) {
                tab[i] = in.nextDouble();
            }

            double[] var7 = tab;
            int var3 = tab.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                double i = var7[var4];
                if (i >= 0.0) {
                    System.out.println(silnia(i));
                } else {
                    System.out.println("Brak silni");
                }
            }

        }

        public static double silnia(double x) {
            return x == 0.0 ? 1.0 : silnia(x - 1.0) * x;
        }

        public static void zadanie7() {
            String[] tab1 = new String[]{"ALA", "Robert", "Komputer", "Java"};
            String[] tab2 = new String[]{"ALA", "Robert", "Komputer", "Java"};
            boolean rowne = true;

            for(int i = 0; i < tab1.length; ++i) {
                if (tab1[i] != tab2[i]) {
                    rowne = false;
                    break;
                }
            }

            if (rowne) {
                System.out.println("Wyrazy Sa rowne");
            } else {
                System.out.println("Nie sa rowne");
            }

        }
    }

}
