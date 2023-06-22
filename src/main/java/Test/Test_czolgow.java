package Test;

import Czolgi.Tiger;
import Czolgi.Leopard;
import Czolgi.Sherman;

/**
 * Klasa do testowania czołgów.
 */
public class Test_czolgow {
    /**
     * Metoda główna, która testuje czołgi.
     *
     * @param args argumenty wiersza poleceń
     */
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Leopard leopard = new Leopard();
        Sherman sherman = new Sherman();

        tiger.fire();
        leopard.fire();
        sherman.fire();
    }
}
