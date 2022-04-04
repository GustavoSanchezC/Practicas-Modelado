

public class Jamon extends Ingredientes {

    int precio;

    /**
     * Constructor para jamon conunpan de nucleo
     * se inicializa el precio del ingrediente
     *
     * @param centro centro de decorator
     */
    public Jamon(Pan centro) {
        super(centro);
        precio = 15;
    }

    /**
     * Metodo sobreescrito que regresa la descripcion del ingrediente
     * se agrega el precio delproducto a su descripcion
     *
     * @return descripcion
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " +Jamon.....Costo= " + precio + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Jamon
     *
     * @return string de Jamon
     */
    @Override
    public String getJamon() {
        return super.getJamon();
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
