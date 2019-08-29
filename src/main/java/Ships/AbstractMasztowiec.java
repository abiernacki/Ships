package Ships;

import java.util.List;

public abstract class AbstractMasztowiec {

    protected boolean check(int a) {
        if (a < 1 || a > 10) {
            return true;
        }
        return false;
    }

    protected boolean checkPoints(List<Punkt> list, int x, int y) {
        int tempX = x-1;
        int tempY = y-1;

        for (int i = tempX; i <= tempX + 2; i++){
            for (int j = tempY; j <= tempY + 2; j++){
                for (Punkt var: list) {
                    if (i == var.getX() && j == var.getY()){
                        return true;
                    }
                }
            }
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
