
public class Margarita extends Pizza{

    /**
     * Metodo constructor para crear una pizza Margarita.
     */
    public Margarita(){
        super.nombre = "MARGARITA";
        super.descripcion = "La pizza Margarita es una típica pizza napolitana elaborada con:" + "\nQueso Cheddar, Pollo y de masa " + 
        "Gruesa.";
        super.precio = 99;
        super.queso = "Queso Cheddar";
        super.carne = "Pollo en cocido y marinado";
        super.masa = "Masa Gruesa";
    }
}