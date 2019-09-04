package Ships;

import java.util.ArrayList;
import java.util.List;

public class Plansza {

    private Jednomasztowiec[] statki1 = new Jednomasztowiec[4];
    private Dwumasztowiec[] statki2 = new Dwumasztowiec[3];
    private Trzymasztowiec[] statki3 = new Trzymasztowiec[2];
    private Czteromasztowiec[] statki4 = new Czteromasztowiec[1];
    private List<Punkt> strzaly = new ArrayList<>();

    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    public List<Punkt> zajetePola() {

        List<Punkt> listaStatkow = new ArrayList<>();

        for (Jednomasztowiec var : statki1) {
            if (var != null) {
                listaStatkow.add(new Punkt(var.getX(), var.getY()));
            }
        }

        for (Dwumasztowiec var : statki2) {
            if (var != null) {
                listaStatkow.add(new Punkt(var.getX1(), var.getY1()));
                listaStatkow.add(new Punkt(var.getX2(), var.getY2()));
            }
        }

        for (Trzymasztowiec var : statki3) {
            if (var != null) {
                listaStatkow.add(new Punkt(var.getX1(), var.getY1()));
                listaStatkow.add(new Punkt(var.getX2(), var.getY2()));
                listaStatkow.add(new Punkt(var.getX3(), var.getY3()));
            }
        }

        for (Czteromasztowiec var : statki4) {
            if (var != null) {
                listaStatkow.add(new Punkt(var.getX1(), var.getY1()));
                listaStatkow.add(new Punkt(var.getX2(), var.getY2()));
                listaStatkow.add(new Punkt(var.getX3(), var.getY3()));
                listaStatkow.add(new Punkt(var.getX4(), var.getY4()));
            }
        }

        return listaStatkow;
    }

//    public Plansza(int tmp) {
////        statki1[0] = new Jednomasztowiec(2, 2);
////
////        statki1[1] = new Jednomasztowiec(8, 6);
////        statki1[2] = new Jednomasztowiec(2, 9);
////        statki1[3] = new Jednomasztowiec(4, 6);
////
////        statki2[0] = new Dwumasztowiec(5, 10, 6, 10);
////        statki2[1] = new Dwumasztowiec(5, 2, 6, 2);
////        statki2[2] = new Dwumasztowiec(10, 7, 10, 8);
////
////        statki3[0] = new Trzymasztowiec(9, 1, 9, 2, 9, 3);
////        statki3[1] = new Trzymasztowiec(6, 8, 7, 8, 8, 8);
////
////        statki4[0] = new Czteromasztowiec(4, 4, 5, 4, 6, 4, 7, 4);
////    }

//    public Plansza() {
////        statki1[0] = new Jednomasztowiec(1, 1);
////
////        statki1[1] = new Jednomasztowiec(8, 5);
////        statki1[2] = new Jednomasztowiec(1, 10);
////        statki1[3] = new Jednomasztowiec(2, 6);
////
////        statki2[0] = new Dwumasztowiec(7, 10, 8, 10);
////        statki2[1] = new Dwumasztowiec(5, 1, 6, 1);
////        statki2[2] = new Dwumasztowiec(10, 9, 10, 10);
////
////        statki3[0] = new Trzymasztowiec(10, 1, 10, 2, 10, 3);
////        statki3[1] = new Trzymasztowiec(4, 8, 5, 8, 6, 8);
////
////        statki4[0] = new Czteromasztowiec(2, 4, 3, 4, 4, 4, 5, 4);
//    }
//
    public void setStatki1(Jednomasztowiec[] statki1) {
        this.statki1 = statki1;
    }

    public void setStatki2(Dwumasztowiec[] statki2) {
        this.statki2 = statki2;
    }

    public void setStatki3(Trzymasztowiec[] statki3) {
        this.statki3 = statki3;
    }

    public void setStatki4(Czteromasztowiec[] statki4) {
        this.statki4 = statki4;
    }

    public List<Punkt> getStrzaly() {
        return strzaly;
    }

    public void plansza() {
        plansza(false);
    }

