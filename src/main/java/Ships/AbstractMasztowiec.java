package Ships;

public abstract class AbstractMasztowiec {

    protected boolean check(int a) {
        if (a < 1 || a > 10) {
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
        return !(a == b + 1 && b < 10);
    }
}
