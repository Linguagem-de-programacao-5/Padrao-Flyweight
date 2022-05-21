import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FaturasTest {

    @Test
    void deveRetornarFaturas(){
        Faturas faturas = new Faturas();
        faturas.criarFatura("Adailton",99.9,10,5);
        faturas.criarFatura("Junior",109.9,10,5);
        faturas.criarFatura("Jose",89.9,2,5);

        List<String> saida = Arrays.asList(
                "Fatura{nomeCliente='Adailton', valor=99.9, dadosVencimento=Faturamento: 10 / Vencimento: 5}",
                "Fatura{nomeCliente='Junior', valor=109.9, dadosVencimento=Faturamento: 10 / Vencimento: 5}",
                "Fatura{nomeCliente='Jose', valor=89.9, dadosVencimento=Faturamento: 2 / Vencimento: 5}");

        assertEquals(saida, faturas.obterFaturas());
    }

    @Test
    void deveRetornarTotalDadosVencimento() {
        Faturas faturas = new Faturas();
        faturas.criarFatura("Adailton",99.9,10,5);
        faturas.criarFatura("Junior",109.9,10,5);
        faturas.criarFatura("Jose",89.9,2,5);

        assertEquals(2, DadosVencimentoFactory.getTotalDadosVencimento());
    }

}