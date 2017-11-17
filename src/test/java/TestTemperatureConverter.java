import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTemperatureConverter {
    private TemperatureConverter converter;

    @Before
    public void initialize(){
        converter = new TemperatureConverter();
    }

    @Test
    public void testConvertFtoC(){
        assertEquals(30, converter.convertFtoC(86), 0.01);
    }

    @Test
    public void testConvertCtoF(){
        assertEquals(86, converter.convertCtoF(30), 0.01);
    }

    @Test
    public void testConvertCtoK(){
        assertEquals(303.2, converter.convertCtoK(30), 0.01);
    }

    @Test
    public void testConvertKtoC(){
        assertEquals(30, converter.convertKtoC(303.2), 0.01);
    }

    @Test
    public void testConvertFtoK(){
        assertEquals(303.16, converter.convertFtoK(86), 0.01);
    }

    @Test
    public void testConvertKtoF(){
        assertEquals(85.98, converter.convertKtoF(303.16), 0.01);
    }
}
