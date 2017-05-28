package com.example.arif.factoryinventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

public class CurrentState extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_state);
        TextView t1,t2,t3,t4,t5,t6;
        Integer netprofit=0,salesamt=0,productcost=0,empno=0,prodno=0,salesno=0,esum=0;
        List<Employee> liste=Employee.listAll(Employee.class);
        List<Product> listp=Product.listAll(Product.class);
        List<Sales> lists=Sales.listAll(Sales.class);

        empno=liste.size();
        prodno=listp.size();
        salesno=lists.size();

        Iterator<Product> itrp=listp.iterator();
        Iterator<Sales> itrs=lists.iterator();
        Iterator<Employee> itre=liste.iterator();
        while(itre.hasNext()){
            Employee eo=itre.next();
            esum+=eo.salary;
        }
        while(itrp.hasNext()){
            Product po=itrp.next();
            productcost+=po.count*po.price;

        }
        while(itrs.hasNext()){
            Sales so=itrs.next();
            salesamt+=so.count*so.price;

        }
        netprofit=salesamt-(esum+productcost);
        t1=(TextView)findViewById(R.id.one);
        t1.setText(empno.toString());
        t2=(TextView)findViewById(R.id.two);
        t2.setText(prodno.toString());
        t3=(TextView)findViewById(R.id.three);
        t3.setText(salesno.toString());
        t4=(TextView)findViewById(R.id.four);
        t4.setText(productcost.toString());
        t5=(TextView)findViewById(R.id.five);
        t5.setText(salesamt.toString());
        t6=(TextView)findViewById(R.id.six);
        t6.setText(netprofit.toString());

    }
}
