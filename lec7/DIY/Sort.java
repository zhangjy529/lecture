public class Sort {
	public static int indexOfSmallest(String[] inputs, int k){
		/**minDex is index of smallest string*/
		int minDex=k;
		for (int i=k; i<inputs.length; i++){
			int cmp=inputs[i].compareTo(inputs[minDex]);
			if (cmp<0){
				minDex=i;
			}
		}
		return minDex;
	}

	/** Returns input strings in sorted order.
	  * Non-destructive. */
	/*
	public static String[] Sort(String[] inputs) {

	}

	/** Prints out all strings in inputs. */
	/*
	public static void print(String[] inputs) {
	}

	/** Outputs the command line arguments 
	  * in alphabetical order. */
	public static void main(String[] args) {
		String[] s={"bbb","aaa", "ccc"};
		System.out.println(indexOfSmallest(s,0));
	}
} 