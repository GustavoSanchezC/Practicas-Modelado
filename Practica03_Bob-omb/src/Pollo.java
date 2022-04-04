

public class Pollo extends Ingredientes {

    int precio;

    /**
     * constructor para el pollo
     * se inicializa el precio del ingrediente
     *
     * @param centro centro del decorator
     */
    public Pollo(Pan centro) {
        super(centro);
        precio = 30;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente
     * se agrega el precio del ingrediente a la descripcion
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Pollo ......Costo =" + precio + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Pollo
     *
     * @return string de Pollo
     */
    @Override
    public String getPollo() {
        return super.getPollo();
    }

    /**
     * Metodo sobreescrito que regresa el precio del ingrediente
     *
     * @return precio del ingrediente
     */
    @Override
    public int getPrecio() {
        return super.getPrecio() + 30;
    }




}
