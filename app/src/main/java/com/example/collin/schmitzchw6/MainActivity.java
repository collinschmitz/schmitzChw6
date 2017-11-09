package com.example.collin.schmitzchw6;

import android.app.ListActivity;
import android.content.Context;
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
        setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, RECIPES));
    }

    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"));
    private static ArrayList <String > rec2 = new ArrayList<String>(Arrays.asList("Chicken", "Lemon", "Main Dish", "Italian"));
    private static ArrayList <String > rec3 = new ArrayList<String>(Arrays.asList("Italian", "Pasta", "Lemon", "Shrimp", "Main Dish"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))
    private static ArrayList <String > rec1 = new ArrayList<String>(Arrays.asList("Chicken", "Easy", "Main Dish", "Lemon", "Healthy"))

    private static final Recipe[] RECIPES = {
            new Recipe("Lemon Chicken Breasts",
                    "Preheat the oven to 400 degrees F. \n" +
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

            "Lemon-Garlic Shrimp and Grits", "Roman-Style Chicken", "Zucchini Parmesan Crips",
            "Chicken Enchiladas", "Garlic Roasted Potatoes", "Twice-Baked Potatoes",
            "Tomato Soup", "Salmon Baked in Foil", "Baked Shrimp Scampi", "Baked Ziti",
            "Chicken-Fried Steak with Gravy", "Guacamole"
    };

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        Log.d(TAG, "onListItemClick position=" + position + " id=" + id + " " + RECIPES[position]);
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
            TextView description = row.findViewById(R.id.text2);

            Recipe recipe = RECIPES[position];
            name.setText(recipe.getName());
            description.setText(recipe.getDirections());
            icon.setImageResource(Recipe.getIconResource(recipe.getRating()));
        }
    }
}
