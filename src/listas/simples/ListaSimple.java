package listas.simples;

//Definicion de una lista Simple
// @author: Lluvia Villanueva
// @date : 15 de octubre de 2026

public class ListaSimple {
    private Nodo cabeza;  //  primer nodo 

    public ListaSimple() {
        this.cabeza = null;   // Al principio la lista está vacía
    }

    // Insertar Al Inicio un nuevo elemento utilizando if-else
    public void insertarAlInicio(int valor) {
        if (cabeza == null) {
            // si la lista está vacía, el nuevo nodo es la cabeza
            Nodo t = new Nodo(valor);
            cabeza = t;
        } else {
            // Si ya hay elementos, el nuevo nodo apunta a la cabeza actual
            // y luego se convierte en la nueva cabeza
            Nodo nuevo = new Nodo(valor);
            nuevo.setSig(cabeza);
            cabeza = nuevo;

        }
    }

    // Método recorrer para imprimir todos los elementos de la lista
        public void recorrer() {
        // Empezamos a revisar desde la cabeza
        Nodo actual = cabeza;
        
        // Si la cabeza no tiene nada, la lista está vacía
        if (actual == null) {
            System.out.println("La lista está vacía.");
            return; // Terminamos aquí porque no hay nada que mostrar
        }

        // Avanzamos hasta llegar al final (que es null)
        while (actual != null) {
            
            actual = actual.getSig(); // Pasamos al siguiente nodo
        }
        System.out.println("null");    
    }

    // Método main
    public static void main(String[] args) {
        ListaSimple miLista = new ListaSimple();

        System.out.println(" Probando lista vacía ");
        miLista.recorrer();

        System.out.println(" Insertando elementos 10, 20, 30 ");
        miLista.insertarAlInicio(30);
        miLista.insertarAlInicio(20);
        miLista.insertarAlInicio(10);

        System.out.println("Recorriendo la lista final ");
        miLista.recorrer();
    }
}