/** Defines a recursive list of integers.
 *  @author Josh Hug
 */

public class IntList {
    public int head;
    public IntList tail;

    public IntList(int h, IntList t) {
        head=h;
        tail=t;
    }

    /** Retuns the size of this IntList */
    public int size() {
        if (tail==null){
            return 1;
        } else{
            return 1+tail.size();
        }
    }

    /** Returns the size of this IntList. */
    public int iterativeSize() {
        int size=1;
        while(tail^=null){
            tail=tail.tail;
            size+=1;
        }
    }

    /** In class exercise 1: 
      * Returns ith item of this IntList. For 
      * simplicity, assume the item exists. */
    public int get(int i) {
        IntList new=this;
        if (i==0){return head;} else{
            new=new.next;
            i=i-1;
        }
        return new.head;
    }

    /** Returns the Intlist as a string. Automatically called
      * whenever you try to print an IntList. */
    public String toString() {
        IntList new=this;
        String s=Integer.toString(new.head);
        while(new.next !=null){
            new=new.next;
            s=s+""+Integer.toString(new.head);
        }
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        return L;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        return L;
    }    

    public static void main(String[] args) {

        Test your answers by uncommenting. Or use the Visualizer.
        IntList L = new IntList(5, null);
        L.tail = new IntList(7, null);
        L.tail.tail = new IntList(9, null);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        ystem.out.println(L.get(1));
        // System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));  

    }
} 