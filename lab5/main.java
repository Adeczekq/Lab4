import java.util.Random;
import java.util.Scanner;




    public class main {
        public static void main(String[] args) {
            Zadanie1();
            Zadanie2();

        }

        public static void zadanie1() {
            Prostokat prostokat = new Prostokat(2, 3);
            System.out.println("Pole prosokata " + prostokat.pole());
            System.out.println("Obwod prostokata " + prostokat.obwod());
            System.out.println("Dlugosc przekatnej prostokata " + prostokat.dlugoscprze());
        }

        public static void zadanie2() {
            Budynek bud1 = new Budynek("dom", 2007, 2);
            Budynek bud2 = new Budynek("blok", 2000, 6);
            bud1.info();
            bud2.info();
        }
    }