

public class ModoCocinando implements EstadoRobot {

    Robot mecha;

    /**
     * constructor para el modo cocinando del robot
     *
     * @param mecha robot que recibe ordenes
     */
    public ModoCocinando(Robot mecha) {
        this.mecha = mecha;
    }

    /**
     * metodo para caminar en el ModoAtendiendo , opcion no posible
     */
    @Override
    public void caminar() {
        mecha.setOrdenRecibida(false);
        System.out.println("***MODO COCINANDO***\nEl Robot no puede caminar mientras Cocina.");
    }

    /**
     * metodo para atender en el ModoAtendiendo , opcion no posible si no se a terminado el pedido
     * en caso contrario cambia a modo camiando y atendiendo
     */
    @Override
    public void atender() {
        if (mecha.getPedidoTerminado()) {
            mecha.asignarNuevoEstado(mecha.getModoCaminando());
            mecha.getEstadoActual().atender();
        }
        mecha.setOrdenRecibida(false);
        System.out.println("***MODO COCINANDO***\nEl Robot no puede Atender mientras Cocina.");
    }

    /**
     * metodo para cocinar en el ModoAtendiendo , opcion posible , se recibe la orden y se prepara
     */
    @Override
    public void cocinar() {
        if (!mecha.getPedidoTerminado()) {
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO COCINANDO***\nEl Robot esta cocinado ");
            mecha.opciones(Robot.tresMenusa, Robot.ham);
            mecha.setPedidoTerminado(true);
            System.out.println("***MODO COCINANDO***\nEl Robot termino el Pedido.");
        } else {
            System.out.println("***MODO COCINANDO***\nEl Robot No tiene pedidos.");
        }
    }

    /**
     * metodo para suspenderse en el ModoAtendiendo , opcion posible cuando se termino el pedido , se cambia a modo suspendido
     */
    @Override
    public void suspenderse() {
        if (!mecha.getPedidoTerminado()) {
            mecha.setOrdenRecibida(false);
            System.out.println("***MODO COCINANDO***\nEl Robot no a terminado de Cocinar el pedido ");
        } else {
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO COCINANDO***\nEl Robot pasara al MODO SUSPENDIDO");
            mecha.setPedidoRecibido(false);
            mecha.setPedidoTerminado(false);
            mecha.asignarNuevoEstado(mecha.getModoSuspendido());
            mecha.suspenderse();
        }
    }
}
