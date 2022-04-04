

public class Mostaza extends Ingredientes {

    int precio;

    /**
     * Constructor para mostaza
     * se inicializa el precio del ingrediente
     *
     * @param centro centro de decorator
     */
    public Mostaza(Pan centro) {
        super(centro);
        precio = 10;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente
     * se agrega el precio del ingrediente a la descripcion
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " +Mostaza.....Costo= " + precio + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Mostaza
     *
     * @return string de Mostaza
     */
    @Override
    public String getMostaza() {
        return super.getMostaza();
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
