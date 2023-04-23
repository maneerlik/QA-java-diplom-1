package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author  smirnov sergey
 * @since   23.04.2023
 */
@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType type;
    private final String name;
    private final float price;
    private Ingredient ingredient;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "тип: {0}, наименование: {1}, цена: {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                    { IngredientType.SAUCE, "hot sauce", 100 },
                    { IngredientType.SAUCE, "sour cream", 200 },
                    { IngredientType.SAUCE, "chili sauce", 300 },
                    { IngredientType.FILLING, "cutlet", 100 },
                    { IngredientType.FILLING, "dinosaur", 200 },
                    { IngredientType.FILLING, "sausage", 300 }
            }
        );
    }

    @Before
    public void setup() {
        ingredient = new Ingredient(type, name, price);
    }

    @Test
    public void getPriceReturnedCorrectPrice() {
        Assert.assertEquals(price, ingredient.getPrice(), 0.1);
    }

    @Test
    public void getNameReturnedCorrectName() {
        Assert.assertEquals(name, ingredient.getName());
    }

    @Test
    public void getTypeReturnedCorrectType() {
        Assert.assertEquals(type, ingredient.getType());
    }

}