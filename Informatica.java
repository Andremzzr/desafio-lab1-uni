public class Informatica extends Loja {

    private double seguroEletronicos;

    public Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, 
                     Endereco endereco, Data dataFundacao, double seguroEletronicos, int qtdMaxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdMaxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    //GETTERS
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    //SETTERS
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() + " Seguro eletronico: " + seguroEletronicos;
    }
    
}
