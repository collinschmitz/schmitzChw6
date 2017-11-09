package com.example.collin.schmitzchw6;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import static android.content.ContentValues.TAG;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new RecipeAdapter());
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        Log.d(TAG, "onListItemClick position=" + position + " id=" + id + " " + RECIPES[position]);
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("RecipeName", RECIPES[position].getName());
        intent.putExtra("RecipeDirections", RECIPES[position].getDirections());
        intent.putExtra("RatingIcon", Recipe.getIconResource(RECIPES[position].getRating()));
        intent.putExtra("RecipeTags", RECIPES[position].getTags());

        startActivity(intent);
    }

    class RecipeAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        @Override
        public int getCount() {return RECIPES.length;}
        @Override
        public Object getItem(int i) {return RECIPES[i];}
        @Override
        public long getItemId(int i) {return i;}
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            View row = convertView;
            if (convertView == null){
                if (inflater == null) inflater = (LayoutInflater)
                        MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.recipe_list_item, parent, false);
            }
            ImageView icon = row.findViewById(R.id.image);
            TextView name = row.findViewById(R.id.text1);
            TextView tags = row.findViewById(R.id.text2);

            Recipe recipe = RECIPES[position];
            name.setText(recipe.getName());
            String displayString = "";
            int count = 0;
            while(count < recipe.getTags().size()){
                if (!displayString.isEmpty()) {
                    displayString = displayString + ", " + recipe.getTags().get(count);
                }
                else{
                    displayString = recipe.getTags().get(count);
                }
                count ++;
            }
            tags.setText(displayString);
            icon.setImageResource(Recipe.getIconResource(recipe.getRating()));

            return row;
        }
    }

    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"));
    private static ArrayList <String > rec2 = new ArrayList<String>(Arrays.asList("Chicken", "Lemon", "Main Dish", "Italian"));
    private static ArrayList <String > rec3 = new ArrayList<String>(Arrays.asList("Italian", "Pasta", "Lemon", "Shrimp", "Main Dish"));
    private static ArrayList <String > rec4 = new ArrayList<String>(Arrays.asList("Shrimp", "Easy", "Main Dish", "American", "Healthy"));
    private static ArrayList <String > rec5 = new ArrayList<String>(Arrays.asList("Soup", "Easy", "Tomato", "Appetizer", "Vegetable"));
    private static ArrayList <String > rec6 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Healthy", "Italian", "Main Dish"));
    private static ArrayList <String > rec7 = new ArrayList<String>(Arrays.asList("Appetizer", "Easy", "Vegetable", "Healthy", "Cheese"));
    private static ArrayList <String > rec8 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Mexican", "Healthy", "Main Dish"));
    private static ArrayList <String > rec9 = new ArrayList<String>(Arrays.asList("Potato", "Easy", "Roasting", "Side Dish", "Vegetable"));
    private static ArrayList <String > rec10 = new ArrayList<String>(Arrays.asList("Potato", "Easy", "Side Dish", "Vegetable", "Cheese"));
    private static ArrayList <String > rec11 = new ArrayList<String>(Arrays.asList("Salmon", "Fish", "Italian", "Main Dish", "Healthy"));
    private static ArrayList <String > rec12 = new ArrayList<String>(Arrays.asList("Shrimp", "Easy", "Italian", "Main Dish", "Appetizer"));
    private static ArrayList <String > rec13 = new ArrayList<String>(Arrays.asList("Pasta", "Main Dish", "Vegetable", "Tomato", "Cheese"));
    private static ArrayList <String > rec14 = new ArrayList<String>(Arrays.asList("Meat", "Main Dish", "Beef", "Gravy", "Steak"));
    private static ArrayList <String > rec15 = new ArrayList<String>(Arrays.asList("Tomato", "Easy", "Appetizer", "Avocado", "Vegetable"));

    private static final Recipe[] RECIPES = {
        new Recipe("Lemon Chicken Breasts",
                            "Warm the olive oil in a small saucepan over medium....",
                    rec1,
                    Recipe.Rating.four),
        new Recipe("Chicken Piccata",
                           "Season chicken with salt and pepper. Dredge chicken in flour and shake off excess.\n" +
                           "In a large skillet...",
                   rec2,
                   Recipe.Rating.three),
        new Recipe("Linguine with Shrimp Scampi",
                           "Drizzle some oil in a large pot of boiling salted water, add 1 tablespoon of salt...",
                   rec3,
                   Recipe.Rating.two),
	    new Recipe("Lemon-Garlic Shrimp and Grits",
                           "Bring 3 cups of water to a boil in a medium saucepan over high heat...",
                   rec4,
                   Recipe.Rating.three),

	    new Recipe("Tomato Soup",
                           "To begin, dice the onion. Melt the butter in a large pot or Dutch oven...",
                   rec5,
                   Recipe.Rating.four),

	    new Recipe("Roman-Style Chicken",
                           "Season the chicken with 1/2 teaspoon salt and 1/2 teaspoon pepper...",
                   rec6,
                   Recipe.Rating.five),

	    new Recipe("Zuccini Parmesan Crisps",
                           "Preheat the oven to 450 degrees F. Coat a baking sheet with cooking spray...",
                   rec7,
                   Recipe.Rating.five),

	    new Recipe("Chicken Enchiladas",
                           "Coat large saute pan with oil. Season chicken with salt and pepper...",
                   rec8,
                   Recipe.Rating.four),

	    new Recipe("Garlic Roasted Potatoes",
                           "Preheat the oven to 400 degrees F. Cut the potatoes in half or quarters and place in a bowl...",
                   rec9,
                   Recipe.Rating.three),

	    new Recipe("Twice-Baked Potatoes",
                           "Preheat the oven to 400 degrees F. Place the potatoes on a baking sheet. Rub them...",
                   rec10,
                   Recipe.Rating.two),

	    new Recipe("Salmon Baked in Foil",
                           "Preheat the oven to 400 degrees F.Sprinkle salmon with 2 teaspoons olive oil, salt, and...",
                   rec11,
                   Recipe.Rating.four),

	    new Recipe("Baked Shrimp Scampi",
                           "Preheat the oven to 425 degrees F.Peel, devein, and butterfly the shrimp, leaving the tails on...",
                   rec12,
                   Recipe.Rating.one),

	    new Recipe("Baked Ziti",
                           "Heat the olive oil in a pot over medium heat. Add the garlic and onions...",
                   rec13,
                   Recipe.Rating.five),

	    new Recipe("Chicken Fried Steak with Gravy",
                           "For the steak: Begin with setting up an assembly line of dishes...",
                   rec14,
                   Recipe.Rating.three),

	    new Recipe("Guacamole",
                           "In a large bowl place the scooped avocado pulp and lime juice, toss to coat...",
                   rec15,
                   Recipe.Rating.five),
    };
}
