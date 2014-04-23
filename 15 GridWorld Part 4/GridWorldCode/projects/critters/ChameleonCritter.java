// Nicholas Romanoff
// Period One
// Homework #15 GridWorld Part 4
// 2014-04-21

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class ChameleonCritter extends Critter {

	public void processActors(ArrayList<Actor> actors) {
        	int n = actors.size();
        	if (n == 0) {
            		setColor(getColor().darker());
		}
       		int r = (int) (Math.random() * n);
       		Actor other = actors.get(r);
        	setColor(other.getColor());
    	}

    	public void makeMove(Location loc) {
        	setDirection(getLocation().getDirectionToward(loc));
        	super.makeMove(loc);
    	}
}
