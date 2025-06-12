package org.example;

public class ServicoComida implements IServico {

    public String executar() {
        return "Entrega de comida iniciada";
    }

    public String cancelar() {
        return "Entrega de comida cancelada";
    }
}