    public void plansza(boolean ukryj) {
        for (int i = 0; i <= numbers.length; i++) {
            for (int j = 0; j <= chars.length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(String.format("%4s", String.format("%-4s", " ")));
                }
                if (i == 0 && j != 0) {
                    System.out.print(String.format("%4s", String.format("%-4s", " " + chars[j - 1] + " ")));
                }
                if (i != 0 && j == 0) {
                    System.out.print(String.format("%4s", String.format("%-4s", numbers[i - 1])));
                }
                if (i != 0 && j != 0) {
                    boolean czyZnaleziono1 = false;
                    boolean czyZnaleziono2 = false;
                    boolean czyZnaleziono3 = false;
                    boolean czyZnaleziono4 = false;

                    for (Jednomasztowiec statek : statki1) {
                        if (statek != null) {
                            if (statek.getX() == j && statek.getY() == i) {
                                czyZnaleziono1 = true;
                            }
                        }
                    }
                    for (Dwumasztowiec statek : statki2) {
                        if (statek != null) {
                            if ((statek.getX1() == j && statek.getY1() == i)
                                    || (statek.getX2() == j && statek.getY2() == i)) {
                                czyZnaleziono2 = true;
                            }
                        }
                    }
                    for (Trzymasztowiec statek : statki3) {
                        if (statek != null) {
                            if ((statek.getX1() == j && statek.getY1() == i) ||
                                    (statek.getX2() == j && statek.getY2() == i) ||
                                    (statek.getX3() == j && statek.getY3() == i)) {
                                czyZnaleziono3 = true;
                            }
                        }
                    }
                    for (Czteromasztowiec statek : statki4) {
                        if (statek != null) {
                            if ((statek.getX1() == j && statek.getY1() == i) ||
                                    (statek.getX2() == j && statek.getY2() == i) ||
                                    (statek.getX3() == j && statek.getY3() == i) ||
                                    (statek.getX4() == j && statek.getY4() == i)) {
                                czyZnaleziono4 = true;
                            }
                        }
                    }

                    boolean czyStrzal = false;
                    for (Punkt var: strzaly) {
                        if (var.getX() == i && var.getY() == j){
                            czyStrzal = true;
                        }
                    }

                    if (czyZnaleziono1) {
                        if (czyStrzal){
                            System.out.print(String.format("%4s", String.format("%-4s", "|Z|")));
                        } else if(!ukryj) {
                            System.out.print(String.format("%4s", String.format("%-4s", "|1|")));
                        } else {
                            System.out.print(String.format("%4s", String.format("%-4s", " _ ")));
                        }
                    } else if (czyZnaleziono2) {
                        if (czyStrzal){
                            System.out.print(String.format("%4s", String.format("%-4s", "|Z|")));
                        } else if(!ukryj) {
                            System.out.print(String.format("%4s", String.format("%-4s", "|2|")));
                        } else {
                            System.out.print(String.format("%4s", String.format("%-4s", " _ ")));
                        }
                    } else if (czyZnaleziono3) {
                        if (czyStrzal){
                            System.out.print(String.format("%4s", String.format("%-4s", "|Z|")));
                        } else if(!ukryj) {
                            System.out.print(String.format("%4s", String.format("%-4s", "|3|")));
                        } else {
                            System.out.print(String.format("%4s", String.format("%-4s", " _ ")));
                        }
                    } else if (czyZnaleziono4) {
                        if (czyStrzal){
                            System.out.print(String.format("%4s", String.format("%-4s", "|Z|")));
                        } else if(!ukryj) {
                            System.out.print(String.format("%4s", String.format("%-4s", "|4|")));
                        } else {
                            System.out.print(String.format("%4s", String.format("%-4s", " _ ")));
                        }
                    } else {
                        if (czyStrzal){
                            System.out.print(String.format("%4s", String.format("%-4s", "|X|")));
                        } else {
                            System.out.print(String.format("%4s", String.format("%-4s", " _ ")));
                        }
                    }
                }

            }
            System.out.println();
        }
    }
}
