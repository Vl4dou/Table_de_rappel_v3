package com.example.tablederappelv3.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tablederappelv3.Model.case_table;
import com.example.tablederappelv3.R;

import java.util.List;


public class case_table_adapter extends BaseAdapter {

    // Attributs
    private Context context;
    private List<case_table> case_table_list;
    private LayoutInflater inflater;

    // Constructor
    public case_table_adapter(Context context, List<case_table> case_table_list)
    {
        this.context=context;
        this.case_table_list=case_table_list;
        this.inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return case_table_list.size();
    }

    @Override
    public Object getItem(int position) {
        return case_table_list.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.adapter_item_table,null);

        // get information about item

        case_table currentItem = (case_table) getItem(i);
        String num= currentItem.getNum();
        String itemNom= currentItem.getNom();
        String itemDebut = currentItem.getDebut();
        String itemFin= currentItem.getFin();

        // get image view
        ImageView imView = view.findViewById(R.id.imageTable);
        String NomDeLimage= "img" + num;
        int resId= context.getResources().getIdentifier(NomDeLimage, "drawable", context.getPackageName());
        imView.setImageResource(resId);

        // get item name view
        TextView numImageTableView = view.findViewById(R.id.numeroImageTable);
        numImageTableView.setText(num);

        TextView nomImageTableView = view.findViewById(R.id.nomImageTable);
        nomImageTableView.setText(itemNom);

        TextView debutImageTableView = view.findViewById(R.id.debut_image_table);
        debutImageTableView.setText(itemDebut);

        TextView finImageTableView = view.findViewById(R.id.fin_image_table);
        finImageTableView.setText(itemFin);

        return view;
    }
}
