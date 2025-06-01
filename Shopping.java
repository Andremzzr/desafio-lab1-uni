public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    private int qtdMaxLojas;

     public Shopping(String nome, Endereco endereco, int qtdMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.qtdMaxLojas = qtdMaxLojas;
        this.lojas = new Loja[qtdMaxLojas];
     }

     public int getqtdMaxLojas() {
         return qtdMaxLojas;
     }

      public String getNome() {
        return nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void setNome(String nome) {
    this.nome = nome;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

     public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Shopping: " + nome + "Endereço: " + endereco + "Quantidade máxima de lojas: " + qtdMaxLojas + "Lojas: " + lojas;
    }

    
}
