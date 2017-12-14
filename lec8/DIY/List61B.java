/* TODO: Set up this interface so that it covers all common
 * methods to AList and SList. Also add a default method
 * print that prints a list. */
public interface List61B<Item> {
    public void insertFront(Item x);
    public void insertBack(Item x);
    public Item getFront();
    public Item getBack();
    public Item get(int i);
    public int size();
    public void insert(Item x, int position);

    default public void print(){
        for (int i=0; i<size(); i++){
            System.out.print(get(i)+" ");
        }
        System.out.println();
    }

} 