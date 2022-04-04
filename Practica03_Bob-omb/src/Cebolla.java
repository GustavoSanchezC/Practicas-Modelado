

public class Cebolla extends Ingredientes {
    int precio;

    /**
     * Constructor para cebolla
     * se inicializa el precio del ingrediente
     *
     * @param centro centro de decorator
     */
    public Cebolla(Pan centro) {
        super(centro);
        precio = 15;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente , ademas de agregar el precio a la descripcion
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " +Cebolla......Costo= " + precio + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Cebolla
     *
     * @return string de Cebolla
     */
    @Override
    public String getCebolla() {
        return super.getCebolla();
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
