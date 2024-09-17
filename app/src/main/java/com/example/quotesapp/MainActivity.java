package com.example.quotesapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotesapp.categories.CategoriesAdapter;
import com.example.quotesapp.categories.CategoriesList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<CategoriesList> categoriesLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);

        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        // add categories to categoriesLists
        CategoriesList loveCategory = new CategoriesList("Love", R.drawable.love);
        categoriesLists.add(loveCategory); // add love category to categoriesLists

        CategoriesList motivationCategory = new CategoriesList("Motivation", R.drawable.motivation);
        categoriesLists.add(motivationCategory); // add motivation Category to categoriesLists

        CategoriesList englishCategory = new CategoriesList("English", R.drawable.english);
        categoriesLists.add(englishCategory); // add english Category to categoriesLists

        CategoriesList successCategory = new CategoriesList("Success", R.drawable.success);
        categoriesLists.add(successCategory); // add success Category to categoriesLists

        CategoriesList lifeCategory = new CategoriesList("Life", R.drawable.life);
        categoriesLists.add(lifeCategory); // add life Category to categoriesLists

        // set adapter to recyclerview
        categoriesRecyclerView.setAdapter(new CategoriesAdapter(categoriesLists, MainActivity.this));
    }
}