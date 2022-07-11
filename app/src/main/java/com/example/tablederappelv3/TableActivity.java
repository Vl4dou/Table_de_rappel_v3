package com.example.tablederappelv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class TableActivity extends AppCompatActivity {

    private TextView titreTable;
    private Button boutonAccueil;
    private ImageView image01;
    private ImageView image02;
    private ImageView image03;
    private ImageView image04;
    private ImageView image05;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        titreTable=(TextView) findViewById(R.id.titreTable);
        boutonAccueil=(Button) findViewById(R.id.boutonAccueil);
        image01=(ImageView) findViewById(R.id.image01);
        image01=(ImageView) findViewById(R.id.image02);
        image01=(ImageView) findViewById(R.id.image03);
        image01=(ImageView) findViewById(R.id.image04);
        image01=(ImageView) findViewById(R.id.image05);

        this.image01.setImageResource(getResources().getIdentifier("img01", "drawable", getPackageName()));

        this.boutonAccueil.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activeMainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activeMainActivity);
                finish();
            }
        });
    }
}