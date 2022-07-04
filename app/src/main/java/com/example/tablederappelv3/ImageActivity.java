package com.example.tablederappelv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageActivity extends AppCompatActivity {

    private TextView titre;
    private TextView enonce;
    private ImageView image;
    private Button boutonRetour;

    private int nombrealeatoire;
    private String strnombrealeatoire;
    private String nomImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        titre=(TextView) findViewById(R.id.titre);
        enonce=(TextView) findViewById(R.id.enonce);
        image=(ImageView) findViewById(R.id.image);
        boutonRetour=(Button) findViewById(R.id.boutonRetour);

        Intent activeImageActivity = getIntent();

        if (activeImageActivity != null){
            int nombrealeatoire = activeImageActivity.getIntExtra("nombrealeatoire", 0);
            Log.i("nombre","nombre:" + nombrealeatoire);
            String strnombrealeatoire = String.valueOf(nombrealeatoire);
            enonce.setText(strnombrealeatoire);
            if (nombrealeatoire<10){
                nomImage="img0" + nombrealeatoire;
            }else {
                nomImage="img" + nombrealeatoire;
            }

            Log.i("enonce","Image:" + nombrealeatoire);
            this.image.setImageResource(getResources().getIdentifier(nomImage, "drawable", getPackageName()));
        }

        this.boutonRetour.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activeMainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(activeMainActivity);
                finish();
            }
        });
    }
}