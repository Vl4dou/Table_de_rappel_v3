package com.example.tablederappelv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView titre;
    private Button boutonQuizz;
    private Button boutonTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titre = (TextView) findViewById(R.id.titre);
        boutonQuizz = (Button) findViewById(R.id.boutonQuizz);
        boutonTable = (Button) findViewById(R.id.boutonTable);


        this.boutonQuizz.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activeQuizzActivity = new Intent(getApplicationContext(), QuizzActivity.class);
                startActivity(activeQuizzActivity);
                finish();
            }
        });

        this.boutonTable.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activeTableActivity = new Intent(getApplicationContext(), TableActivity.class);
                startActivity(activeTableActivity);
                finish();
            }
        });
    }
}
