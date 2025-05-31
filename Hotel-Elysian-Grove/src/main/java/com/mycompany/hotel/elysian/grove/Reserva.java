
package com.mycompany.hotel.elysian.grove;

public class Reserva {
    private String nomeReserva,cpfReserva, emailReserva, servicoReserva;

    public String getNomeReserva() {
        return nomeReserva;
    }

    public void setNomeReserva(String nomeReserva) {
        this.nomeReserva = nomeReserva;
    }

    public String getCpfReserva() {
        return cpfReserva;
    }

    public void setCpfReserva(String cpfReserva) {
        this.cpfReserva = cpfReserva;
    }

    public String getEmailReserva() {
        return emailReserva;
    }

    public void setEmailReserva(String emailReserva) {
        this.emailReserva = emailReserva;
    }

    public String getServicoReserva() {
        return servicoReserva;
    }

    public void setServicoReserva(String servicoReserva) {
        this.servicoReserva = servicoReserva;
    }
    
    public String status(){
        return "------Dados da Reserva:------"+
                "\nNome: "+this.nomeReserva+
                "\nCPF: "+this.cpfReserva+
                "\nEmail: "+this.emailReserva+
                "\nServiço: " + this.servicoReserva+
                "\n";
    }
}
