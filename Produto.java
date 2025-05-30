public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    //GETTERS

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    //SETTERS
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + " nome: " + nome + " preco: " + preco;
    }

} 
