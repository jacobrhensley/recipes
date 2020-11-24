package recipes;

public class App {
    public static void main(String[] args) {

        Recipe PBandJ = new Recipe();


        PBandJ.title = "PB&J";
        String[] i = {"Peanut Butter", "Jelly", "Bread"};
        PBandJ.ingredients = i;
        String[] ins = {"Spread Peanut Butter on 1 slice of Bread", "Spread Jelly on 2nd slice of Bread", "Place 2 pieces of bread together where the Peanut Butter and Jelly touch", "Enjoy"};
        PBandJ.instructions = ins;

        showRecipe(PBandJ);

    }

    public static void showRecipe(Recipe recipe) {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Title: " + recipe.title);
        System.out.println("-----------");
        System.out.println("Ingredients:");
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
