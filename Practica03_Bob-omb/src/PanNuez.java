

public class PanNuez implements Pan {

    public String pollo;
    public String pepperoni;
    public String jamon;
    public String lechuga;
    public String jitomate;
    public String cebolla;
    public String mostaza;
    public String catsup;
    public String mayonesa;
    public int precio;

    public String nombre;
    public int precioPan;

    /**
     * constructor para un pan nuez
     * inicializamos su precio y nombre
     */
    public PanNuez() {
        nombre = "Pan Nuez";
        precioPan = 35;
    }

    /**
     * descripcion del pan nuez mas su precio
     *
     * @return texto con la cadena completa
     */
    @Override
    public String getDescripcion() {
        return "---------------Ingredientes-------------\n" + "Usted Eligio -> " + getNombre() + ".....Costo= " + precioPan + "\n";
    }

    /**
     * Metodo sobreescrito para el ingrediente Pollo
     *
     * @return string de Pollo
     */
    @Override
    public String getPollo() {
        return pollo;
    }

    /**
     * Metodo sobreescrito para el ingrediente Pepperoni
     *
     * @return string de Pepperoni
     */
    @Override
    public String getPepperoni() {
        return pepperoni;
    }

    /**
     * Metodo sobreescrito para el ingrediente Jamon
     *
     * @return string de Jamon
     */
    @Override
    public String getJamon() {
        return jamon;
    }

    /**
     * Metodo sobreescrito para el ingrediente Lechuga
     *
     * @return string de Lechuga
     */
    @Override
    public String getLechuga() {
        return lechuga;
    }

    /**
     * Metodo sobreescrito para el ingrediente Jitomate
     *
     * @return string de Jitomate
     */
    @Override
    public String getJitomate() {
        return jitomate;
    }

    /**
     * Metodo sobreescrito para el ingrediente Cebolla
     *
     * @return string de Cebolla
     */
    @Override
    public String getCebolla() {
        return cebolla;
    }

    /**
     * Metodo sobreescrito para el ingrediente Mostaza
     *
     * @return string de Mostaza
     */
    @Override
    public String getMostaza() {
        return mostaza;
    }

    /**
     * Metodo sobreescrito para el ingrediente Catsup
     *
     * @return string de Catsup
     */
    @Override
    public String getCatsup() {
        return catsup;
    }

    /**
     * Metodo sobreescrito para el ingrediente Mayonesa
     *
     * @return string de Mayonesa
     */
    @Override
    public String getMayonesa() {
        return mayonesa;
    }

    /**
     * Metodo sobreescrito que regresa el precio del pan
     *
     * @return precio del pan
     */
    @Override
    public int getPrecio() {
        return precio + precioPan;
    }

    /**
     * Metodo que regresa el nombre del pan
     *
     * @return string del nombre del pan
     */
    public String getNombre() {
        return nombre;
    }


}
