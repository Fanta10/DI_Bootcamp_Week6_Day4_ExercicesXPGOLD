package exercicesxpgold;

public class DogOwner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instance de la classe Dog avec le costructeur sans parametre
		Dog dog1 = new Dog();

		System.out.println("le temps de boire du dog1 est : " + dog1.getDrinkTime());
		System.out.println(" le dog1 est à : " + dog1.needsToGo());
		// instance de la classe Dog avec le costructeur sans parametre
		Dog dog2 = new Dog();
		// attribuer une valeur à l'attribut DrinkTime
		dog2.setDrinkTime(2);
		System.out.println("le temps de boire du dog2 est : " + dog2.getDrinkTime());
		System.out.println(" le dog2 est à : " + dog2.needsToGo());

	}

}
