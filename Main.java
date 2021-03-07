//Factory Method
package com.company;
public class Main {
    public static void main(String[] args) {
        Maker maker = getMakerByName("Ship");
        Transport TrDeliver = maker.createDeliver();
        TrDeliver.deliver();
    }
    public static Maker getMakerByName(String maker){
        if (maker.equals("Truck")) return new TruckMaker();
        else if (maker.equals("Ship")) return new ShipMaker();
        throw new RuntimeException("unsupported transport production line "  + maker);
    }
}
interface Transport {
    void deliver();
}
class Truck implements Transport {
    public  void  deliver(){
        System.out.println("fruits");
    }
}
class Ship implements Transport {
    public  void  deliver(){
        System.out.println("box");
    }
}
interface Maker{
    Transport createDeliver();
}
class TruckMaker implements Maker
{
    public Transport createDeliver ()
    {
        return new Truck();
    }
}
class ShipMaker implements Maker {
    public Transport createDeliver() {
        return new Ship();
    }
}
