public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados)
 {  
    super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    this.produtosImportados = produtosImportados;

 }

    //GETTERS
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    //SETTERS
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + "Produtos importados: " + produtosImportados;
    }

}
