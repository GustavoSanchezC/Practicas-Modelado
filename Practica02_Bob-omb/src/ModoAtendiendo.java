

public class ModoAtendiendo implements EstadoRobot {
    Robot mecha;

    /**
     * constructor para el modo atendiendo del robot
     *
     * @param mecha robot que recibe ordenes
     */
    public ModoAtendiendo(Robot mecha) {
        this.mecha = mecha;
    }

    /**
     * metodo para caminar en el ModoAtendiendo , opcion no posible
     */
    @Override
    public void caminar() {
        mecha.setOrdenRecibida(false);
        System.out.println("***MODO ATENDIENDO***\nEl Robot no puede caminar mientras Atiende.");
    }

    /**
     * metodo para atender en el ModoAtendiendo, opcion posible , se cambia de modo a cocinar cuando ya se recibio el pedido
     */
    @Override
    public void atender() {
        if (!mecha.getPedidoRecibido()) {
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO ATENDIENDO***\nEl Robot esta atendiendo.");
            mecha.setPedidoRecibido(true);
            mecha.getModoAtendiendo().atender();
        } else {
            mecha.recibeOrden();
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO ATENDIENDO***\nEl robot a terminado de atender al cliente ,pasara a modo COCINANDO ");
            mecha.asignarNuevoEstado(mecha.getModoCocinando());
        }
    }

    /**
     * metodo para cocinar en el ModoAtendiendo , opcion posible cuando se terminó de atender cambia a modo cocinar
     */
    @Override
    public void cocinar() {
        if (!mecha.getPedidoRecibido()) {
            mecha.setOrdenRecibida(false);
            System.out.println("***MODO ATENDIENDO***\nEl Robot no a terminado de atender al cliente.");
        } else {
            mecha.setOrdenRecibida(true);
            System.out.println("***MODO ATENDIENDO***\nEl Robot pasara a modo COCINANDO");
            mecha.asignarNuevoEstado(mecha.getModoCocinando());
            mecha.cocinar();
        }
    }

    /**
     * metodo para suspenderse en el ModoAtendiendo, opcion no posible
     */
    @Override
    public void suspenderse() {
        mecha.setOrdenRecibida(false);
        System.out.println("***MODO ATENDIENDO***\nEl robot no puede suspenderse mientras Atiende.");
    }
}
