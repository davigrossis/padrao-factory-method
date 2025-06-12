package org.example;

public class ServicoEncomenda implements IServico {

    public String executar() {
        return "Entrega de encomenda iniciada";
    }

    public String cancelar() {
        return "Entrega de encomenda cancelada";
    }
}
