package com.example.arif.factoryinventory;

import com.orm.SugarRecord;

/**
 * Created by Arif on 5/4/2017.
 */

public class Product extends SugarRecord{

    String name;
    Integer id;
    Integer count;
    Integer price;

    public Product(){}

    public Product(String name,Integer id,Integer count,Integer price){
        this.name=name;
        this.id=id;
        this.count=count;
        this.price=price;
    }

    public String toString(){
        return "Name:"+name+" Price:"+price.toString()+" Count:"+count.toString();
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
