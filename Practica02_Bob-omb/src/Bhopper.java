

public class Bhopper extends PrepararHamburguesa {
    /**
     * Metodo sobre escrito para los condimentos
     */
    @Override
    public void ponerCondimentos() {
        System.out.println("No lleva condimentos");
    }

    /**
     * Metodo sobre escrito para extras
     */
    @Override
    public void ponerExtras() {
        System.out.println("\n-Poner lechuga" +
                "\n-Poner pepinillos");
    }

    /**
     * Metodo sobre escrito para guarnición
     */
    @Override
    public void ponerGuarnicion() {
        System.out.println("\n-No lleva guarnicion");
    }
}
