public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }


    //GETTERS

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    //SETTERS
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data data) {
        this.dataValidade = data;
    }

    public boolean estaVencido(Data dataComparacao){
        int anoValidade = this.dataValidade.getAno();
        int mesValidade = this.dataValidade.getMes();
        int diaValidade = this.dataValidade.getDia();

        int anoComparacao = dataComparacao.getAno();
        int mesComparacao = dataComparacao.getMes();
        int diaComparacao = dataComparacao.getDia();
        
        if (anoComparacao > anoValidade) {
            return true;
        }       
        else if (anoComparacao < anoValidade) {
                    return false;
        }

        if (mesComparacao > mesValidade) {
            return true;
        }
        else if (mesComparacao < mesValidade) {
            return false;
        }

        return diaComparacao >= diaValidade;

    }
        

    @Override
    public String toString() {
        return "Produto: " + " nome: " + nome + " preco: " + preco + "Data de validade:" + dataValidade;
        
    }

} 
