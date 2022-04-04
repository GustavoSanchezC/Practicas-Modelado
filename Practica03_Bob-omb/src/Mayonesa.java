

public class Mayonesa extends Ingredientes {

    int precio;

    /**
     * Constructor para mayonesa con un Pan de nucleo
     * se inicializa el precio del ingrediente
     *
     * @param centro centro de decorator
     */
    public Mayonesa(Pan centro) {
        super(centro);
        precio = 10;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente
     * se agrega el precio del ingrediente a su descripcion
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " +Mayonesa.....Costo= " + precio + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Mayonesa
     *
     * @return string de Mayonesa
     */
    @Override
    public String getMayonesa() {
        return super.getMayonesa();
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
