package com.example.tablederappelv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class TableActivity extends AppCompatActivity {

    private TextView titreTable;
    private Button boutonAccueil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        titreTable=(TextView) findViewById(R.id.titreTable);
        boutonAccueil=(Button) findViewById(R.id.boutonAccueil);

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