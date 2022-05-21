public class DadosVencimento {

    String identificador;
    int diaVencimento;
    int diaFaturamento;

    public DadosVencimento(String identificador, int diaFaturamento, int diaVencimento) {
        this.identificador = identificador;
        this.diaFaturamento = diaFaturamento;
        this.diaVencimento = diaVencimento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getDiaFaturamento() {
        return diaFaturamento;
    }

    public void setDiaFaturamento(int diaFaturamento) {
        this.diaFaturamento = diaFaturamento;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

}
