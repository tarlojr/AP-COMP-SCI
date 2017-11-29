package BoxBug;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class RollingRock extends Rock {

    public RollingRock(Color rockColor) {
        Rock rock = new Rock();
        setDirection(180);
        setColor(rockColor);
    }

    public void move() {
        Grid<Actor> gr = getGrid();
        if (gr == null) {
            return;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next)) {
            moveTo(next);
        } else {
            removeSelfFromGrid();
        }
    }

    @Override
    public void act() {
        move();
    }
}
/*
public Location selectMoveLocation(ArrayList<Location> locs) {
int n = locs.size();
if (n == 0) {
return getLocation();
}
int r = (int) (Math.random() * n);
return locs.get(r);
}
 * 
 */