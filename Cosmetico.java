public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int qtdMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, 
                     Data dataFundacao, double taxaComercializacao, int qtdMaxProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdMaxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    //GETTERS
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    //SETTERS
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + " Taxa de comercialização: " + taxaComercializacao;
    }
}