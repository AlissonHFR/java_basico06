package java_basico06;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {
		
		String[] carros = {"civic","gol","palio","uno"};
		
		
		
		for(String carro : carros) {
			System.out.println("Carro: "+ carro);
		}

	}

}
