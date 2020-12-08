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


}