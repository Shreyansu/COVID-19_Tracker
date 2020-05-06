package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailCountryActivity extends AppCompatActivity {

    private int positionCountry;
    private TextView country,cases,todayCases,death,todayDeath,active,critical,recovered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_country);

        Intent intent  = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Data of " + CountryActivity.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        country = (TextView)findViewById(R.id.zCountry);
        cases = (TextView)findViewById(R.id.zCases);
        todayCases = (TextView)findViewById(R.id.zTodayCases);
        todayDeath = (TextView)findViewById(R.id.ztodayDeath);
        death = (TextView)findViewById(R.id.zDeaths);
        active = (TextView)findViewById(R.id.zActive);
        critical = (TextView)findViewById(R.id.zCritical);
        recovered = (TextView)findViewById(R.id.zRecovered);

        country.setText(CountryActivity.countryModelList.get(positionCountry).getCountry());
        cases.setText(CountryActivity.countryModelList.get(positionCountry).getCases());
        todayCases.setText(CountryActivity.countryModelList.get(positionCountry).getTodayCases());
        todayDeath.setText(CountryActivity.countryModelList.get(positionCountry).getTodayDeath());
        death.setText(CountryActivity.countryModelList.get(positionCountry).getDeath());
        active.setText(CountryActivity.countryModelList.get(positionCountry).getActiveCases());
        critical.setText(CountryActivity.countryModelList.get(positionCountry).getCritical());
        recovered.setText(CountryActivity.countryModelList.get(positionCountry).getRecovered());












    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if(item.getItemId() == R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
