import java.time.LocalDate;

public class Budynek {
        String nazwa;
        int rokBud;
        int pietera;

        public Budynek(String nazwa, int rokBud, int pietera) {
            this.nazwa = nazwa;
            this.rokBud = rokBud;
            this.pietera = pietera;
        }

        public int getLiczbaPieter() {
            return pietera;
        }

        public void setLiczbaPieter(int pietera) {
            this.pietera = pietera;
        }



        public String getNazwa() {
            return nazwa;
        }

        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }

        public int getRokBudowy() {
            return rokBud;
        }

        public void setRokBudowy(int rokBud) {
            this.rokBud = rokBud;
        }
        public int wiek()
        {
            return LocalDate.now().getYear()-rokBud;
        }
        public void info() {
            System.out.println("Nazwa: " + nazwa);
            System.out.println("Rok budowy: " + rokBud);
            System.out.println("Ile pieter: " + pietera);
            System.out.println("Wiek: " + wiek());

        }
}
