package SpiralBug;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.UnboundedGrid;

public class SpiralBugRunner {
    public static void main(String[] args){
        UnboundedGrid grid = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld(grid);
        world.add(new SpiralBug(0));
        world.add(new Rock());
        world.show();
    }
}
