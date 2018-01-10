package arrayplusmain;

import java.util.ArrayList;

public class ArrayPlus {
    private ArrayList<Integer> AL;
    
    public ArrayPlus(){
        AL = new ArrayList<Integer>();
    }
    
    public void randomize(int x, int y, int z){
        for(int c = 0; c<z; c++){
        AL.add((int)(Math.random()*(y-x+1)+x));
        }
    }
    
    public void bubbleSort(){
        for(int x = 1; x<AL.size(); x++){
            for(int a = 0; a<AL.size()-x; a++){
                if(AL.get(a)>AL.get(a+1)){
                    int p = AL.get(a+1);
                    AL.set(a+1, AL.get(a));
                    AL.set(a,p);
                }
            }
        }
    }
    
    public void display(){
        String l1 = "";
        for(int x = 0; x<AL.size(); x++){
            l1 += AL.get(x) +" ";
        }
        System.out.println(l1);
    }
}