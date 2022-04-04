

public class ModoCaminado implements EstadoRobot {
    Robot mecha;

    /**
     * constructor para el modo caminado del robot
     *
     * @param mecha robot que recibe ordenes
     */
    public ModoCaminado(Robot mecha) {
        this.mecha = mecha;
    }

    /**
     * metodo para caminar en el ModoCaminando , opcion posible
     */
    @Override
    public void caminar() {
        mecha.setOrdenRecibida(true);
        mecha.asignarNuevoEstado(mecha.getModoCaminando());
        System.out.println("***MODO CAMINANDO***\nEl Robot esta Caminando... ");
        System.out.println("***MODO CAMINANDO***\nEl Robot llego a su destino...");

    }

    /**
     * metodo para atender en el ModoCaminando , opcion posible se cambia de modo a atender
     */
    @Override
    public void atender() {
        mecha.setOrdenRecibida(true);
        System.out.println("***MODO CAMINANDO***\nEl Robot pasara a modo Atendiendo .");
        mecha.asignarNuevoEstado(mecha.getModoAtendiendo());
        mecha.setPedidoRecibido(true);
        mecha.atender();
    }

    /**
     * metodo para cocinar en el ModoCaminando , opcion posible
     */
    @Override
    public void cocinar() {
        mecha.setOrdenRecibida(false);
        System.out.println("\"***MODO CAMINANDO***\nEl robot no puede Cocinar sin haber Atendido ");
    }

    /**
     * metodo para suspenderse en el ModoCaminando , opcion posible , se cambia de modo a suspencion
     */
    @Override
    public void suspenderse() {
        mecha.setOrdenRecibida(true);
        System.out.println("\"***MODO CAMINANDO***\nEl Robot pasara al MODO SUSPENDIDO");
        mecha.asignarNuevoEstado(mecha.getModoSuspendido());
        mecha.suspenderse();
    }
}
