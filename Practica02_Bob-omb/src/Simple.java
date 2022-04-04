

public class Simple extends PrepararHamburguesa {
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
        System.out.println("\n-Poner pepinillos\n-Poner tomate" +
                "\n-Poner lechuga\n-Poner cebolla");
    }

    /**
     * Metodo sobre escrito para las guarniciones
     */
    @Override
    public void ponerGuarnicion() {
        System.out.println("\n-No lleva guarnicion");
    }
}
