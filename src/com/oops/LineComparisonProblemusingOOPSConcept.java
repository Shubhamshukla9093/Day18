package com.oops;

class Cust {
    int id;
    String name;
    Cust(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public void printCustomer()
    {
        System.out.println("The Id is " + id);
        System.out.println("The name is " + name);
    }
}

class GFG {
    public static void main(String[] args)
    {
        Cust c1;
        c1 = new Cust(25, "Shubham");
        c1.printCustomer();
    }
}