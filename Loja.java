public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;


    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
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

    public double gastosComSalario(){
        if(salarioBaseFuncionario == -1){
            return salarioBaseFuncionario;
        } 
        return quantidadeFuncionarios*salarioBaseFuncionario;
    }

    @Override
    public String toString() {
        return "Loja" + " nome: " + nome + " quantidade de funcionários: " + quantidadeFuncionarios + "salário base: " + salarioBaseFuncionario ;
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

}