
import java.util.*;
import java.util.Iterator;

public class Robot {

    private boolean ordenRecibida;
    private boolean pedidoRecibido; //pedido del cliente
    private boolean pedidoTerminado;

    private EstadoRobot estadoActual;

    private EstadoRobot modoSuspendido;
    private EstadoRobot modoAtendiendo;
    private EstadoRobot modoCaminando;
    private EstadoRobot modoCocinando;
    public static int ham;
    public static int tresMenusa;

    static Hamburguesa hamburguesaRE;

    /**
     * Constructor para nuestro robot inicializamos variables y estados del robot además de iniciarlo en modo suspendido
     */
    public Robot() {
        ordenRecibida = false;
        pedidoRecibido = false;
        pedidoTerminado = false;

        modoSuspendido = new ModoSuspendido(this);
        modoCaminando = new ModoCaminado(this);
        modoAtendiendo = new ModoAtendiendo(this);
        modoCocinando = new ModoCocinando(this);

        estadoActual = modoSuspendido;
    }

    /**
     * Metodo que asigan un nuevo estado a nuestro robot
     *
     * @param nuevoEstado nuevo estado asigando
     */
    public void asignarNuevoEstado(EstadoRobot nuevoEstado) {
        estadoActual = nuevoEstado;

    }

    /**
     * Metodo que sirve para recorrer dado un Iterator
     *
     * @param itera es el iterator con el cual recorremos
     */
    public static void recorrerMenuParticular(Iterator itera) {
        int contador = 1;
        while (itera.hasNext()) {
            System.out.println("HAMBURGUESA " + contador + ":\n" + itera.next().toString());
            contador++;
        }
    }

    /**
     *Metodo que interactua con el usuario, es donde se recibe el pedido de hamburguesa
     */
    public void recibeOrden() {
        MenuCompleto menu = new MenuCompleto();
        Object[] menusRestaurantes = menu.getMenu();
        for (int i = 0; i < menusRestaurantes.length; i++) {
            Iterator recorrerMenus = (Iterator) menusRestaurantes[i];
            System.out.println("+++++ MENU " + (i + 1) + " +++++");
            recorrerMenuParticular(recorrerMenus);
        }
        Scanner read = new Scanner(System.in);
        int primerMenu; //ESTE ES EL MENU
        System.out.println("¿Que menu desea seleccionar?");
        do {
            System.out.println("LAS OPCIONES SON:\n" +
                    "1. Menu General\n" +
                    "2. Menu Del Dia\n" +
                    "3. Menu Deluxe\n");
            while (true) {
                try {
                    String opcionUsuario = read.nextLine();
                    primerMenu = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("LAS OPCIONES SON:\n" +
                            "1. Menu General\n" +
                            "2. Menu Del Dia\n" +
                            "3. Menu Deluxe\n");
                }
            }
        } while (!(0 < primerMenu && primerMenu <= menusRestaurantes.length));
        Menu menuParticular = menu.getMenuParticular(primerMenu - 1);
        Hamburguesa temp = impresionDeMenuParticular(primerMenu, menuParticular);
        setHamburguesaRE(temp);
        setTresMenusa(primerMenu);

    }


    /**
     * Metodo que sirve como interaccion con el usuario para poder recibir la hamburguesa
     * @param primerMenu es el menu con el que ya se decidio el usuario
     * @param menu es el menu que decidio el usuario
     * @return regresa la Hamburguesa que el usuario pidio
     */
    public Hamburguesa impresionDeMenuParticular(int primerMenu, Menu menu) {
        System.out.println("¿Que Hamburguesa desea seleccionar?");
        Scanner read = new Scanner(System.in);
        int menuParticular; //ESTA ES LA HAMBURGUESA
        do {
            while (true) {
                try {
                    String opcionUsuario = read.nextLine();
                    menuParticular = Integer.parseInt(opcionUsuario);
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("INGRESE UNA OPCION VALIDA :D");
                }
            }
        } while (!(0 < menuParticular && menuParticular <= menu.getTamanoED()));
        setHam(menuParticular);
        return menu.getHamburguesa(menuParticular - 1);
    }


    /**
     * metodo que se usa en el main para que el robot camine
     */
    public void caminar() {
        estadoActual.caminar();
    }

    /**
     * metodo que se usa en el main para que el robot atienda
     */
    public void atender() {
        estadoActual.atender();
    }

    /**
     * metodo que se usa en el main para que el robot cocine
     */
    public void cocinar() {
        estadoActual.cocinar();
    }

    /**
     * metodo que se usa en el main para que el robot se suspenda
     */
    public void suspenderse() {
        estadoActual.suspenderse();
    }

