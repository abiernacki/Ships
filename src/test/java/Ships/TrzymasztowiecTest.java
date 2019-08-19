package Ships;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrzymasztowiecTest {

    @Test
    public void TestPoprawny1(){

        //given
        Trzymasztowiec trzymasztowiec = new Trzymasztowiec(1,1,1,2,1,3);

        //when
        boolean result = trzymasztowiec.validate();

        //then

        assertTrue(result);
    }

    @Test
    public void TestPoprawny2(){

        //given
        Trzymasztowiec trzymasztowiec = new Trzymasztowiec(1,1,2,1,3,1);

        //when
        boolean result = trzymasztowiec.validate();

        //then

        assertTrue(result);
    }

    @Test
    public void TestNiePoprawny1(){

        //given
        Trzymasztowiec trzymasztowiec = new Trzymasztowiec(2,3,4,5,6,7);

        //when
        boolean result = trzymasztowiec.validate();

        //then

        assertFalse(result);
    }

    @Test
    public void TestNiePoprawny2(){

        //given
        Trzymasztowiec trzymasztowiec = new Trzymasztowiec(1,1,1,3,1,5);

        //when
        boolean result = trzymasztowiec.validate();

        //then

        assertFalse(result);
    }

    @Test
    public void TestNiePoprawny3(){

        //given
        Trzymasztowiec trzymasztowiec = new Trzymasztowiec(1,1,1,2,2,2);

        //when
        boolean result = trzymasztowiec.validate();

        //then

        assertFalse(result);
    }

    @Test
    public void TestNiePoprawny4(){

        //given
        Trzymasztowiec trzymasztowiec = new Trzymasztowiec(1,1,1,2,1,4);

        //when
        boolean result = trzymasztowiec.validate();

        //then

        assertFalse(result);
    }

    @Test
    public void TestNiePoprawny5(){

        //given
        Trzymasztowiec trzymasztowiec = new Trzymasztowiec(1,1,3,1,4,1);

        //when
        boolean result = trzymasztowiec.validate();

        //then

        assertFalse(result);
    }

}