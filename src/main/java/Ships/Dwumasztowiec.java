package Ships;

import java.util.List;

public class Dwumasztowiec extends AbstractMasztowiec {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Dwumasztowiec(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public boolean validate(List<Punkt> list) {
        validate();

        if (checkPoints(list, x1, y1)) return false;
        if (checkPoints(list, x2, y2)) return false;
        return true;
    }

    public boolean validate() {
        if (check(x1)) return false;
        if (check(y1)) return false;
        if (check(x2)) return false;
        if (check(y2)) return false;

        if (x1 != x2 && y1 != y2) {
            return false;
        }
        if (x1 == x2 && y1 == y2) {
            return false;
        }

        if (test(x1, x2, y1, y2)) return false;
        if (test(y1, y2, x1, x2)) return false;

        return true;
    }

    private boolean test(int x1, int x2, int y1, int y2) {
        if (x1 == x2 && y1 != y2) {
            if (varAnd(y1, y2)) {
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
}
