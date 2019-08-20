package Ships;

public class Statki {

    private Jednomasztowiec[] statki1 = new Jednomasztowiec[4];
    private Dwumasztowiec[] statki2 = new Dwumasztowiec[3];
    private Trzymasztowiec[] statki3 = new Trzymasztowiec[2];
    private Czteromasztowiec[] statki4 = new Czteromasztowiec[1];

    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

//    public Statki() {
//        Jednomasztowiec jednomasztowiec = new Jednomasztowiec(1, 1);
//        if (jednomasztowiec.validate()) {
//            statki1[0] = jednomasztowiec;
//        } else {
//            System.out.println("blad");
//        }
//        statki1[1] = new Jednomasztowiec(8, 5);
//        statki1[2] = new Jednomasztowiec(1, 10);
//        statki1[3] = new Jednomasztowiec(2, 6);
//
//        statki2[0] = new Dwumasztowiec(7, 10, 8, 10);
//        statki2[1] = new Dwumasztowiec(5, 1, 6, 1);
//        statki2[2] = new Dwumasztowiec(10, 9, 10, 10);
//
//        statki3[0] = new Trzymasztowiec(10, 1, 10, 2, 10, 3);
//        statki3[1] = new Trzymasztowiec(4, 8, 5, 8, 6, 8);
//
//        statki4[0] = new Czteromasztowiec(2, 4, 3, 4, 4, 4, 5, 4);
//    }

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

    public void plansza() {
        for (int i = 0; i <= numbers.length; i++) {
            for (int j = 0; j <= chars.length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(String.format("%4s", String.format("%-4s", " ")));
                }
                if (i == 0 && j != 0) {
                    System.out.print(String.format("%4s", String.format("%-4s", " " +chars[j - 1] + " " )));
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

                    if (czyZnaleziono1) {
                        System.out.print(String.format("%4s", String.format("%-4s", "|1|")));
                    } else if (czyZnaleziono2) {
                        System.out.print(String.format("%4s", String.format("%-4s", "|2|")));
                    } else if (czyZnaleziono3) {
                        System.out.print(String.format("%4s", String.format("%-4s", "|3|")));
                    } else if (czyZnaleziono4) {
                        System.out.print(String.format("%4s", String.format("%-4s", "|4|")));
                    } else {
                        System.out.print(String.format("%4s", String.format("%-4s", " _ ")));
                    }
                }

            }
            System.out.println();
        }
    }
}
