

public class SHABurguer extends PrepararHamburguesa { //Sweet Home Avocado Burguer
    /**
     * Metodo sobre escrito para los condimentos
     */
    @Override
    public void ponerCondimentos() {
        System.out.println("\n-Poner pico de gallo");
    }

    /**
     * Metodo sobre escrito para los extras
     */
    @Override
    public void ponerExtras() {
        System.out.println("\n-Poner aguacate");
    }

    /**
     * Metodo sobre escrito para las guarniciones
     */
    @Override
    public void ponerGuarnicion() {
        System.out.println("\n-No lleva guarnicion");
    }
}
