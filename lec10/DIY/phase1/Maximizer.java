public class Maximizer {
	public static Dog maxDog(Dog[] dogs) {
		if(dogs==null || dogs.length==0){
			return null;
		} else{
			Dog maxDog=dogs[0];
			for (Dog d:dogs){
				if (d.size>maxDog.size){
					maxDog=d;
				}
			}
			return maxDog;
		}
	}

	public static void main(String[] args) {
		Dog[] dogs = {new Dog("Elyse", 3), new Dog("Sture", 9),
		             new Dog("Artemesios", 15)};
		Dog maxDog = (Dog) maxDog(dogs);
		maxDog.bark();
	}
} 