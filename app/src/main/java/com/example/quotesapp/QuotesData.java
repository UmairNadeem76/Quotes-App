package com.example.quotesapp;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {
    public static List<QuotesList> getLifeQuotes() {
        final List<QuotesList> lifeQuoteList = new ArrayList<>();

        QuotesList lifeQuote1 = new QuotesList("Life is a mountain. Your goal is to find your path not reach the top.", "Maxime Lagace");
        lifeQuoteList.add(lifeQuote1);

        QuotesList lifeQuote2 = new QuotesList("Life is what happens when you're busy making other plans.", "John Lennon");
        lifeQuoteList.add(lifeQuote2);

        QuotesList lifeQuote3 = new QuotesList("The purpose of life is not to be happy. It is to be useful, to be honorable, to be compassionate, to have it make some difference that you have lived and lived well.", "Ralph Waldo Emerson");
        lifeQuoteList.add(lifeQuote3);

        QuotesList lifeQuote4 = new QuotesList("In the end, it's not the years in your life that count. It's the life in your years.", "Abraham Lincoln");
        lifeQuoteList.add(lifeQuote4);

        return lifeQuoteList;
    }

    public static List<QuotesList> getMotivationQuotes() {
        final List<QuotesList> motivationQuoteList = new ArrayList<>();

        QuotesList motivationQuote1 = new QuotesList("The only way to do great work is to love what you do.", "Steve Jobs");
        motivationQuoteList.add(motivationQuote1);

        QuotesList motivationQuote2 = new QuotesList("The harder you work for something, the greater you'll feel when you achieve it.", "Anonymous");
        motivationQuoteList.add(motivationQuote2);

        QuotesList motivationQuote3 = new QuotesList("Don't watch the clock; do what it does. Keep going.", "Sam Levenson");
        motivationQuoteList.add(motivationQuote3);

        QuotesList motivationQuote4 = new QuotesList("Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful.", "Albert Schweitzer");
        motivationQuoteList.add(motivationQuote4);

        return motivationQuoteList;
    }

    public static List<QuotesList> getLoveQuotes() {
        final List<QuotesList> loveQuoteList = new ArrayList<>();

        QuotesList loveQuote1 = new QuotesList("Love is composed of a single soul inhabiting two bodies.", "Aristotle");
        loveQuoteList.add(loveQuote1);

        QuotesList loveQuote2 = new QuotesList("To love and be loved is to feel the sun from both sides.", "David Viscott");
        loveQuoteList.add(loveQuote2);

        QuotesList loveQuote3 = new QuotesList("Love recognizes no barriers. It jumps hurdles, leaps fences, penetrates walls to arrive at its destination full of hope.", "Maya Angelou");
        loveQuoteList.add(loveQuote3);

        QuotesList loveQuote4 = new QuotesList("The best thing to hold onto in life is each other.", "Audrey Hepburn");
        loveQuoteList.add(loveQuote4);

        return loveQuoteList;
    }

    public static List<QuotesList> getSuccessQuotes() {
        final List<QuotesList> successQuoteList = new ArrayList<>();

        QuotesList successQuote1 = new QuotesList("Success is not final, failure is not fatal: It is the courage to continue that counts.", "Winston Churchill");
        successQuoteList.add(successQuote1);

        QuotesList successQuote2 = new QuotesList("Success usually comes to those who are too busy to be looking for it.", "Henry David Thoreau");
        successQuoteList.add(successQuote2);

        QuotesList successQuote3 = new QuotesList("The way to get started is to quit talking and begin doing.", "Walt Disney");
        successQuoteList.add(successQuote3);

        QuotesList successQuote4 = new QuotesList("Don't be afraid to give up the good to go for the great.", "John D. Rockefeller");
        successQuoteList.add(successQuote4);

        return successQuoteList;
    }

    public static List<QuotesList> getEnglishQuotes() {
        final List<QuotesList> englishQuoteList = new ArrayList<>();

        QuotesList englishQuote1 = new QuotesList("The limits of my language mean the limits of my world.", "Ludwig Wittgenstein");
        englishQuoteList.add(englishQuote1);

        QuotesList englishQuote2 = new QuotesList("To have another language is to possess a second soul.", "Charlemagne");
        englishQuoteList.add(englishQuote2);

        QuotesList englishQuote3 = new QuotesList("Language is the road map of a culture. It tells you where its people come from and where they are going.", "Rita Mae Brown");
        englishQuoteList.add(englishQuote3);

        QuotesList englishQuote4 = new QuotesList("The more that you read, the more things you will know. The more that you learn, the more places you'll go.", "Dr. Seuss");
        englishQuoteList.add(englishQuote4);

        return englishQuoteList;
    }

}