    /**
     * metodo con todas las opciones que hay de hamburguesas, se prepara segun la eleccion del cliente
     *
     * @param menu tipo de menu seleccionado
     * @param ham  hamburguesa seleccionada
     */
    public void opciones(int menu, int ham) {
        if (menu == 1) {
            switch (ham) {
                case 1 -> {
                    Bhopper nb = new Bhopper();
                    nb.prepararHamburguesa(hamburguesaRE);

                }
                case 2 -> {
                    GreatMac ng = new GreatMac();
                    ng.prepararHamburguesa(hamburguesaRE);

                }
                case 3 -> {
                    BaconCheese nbc = new BaconCheese();
                    nbc.prepararHamburguesa(hamburguesaRE);
                }
                case 4 -> {
                    Simple ns = new Simple();
                    ns.prepararHamburguesa(hamburguesaRE);
                }
                case 5 -> {
                    GreenBean ngb = new GreenBean();
                    ngb.prepararHamburguesa(hamburguesaRE);
                }
                default -> System.out.println("Opcion incorrecta");
            }
        }
        if (menu == 2) {
            switch (ham) {
                case 1 -> {
                    HMWYBSBurguer nhmw = new HMWYBSBurguer();
                    nhmw.prepararHamburguesa(hamburguesaRE);
                }
                case 2 -> {
                    DYFCBurguer ndy = new DYFCBurguer();
                    ndy.prepararHamburguesa(hamburguesaRE);
                }
                case 3 -> {
                    SHABurguer nsha = new SHABurguer();
                    nsha.prepararHamburguesa(hamburguesaRE);
                }
                case 4 -> {
                    TGWBurguer ntgw = new TGWBurguer();
                    ntgw.prepararHamburguesa(hamburguesaRE);
                }
                default -> System.out.println("Opcion incorrecta");
            }
        }
        if (menu == 3) {
            switch (ham) {
                case 1 -> {
                    SheepBurguer nsb = new SheepBurguer();
                    nsb.prepararHamburguesa(hamburguesaRE);
                }
                case 2 -> {
                    Hambur nh = new Hambur();
                    nh.prepararHamburguesa(hamburguesaRE);
                }
                case 3 -> {
                    SmurflandiaBurguer nsl = new SmurflandiaBurguer();
                    nsl.prepararHamburguesa(hamburguesaRE);
                }
                default -> System.out.println("Opcion incorrecta");
            }
        }
    }

    /**
     * setter que cambia el valor de la orden dependiendo si sue posible ejecutarla
     *
     * @param ordenRecibida valor a cambiar
     */
    public void setOrdenRecibida(boolean ordenRecibida) {
        this.ordenRecibida = ordenRecibida;
    }

    /**
     * setter que cambia el valor de pedidoRecibido dependiendo si ya se recibio este
     *
     * @param pedidoRecibido valor a cambiar
     */
    public void setPedidoRecibido(boolean pedidoRecibido) {
        this.pedidoRecibido = pedidoRecibido;
    }

    /**
     * setter que cambia el valor de pedidoTerminado dependiendo si ya se termino este
     *
     * @param pedidoTerminado valor a cambiar
     */
    public void setPedidoTerminado(boolean pedidoTerminado) {
        this.pedidoTerminado = pedidoTerminado;
    }

    /**
     * @return ordenRecibida , Actualizamos la orden
     */
    public boolean getOrdenRecibida() {
        return ordenRecibida;
    }

    /**
     * @return peido echo por el cliente
     */
    public boolean getPedidoRecibido() {
        return pedidoRecibido;
    }

    /**
     * @return regresamos el pedido terminado
     */
    public boolean getPedidoTerminado() {
        return pedidoTerminado;
    }

    /**
     * @return regresamos el estado actual del robot
     */
    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    /**
     * @return regresamos el modo suspendido del robot
     */
    public EstadoRobot getModoSuspendido() {
        return modoSuspendido;
    }

    /**
     * @return regresamos el modo atendiendo del robot
     */
    public EstadoRobot getModoAtendiendo() {
        return modoAtendiendo;
    }

    /**
     * @return regresamos el modo caminando del robot
     */
    public EstadoRobot getModoCaminando() {
        return modoCaminando;
    }

    /**
     * @return regresamos el modo cocinando del robot
     */
    public EstadoRobot getModoCocinando() {
        return modoCocinando;
    }

    /**
     * @param ham
     */
    public static void setHam(int ham) {
        Robot.ham = ham;
    }

    public static void setTresMenusa(int tresMenusa) {
        Robot.tresMenusa = tresMenusa;
    }

    public void setHamburguesaRE(Hamburguesa hamburguesaRE) {
        this.hamburguesaRE = hamburguesaRE;
    }
}