package daysofchristmas;

import java.util.ArrayList;

public class DaysOfChristmasMain {
    public static void main(String[] args) {
        ArrayList<Gift> AList = new ArrayList<Gift>();
        AList.add(new aPartridgePearTree());
        System.out.println(AList.get(0).getPrice());
        
        System.out.println("Welcome to the 12 day's of hell");
        System.out.println();
        
    }
}
