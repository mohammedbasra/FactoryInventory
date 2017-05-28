package com.example.arif.factoryinventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SalesListView extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_list_view);
        List<Sales> listS=Sales.listAll(Sales.class);
        listView=(ListView)findViewById(R.id.sales_list);
        ArrayList<String> arr= new ArrayList<String>();
        Iterator<Sales> itr = listS.iterator();
        while(itr.hasNext()){
            Sales ss = itr.next();
            arr.add(ss.toString());
        }
        adapter=new ArrayAdapter<String>(SalesListView.this,android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(adapter);
       
    }
}
