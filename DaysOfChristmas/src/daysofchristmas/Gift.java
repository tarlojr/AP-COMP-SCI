package daysofchristmas;

public abstract class Gift {
    double price;
    String name;
    int day;
    public Gift(double p,String n){
        price = p;
        name = n;
    }
    public double getPrice(){
        return price;
    }
    public int getDay(){
        return day;
    }
    public String getName(){
        return name;
    }
}
