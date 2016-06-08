package com.hfad.ch2beeradviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.hfad.headfirstandroid.R;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    //Call when the user clicks the button
    public void onClickFindBeer(View view){
        //Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);

        // Get a reference to the Spinner
        Spinner color = (Spinner) findViewById((R.id.color));

        // Get the selected item in Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        BeerExpert beerExpert = new BeerExpert();
        List<String> theBrands = beerExpert.getBrands(beerType);

        StringBuilder brandsFormatted = new StringBuilder();

        for (String s : theBrands){
            brandsFormatted.append(s).append("\n");
        }

        // Display the selected item
        brands.setText(brandsFormatted);
    }

}
