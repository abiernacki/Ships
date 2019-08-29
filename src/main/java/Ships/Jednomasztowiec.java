package Ships;

import java.util.List;

public class Jednomasztowiec extends AbstractMasztowiec{

    private int x;
    private int y;

    public Jednomasztowiec(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean validate(){
        if (check(x)) return false;
        if (check(y)) return false;
        return true;
    }

    public boolean validate(List<Punkt> list){
        validate();

        if (checkPoints(list, x, y)) return false;
        return true;
    }



    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
