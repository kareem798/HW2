package il.ac.tau.cs.software1.inventory;

/*
 * A simple array-based Inventory (Question 6).
 */
public class NaiveInventory implements Inventory {

	private static final int INITIAL_CAPACITY = 100;

	private Collectible[] collectibles;
	private int collectCount;

	public NaiveInventory() {
		this.collectibles = new Collectible[INITIAL_CAPACITY];
		collectCount = 0;
	}

	@Override
	public void collect(Collectible collectible) {
		if(collectibles.length == INITIAL_CAPACITY) {
			
		}
		collectibles[collectCount] = collectible;
		collectCount++;
	}

	@Override
	public float getTotalWeight() {
		// TODO: implement
		return 0.f;
	}

	@Override
	public int getCurrentCount() {
		// TODO: implement
		return 0;
	}

	// Returns the array of Collectibles that is stored in the field of this class
	public Collectible[] getCollArr() {
		// TODO: implement
		return null;
	}
}
