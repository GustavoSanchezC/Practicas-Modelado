
public class Catsup extends Ingredientes {

    int precio;

    /**
     * Constructor para catsup usando un pan como nucleo
     * se inicializa el precio del ingrediente
     *
     * @param centro centro de decorator
     */
    public Catsup(Pan centro) {
        super(centro);
        precio = 10;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente ademas de agregar su precio a la descripcion
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " +Catsup......Costo=  " + precio + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Catsup
     *
     * @return string de Catsup
     */
    @Override
    public String getCatsup() {
        return super.getCatsup();
    }

    /**
     * Metodo sobreescrito que regresa el precio del ingrediente
     *
     * @return precio del ingrediente
     */
    @Override
    public int getPrecio() {
        return super.getPrecio() + 10;
    }

}
