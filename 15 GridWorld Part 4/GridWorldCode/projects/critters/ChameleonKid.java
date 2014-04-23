// Nicholas Romanoff
// Period One
// Homework #15 GridWorld Part 4
// 2014-04-21

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter {

	public void processActors(ArrayList<Actor> actors) {
        	int n = actors.size();
        	if (n == 0) {
            		setColor(getColor().darker());
			return;
		}
		Color startingColor = getColor();
		for (Actor actor : actors) {
			if ((getDirection() == getDirectionToward(actor.getLocation())) ||
			   ((getDirection() + HALF-CIRCLE) ==
			     getDirectionToward(actor.getLocation())) ||
			   ((getDirection() - HALF-CIRCLE) ==
			     getDirectionToward(actor.getLocation()))) {
       				Actor other = actors.get(r);
        			setColor(actor.getColor());
			}
		}
		if (startingColor == getColor()) {
			setColor(getColor().darker());
		}
    	}
}
