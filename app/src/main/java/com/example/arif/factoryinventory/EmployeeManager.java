package com.example.arif.factoryinventory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class EmployeeManager extends AppCompatActivity {

    Button b;
    EditText name,id,salary;
    Employee e = new Employee();
    String n,i,s;
    Integer ID,Salary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_manager);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        b = (Button)findViewById(R.id.employeeSave);
        name=(EditText)findViewById(R.id.employeeNameText);
        salary=(EditText)findViewById(R.id.employeeSalaryText);
        id=(EditText)findViewById(R.id.employeeIDText);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                n=name.getText().toString();
                i=id.getText().toString();
                s=salary.getText().toString();
                ID=Integer.parseInt(i);
                Salary=Integer.parseInt(s);
                e=new Employee(n,(int)ID,Salary);
                e.save();

            }
        });

        // List<Employee> liste = Employee.listAll(Employee.class);
        
    }
}
