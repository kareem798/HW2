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
		if(collectCount == collectibles.length) {
			Collectible[] newCollectibles = new Collectible[collectibles.length * 2];
			for(int i = 0; i < collectibles.length; i++) {
				newCollectibles[i] = collectibles[i];
			}
			collectibles = newCollectibles;
		}
		collectibles[collectCount] = collectible;
		collectCount++;
	}

	@Override
	public float getTotalWeight() {
		float totalWeight = 0.f;
		for(int i = 0; i < collectCount; i++) {
			totalWeight += collectibles[i].getWeight();
		}
		return totalWeight;
	}

	@Override
	public int getCurrentCount() {
		
		return collectCount;
	}

	
	public Collectible[] getCollArr() {
		
		return collectibles;
	}
}
