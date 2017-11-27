package SpiralBug;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Flower;

public class SpiralBug extends Bug {

    private int steps;
    private int sideLength;
    private boolean x = false;
    private int y = 0;

    SpiralBug(int length) {
        steps = 0;
        sideLength = length;
    }

    public void SpiralBug(int length) {
        steps = 0;
        sideLength = length;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean canMove() {
        Grid<Actor> gr = getGrid();
        if (gr == null) {
            return false;
        }
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next)) {
            return false;
        }
        Actor neighbor = gr.get(next);
        return (neighbor == null);
// ok to move into empty location or onto flower
// not ok to move onto any other actor
    }

    @Override
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
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, loc);
    }

    @Override
    public void act() {
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        } else {
            turn();
            turn();
            steps = 0;
            x = !x;
            if (canMove() == false) {
                y++;
            }
            if (canMove() == true) {
                y = 0;
            }
            if (y > 5) {
                removeSelfFromGrid();
                Flower flower = new Flower(getColor());
                Location loc = getLocation();
                Grid<Actor> gr = getGrid();
                flower.putSelfInGrid(gr, loc);
            }
            if (x == false) {
                sideLength++;
            }
        }
    }
}