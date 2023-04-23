package praktikum;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author  smirnov sergey
 * @since   21.04.2023
 */
public class BunTest {

    private Bun bun = new Bun("Мягкая французская булочка", 0.25f);

    @Test
    public void getNameResultCompareIsEqual() {
        Assert.assertEquals("Мягкая французская булочка", bun.getName());
    }

    @Test
    public void getFoodCallResultCompareIsEqual() {
        Assert.assertEquals(0.25f, bun.getPrice(), 0.01);
    }

}