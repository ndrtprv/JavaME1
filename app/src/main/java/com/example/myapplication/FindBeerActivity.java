package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert beerExpert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        TextView brands = findViewById(R.id.brands);

        Spinner color = findViewById(R.id.colors);

        String beerType = String.valueOf(color.getSelectedItem());

        beerExpert = new BeerExpert();
        brands.setText(beerExpert.getBrands(beerType));
        brands.setVisibility(View.VISIBLE);
    }
}