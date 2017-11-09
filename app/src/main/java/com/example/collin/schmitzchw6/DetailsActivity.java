package com.example.collin.schmitzchw6;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }

    protected void onStart(){
        super.onStart();
        Intent intent = getIntent();
        if (intent != null) {
            TextView name = findViewById(R.id.text1);
            TextView directions = findViewById(R.id.text2);
            name.setText(intent.getCharSequenceExtra("RecipeName"));
            directions.setText(intent.getCharSequenceExtra("RecipeDirections"));
        }
    }
}
