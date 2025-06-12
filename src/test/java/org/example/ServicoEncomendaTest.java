package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoEncomendaTest {

    @Test
    void deveExecutarEntregaEncomenda() {
        IServico servico = ServicoFactory.obterServico("Encomenda");
        assertEquals("Entrega de encomenda iniciada", servico.executar());
    }

    @Test
    void deveCancelarEntregaEncomenda() {
        IServico servico = ServicoFactory.obterServico("Encomenda");
        assertEquals("Entrega de encomenda cancelada", servico.cancelar());
    }
}
