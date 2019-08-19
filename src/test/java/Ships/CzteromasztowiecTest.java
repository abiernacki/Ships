package Ships;

import org.junit.Test;

import static org.junit.Assert.*;

public class CzteromasztowiecTest {

    @Test
    public void TestPoprawny1(){

        //given
        Czteromasztowiec czteromasztowiec = new Czteromasztowiec(1,1,1,2,1,3,1,4);

        //when
        boolean result = czteromasztowiec.validate();

        //then

        assertTrue(result);
    }

    @Test
    public void TestPoprawny2(){

        //given
        Czteromasztowiec czteromasztowiec = new Czteromasztowiec(1,1,2,1,3,1,4,1);

        //when
        boolean result = czteromasztowiec.validate();

        //then

        assertTrue(result);
    }

    @Test
    public void TestNiePoprawny1(){

        //given
        Czteromasztowiec czteromasztowiec = new Czteromasztowiec(1,1,1,3,1,5,1,7);

        //when
        boolean result = czteromasztowiec.validate();

        //then

        assertFalse(result);
    }

    @Test
    public void TestNiePoprawny2(){

        //given
        Czteromasztowiec czteromasztowiec = new Czteromasztowiec(1,1,2,3,4,5,1,7);

        //when
        boolean result = czteromasztowiec.validate();

        //then

        assertFalse(result);
    }

    @Test
    public void TestNiePoprawny3(){

        //given
        Czteromasztowiec czteromasztowiec = new Czteromasztowiec(1,1,1,2,1,3,2,3);

        //when
        boolean result = czteromasztowiec.validate();

        //then

        assertFalse(result);
    }

    @Test
    public void TestNiePoprawny4(){

        //given
        Czteromasztowiec czteromasztowiec = new Czteromasztowiec(1,1,1,2,1,4,1,5);

        //when
        boolean result = czteromasztowiec.validate();

        //then

        assertFalse(result);
    }
    @Test
    public void TestNiePoprawny5(){

        //given
        Czteromasztowiec czteromasztowiec = new Czteromasztowiec(1,1,2,1,1,4,1,6);

        //when
        boolean result = czteromasztowiec.validate();

        //then

        assertFalse(result);
    }

}