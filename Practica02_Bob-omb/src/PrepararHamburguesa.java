


/**
 * Template de la preparacion de las hamburguesas
 */
public abstract class PrepararHamburguesa {
    protected Hamburguesa pedido;

    /**
     * metodo que prepara la hamburguesa dependiendo que tipo de hamburguesa es
     *
     * @param ham hamburguesa ordenada
     */
    public final void prepararHamburguesa(Hamburguesa ham) {
        this.pedido = ham;
        ponerPan();
        ponerCondimentos();
        prepararCarne();
        ponerCarne();
        ponerQueso();
        ponerExtras();
        ponerPan();
        ponerGuarnicion();
        mostrarHamburguesa();
    }

    /**
     * Metodo que pone el pan de hamburguesa al proceso
     */
    public void ponerPan() {
        System.out.println("\n-Poner pan");
    }

    /**
     * Metodo que pone el queso (o no) al proceso
     */
    public void ponerQueso() {
        if (!pedido.getQueso()) {
            System.out.println("\n-No lleva queso");
        } else {
            System.out.println("\n-Poner queso");
        }
    }

    /**
     * Metodo que pone los condimentos al proceso
     */
    public abstract void ponerCondimentos();

    /**
     * Metodo que prepara los diferentes tipos de carne al proceso
     */
    public void prepararCarne() {
        if (!pedido.getVegetariana()) {
            System.out.println("\n-Preparar carne");
        } else {
            System.out.println("\n-Preparar carne vegetariana");
        }
    }

    /**
     * Metodo que poner la carne al proceso
     */
    public void ponerCarne() {
        if (!pedido.getVegetariana()) {
            System.out.println("\n-Poner carne");
        } else {
            System.out.println("\n-Poner carne vegetariana");
        }
    }

    /**
     * Metodo que pone los extras al proceso
     */
    public abstract void ponerExtras();

    /**
     * Metodo que pone la guarnicion al proceso
     */
    public abstract void ponerGuarnicion();

    /**
     * Metodo que despliega la hamburguesa final
     */
    public void mostrarHamburguesa() {
        System.out.println(pedido.toString());
    }
}