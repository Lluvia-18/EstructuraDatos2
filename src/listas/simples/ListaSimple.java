

package listas.simples;

// Autor: Lluvia Villanueva
// Fecha: 15 de octubre de 2026
// Definicion de una lista simple

public class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    // Insertar Al Inicio utilizando if-else
    public void insertarAlInicio(int valor) {
        if (cabeza == null) {
            // si la lista está vacía, el nuevo nodo es la cabeza
            Nodo t = new Nodo(valor);
            cabeza = t;
        } else {
            // Si ya hay elementos, el nuevo nodo apunta a la cabeza actual
            // y luego se convierte en la nueva cabeza
            Nodo t = new Nodo(valor);
            t.setSig(cabeza);
            cabeza = t;
        }
    }

    // Método recorrer para imprimir todos los elementos de la lista
    public void recorrer() {
        if (cabeza == null) {
            System.out.println("Lista Vacia");
            return;
        }
        
        Nodo itera = cabeza;
        while (itera != null) {
            System.out.println("Valor: " + itera.getValor());
            itera = itera.getSig();
        }
    }

    public static void main(String[] args) {
        ListaSimple ls = new ListaSimple();

        ls.insertarAlInicio(2);
        ls.insertarAlInicio(3);

        ls.recorrer();
    }
}