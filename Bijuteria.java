public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int qtdMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdMaxProdutos);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double metaVendas, int qtdMaxProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qtdMaxProdutos);
        this.metaVendas = metaVendas;
    }

    //GETTERS
    public double getMetaVendas() {
        return metaVendas;
    }

    //SETTERS
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() + " meta de vendas: " + metaVendas;
    }
}