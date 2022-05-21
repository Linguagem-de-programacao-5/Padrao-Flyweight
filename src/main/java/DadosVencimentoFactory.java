import java.util.HashMap;
import java.util.Map;

public class DadosVencimentoFactory {

        private static Map<String, DadosVencimento> dadosVencimentos = new HashMap<>();

        public static DadosVencimento getDadosVencimento(int diaFaturamento, int diaVencimento) {
            String identificador = "Faturamento: " + diaFaturamento + " /" + " Vencimento: " + diaVencimento;
             DadosVencimento dadosVencimento = dadosVencimentos.get(identificador);
            if (dadosVencimento == null) {
                dadosVencimento = new DadosVencimento(identificador, diaVencimento,diaFaturamento);
                dadosVencimentos.put(identificador, dadosVencimento);
            }
            return dadosVencimento;
        }

        public static int getTotalDadosVencimento() {
            return dadosVencimentos.size();
        }
}
