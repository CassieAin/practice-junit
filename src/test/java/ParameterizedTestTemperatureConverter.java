import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class ParameterizedTestTemperatureConverter {
    private TemperatureConverter converter;
    @Parameterized.Parameter
    public double celsius;
    @Parameterized.Parameter(1)
    public double farenheit;
    @Parameterized.Parameter(2)
    public double kalvin;

    @Before
    public void initialize(){
        converter = new TemperatureConverter();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][] {
                {30, 86, 303.2},
                {0, 32, 273.2},
                {12, 53.59, 285.2},
                {-10, 14,  263.2},
                {-30, -22, 243.2}
        });
    }

    @Test
    public void testParamsConvertCtoF(){
        assertEquals(farenheit, converter.convertCtoF(celsius), 0.01);
    }

    @Test
    public void testParamsConvertCtoK(){
        assertEquals(kalvin, converter.convertCtoK(celsius), 0.01);
    }

    @Test
    public void testParamsConvertFtoC(){
        assertEquals(celsius, converter.convertFtoC(farenheit), 0.01);
    }

    @Test
    public void testParamsConvertFtoK(){
        assertEquals(kalvin, converter.convertFtoK(farenheit), 0.01);
    }

    @Test
    public void testParamsConvertKtoC(){
        assertEquals(celsius, converter.convertKtoC(kalvin), 0.01);
    }

    @Test
    public void testParamsConvertKtoF(){
        assertEquals(farenheit, converter.convertKtoF(kalvin), 0.01);
    }

}
