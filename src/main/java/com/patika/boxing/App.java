package com.patika.boxing;


public class App 
{
    public static void main( String[] args )
    {
        Boxer marc = new Boxer ("Marc", 15, 100, 90, 30);
        Boxer alex = new Boxer ("Alex", 10, 95, 100, 40);
        Ring r = new Ring (marc, alex, 90, 100);
        r.run();
    }
}
