

public interface Servicio {

    /**
     * Metodo que muestra una bienvenida al usuario
     */
    public void mostrarBienvenida(Cliente usuario);

    /**
     * Metodo que muestras las recomendaciones de los ervicios
     *
     * @return las reocomendaciones asignadas
     */
    public String mostrarRecomendacion();

    /**
     * Metodo que cobra el servicio
     */
    public void cobro();

    /**
     * Metodo para cancelar suscripcion
     *
     * @param usuario
     */
    public void cancelacion(Cliente usuario);

    /**
     * Metodo para agregar recomendaciones a una lista
     */
    public void agregarRecomendaciones();

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario
     */
    public void agregarUsuarios(Cliente usuario);

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario
     */
    public void removerUsuarios(Cliente usuario);

    /**
     * Notifica al usuario sobre actualizaciones o recomendaciones
     */
    public void notificar();
}