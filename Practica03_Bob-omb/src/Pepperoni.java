

public class Pepperoni extends Ingredientes {

    int precio;

    /**
     * Constructor para pepperoni con un Pan de nucleo
     * se inicializa el precio del ingrediente
     *
     * @param centro centro de decorator
     */
    public Pepperoni(Pan centro) {
        super(centro);
        precio = 20;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente
     * se agrega el precio del ingrediente a la descripcion
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " +Pepperoni .....Costo= " + precio + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Pepperoni
     *
     * @return string de Pepperoni
     */
    @Override
    public String getPepperoni() {
        return super.getPepperoni();
    }

    /**
     * Metodo sobreescrito que regresa el precio del ingrediente
     *
     * @return precio del ingrediente
     */
    @Override
    public int getPrecio() {
        return super.getPrecio() + 20;
    }


}
