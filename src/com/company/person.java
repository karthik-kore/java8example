package com.company;

public class person {
    int id;
    String name;
    String company;

    public person(int id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return ("id:"+this.getId()+
                " name: "+ this.getName() +
                " company : " + this.getCompany());
    }
}
