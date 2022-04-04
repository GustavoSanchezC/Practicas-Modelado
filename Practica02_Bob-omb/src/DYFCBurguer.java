

public class DYFCBurguer extends PrepararHamburguesa {

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
        System.out.println("\n-Poner lechuga" +
                "\n-Poner cebolla blanca" +
                "\n-Poner tocino");
    }

    /**
     * Metodo sobre escrito para los guarnición
     */
    @Override
    public void ponerGuarnicion() {
        System.out.println("\n-No lleva guarnicion");
    }
}
