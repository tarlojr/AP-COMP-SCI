package SpiralBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;

public class SpiralBugRunner {
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new SpiralBug(1));
        world.add(new Rock());
        world.show();
    }
}
