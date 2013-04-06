// Varatep Buranintu
// Austin Myers

// Graph interface

public interface GraphInterface {
	
	// calculate the rooms reachable from a given node in parameter
	public int[] calculateRoomsReachable(Node nd);
	// calculate the minimum work to open all doors so every room is reachable
	//	from a given node in parameter
	public int[] minWorkOpenDoors(Node nd);
	//calculate the least amount of work to open doors to
	//	move between any two rooms
	public int[] leastWorkOpenDoors(Node nd1, Node nd2);
	// calc total spookiness to go from one room to another
	public int totalSpookiness(Node nd1, Node nd2);
	// calc max spookiness of a path
	public int maxSpookiness(Node nd1, Node nd2);
	
	// will also be needing helper methods
	/*
		helper methods to consider:
			adding/removing rooms reachable (can also add/remove walls on side)
			method to take in from driver and make a graph of nodes of rooms
			method to check boundaries of rooms used in setting the 6
				maximum reachable rooms
			more to consider?
}