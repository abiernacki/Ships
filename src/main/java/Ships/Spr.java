package Ships;

public class Spr {

    public static void main(String[] args) {

        Plansza planszaKomputera = new Plansza(1);
        Plansza planszaUzytkownik = new Plansza();
        Gra gra = new Gra();
//        gra.rozmiescStatki(planszaUzytkownik);
//        System.out.println("Plansza komputera");
//        System.out.println();
//        System.out.println();
//        planszaKomputera.plansza();
//        System.out.println();
//        System.out.println();
//        System.out.println("Plansza użytkownika");
//        System.out.println();
//        System.out.println();
//        planszaUzytkownik.plansza();
        gra.rozpocznijGre(planszaKomputera,planszaUzytkownik);




    }
}
