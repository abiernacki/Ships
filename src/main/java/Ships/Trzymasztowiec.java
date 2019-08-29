package Ships;

import java.util.List;

public class Trzymasztowiec extends AbstractMasztowiec {

    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;


    public Trzymasztowiec(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.x3 = x3;
    }

    public boolean validate(List<Punkt> list) {
        validate();

        if (checkPoints(list, x1, y1)) return false;
        if (checkPoints(list, x2, y2)) return false;
        if (checkPoints(list, x3, y3)) return false;
        return true;
    }

    public boolean validate() {
        if (check(x1)) return false;
        if (check(y1)) return false;
        if (check(x2)) return false;
        if (check(y2)) return false;
        if (check(x3)) return false;
        if (check(y3)) return false;


        if (checkIn(x1, x2, x3) && checkIn(y1, y2, y3)) {
            return false;
        }
        if (checkIn2(x1, x2, x3) && checkIn2(y1, y2, y3)) {
            return false;
        }
        if (checkIn3(x1, x2, x3) && (checkIn3(y1, y2, y3))) {
            return false;
        }

        if (test(x1, x2, x3, y1, y2, y3)) return false;
        if (test(y1, y2, y3, x1, x2, x3)) return false;

        if (checkIn2(x1, x2, x3) && checkIn4(y1,y2,y3) && checkIn4(y3,y2,y1)) {
            return false;
        }
        if (checkIn2(y1, y2, y3) && checkIn4(x1,x2,x3) && checkIn4(x3,x2,x1)) {
            return false;
        }

        return true;
    }

    private boolean checkIn4(int a, int b, int c){
        return !(b - a == 1 && c - b == 1);
    }

    private boolean checkIn3(int a, int b, int c) {
        return a != b || a != c;
    }

    public boolean checkIn2(int a, int b, int c) {
        return a == b && a == c;
    }

    public boolean checkIn(int a, int b, int c) {
        return a != b && a != c && b != c;
    }

    private boolean test(int a, int b, int c, int d, int e, int f) {
        if (a == b && a == c && d != e && d != f && e != f) {
            if (varAnd(d, e) && varAnd(d, f) && varAnd(e, f)) {
                return true;
            }
        }
        return false;
    }


    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }
}
