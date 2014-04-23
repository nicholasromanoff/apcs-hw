// Nicholas Romanoff
// Period One
// Homework #15 GridWorld Part 4
// 2014-04-21

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

public class RockHound extends Critter {

	public void processActors(ArrayList<Actor> actors) {
		for (Actor actor : actors) {
			if (!(actor instanceof Critter)) {
				actor.removeSelfFromGrid();
			}
		}
	}
}
