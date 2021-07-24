package com.exam;

public class Product {

    private String name;
    private int id;
    private int openingstock;
    private int unitprice;

    public Product(String name, int id, int openingstock, int unitprice) {
        this.name = name;
        this.id = id;
        this.openingstock = openingstock;
        this.unitprice = unitprice;
    }

    public int getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(int unitprice) {
        this.unitprice = unitprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOpeningstock() {
        return openingstock;
    }

    public void setOpeningstock(int openingstock) {
        this.openingstock = openingstock;
    }

}
