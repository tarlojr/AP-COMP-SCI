package daysofchristmas;

public abstract class Gift {
    double price;
    String name;
    int timesCalled;
    public Gift(double p,String n){
        price = p;
        name = n;
    }
    public double getPrice(){
        return price;
    }
    public int getTimesCalled(){
        return timesCalled;
    }
    public String getName(){
        return name;
    }
}
