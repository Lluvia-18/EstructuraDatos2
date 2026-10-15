package listas.simples;
//Autor: Lluvia Villanueva 
//Fecha:15 de octubre de 2026


public class Nodo {
    private int valor;
    private Nodo sig;

    // Constructor por defecto
    public Nodo() {
        this.valor = 0;
        this.sig = null;
    }

    // Constructor con valor inicial
    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }

    // --- Getters y Setters --

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}