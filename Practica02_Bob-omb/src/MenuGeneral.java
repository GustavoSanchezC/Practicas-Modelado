

import java.util.Iterator;

public class MenuGeneral implements Menu {

    private Hamburguesa hamburguesas[] = new Hamburguesa[5];

    /**
     * Menu general de las hamburguesas
     */
    public MenuGeneral() {
        hamburguesas[0] = new Hamburguesa(19570, "Bhopper", "Hamburguesa acompañada con queso, lechuga y pepinillos",
                3.99, true, false);
        hamburguesas[1] = new Hamburguesa(19670, "Great Mac", "Hamburguesa acompañada con queso",
                2.99, true, false);
        hamburguesas[2] = new Hamburguesa(19770, "Baccon Cheese", "Hamburguesa acompañada con queso y tocino",
                9.99, true, false);
        hamburguesas[3] = new Hamburguesa(19870, "Simple", "Hamburguesa acompañada con lechuga, cebolla, tomate y pepinillos",
                5.99, false, false);
        hamburguesas[4] = new Hamburguesa(19970, "Green Bean", "Hamburguesa vegetariana acompañada com jitomate y germen de trigo",
                6.99, false, true);
    }

    /**
     * Metodo que regresa una hamburguesa
     *
     * @param key es la clave con la que obtenermos la hamburguesa en nuestra ED
     * @return una Hamburguesa de ED
     */
    @Override
    public Hamburguesa getHamburguesa(int key) {
        return hamburguesas[key];
    }

    /**
     * Metodo que regresa el tamaño de la ED
     *
     * @return un int que es el tamaño de la ED
     */
    @Override
    public int getTamanoED() {
        return hamburguesas.length;
    }

    /**
     * Metodo que regresa el Iterador del Arreglo
     *
     * @return iterado de Hashtable
     */
    public Iterator getIterador() {
        return new IteradorArreglo(hamburguesas);
    }

    /**
     * Implementacion de 'Iterador' para el Arreglo
     */
    private class IteradorArreglo implements Iterator {
        Hamburguesa[] hamburguesas;
        int posicion = 0;

        public IteradorArreglo(Hamburguesa[] hamburguesas) {
            this.hamburguesas = hamburguesas;
        }

        @Override
        public boolean hasNext() {
            if (posicion >= hamburguesas.length || hamburguesas[posicion] == null) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Object next() {
            Hamburguesa hamburguesa = hamburguesas[posicion];
            posicion = posicion + 1;
            return hamburguesa;
        }
    }
}