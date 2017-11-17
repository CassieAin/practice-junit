import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class ParameterizedTestCToFConverter {
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
                {30, 86},
                {0, 32},
                {12, 53.59},
                {-10, 14},
                {-30, -22}
        });
    }

    @Test
    public void testParamsConvertCtoF(){
        assertEquals(expected, converter.convertCtoF(input), 0.01);
    }
}
