package Test;

import Czolgi.Tiger;
import Czolgi.Leopard;
import Czolgi.Sherman;



public class Test_czolgow {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Leopard leopard = new Leopard();
        Sherman sherman = new Sherman();

        tiger.fire();
        leopard.fire();
        sherman.fire();
    }
}