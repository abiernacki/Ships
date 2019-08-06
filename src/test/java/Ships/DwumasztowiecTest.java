package Ships;

import Ships.Dwumasztowiec;
import org.junit.Test;

import static org.junit.Assert.*;

public class DwumasztowiecTest {

    @Test
    public void testPoprawny1(){

        //given
        Dwumasztowiec dwumasztowiec = new Dwumasztowiec(1,1,1,2);

        //when
        boolean result = dwumasztowiec.validate();

        //then

        assertTrue(result);
    }

    @Test
    public void testPoprawny2(){

        //given
        Dwumasztowiec dwumasztowiec = new Dwumasztowiec(6,6,7,6);

        //when
        boolean result = dwumasztowiec.validate();

        //then

        assertTrue(result);
    }


    @Test
    public void testNiePoprawny1(){

        //given
        Dwumasztowiec dwumasztowiec = new Dwumasztowiec(6,6,8,6);

        //when
        boolean result = dwumasztowiec.validate();

        //then

        assertFalse(result);
    }

    @Test
    public void testNiePoprawny2(){

        //given
        Dwumasztowiec dwumasztowiec = new Dwumasztowiec(1,1,1,5);

        //when
        boolean result = dwumasztowiec.validate();

        //then

        assertFalse(result);
    }

}