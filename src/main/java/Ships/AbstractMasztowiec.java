package Ships;

public abstract class AbstractMasztowiec {

    private final static int ROZMIAR = 10;
    
    protected boolean check(int y2) {
        if (y2 < 1 || y2 > ROZMIAR) {
            return true;
        }
        return false;
    }

    protected boolean varAnd(int a, int b) {
        return var1(a, b) && var2(a, b);
    }

    protected boolean var2(int a, int b) {
        return !(a == b - 1 && b > 1);
    }

    protected boolean var1(int a, int b) {
        return !(a == b + 1 && b < ROZMIAR);
    }
}
