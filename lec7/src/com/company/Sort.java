package com.company;

public class Sort {
    //Return the index of the smallest string starting with k ([0, 2, 3], 1) --> 1
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

    // Returns inputs in sorted order, sorting only the last k items
    public static String[] sort (String[] inputs, int k){
        if (k==inputs.length){
            return inputs;
        }
        int minDex = indexOfSmallest(inputs, k);
        swap(inputs, k, minDex);
        // move smallest item to front
        //sort rest of the stuff
        return sort(inputs, k+1);
    }

    private static void swap(String[] input, int a, int b){
        String temp = input[a];
        input[a]=input[b];
        input[b]=temp;
    }
    //Return inputs in sorted order, where a<z and is nondescructive
    public static String[] sort(String[] inputs){
        return sort(inputs,0);
    }
    public static void main(String[] args){
        String[] inputs = {"milvia", "zero", "josh", "trump"};
        String[] outputs=sort(inputs);
        for (int i=0; i<outputs.length; i++){
            System.out.println(outputs[i]);
        }
    }
}
