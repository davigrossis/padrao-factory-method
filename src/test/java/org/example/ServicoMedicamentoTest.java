package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoMedicamentoTest {

    @Test
    void deveExecutarEntregaMedicamento() {
        IServico servico = ServicoFactory.obterServico("Medicamento");
        assertEquals("Entrega de medicamento iniciada", servico.executar());
    }

    @Test
    void deveCancelarEntregaMedicamento() {
        IServico servico = ServicoFactory.obterServico("Medicamento");
        assertEquals("Entrega de medicamento cancelada", servico.cancelar());
    }
}
