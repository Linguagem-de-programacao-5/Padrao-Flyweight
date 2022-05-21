import java.util.ArrayList;
import java.util.List;

public class Faturas {

    private List<Fatura> faturas = new ArrayList<>();

    public void criarFatura( String nomeCliente, double valor, int diaVencimento, int diaFaturamento) {
        DadosVencimento dadosVencimento = DadosVencimentoFactory.getDadosVencimento(diaVencimento, diaFaturamento);
        Fatura fatura = new Fatura(nomeCliente, valor, dadosVencimento);
        faturas.add(fatura);
    }

    public List<String> obterFaturas() {
        List<String> saida = new ArrayList<String>();
        for (Fatura fatura : this.faturas) {
            saida.add(fatura.obterFatura());
        }
        return saida;
    }
}
