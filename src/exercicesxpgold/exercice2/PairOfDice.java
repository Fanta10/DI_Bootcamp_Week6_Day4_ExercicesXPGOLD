package exercicesxpgold.exercice2;



public class PairOfDice {
	//attributs
	private int die1;
	private int die2;
	
	//costructeur sans parametres
	public PairOfDice() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	//costructeur avec parametres
	public PairOfDice(int die1, int die2) {
		super();
		this.die1 = die1;
		this.die2 = die2;
	}
	
	//getters et setters
	public int getDie1() {
		return die1;
	}



	public void setDie1(int die1) {
		this.die1 = die1;
	}



	public int getDie2() {
		return die2;
	}



	public void setDie2(int die2) {
		this.die2 = die2;
	}
	
	//methode
	private static int Compter(int die1, int die2) {
		int compteur = 0;
		do {
			
            die1 = (int) (1 + Math.random() * (6 - 1));
            die2 = (int) (1 + Math.random() * (6 - 1));
            compteur++;
            System.out.println("le total des deux dés est : " + (die1 + die2));
			
		}while((die1 + die2) != 2);
		return compteur;
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairOfDice result = new PairOfDice();
		System.out.println("le nombre de fois une paire de dés est lancée, avant que " +
			"le total des deux dès soit égal à 2 est : " + PairOfDice.Compter(0, 0));
		
		

	}

}
