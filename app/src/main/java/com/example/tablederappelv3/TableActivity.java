package com.example.tablederappelv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tablederappelv3.Adapters.case_table_adapter;
import com.example.tablederappelv3.Model.case_table;

import java.util.ArrayList;
import java.util.List;


public class TableActivity extends AppCompatActivity {

    private TextView titreTable;
    private Button boutonAccueil;
    private ImageView image01;
    private ImageView image02;
    private ImageView image03;
    private ImageView image04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        //Liste d'item

        List<case_table> case_tableList= new ArrayList<>();
        case_tableList.add(new case_table("00", "Roue", "_", "_"));
        case_tableList.add(new case_table("01", "Bougie", "_", "_"));
        case_tableList.add(new case_table("02", "Cygne", "_", "_"));
        case_tableList.add(new case_table("03", "Cochon", "_", "_"));
        case_tableList.add(new case_table("04", "Dartagnan", "_", "_"));
        case_tableList.add(new case_table("05", "Albert", "_", "_"));
        case_tableList.add(new case_table("06", "Escargot", "_", "_"));
        case_tableList.add(new case_table("07", "Boomerang", "_", "_"));
        case_tableList.add(new case_table("08", "Huitre", "_", "_"));
        case_tableList.add(new case_table("09", "Oeuf", "_", "_"));
        case_tableList.add(new case_table("10", "Toreau", "T", "o"));
        case_tableList.add(new case_table("11", "Tintin", "T", "in"));
        case_tableList.add(new case_table("12", "Terminator", "T", "eu/eur/or"));
        case_tableList.add(new case_table("13", "Toit", "T", "oi"));
        case_tableList.add(new case_table("14", "Théatre", "T", "ate/atre"));
        case_tableList.add(new case_table("15", "Tipiac", "T", "k"));
        case_tableList.add(new case_table("16", "Tasse", "T", "sse"));
        case_tableList.add(new case_table("17", "Tablette", "T", "ette"));
        case_tableList.add(new case_table("18", "Truite", "T", "ite/iste/itre"));
        case_tableList.add(new case_table("19", "Tune", "T", "ne"));
        case_tableList.add(new case_table("20", "Nemo", "N", "o"));
        case_tableList.add(new case_table("21", "Nain", "N", "in"));
        case_tableList.add(new case_table("22", "Noeud", "N", "eu/eur/or"));
        case_tableList.add(new case_table("23", "Noix", "N", "oi"));
        case_tableList.add(new case_table("24", "Nattes", "N", "ate/atre"));
        case_tableList.add(new case_table("25", "Nordique", "N", "k"));
        case_tableList.add(new case_table("26", "NUPES", "N", "sse"));
        case_tableList.add(new case_table("27", "Navette", "N", "ette"));
        case_tableList.add(new case_table("28", "Nudiste", "N", "ite/iste/itre"));
        case_tableList.add(new case_table("29", "Naine", "N", "ne"));


        // get List view
        GridView TableGridView = findViewById(R.id.TableGridView);
        TableGridView.setAdapter(new case_table_adapter(this,case_tableList));

    }
}