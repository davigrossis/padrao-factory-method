package org.example;

public class ServicoMedicamento implements IServico {

    public String executar() {
        return "Entrega de medicamento iniciada";
    }

    public String cancelar() {
        return "Entrega de medicamento cancelada";
    }
}
