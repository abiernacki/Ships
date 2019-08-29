package Ships;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class JednomasztowiecTest {

    @Test
    public void testValidate2(){

        // given
        Jednomasztowiec jednomasztowiec = new Jednomasztowiec(5,8);
        List<Punkt> lista = new ArrayList<>();

        // when
        boolean valid = jednomasztowiec.validate(lista);

        // then
        assertTrue(valid);
    }

    @Test

    public void testValidate2Error(){

        // given
        Jednomasztowiec jednomasztowiec = new Jednomasztowiec(5,8);
        List<Punkt> lista = new ArrayList<>();
        lista.add(new Punkt(6,8));

        // when
        boolean valid = jednomasztowiec.validate(lista);

        // then
        assertFalse(valid);
    }

    @Test
    public void testValidate2Correct(){

        // given
        Jednomasztowiec jednomasztowiec = new Jednomasztowiec(5,8);
        List<Punkt> lista = new ArrayList<>();
        lista.add(new Punkt(7,9));
        lista.add(new Punkt(9,8));

        // when
        boolean valid = jednomasztowiec.validate(lista);

        // then
        assertTrue(valid);
    }


}