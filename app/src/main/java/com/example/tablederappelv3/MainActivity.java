package com.example.tablederappelv3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private Button boutonRevele;
    private Button boutonSuivant;
    private Integer nombrealeatoire;
    private String enonce;
    private String strnombrealeatoire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.image = (ImageView) this.findViewById(R.id.image);

        this.boutonRevele = (Button) this.findViewById(R.id.boutonRevele);
        this.boutonSuivant = (Button) this.findViewById(R.id.boutonSuivant);

        this.nombrealeatoire=(int)(Math.random()*10);
        String strnombrealeatoire = String.valueOf(nombrealeatoire);
        TextView enonce = (strnombrealeatoire);

        this.boutonRevele.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage1();
            }
        });

        this.boutonSuivant.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                showImage2();
            }
        });
    }

    private void showImage1() {
        this.image.setImageResource(R.drawable.img1);
    }

    private void showImage2() {
        this.image.setImageResource(R.drawable.img2);
    }

}