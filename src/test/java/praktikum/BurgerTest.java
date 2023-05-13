package praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author  smirnov sergey
 * @since   22.04.2023
 */
public class BurgerTest extends BaseTest {

    @Mock
    private Bun bun;

    @Mock
    private Ingredient ingredient;

    @Mock
    private Ingredient oneMoreIngredient;

    @Spy
    private Burger burger;

    @Before
    public void setup() {
        Mockito.when(bun.getName()).thenReturn("Мягкая французская булочка");
        Mockito.when(bun.getPrice()).thenReturn(0.25f);
        Mockito.when(ingredient.getPrice()).thenReturn(0.15f);
        Mockito.when(ingredient.getName()).thenReturn("chili sauce");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(oneMoreIngredient.getPrice()).thenReturn(0.15f);
        Mockito.when(oneMoreIngredient.getName()).thenReturn("cutlet");
        Mockito.when(oneMoreIngredient.getType()).thenReturn(IngredientType.FILLING);
    }

    @Test
    public void setBunsCallSetBunsIsCalled() {
        burger.setBuns(bun);
        Mockito.verify(burger, Mockito.times(1)).setBuns(bun);
    }

    @Test
    public void addIngredientIngredientAdded() {
        burger.addIngredient(ingredient);
        Assert.assertNotNull(burger.ingredients.get(0));
    }

    @Test
    public void removeIngredientIngredientRemoved() {
        burger.ingredients.add(ingredient);
        burger.removeIngredient(0);
        Assert.assertTrue(burger.ingredients.isEmpty());
    }

    // проверяет работу метода Burger.moveIngredient
    @Test
    public void moveIngredientIngredientMoved() {
        burger.ingredients.addAll(List.of(ingredient, oneMoreIngredient)); // добавляет 2 ингредиента
        burger.moveIngredient(1, 0); // меняет ингредиенты местами методом Burger.moveIngredient
        burger.ingredients.get(1).getName(); // дергает getName() второго ингредиента
        Mockito.verify(ingredient).getName(); // убеждается, что метод дернулся у передвинутого ингредиента
    }

    @Test
    public void getPriceReturnedPriceOfTheBurger() {
        burger.setBuns(bun);
        burger.ingredients.addAll(List.of(ingredient, oneMoreIngredient));
        Assert.assertEquals(0.8, burger.getPrice(), 0.01);
    }

    @Test
    public void getReceiptCorrectReceiptReceived() {
        burger.setBuns(bun);
        burger.ingredients.addAll(List.of(ingredient, oneMoreIngredient));
        String expected = "(==== Мягкая французская булочка ====)\r\n" +
                "= sauce chili sauce =\r\n" +
                "= filling cutlet =\r\n" +
                "(==== Мягкая французская булочка ====)\r\n" +
                "\r\nPrice: 0,800000\r\n";
        assertThat(expected, is(burger.getReceipt()));
    }

}