


public class BaconCheese extends PrepararHamburguesa {

    /**
     * Metodo sobre escrito para ponerCondimentos
     */
    @Override
    public void ponerCondimentos() {
        System.out.println("\n-No lleva condimentos");
    }

    /**
     * Metodo sobre escrito para los extras
     */
    @Override
    public void ponerExtras() {
        System.out.println("\n-Poner tocino");
    }

    /**
     * metodo sobre escrito para guarniciones
     */
    @Override
    public void ponerGuarnicion() {
        System.out.println("\n-No lleva guarnicion");
    }
}
