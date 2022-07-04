package com.example.tablederappelv3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView titre;
    private TextView enonce;
    private ImageView image;
    private Button boutonRevele;
    private Button boutonSuivant;

    private int nombrealeatoire;
    private String strnombrealeatoire;
    private String nomImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titre=(TextView) findViewById(R.id.titre);
        enonce=(TextView) findViewById(R.id.enonce);
        image=(ImageView) findViewById(R.id.image);
        boutonRevele=(Button) findViewById(R.id.boutonRevele);
        boutonSuivant=(Button) findViewById(R.id.boutonSuivant);

        init();

        majEnonce();

        this.boutonRevele.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage1();
            }
        });

        this.boutonSuivant.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                majEnonce();
            }
        });
    }

    private void init(){

    }

    private void majEnonce(){
        nombrealeatoire=(int)(Math.random()*2+1);
        Log.i("DEBUG","Valeur:" + nombrealeatoire);
        String strnombrealeatoire = String.valueOf(nombrealeatoire);
        enonce.setText(strnombrealeatoire);
    }

    private void showImage1() {
        nomImage="img" + nombrealeatoire;
        Log.i("enonce","Image:" + nomImage);
        //this.image.setImageResource(R.drawable.(nomImage))
        //iv.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()))
        this.image.setImageResource(getResources().getIdentifier(nomImage, "drawable", getPackageName()));
    }

    private void showImage2() {
        this.image.setImageResource(R.drawable.img2);
    }



}
