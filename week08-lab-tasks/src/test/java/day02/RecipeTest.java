package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void testCreateWithName() {
        Recipe recipe = new Recipe("húsleves");

        assertEquals("húsleves", recipe.getName());
        assertNull(recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testCreateWithNameAndDescription() {
        Recipe recipe = new Recipe("húsleves", "leves hússal és zöldségekkel");

        assertEquals("húsleves", recipe.getName());
        assertEquals("leves hússal és zöldségekkel", recipe.getDescription());
        assertEquals(0, recipe.getIngredients().size());
    }

    @Test
    void testAddIngredient() {
        Recipe recipe = new Recipe("húsleves");
        recipe.addIngredient("csirkeaprólék");

        assertEquals(1, recipe.getIngredients().size());
        assertEquals("csirkeaprólék", recipe.getIngredients().get(0));
    }

    @Test
    void testAddIngredientWithMore() {
        Recipe recipe = new Recipe("húsleves");
        recipe.addIngredient("csirkeaprólék", "zöldség","só");

        assertEquals(3, recipe.getIngredients().size());
        assertArrayEquals(new String[] {"csirkeaprólék", "zöldség", "só"}, recipe.getIngredients().toArray());
    }
}