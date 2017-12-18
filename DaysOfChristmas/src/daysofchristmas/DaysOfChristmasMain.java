package daysofchristmas;

import java.util.ArrayList;
import java.util.Scanner;

public class DaysOfChristmasMain {
    public static void main(String[] args) {
        double price = 0;
        String name = "";
        int amount = 0;
        double price2 = 0;
        String name2 = "";
        ArrayList<Gift> AList = new ArrayList<Gift>();
        AList.add(new aPartridgePearTree());
        AList.add(new aaTwoTurtleDoves());
        //System.out.println(AList.get(0).getPrice());
        int i = 0;
        while(i == 0){
            Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the 12 day's of hell");
        System.out.println();
        System.out.println("please pick one thing to do");
        System.out.println("1 - 12) that day of christmas");
        System.out.println("13) exit");
        try{
        int x = s.nextInt();
        if(x<=12){
            for(int y = x-1; y>-1; y--){
                amount = y+1;
                price = price + AList.get(y).getPrice();
                name = name + "("+ amount +")" + AList.get(y).getName() + '\n';
            }
            System.out.println("You bought" + '\n' + name);
            System.out.println(price);
            
            for(int u = x-1; u>-1; u--){
                price2 = price2 + AList.get(u).getPrice();
                name2 = name2 + AList.get(u).getDay() + AList.get(u).getName() + '\n';
            }
        }
        else if(x == 13){
            System.out.println("exiting...");
            i++;
            System.out.println("exited");
        }
        else{
        System.out.println("Please enter a valid number");
        }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Please enter a valid number");
            System.out.println();
        }
        }
    }
}
