package Processo;




public class Atividade4 {

	public static void main(String[] args) {
	
		final int distancia = 100; 
        final int velocidadeCarro = 110;
        final int velocidadeCaminhao = 80;
        final int tempoPedagio = 5;

        double tempoCarro = distancia/velocidadeCarro;
        double tempoCaminhao = (distancia/velocidadeCaminhao) + (2*tempoPedagio);

        double distanciaCarro = tempoCarro * velocidadeCarro;
        double distanciaCaminhao = tempoCaminhao * velocidadeCaminhao;

        if (distanciaCarro < distanciaCaminhao) {
            System.out.println("O carro estará mais próximo à cidade de Ribeirão Preto.");

        } else {
            System.out.println("O caminhão estará mais próximo à cidade de Ribeirão Preto.");
        }
	}

}
