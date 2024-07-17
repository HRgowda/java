class Food {
  private String name;
  private String ingredients;
  private String instructions;

  public Food(String name, String ingredients, String instructions) {
      this.name = name;
      this.ingredients = ingredients;
      this.instructions = instructions;
  }

  public void displayRecipe() {
      System.out.println("Recipe for " + name);
      System.out.println("Ingredients: " + ingredients);
      System.out.println("Instructions: " + instructions);
  }
}

class FoodVariant1 extends Food {
  public FoodVariant1(String name, String ingredients, String instructions) {
      super(name, ingredients, instructions);
  }
}

class FoodVariant2 extends FoodVariant1 {
  private String additionalIngredient;

  public FoodVariant2(String name, String ingredients, String instructions, String additionalIngredient) {
      super(name, ingredients, instructions);
      this.additionalIngredient = additionalIngredient;
  }

  @Override
  public void displayRecipe() {
      super.displayRecipe();
      System.out.println("Additional Ingredient: " + additionalIngredient);
  }
}

public class Main {
  public static void main(String[] args) {
      FoodVariant1 food1 = new FoodVariant1("Pasta", "Pasta, Sauce, Cheese", "1. Boil pasta. 2. Add sauce. 3. Sprinkle cheese.");
      food1.displayRecipe();

      System.out.println();

      FoodVariant2 food2 = new FoodVariant2("Pasta", "Pasta, Sauce, Cheese", "1. Boil pasta. 2. Add sauce. 3. Sprinkle cheese.", "Basil");
      food2.displayRecipe();
  }
}
