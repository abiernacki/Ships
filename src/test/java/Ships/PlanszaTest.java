package Ships;

import org.junit.Test;

public class PlanszaTest {

    @Test
    public void testPlansza() {

        //given
        Plansza plansza = new Plansza();

        //when
        plansza.plansza();

        for (Punkt var : plansza.zajetePola()) {
            System.out.print(var.getX());
            System.out.print(",");
            System.out.print(var.getY());
            System.out.println();
        }
    }

}