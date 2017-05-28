package com.example.arif.factoryinventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class ProductManager extends AppCompatActivity {
    Button b;
    EditText name,id,price,count;
    Product P= new Product();
    String n,i,p,c;
    Integer ID,Price,Count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_manager);
        b = (Button)findViewById(R.id.productSave);
        name=(EditText)findViewById(R.id.productNameText);
        price=(EditText)findViewById(R.id.productPriceText);
        id=(EditText)findViewById(R.id.productIDText);
        count=(EditText)findViewById(R.id.productCountText);
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
                P=new Product(n,ID,Count,Price);
                P.save();
            }
        });
    }
}
