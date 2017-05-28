package com.example.arif.factoryinventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

public class NewTerm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_term2);
        Integer netprofit=0,salesamt=0,productcost=0,empno=0,prodno=0,salesno=0,empamount=0;
        List<Employee> liste=Employee.listAll(Employee.class);
        List<Product> listp=Product.listAll(Product.class);
        List<Sales> lists=Sales.listAll(Sales.class);
        TextView t11=(TextView)findViewById(R.id.texta);
        empno=liste.size();
        prodno=listp.size();
        salesno=lists.size();
        Iterator<Employee> itre=liste.iterator();
        Iterator<Product> itrp=listp.iterator();
        Iterator<Sales> itrs=lists.iterator();
        while(itrp.hasNext()){
            Product po=itrp.next();
            productcost+=po.count*po.price;

        }
        while(itrs.hasNext()){
            Sales so=itrs.next();
            salesamt+=so.count*so.price;

        }
        while(itre.hasNext()){
            Employee eo=itre.next();
            empamount+=eo.salary;
        }
        netprofit=(salesamt-(empamount+productcost));
        if((netprofit)>0)t11.setText("Gained a profit of:"+netprofit.toString());
        else t11.setText("Incured a loss of:"+netprofit.toString());
        Sales.deleteAll(Sales.class);
        Product.deleteAll(Product.class);

    }
}
