package Ships;

import Ships.Statki;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatkiTest {

    @Test
    public void testPlansza(){

        //given
        Statki statki = new Statki();

        //when
        statki.plansza();
    }

}