// Nicholas Romanoff
// Period One
// Homework #15 GridWorld Part 4
// 2014-04-21

package info.gridworld.actor;

import info.gridworld.grid.Location;
import java.util.ArrayList;

public class Critter extends Actor {

	public void act() {
		if (getGrid() != null) {
			processActors(getActors());
			makeMove(selectMoveLocation(getMoveLocations()));
		}
	}

	public ArrayList<Actor> getActors() {
		return getGrid().getNeighbors(getLocation());
	}

	public void processActors(ArrayList<Actor> actors) {
		for (Actor actor : actors) {
			if ((!(actor instanceof Critter)) 
			   && (!(actor instanceof Rock))) {
				actor.removeSelfFromGrid();
			}
		}
	}
				
	public ArrayList<Location> getMoveLocations() {
		return getGrid().getEmptyAdjacentLocations(getLocation());
	}

	public Location selectMoveLocation(ArrayList<Location> locations) {
		int options = locations.size();
		if (options <= 0) {
			return getLocation();
		}
		return locations.get((int) (Math.random() * options));
	}

	public void makeMove(Location location) {
		if (location == null) {
			removeSelfFromGrid();
		}
		else {
			moveTo(location);
		}
	}
}
