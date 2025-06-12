package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDocumentoTest {

    @Test
    void deveExecutarEntregaDocumento() {
        IServico servico = ServicoFactory.obterServico("Documento");
        assertEquals("Entrega de documento iniciada", servico.executar());
    }

    @Test
    void deveCancelarEntregaDocumento() {
        IServico servico = ServicoFactory.obterServico("Documento");
        assertEquals("Entrega de documento cancelada", servico.cancelar());
    }
}
