

public class ModoSuspendido implements EstadoRobot {

    Robot mecha;

    /**
     * constructor para el modo suspendido del robot
     *
     * @param mecha robot que recibe ordenes
     */
    public ModoSuspendido(Robot mecha) {
        this.mecha = mecha;
    }

    /**
     * metodo para caminar en el ModoSuspendido, opcion posible cambia modo a suspendido  en caso de no tener ordenes , pasa a modo caminado
     */
    @Override
    public void caminar() {
        if (mecha.getPedidoTerminado()) {
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO SUSPENDIDO***\nEl Robot ha terminado sus pedidos por hoy." +
                    "Pasara a MODO Suspendido.");
            mecha.asignarNuevoEstado(mecha.getModoSuspendido());
            mecha.setPedidoTerminado(false);
        } else {
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO SUSPENDIDO***\nEl Robot pasara al MODO Caminando.");
            mecha.asignarNuevoEstado(mecha.getModoCaminando());
            mecha.caminar();
        }
    }

    /**
     * metodo para atender en el ModoSuspendido, opcion posible cambia modo a suspendido  en caso de no tener ordenes
     * no cambia de modo al no caminar hacia el cliente
     */
    @Override
    public void atender() {
        if (mecha.getPedidoTerminado()) {
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO SUSPENDIDO***\nEl Robot ha terminado sus pedidos por hoy." +
                    "Pasara a MODO Suspendido.");
            mecha.asignarNuevoEstado(mecha.getModoSuspendido());
        } else {
            mecha.setOrdenRecibida(false);
            System.out.println("***MODO SUSPENDIDO***\nEl Robot no puede atender lejos del cliente." +
                    "Pasara a MODO Suspendido.");
        }

    }

    /**
     * metodo para cocinar en el ModoSuspendido, opcion posible cambia modo a suspendido  en caso de no tener ordenes
     * no cambia de modo al no tener ordenes
     */
    @Override
    public void cocinar() {
        if (mecha.getPedidoTerminado()) {
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO SUSPENDIDO***\nEl Robot ha terminado sus pedidos por hoy." +
                    "Pasara a MODO Suspendido.");
            mecha.asignarNuevoEstado(mecha.getModoSuspendido());
        } else {
            mecha.setOrdenRecibida(false);
            System.out.println("***MODO SUSPENDIDO***\nEl Robot no puede Cocinar sin recibir pedidos ." +
                    "Pasara a MODO Suspendido.");
        }

    }

    /**
     * metodo para suspenderse en el ModoSuspendido, opcion posible cambia modo a suspendido  en caso de no tener ordenes , pasa a modo suspendido
     */
    @Override
    public void suspenderse() {
        if (mecha.getPedidoTerminado()) {
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO SUSPENDIDO***\nEl Robot ha terminado sus pedidos por hoy." +
                    "Pasara a MODO Suspendido.");
            mecha.asignarNuevoEstado(mecha.getModoSuspendido());
        } else {
            mecha.setOrdenRecibida(false);
            System.out.println("***MODO SUSPENDIDO***\nEl Robot pasara al MODO Suspendido.");
            mecha.asignarNuevoEstado(mecha.getModoSuspendido());
        }
    }
}
