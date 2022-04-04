

public class Lechuga extends Ingredientes {

    int precio;

    /**
     * Constructor para lechuga con un Pan de nucleo
     * se inicializa el precio del ingrediente
     *
     * @param centro centro de decorator
     */
    public Lechuga(Pan centro) {
        super(centro);
        precio = 15;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente
     * se agrega el precio del ingrediente a la descripcion
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " +Lechuga.....Costo= " + precio + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Lechuga
     *
     * @return string de Lechuga
     */
    @Override
    public String getLechuga() {
        return super.getLechuga();
    }

    /**
     * Metodo sobreescrito que regresa el precio del ingrediente
     *
     * @return precio del ingrediente
     */
    @Override
    public int getPrecio() {
        return super.getPrecio() + 15;
    }


}
