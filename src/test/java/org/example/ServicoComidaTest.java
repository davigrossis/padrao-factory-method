package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoComidaTest {

    @Test
    void deveExecutarEntregaComida() {
        IServico servico = ServicoFactory.obterServico("Comida");
        assertEquals("Entrega de comida iniciada", servico.executar());
    }

    @Test
    void deveCancelarEntregaComida() {
        IServico servico = ServicoFactory.obterServico("Comida");
        assertEquals("Entrega de comida cancelada", servico.cancelar());
    }
}
