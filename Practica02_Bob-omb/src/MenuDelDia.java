

import java.util.ArrayList;
import java.util.Iterator;

public class MenuDelDia implements Menu {

    private ArrayList<Hamburguesa> hamburguesasDelDia = new ArrayList<>();

    /**
     * Menu de hamburguesas del dia
     */
    public MenuDelDia() {
        Hamburguesa h1 = new Hamburguesa(110, "Hit Me With Your Best Shallot Burger", "Hamburgesa acompañada con chalota, arugula y" +
                " queso", 9.95, true, false);
        Hamburguesa h2 = new Hamburguesa(314, "Don't You Four Cheddar 'Bout Me Burger", "Hamburgesa acompañada" +
                " con queso, lechuga, cebolla blanca y tiras de tocino", 5.95, true, false);
        Hamburguesa h3 = new Hamburguesa(418, "Sweet Home Avocado Burger", "Hamburgesa acompañada con rebanadas de aguacate y pico de gallo",
                5.95, false, false);
        Hamburguesa h4 = new Hamburguesa(817, "The Gouda Wife Burger", "Hamburgesa acompañada con queso, camote, salsa de pepino y" +
                "rabano y mostaza", 5.95, true, false);
        hamburguesasDelDia.add(h1);
        hamburguesasDelDia.add(h2);
        hamburguesasDelDia.add(h3);
        hamburguesasDelDia.add(h4);
    }

    /**
     * Metodo que regresa una hamburguesa
     *
     * @param key es la clave con la que obtenermos la hamburguesa en nuestra ED
     * @return una Hamburguesa de ED
     */
    @Override
    public Hamburguesa getHamburguesa(int key) {
        return hamburguesasDelDia.get(key);
    }

    /**
     * Metodo que regresa el tamaño de la ED
     *
     * @return un int que es el tamaño de la ED
     */
    @Override
    public int getTamanoED() {
        return hamburguesasDelDia.size();
    }

    /**
     * Metodo que regresa el Iterador del ArrayList
     *
     * @return iterado de ArrayList
     */
    public Iterator getIterator() {
        return hamburguesasDelDia.iterator();
    }
}