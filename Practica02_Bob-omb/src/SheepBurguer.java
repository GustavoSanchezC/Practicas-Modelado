

public class SheepBurguer extends PrepararHamburguesa {
    /**
     * Metodo sobre escrito para los condimentos
     */
    @Override
    public void ponerCondimentos() {
        System.out.println("\n-Poner salsa de oro comestible");
    }

    /**
     * Metodo sobre escrito para los extras
     */
    @Override
    public void ponerExtras() {
        System.out.println("\n-Poner pimiento morron" +
                "\n-Poner berenjena");
    }

    /**
     * Metodo sobre escrito para las guarniciones
     */
    @Override
    public void ponerGuarnicion() {
        System.out.println("\n-Poner papas a la francesa con queso cheddar fundido");
    }
}
