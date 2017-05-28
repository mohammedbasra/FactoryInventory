package com.example.arif.factoryinventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeListView extends AppCompatActivity {
    ListView listView;

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list_view);
        List<Employee> listE=Employee.listAll(Employee.class);
        listView=(ListView)findViewById(R.id.employee_list);
        ArrayList<String> arr= new ArrayList<String>();
        Iterator<Employee> itr = listE.iterator();
        while(itr.hasNext()){
            Employee ee =(Employee) itr.next();
            arr.add(ee.toString());
        }
        adapter=new ArrayAdapter<String>(EmployeeListView.this,android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(adapter);
    }
}
