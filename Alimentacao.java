public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int qtdMaxProdutos)
    {  
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdMaxProdutos);
        this.dataAlvara = dataAlvara;

    }

    //GETTERS
    public Data getDataAlvara() {
        return dataAlvara;
    }

    //SETTERS
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() + "Data Alvara: " + dataAlvara;
    }
    
}
