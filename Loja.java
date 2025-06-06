public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;


    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qtdMaxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdMaxProdutos];
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int qtdMaxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;        
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[qtdMaxProdutos];
    }

    // GETTERS
    public String getNome(){
        return nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public double gastosComSalario(){
        if(salarioBaseFuncionario == -1){
            return salarioBaseFuncionario;
        } 
        return quantidadeFuncionarios*salarioBaseFuncionario;
    }

    @Override
    public String toString() {
        String produtosString = "";
        for (int i = 0; i < estoqueProdutos.length; i++) {
            Produto produto = estoqueProdutos[i];
            if (produto != null) {
                produtosString += produto + " ";
            }
        } 
        return "Loja" + " nome: " + nome + " quantidade de funcionários: " + quantidadeFuncionarios + " salário base: " + salarioBaseFuncionario + " Endereço:" + endereco + " Data de fundação" + dataFundacao + " Estoque de Produtos: " + produtosString;   
    }

    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios <=10){
            return 'P';
        }

        else if (quantidadeFuncionarios <=30){
            return 'M';
        }

        else {
            return 'G';
        }
    }

    public void imprimeProdutos(){
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null) {
                System.out.println(estoqueProdutos[i]);
            }
        }
    }

    public boolean insereProduto(Produto produto){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] == null){
               estoqueProdutos[i] = produto;
               return true;  
            }
        }

        return false;
    }

     public boolean removeProduto(String nome){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome() == nome){
               estoqueProdutos[i] = null ;
               return true;  
            }
        }
        return false;
    }

}