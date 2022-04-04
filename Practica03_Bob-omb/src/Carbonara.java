

public class Carbonara extends Pizza {

    /**
     * Metodo constructor para crear una pizza Carbonara.
     */
    public Carbonara() {
        super.nombre = "CARBONARA";
        super.descripcion = "La pizza Carbonara es una de las preferidas por toda la familia.\n" +
                "Cuenta con un Queso Especial y Contiene Salchicha";
        super.precio = 95;
        super.queso = "Queso Cheddar Americano";
        super.carne = "Salchicha De Pavo Real";
        super.masa = "Masa Delgada";
    }
}