

public class GreenBean extends PrepararHamburguesa {
    /**
     * Metodo sobre escrito para los condimentos
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
        System.out.println("\n-Poner jitomate" +
                "\n-Poner germen de trigo");
    }

    /**
     * Metodo sobre escrito para los guarnicion
     */
    @Override
    public void ponerGuarnicion() {
        System.out.println("\n-No lleva guarnicion");
    }
}
