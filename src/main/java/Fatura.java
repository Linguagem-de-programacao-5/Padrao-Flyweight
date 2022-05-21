public class Fatura {
    String nomeCliente;
    double valor;
    DadosVencimento dadosVencimento;

    public Fatura(String nomeCliente, double valor, DadosVencimento dadosVencimento) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.dadosVencimento = dadosVencimento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public DadosVencimento getDadosVencimento() {
        return dadosVencimento;
    }

    public void setDadosVencimento(DadosVencimento dadosVencimento) {
        this.dadosVencimento = dadosVencimento;
    }

    public String obterFatura() {
        return "Fatura{" +
                "nomeCliente='" + getNomeCliente() + '\'' +
                ", valor=" + getValor() +
                ", dadosVencimento=" + getDadosVencimento().getIdentificador()+
                '}';
    }
}
