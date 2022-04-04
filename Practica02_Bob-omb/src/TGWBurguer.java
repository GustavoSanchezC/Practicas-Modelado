

public class TGWBurguer extends PrepararHamburguesa { //The Gouda Wife Burguer
    /**
     * Metodo sobre escrito para los condimentos
     */
    @Override
    public void ponerCondimentos() {
        System.out.println("\n-Poner salsa de pepino y rabano" +
                "\n-Poner mostaza");
    }

    /**
     * Metodo sobre escrito para los extras
     */
    @Override
    public void ponerExtras() {
        System.out.println("\n-Poner camote");
    }

    /**
     * Metodo sobre escrito para las guarniciones
     */
    @Override
    public void ponerGuarnicion() {
        System.out.println("\n-No lleva guarnicion");
    }
}
