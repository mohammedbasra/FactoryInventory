package com.example.arif.factoryinventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class SalesManager extends AppCompatActivity {

    Button b;
    EditText name,id,price,count;
    Sales S= new Sales();
    String n,i,p,c;
    Integer ID,Price,Count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_manager);
        b = (Button)findViewById(R.id.salesSave);
        name=(EditText)findViewById(R.id.salesNameText);
        price=(EditText)findViewById(R.id.salesPriceText);
        id=(EditText)findViewById(R.id.salesIDText);
        count=(EditText)findViewById(R.id.salesCountText);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n=name.getText().toString();
                i=id.getText().toString();
                p=price.getText().toString();
                c=count.getText().toString();
                ID=Integer.parseInt(i);
                Price=Integer.parseInt(p);
                Count=Integer.parseInt(c);
                S=new Sales(n,ID,Count,Price);
                S.save();
            }
        });

    }
}
