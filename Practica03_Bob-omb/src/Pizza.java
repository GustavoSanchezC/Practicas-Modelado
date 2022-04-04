

public abstract class Pizza {

    protected String nombre;
    protected String descripcion;
    protected int precio;
    protected String queso;
    protected String carne;
    protected String masa;
    protected String salsa;

    /**
     * Constructor para la pizza base abstracta
     */
    public Pizza() {
        nombre = "Pizza";
        descripcion = "Pizza Base";
        precio = 50;
        queso = "Queso Sencillo";
        carne = "Carne de Cerdo";
        masa = "Masa de Arina";
        salsa = "Salsa de tomate";
    }

    /**
     * getter para obtener el precio de la pizza
     *
     * @return precio de la pizza
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * getter para onbtener el tipo de queso de la pizza
     *
     * @return tipo de queso de la pizza
     */
    public String getQueso() {
        return queso;
    }

    /**
     * getter para obtener el tipo de carne de la pizza
     *
     * @return tipo de carne de la pizza
     */
    public String getCarne() {
        return carne;
    }

    /**
     * getter para obtener el tipo de masa de la pizza
     *
     * @return tipo de masa
     */
    public String getMasa() {
        return masa;
    }

    /**
     * getter para obtener el tipo de salsa de la pizza
     *
     * @return tipo de salsa de la pizza
     */
    public String getSalsa() {
        return salsa;
    }
}