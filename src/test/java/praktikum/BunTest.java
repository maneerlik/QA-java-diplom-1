package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author  smirnov sergey
 * @since   21.04.2023
 */
@RunWith(Parameterized.class)
public class BunTest {

    private Bun bun;

    public BunTest(String name, float price) {
        bun = new Bun(name, price);
    }

    @Parameterized.Parameters(name = "{index}: name - {0}, price - {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Мягкая французская булочка", 0.25f },
                { "Мягкая французская булочка мягкая французская булочка мягкая французская булочка " +
                        "мягкая французская булочка мягкая французская булочка мягкая французская булочка", 0.25f },
                { "@#$%^&*", 0.25f },
                { "12345", 0.25f },
                { "", 0.25f },
                { null, 0.25f },
                { "Мягкая французская булочка", 0 },
                { "Мягкая французская булочка", -0.25f },
                { "Мягкая французская булочка", 100 },
            }
        );
    }

    @Test
    public void getNameResultCompareIsEqual() {
        Assert.assertEquals(bun.name, bun.getName());
    }

    @Test
    public void getFoodCallResultCompareIsEqual() {
        Assert.assertEquals(bun.price, bun.getPrice(), 0.01);
    }

}