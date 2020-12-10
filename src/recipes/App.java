package recipes;

public class App {
    public static void main(String[] args) {

        String[] i = {"Peanut Butter", "Jelly", "Bread"};
        String[] ins = {"Spread Peanut Butter on 1 slice of Bread", "Spread Jelly on 2nd slice of Bread", "Place 2 pieces of bread together where the Peanut Butter and Jelly touch", "Enjoy"};
        Recipe PBandJ = new Recipe("PB&J", i, ins);

        Recipe.showRecipe(PBandJ);

    }


}
