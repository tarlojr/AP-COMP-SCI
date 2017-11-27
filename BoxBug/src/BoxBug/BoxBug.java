package BoxBug;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class BoxBug extends Bug{
    private int steps;
    private int sideLength;
    boolean x = false;
    int y = 0;
    
    BoxBug(int l){
    sideLength = l;
    steps = 0;
    }
    
    @Override
    public void act(){
        if (steps < sideLength && canMove()) {
            move();
            steps++;
            if(y == 4){
                Grid gr = getGrid();
                int u = (int)(Math.random())*(gr.getNumRows());
                int i = (int)(Math.random())*(gr.getNumCols());
                Location loc = new Location(u, i);
            }
        } 
        else{
            turn();
            turn();
            steps = 0;
            x = !x;
            if(x == true){
                y++;
            }
            if(x == false){
                
            }
        }
    }
}
