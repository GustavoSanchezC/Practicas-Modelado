

public class Hambur extends PrepararHamburguesa {

    /**
     * Metodo sobre escrito para los condimentos
     */
    @Override
    public void ponerCondimentos() {
        System.out.println("\n-Poner salsa BBQ" +
                "\n-Poner salsa de oro comestible");
    }

    /**
     * Metodo sobre escrito para los extras
     */
    @Override
    public void ponerExtras() {
        System.out.println("\n-Poner salchicha");
    }

    /**
     * Metodo sobre escrito para guarniciones
     */
    @Override
    public void ponerGuarnicion() {
        System.out.println("\n-Poner papas a la francesa con queso cheddar fundido");
    }
}
