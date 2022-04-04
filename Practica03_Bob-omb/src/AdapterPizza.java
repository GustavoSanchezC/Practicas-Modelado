
public class AdapterPizza extends Pizza implements Pan {

    private final Pizza p;

    /**
     * Adaptador para pizza se recibe una pizza y se adapta segun lo que tenemos en la interfaz Pan
     *
     * @param p pizza que se adapta
     */
    public AdapterPizza(Pizza p) {
        this.p = p;
    }

    /**
     * Descripccion completa de la pizza y sus ingredientes
     *
     * @return un textpo donde sumamos todo el contenido de la pizza
     */
    @Override
    public String getDescripcion() {
        return p.descripcion + "\n" + "---------------Ingredientes-------------\n" + "\n" + "+" + getPollo() + "\n" + "+" + getPepperoni() + "\n" + "+" + getJamon() + "\n" + "+" + getLechuga() + "\n";
    }

    /**
     * getter de Pan que usamos para la carne de pizza
     *
     * @return carne de pizza
     */
    @Override
    public String getPollo() {
        return p.getCarne();
    }

    /**
     * getter de Pan que usamos para masa de la pizza
     *
     * @return masa de pizza
     */
    @Override
    public String getPepperoni() {
        return p.getMasa();
    }

    /**
     * getter de Pan que usamos para el queso de pizza
     *
     * @return queso de pizza
     */
    @Override
    public String getJamon() {
        return p.getQueso();
    }

    /**
     * getter de Pan que usamos para el tipo  salsa de pizza
     *
     * @return salsa de pizza
     */
    @Override
    public String getLechuga() {
        return p.getSalsa();
    }

    /**
     * getter sin funcion en pizza
     *
     * @return null
     */
    @Override
    public String getJitomate() {
        return null;
    }

    /**
     * getter sin funcion en pizza
     *
     * @return null
     */
    @Override
    public String getCebolla() {
        return null;
    }

    /**
     * getter sin funcion en pizza
     *
     * @return null
     */
    @Override
    public String getMostaza() {
        return null;
    }

    /**
     * getter sin funcion en pizza
     *
     * @return null
     */
    @Override
    public String getCatsup() {
        return null;
    }

    /**
     * getter sin funcion en pizza
     *
     * @return null
     */
    @Override
    public String getMayonesa() {
        return null;
    }

    /**
     * getter para obtener el precio de la pizza
     *
     * @return precio de la pizza adaptada
     */
    @Override
    public int getPrecio() {
        return p.precio;
    }


}
