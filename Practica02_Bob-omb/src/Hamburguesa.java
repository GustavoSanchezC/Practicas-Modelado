

public class Hamburguesa {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean queso;
    private boolean vegetariana;


    /**
     * constructor para la hamburguesa que el cliente selecciono
     *
     * @param id          identificador de la hamburguesa
     * @param nombre      de la hamburguesa
     * @param descripcion de la hamburguesa
     * @param precio      de la hamburguesa
     * @param queso       si lleva o si no lo lleva
     * @param vegetariana si lleva o si no lo lleva
     */
    public Hamburguesa(int id, String nombre, String descripcion, double precio, boolean queso, boolean vegetariana) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.queso = queso;
        this.vegetariana = vegetariana;
    }

    /**
     * getter para obtener el id
     *
     * @return id de la hamburguesa
     */
    public int getId() {
        return id;
    }

    /**
     * getter para obtener el nombre de la hamburguesa
     *
     * @return nombre de la hamburguesa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getter para obtener la descripcion de la hamburguesa
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * getter para obtener el precio de la hamburguesa
     *
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * getter para obtener queso de la hamburguesa en el caso de llevar queso
     *
     * @return queso
     */
    public boolean getQueso() {
        return queso;
    }

    /**
     * getter para obtener el valor de vegetariana en caso de serlo
     *
     * @return vegetariana
     */
    public boolean getVegetariana() {
        return vegetariana;
    }

    /**
     * mostramos toda la informcion de la hamburguesa
     *
     * @return string con el valor
     */
    public String toString() {
        return "\nId de la Hamburguesa: " + getId()
                + "\nNombre de la Hamburguesa: " + getNombre()
                + "\nDescripción: " + getDescripcion()
                + "\nPrecio: " + getPrecio()
                + "\nTiene queso?: " + getQueso()
                + "\nEs vegetariana?: " + getVegetariana() + "\n";
    }
}