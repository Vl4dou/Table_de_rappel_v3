package com.example.tablederappelv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class QuizzActivity extends AppCompatActivity {

    private TextView titre;
    private TextView enonce;
    private ImageView image;
    private Button boutonRevele;
    private Button boutonSuivant;
    private Button boutonQuizz;
    private Button boutonAccueil;

    private int nombrealeatoire;
    private String strnombrealeatoire;
    private String nomImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);

        titre=(TextView) findViewById(R.id.titre);
        enonce=(TextView) findViewById(R.id.enonce);
        image=(ImageView) findViewById(R.id.image);
        boutonRevele=(Button) findViewById(R.id.boutonRevele);
        boutonSuivant=(Button) findViewById(R.id.boutonSuivant);
        boutonQuizz=(Button) findViewById(R.id.boutonQuizz);
        boutonAccueil=(Button) findViewById(R.id.boutonAccueil);

        init();

        majEnonce();

        this.boutonRevele.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent activeImageActivity = new Intent(getApplicationContext(), ImageActivity.class);
                activeImageActivity.putExtra("nombrealeatoire", nombrealeatoire);
                startActivity(activeImageActivity);
                finish();
            }
        });

        this.boutonSuivant.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                majEnonce();
            }
        });

        this.boutonAccueil.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activeMainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activeMainActivity);
                finish();
            }
        });
    }

    private void init(){

    }

    private void majEnonce(){
        nombrealeatoire=(int)(Math.random()*30);
        Log.i("DEBUG","Valeur:" + nombrealeatoire);
        String strnombrealeatoire = String.valueOf(nombrealeatoire);
        enonce.setText(strnombrealeatoire);
    }

    private void showImage2() {
        this.image.setImageResource(R.drawable.img02);
    }

}
