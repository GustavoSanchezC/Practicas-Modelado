

public class Jitomate extends Ingredientes {

    int precio;

    /**
     * Constructor para jitomate
     * se inicializa el precio del ingrediente
     *
     * @param centro centro de decorator
     */
    public Jitomate(Pan centro) {
        super(centro);
        precio = 15;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente
     * se agrega el precio del ingrediente a su descripcion
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " +Jitomate.....Costo= " + precio + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Jitomate
     *
     * @return string de Jitomate
     */
    @Override
    public String getJitomate() {
        return super.getJitomate();
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
