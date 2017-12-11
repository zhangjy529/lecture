/** SList with additional operation printLostItems() which prints all items
  * that have ever been deleted. */
public class VengefulSList<Item> extends SList<Item>{
	private SList<Item> deleteItems;

	public VengefulSList(){
		super();
		deleteItems = new SList<Item>();
	}

	@Override

	public Item deleteBack(){
		Item oldBack = super.deleteBack();
		deleteItems.insertBack(oldBack);
		return oldBack;
	}

	public void printLostItems(){
		deleteItems.print();
	}

	public static void main(String[] args) {

		VengefulSList<Integer> vs1 = new VengefulSList<Integer>();
		vs1.insertBack(1);
		vs1.insertBack(5);
		vs1.insertBack(10);
		vs1.insertBack(13);
		// vs1 is now: [1, 5, 10, 13] 

		vs1.deleteBack();
		vs1.deleteBack();
		// After deletion, vs1 is: [1, 5]

		// Should print out the numbers of the fallen, namely 10 and 13.
		System.out.print("The fallen are: ");
		vs1.printLostItems();
	}
} 