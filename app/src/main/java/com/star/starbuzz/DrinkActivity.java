package com.star.starbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    private ImageView mImageView;
    private TextView mNameTextView;
    private TextView mDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        mImageView = (ImageView) findViewById(R.id.photo);
        mNameTextView = (TextView) findViewById(R.id.name);
        mDescriptionTextView = (TextView) findViewById(R.id.description);

        Drink drink = Drink.drinks[getIntent().getIntExtra(EXTRA_DRINKNO, 0)];

        mImageView.setImageResource(drink.getImageResourceId());
        mImageView.setContentDescription(drink.getName());
        mNameTextView.setText(drink.getName());
        mDescriptionTextView.setText(drink.getDescription());
    }

}
