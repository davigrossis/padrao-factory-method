package org.example;

public class ServicoDocumento implements IServico {

    public String executar() {
        return "Entrega de documento iniciada";
    }

    public String cancelar() {
        return "Entrega de documento cancelada";
    }
}
