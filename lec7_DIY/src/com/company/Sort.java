package com.company;

public class Sort {

    /** Returns input strings in sorted order.
     * Non-destructive. */
    public static int indexOfSmallest(String[] inputs, int k) {
		/* The index of the smallest known so far. */
        int minDex = k;

        for (int i = k; i < inputs.length; i += 1) {
            int cmp = inputs[i].compareTo(inputs[minDex]);

            if (cmp < 0) {
                minDex = i;
            }
        }
        return minDex;

    }

    /** Returns inputs in sorted order, sorting only the last
     k items.
     ([5, 3, 8, 1], 1) --> [5, 1, 3, 8] */
    private static String[] sort(String[] inputs, int k) {
        if (k == inputs.length) {
            return inputs;
        }

        int minDex = indexOfSmallest(inputs, k);
        swap(inputs, k, minDex);
        // move smallest item to front
        // sort rest of the stuff

        return sort(inputs, k + 1);
    }

    private static void swap(String[] input, int a, int b) {
        String temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
    /** Prints out all strings in inputs. */
    public static void print(String[] inputs) {
        for (int i=0; i<inputs.length; i++){
            System.out.println(inputs[i]);
        }
    }

    /** Outputs the command line arguments
     * in alphabetical order. */
    public static void main(String[] args) {
        String [] inputs={"apple", "pear", "banana", "orange"};
        print(inputs);
        String [] outputs = sort(inputs, 0);
        System.out.println("----------------------------");
        print(outputs);
    }
}
