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

     public int getQtdMaxLojas() {
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

    public int quantidadeLojasPorTipo(String tipoLoja) {

        if (!tipoLoja.equals("Informática") && !tipoLoja.equals("Vestuário") && 
            !tipoLoja.equals("Alimentação") && !tipoLoja.equals("Bijuteria") && 
            !tipoLoja.equals("Cosmético")) {
            return -1;
        }

        int contador = 0;

        for (int i = 0; i < lojas.length; i++) {
            Loja loja = lojas[i];
            if (loja != null) {
                if ((tipoLoja.equals("Informática") && loja instanceof Informatica) || (tipoLoja.equals("Alimentação") && loja instanceof Alimentacao) || (tipoLoja.equals("Bijuteria") && loja instanceof Bijuteria) || (tipoLoja.equals("Vestuário") && loja instanceof Vestuario) || (tipoLoja.equals("Cosmético") && loja instanceof Cosmetico)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCaro = null;
        double maiorSeguro = 0.0;

        for (int i = 0; i < lojas.length; i++) {
            Loja loja = lojas[i];
            if (lojas[i] != null && lojas[i] instanceof Informatica) {
                Informatica lojaInfo = (Informatica) loja;
                if (lojaInfo.getSeguroEletronicos() > maiorSeguro ) {
                    lojaMaisCaro = lojaInfo;
                    maiorSeguro = lojaInfo.getSeguroEletronicos();
                }
            }
        } 

        return lojaMaisCaro;
    }

    @Override
    public String toString() {
        String lojasString = "";
        for (int i = 0; i < lojas.length; i++) {
            Loja loja = lojas[i];
            if (loja != null) {
                lojasString += loja + " ";
            }
        } 
        return "Shopping: " + nome + "Endereço: " + endereco + "Quantidade máxima de lojas: " + qtdMaxLojas + "Lojas: " + lojasString;
    }

    
}
