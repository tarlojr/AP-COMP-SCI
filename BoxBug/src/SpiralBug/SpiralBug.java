package SpiralBug;
import info.gridworld.actor.Bug;

public class SpiralBug extends Bug {
    private int steps;
    private int sideLength;
    public void SpiralBug(int length){
        steps = 0;
        sideLength = length;
    }
    public void act(){
        if(steps< sideLength && canMove()){
            move();
            turn();
            turn();
            steps++;
        }
        else{
            turn();
            turn();
            steps = 0;
        }
    }
    
}