import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value=Parameterized.class)
public class ParameterizedTestKToFConverter {

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
                {303.16, 85.98}
        });
    }

    @Test
    public void testConvertKtoF(){
        assertEquals(expected, converter.convertKtoF(input), 0.01);
    }
}
