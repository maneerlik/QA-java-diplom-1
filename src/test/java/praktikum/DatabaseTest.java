package praktikum;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author  smirnov sergey
 * @since   23.04.2023
 */
public class DatabaseTest {

    private final Database db = new Database();

    @Test
    public void availableBunsReturnedListOfBuns() {
        Assert.assertFalse(db.availableBuns().isEmpty());
    }

    @Test
    public void availableIngredientsReturnedListOfIngredients() {
        Assert.assertFalse(db.availableIngredients().isEmpty());
    }

}