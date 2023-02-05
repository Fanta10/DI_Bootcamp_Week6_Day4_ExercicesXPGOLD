package exercicesxpgold;

/**
 * TODO: Add a description of the class.
 *
 */
public class Dog {
	
	//attribut
	private int DrinkTime = 7;
	
	//constructeur sans parametres
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructeur avec parametres
	public Dog(int drinkTime) {
		super();
		DrinkTime = drinkTime;
	}
	//getter et setter
	public int getDrinkTime() {
		return DrinkTime;
	}

	public void setDrinkTime(int drinkTime) {
		DrinkTime = drinkTime;
	}
	
	public boolean needsToGo() {
		if(getDrinkTime() > 4) {
			return true;
			
		}else {
			return false;
			
		}
		
		
	}
	
	

}
