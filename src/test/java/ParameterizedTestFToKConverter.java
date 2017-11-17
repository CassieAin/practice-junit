import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class ParameterizedTestFToKConverter {

    private TemperatureConverter converter;
    @Parameterized.Parameter
    public double input;
    @Parameterized.Parameter(1)
    public double expected;

    @Before
    public void initialize(){
        converter = new TemperatureConverter();
    }

    @Parameterized.Parameters(name ="{index}: convert from {0} to {1} = {2}")
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][] {
                {85.98, 303.16},
                {32, 273.16},
                {53.59, 285.16},
                {14, 263.16},
                {-22, 243.16}
        });
    }

    @Test
    public void testConvertFtoK(){
        assertEquals(expected, converter.convertFtoK(input), 0.01);
    }
}
