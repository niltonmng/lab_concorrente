package questao2;

public class Main {

	public	static	void main(String[] args)	{
		Ponte p	= new Ponte();
		Thread t = new Thread(p);
		t.start();
		p.carro("A");
		p.carro("B");
		p.carro("A");
	}
}
