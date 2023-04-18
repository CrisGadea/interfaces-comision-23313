package org.edu.cac;

public class Celular implements Comunicable{

    private String numero;

    private String modelo;

    public Celular(String numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void recibirMensaje(Mensaje mensaje, Persona emisor) {
        System.out.println("Mensaje recibido");
    }

    @Override
    public void enviarMensaje(Mensaje mensaje, Persona destinatario) {
        System.out.println("Mensaje enviado");
    }
}
