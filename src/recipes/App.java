package recipes;

public class App {
    public static void main(String[] args) {

        String[] i = {"Peanut Butter", "Jelly", "Bread"};
        String[] ins = {"Spread Peanut Butter on 1 slice of Bread", "Spread Jelly on 2nd slice of Bread", "Place 2 pieces of bread together where the Peanut Butter and Jelly touch", "Enjoy"};
        Recipe PBandJ = new Recipe("PB&J", i, ins);

        showRecipe(PBandJ);

    }

    public static void showRecipe(Recipe recipe) {
        System.out.print("-------------------------------------------------------------------------------------------------------\n" +
        "Title: " + recipe.title + "\n" +
        "-----------\n" +
        "Ingredients:\n");
        for(int x = 0; x<recipe.ingredients.length; x++){
            System.out.println(recipe.ingredients[x]);
        }
        System.out.println("-----------");
        System.out.println("Instructions:");
        for(int x = 0; x<recipe.instructions.length; x++){
            System.out.println(x + 1 + ": " + recipe.instructions[x]);
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
