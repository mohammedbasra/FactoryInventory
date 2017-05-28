package com.example.arif.factoryinventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductListView extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list_view);
        List<Product> listP=Product.listAll(Product.class);
        listView=(ListView)findViewById(R.id.product_list);
        ArrayList<String> arr= new ArrayList<String>();
        Iterator<Product> itr = listP.iterator();
        while(itr.hasNext()){
            Product pp =(Product) itr.next();
            arr.add(pp.toString());
        }
        adapter=new ArrayAdapter<String>(ProductListView.this,android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(adapter);
    }
}
