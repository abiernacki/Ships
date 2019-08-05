package Ships;

public class Dwumasztowiec {

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

    public boolean validate() {
        if (x1 < 1 || x1 > 10) {
            return false;
        }
        if (y1 < 1 || y1 > 10) {
            return false;
        }
        if (x2 < 1 || x2 > 10) {
            return false;
        }
        if (y2 < 1 || y2 > 10) {
            return false;
        }
        if (x1 != x2 && y1 != y2) {
            return false;
        }
        if (x1 == x2 && y1 == y2) {
            return false;
        }
        if (x1 == x2 && y1 != y2) {
            if (!(y1 == y2 + 1 && y2 < 10) && !(y1 == y2 - 1 && y2 > 1)) {
                return false;
            }
        }
        if (y1 == y2 && x1 != x2) {
            if (!(x1 == x2 + 1 && x2 < 10) && !(x1 == x2 - 1 && x2 > 1)) {
                return false;
            }
        }

        return true;
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
