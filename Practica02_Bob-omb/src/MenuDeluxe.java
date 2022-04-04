

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MenuDeluxe implements Menu {
    private Hashtable<Integer, Hamburguesa> hamburguesasDeluxe = new Hashtable<>();

    /**
     * Menu de las hamburguesas de lujo
     */
    public MenuDeluxe() {
        Hamburguesa hd1 = new Hamburguesa(01, "Sheep Burguer", "Hamburguesa acompañada con pimiento morron y berenjena," +
                " salsa de oro comestible y una guarnicion de papas a la francesa con queso cheddar fundido", 19.95, false, false);
        Hamburguesa hd2 = new Hamburguesa(02, "Hambur", "Hamburguesa acompañada con rodajas de salchicha de cerdo, salsa BBBQ," +
                " salsa de oro comestible y una guarnicion de papas a la francesa con queso cheddar fundido", 21.95, false, false);
        Hamburguesa hd3 = new Hamburguesa(03, "Smurflandia Burguer", "Hamburguesa acompañada con ajo negro, queso, hongos neptuno lanudos," +
                "salsa de oro comestible y una guarnicion de papas a la francesa con queso cheddar fundido", 35.95, true, false);
        hamburguesasDeluxe.put(0, hd1);
        hamburguesasDeluxe.put(1, hd2);
        hamburguesasDeluxe.put(2, hd3);
        //SI AGREGAS MAS HAMBURGUESAS POR FAVOR COLOCA COMO KEY AL NUMERO SIGUIENTE
    }

    /**
     * Metodo que regresa una hamburguesa
     *
     * @param key es la clave con la que obtenermos la hamburguesa en nuestra ED
     * @return una Hamburguesa de ED
     */
    @Override
    public Hamburguesa getHamburguesa(int key) {
        return hamburguesasDeluxe.get(key);
    }

    /**
     * Metodo que regresa el tamaño de la ED
     *
     * @return un int que es el tamaño de la ED
     */
    @Override
    public int getTamanoED() {
        return hamburguesasDeluxe.size();
    }

    /**
     * Metodo que regresa el Iterador de la Hashtable
     *
     * @return iterado de Hashtable
     */
    public Iterator getIterator() {
        Set<Entry<Integer, Hamburguesa>> entrySet = hamburguesasDeluxe.entrySet();
        Iterator<Entry<Integer, Hamburguesa>> itr = entrySet.iterator();
        return itr;
    }
}
