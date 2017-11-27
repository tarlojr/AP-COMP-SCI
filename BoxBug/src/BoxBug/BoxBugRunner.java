package BoxBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;

public class BoxBugRunner {
    public static void main(String[] args){
        ActorWorld world = new ActorWorld();
        world.add(new BoxBug(1));
        world.add(new Rock());
        world.show();
    }
}
