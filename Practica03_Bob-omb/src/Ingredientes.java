

public abstract class Ingredientes implements Pan {

    protected Pan centro;

    /**
     * Constructor para ingredientes
     *
     * @param centro centro de decorator
     */
    public Ingredientes(Pan centro) {
        this.centro = centro;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return centro.getDescripcion();
    }

    /**
     * Metodo sobreescrito para el ingrediente Pollo
     *
     * @return string de Pollo
     */
    @Override
    public String getPollo() {
        return centro.getPollo();
    }

    /**
     * Metodo sobreescrito para el ingrediente Pepperoni
     *
     * @return string de Pepperoni
     */
    @Override
    public String getPepperoni() {
        return centro.getPepperoni();
    }

    /**
     * Metodo sobreescrito para el ingrediente Jamon
     *
     * @return string de Jamon
     */
    @Override
    public String getJamon() {
        return centro.getJamon();
    }

    /**
     * Metodo sobreescrito para el ingrediente Lechuga
     *
     * @return string de Lechuga
     */
    @Override
    public String getLechuga() {
        return centro.getLechuga();
    }

    /**
     * Metodo sobreescrito para el ingrediente Jitomate
     *
     * @return string de Jitomate
     */
    @Override
    public String getJitomate() {
        return centro.getJitomate();
    }

    /**
     * Metodo sobreescrito para el ingrediente Cebolla
     *
     * @return string de Cebolla
     */
    @Override
    public String getCebolla() {
        return centro.getCebolla();
    }

    /**
     * Metodo sobreescrito para el ingrediente Mostaza
     *
     * @return string de Mostaza
     */
    @Override
    public String getMostaza() {
        return centro.getMostaza();
    }

    /**
     * Metodo sobreescrito para el ingrediente Catsup
     *
     * @return string de Catsup
     */
    @Override
    public String getCatsup() {
        return centro.getCatsup();
    }

    /**
     * Metodo sobreescrito para el ingrediente Mayonesa
     *
     * @return string de Mayonesa
     */
    @Override
    public String getMayonesa() {
        return centro.getMayonesa();
    }

    /**
     * Metodo sobreescrito que regresa el precio del ingrediente
     *
     * @return precio del ingrediente
     */
    @Override
    public int getPrecio() {
        return centro.getPrecio();
    }

}
