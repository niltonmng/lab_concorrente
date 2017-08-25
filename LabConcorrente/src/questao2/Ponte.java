package questao2;
import java.util.ArrayList;
import java.util.List;

public class Ponte implements Runnable {

	private List<String> fila;
	
	public Ponte() {
		this.fila = new ArrayList<>();
	}
	
	
	public void carro(String carro) {
		fila.add(carro);
	}

	@Override
	public void run() {
		String primeiro = this.fila.get(0);
		for (int i = 0; i < fila.size(); i++) {
			if (this.fila.contains(primeiro)) {
				if(primeiro.equals("A"))
					System.out.println("Passei carro A --> B");
				else
					System.out.println("Passei carro B --> A");
				this.fila.remove(primeiro);
			} 
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		if(!this.fila.isEmpty()) {
			primeiro = this.fila.get(0);
			while(!this.fila.isEmpty()) {
				if (this.fila.contains(primeiro)) {
					if(primeiro.equals("A"))
						System.out.println("Passei carro A --> B");
					else
						System.out.println("Passei carro B --> A");
					this.fila.remove(primeiro);
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
