package Processo;

public class Numeros {
	
	private String nome;
    private Integer numero;

    public Numeros() {
    }
    public Numeros(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
    public String toString(){
        return numero + ", ";
    }
}
