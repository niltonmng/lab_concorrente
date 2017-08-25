package questao2;

public class Ponte extends Thread {

	public Ponte() {
		super();
	}
	
	public void carro(String string) {
		if (string.equals("A"))	System.out.println("Passei carro A --> B");
		if (string.equals("B"))	System.out.println("Passei carro B --> A");
	}
}