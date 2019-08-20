package Ships;

import java.util.Scanner;

public class Gra {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;

    Scanner scanner = new Scanner(System.in);
    private Jednomasztowiec[] statki1 = new Jednomasztowiec[4];
    private Dwumasztowiec[] statki2 = new Dwumasztowiec[3];
    private Trzymasztowiec[] statki3 = new Trzymasztowiec[2];
    private Czteromasztowiec[] statki4 = new Czteromasztowiec[1];


    public void rozmiescStatki(Statki statki) {

        System.out.print("Podaj współrzędną X pierwszego jednomasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y pierwszego jednomasztowca: ");
        y1 = scanner.nextInt();
        System.out.println();
        statki1[0] = new Jednomasztowiec(x1, y1);
        statki.setStatki1(statki1);
        statki.plansza();
        System.out.println();

        System.out.print("Podaj współrzędną X drugiego jednomasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y drugiego jednomasztowca: ");
        y1 = scanner.nextInt();
        System.out.println();
        statki1[1] = new Jednomasztowiec(x1, y1);
        statki.setStatki1(statki1);
        statki.plansza();
        System.out.println();

        System.out.print("Podaj współrzędną X trzeciego jednomasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y trzeciego jednomasztowca: ");
        y1 = scanner.nextInt();
        System.out.println();
        statki1[2] = new Jednomasztowiec(x1, y1);
        statki.setStatki1(statki1);
        statki.plansza();
        System.out.println();

        System.out.print("Podaj współrzędną X czwartego jednomasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y czwartego jednomasztowca: ");
        y1 = scanner.nextInt();
        System.out.println();
        statki1[3] = new Jednomasztowiec(x1, y1);
        statki.setStatki1(statki1);
        statki.plansza();
        System.out.println();


        System.out.print("Podaj współrzędną X1 pierwszego dwumasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y1 pierwszego dwumasztowca: ");
        y1 = scanner.nextInt();
        System.out.print("Podaj współrzędną X2 pierwszego dwumasztowca: ");
        x2 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y2 pierwszego dwumasztowca: ");
        y2 = scanner.nextInt();
        System.out.println();
        statki2[0] = new Dwumasztowiec(x1, y1, x2, y2);
        statki.setStatki2(statki2);
        statki.plansza();
        System.out.println();

        System.out.print("Podaj współrzędną X1 drugiego dwumasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y1 drugiego dwumasztowca: ");
        y1 = scanner.nextInt();
        System.out.print("Podaj współrzędną X2 drugiego dwumasztowca: ");
        x2 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y2 drugiego dwumasztowca: ");
        y2 = scanner.nextInt();
        System.out.println();
        statki2[1] = new Dwumasztowiec(x1, y1, x2, y2);
        statki.setStatki2(statki2);
        statki.plansza();
        System.out.println();

        System.out.print("Podaj współrzędną X1 trzeciego dwumasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y1 trzeciego dwumasztowca: ");
        y1 = scanner.nextInt();
        System.out.print("Podaj współrzędną X2 trzeciego dwumasztowca: ");
        x2 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y3 trzeciego dwumasztowca: ");
        y2 = scanner.nextInt();
        System.out.println();
        statki2[2] = new Dwumasztowiec(x1, y1, x2, y2);
        statki.setStatki2(statki2);
        statki.plansza();
        System.out.println();

        System.out.print("Podaj współrzędną X1 pierwszego trzymasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y1 pierwszego trzymasztowca: ");
        y1 = scanner.nextInt();
        System.out.print("Podaj współrzędną X2 pierwszego trzymasztowca: ");
        x2 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y2 pierwszego trzymasztowca: ");
        y2 = scanner.nextInt();
        System.out.print("Podaj współrzędną X3 pierwszego trzymasztowca: ");
        x3 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y3 pierwszego trzymasztowca: ");
        y3 = scanner.nextInt();
        System.out.println();
        statki3[0] = new Trzymasztowiec(x1, y1, x2, y2, x3, y3);
        statki.setStatki3(statki3);
        statki.plansza();
        System.out.println();

        System.out.print("Podaj współrzędną X1 drugiego trzymasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y1 drugiego trzymasztowca: ");
        y1 = scanner.nextInt();
        System.out.print("Podaj współrzędną X2 drugiego trzymasztowca: ");
        x2 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y2 drugiego trzymasztowca: ");
        y2 = scanner.nextInt();
        System.out.print("Podaj współrzędną X3 drugiego trzymasztowca: ");
        x3 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y3 drugiego trzymasztowca: ");
        y3 = scanner.nextInt();
        System.out.println();
        statki3[1] = new Trzymasztowiec(x1, y1, x2, y2, x3, y3);
        statki.setStatki3(statki3);
        statki.plansza();
        System.out.println();

        System.out.print("Podaj współrzędną X1 pierwszego czteromasztowca: ");
        x1 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y1 pierwszego czteromasztowca: ");
        y1 = scanner.nextInt();
        System.out.print("Podaj współrzędną X2 pierwszego czteromasztowca: ");
        x2 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y2 pierwszego czteromasztowca: ");
        y2 = scanner.nextInt();
        System.out.print("Podaj współrzędną X3 pierwszego czteromasztowca: ");
        x3 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y3 pierwszego czteromasztowca: ");
        y3 = scanner.nextInt();
        System.out.print("Podaj współrzędną X3 pierwszego czteromasztowca: ");
        x4 = scanner.nextInt();
        System.out.print("Podaj współrzędną Y3 pierwszego czteromasztowca: ");
        y4 = scanner.nextInt();
        System.out.println();
        statki4[0] = new Czteromasztowiec(x1, y1, x2, y2, x3, y3, x4, y4);
        statki.setStatki4(statki4);
        statki.plansza();
        System.out.println();
    }
}
