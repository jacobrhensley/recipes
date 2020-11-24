package recipes;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Recipe PBandJ = new Recipe();

        PBandJ.title = "PB&J";
        String[] i = {"Peanut Butter", "Jelly", "Bread"};
        PBandJ.ingredients = i;
        String[] ins = {"Spread Peanut Butter on 1 slice of Bread", "Spread Jelly on 2nd slice of Bread", "Place 2 pieces of bread together where the Peanut Butter and Jelly touch", "Enjoy"};
        PBandJ.instructions = ins;

        System.out.println(PBandJ.title);

        for(int x = 0; x<PBandJ.ingredients.length; x++){
            System.out.println(PBandJ.ingredients[x]);
        }
        // System.out.println(Arrays.toString(PBandJ.ingredients));


    }
}
