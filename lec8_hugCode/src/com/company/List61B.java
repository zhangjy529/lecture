package com.company;

/** Define a list interface for all lists present, past,
 * future, amen. */
public interface List61B<Blorp> {
    public void insertFront(Blorp x);
    public Blorp getFront();
    public void insertBack(Blorp x);
    public Blorp getBack();
    public Blorp deleteBack();
    public int size();
    public Blorp get(int position);
    public void insert(Blorp item, int position);

    // Spcify a default method that subclasses should inherit from an interface
    // Could not use info from AList or Slist
    // works for all classes below it
    default public void print() {
        for (int i = 0; i < size(); i += 1) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
}
