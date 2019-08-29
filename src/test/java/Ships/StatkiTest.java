package Ships;

import Ships.Statki;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatkiTest {

    @Test
    public void testPlansza() {

        //given
        Statki statki = new Statki();

        //when
        statki.plansza();

        for (Punkt var : statki.zajetePola()) {
            System.out.print(var.getX());
            System.out.print(",");
            System.out.print(var.getY());
            System.out.println();
        }
    }

}