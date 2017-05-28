package com.example.arif.factoryinventory;

import com.orm.SugarRecord;

/**
 * Created by Arif on 5/4/2017.
 */

public class Employee extends SugarRecord {
    String name;
    Integer id;
    Integer salary;

    public Employee(){}

    public Employee(String name,Integer id,Integer salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public String toString(){
        return "Name:"+name.toString()+" Salary:"+salary.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer GetId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
