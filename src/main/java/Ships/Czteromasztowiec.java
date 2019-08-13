package Ships;

public class Czteromasztowiec extends AbstractMasztowiec {

    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;
    private int y4;
    private int x4;


    public Czteromasztowiec(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.x3 = x3;
        this.y4 = y4;
        this.x4 = x4;
    }

    public boolean validate() {
        if (check(x1)) return false;
        if (check(y1)) return false;
        if (check(x2)) return false;
        if (check(y2)) return false;
        if (check(x3)) return false;
        if (check(y3)) return false;
        if (check(x4)) return false;
        if (check(y4)) return false;

        if (checkIn(x1, x2, x3, x4) && checkIn(y1, y2, y3, y4)) {
            return false;
        }
        if (checkIn2(x1, x2, x3, x4) && checkIn2(y1, y2, y3, y4)) {
            return false;
        }
        if (checkIn3(x1, x2, x3, x4) && (checkIn3(y1, y2, y3, y4))) {
            return false;
        }
        if (test(x1, x2, x3, x4, y1, y2, y3, y4)) return false;
        if (test(y1, y2, y3, y4, x1, x2, x3, x4)) return false;

        return true;
    }

    private boolean checkIn3(int a, int b, int c, int d) {
        return a != b || a != c || a != d;
    }

    public boolean checkIn2(int a, int b, int c, int d) {
        return a == b && a == c && a == d;
    }

    public boolean checkIn(int a, int b, int c, int d) {
        return a != b && a != c && a != d && b != c && b != d && c != d;
    }

    private boolean test(int a, int b, int c, int d, int e, int f, int g, int h) {
        if (a == b && a == c && a == d && e != f && e != g && e != h && f != g && f != h && g != h) {
            if (varAnd(e, f) && varAnd(e, g) && varAnd(e, h) && varAnd(f, g) && varAnd(f, h) && varAnd(g, h)) {
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

    public int getX4() {
        return x4;
    }

    public int getY4() {
        return y4;
    }
}
