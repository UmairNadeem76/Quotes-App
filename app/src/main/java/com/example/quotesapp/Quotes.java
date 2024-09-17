package com.example.quotesapp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class Quotes extends AppCompatActivity {

    private TextView quoteTxt, writerName;

    private final List<QuotesList> quotesLists = new ArrayList<>();

    private int currentQuotePosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        final TextView categoryName = findViewById(R.id.categoryName);
        quoteTxt = findViewById(R.id.quoteTxt);
        writerName = findViewById(R.id.writerName);

        final Button prevBtn = findViewById(R.id.prevBtn);
        final Button nextBtn = findViewById(R.id.nextBtn);
        final ImageView copyBtn = findViewById(R.id.copyBtn);

        // get category name from CategoriesAdapter class
        final String getName = getIntent().getStringExtra("name");

        // set Category Name to TextView
        categoryName.setText(getName);

        // check category name and get quotes corresponding to the category name
        if(getName.equals("Life")){

            // get life quotes from QuotesData class
            quotesLists.addAll(QuotesData.getLifeQuotes());
        }
        else if(getName.equals("Success")){

            // get success quotes from QuotesData class
            quotesLists.addAll(QuotesData.getSuccessQuotes());
        }
        else if(getName.equals("Motivation")){

            // get motivation quotes from QuotesData class
            quotesLists.addAll(QuotesData.getMotivationQuotes());
        }
        else if(getName.equals("English")){

            // get english quotes from QuotesData class
            quotesLists.addAll(QuotesData.getEnglishQuotes());
        }
        else if(getName.equals("Love")){

            // get love quotes from QuotesData class
            quotesLists.addAll(QuotesData.getLoveQuotes());
        }

        setQuoteToTextView();

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentQuotePosition--;

                if(currentQuotePosition < 0){
                    currentQuotePosition = quotesLists.size() - 1;
                }

                setQuoteToTextView();
            }
        });

        copyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("quote", quotesLists.get(currentQuotePosition).getQuote()+"\nby "+quotesLists.get(currentQuotePosition).getWriter());
                clipboardManager.setPrimaryClip(clipData);
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentQuotePosition++;

                if(currentQuotePosition >= quotesLists.size()){
                    currentQuotePosition = 0;
                }

                setQuoteToTextView();
            }
        });
    }

    private void setQuoteToTextView(){

        quoteTxt.setText(quotesLists.get(currentQuotePosition).getQuote());
        writerName.setText(quotesLists.get(currentQuotePosition).getWriter());
    }
}