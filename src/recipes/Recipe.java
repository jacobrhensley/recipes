package recipes;

public class Recipe{
    
    public String title;
    public String[] ingredients = {};
    public String[] instructions = {};
    public String[] season = {};

    public Recipe(){

    };

    public Recipe(String title, String[] ingredients, String[] instructions){
        this.title = title;

        this.ingredients = ingredients;

        this.instructions = instructions;
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