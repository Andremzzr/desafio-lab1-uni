public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! A data será ajustada para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean verificaAnoBissextoPorAno(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    private boolean dataValida(int dia, int mes, int ano) {
        
        if (mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int fevereiro = 28;
        if (verificaAnoBissextoPorAno(ano)) {
            fevereiro = 29;
        }

        int[] qtdDiasMes = {31, fevereiro, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        return dia <= qtdDiasMes[mes - 1];
    }

    // GETTERS

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // SETTTERS

    public void setDia(int dia) {
        if (dataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public void setMes(int mes) {
        if (dataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido.");
        }
    }

    public void setAno(int ano) {
        if (dataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido.");
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

}