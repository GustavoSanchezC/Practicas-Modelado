

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MomazonPV implements Servicio {

    private List<Cliente> usuarios = new ArrayList<Cliente>();
    public List<String> recomendaciones = new ArrayList<String>();
    private List<Cliente> exUsuarios = new ArrayList<Cliente>();

    public MomazonPV() {
        agregarRecomendaciones();
    }

    /**
     * metodo que muestra la bienvenida a usuarios nuevos y viejos
     */
    @Override
    public void mostrarBienvenida(Cliente usuario) {
        if (exUsuarios.contains(usuario)) {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido de nuevo a Momazon PV, un gusto que estes de nuevo con nosotros.");
            exUsuarios.remove(usuario);
        } else {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido a Momazon PV, un gusto que estes con nosotros.");
        }
    }

    /**
     * Metodo para agregar recomendaciones a la lista
     */
    @Override
    public void agregarRecomendaciones() {
        recomendaciones.add("La Rueda Del Tiempo.");
        recomendaciones.add("Upload.");
        recomendaciones.add("Greys Anatomy.");
        recomendaciones.add("Mente Asesina.");
        recomendaciones.add("The Walking Dead.");
        recomendaciones.add("The Good Doctor");
        recomendaciones.add("Reacher.");
        recomendaciones.add("Hanna.");
        recomendaciones.add("The Expanse.");
        recomendaciones.add("Chicago Med.");
        recomendaciones.add("Invincible.");
        recomendaciones.add("Con amor.");
        recomendaciones.add("Solos.");
        recomendaciones.add("Cruel Summer.");
        recomendaciones.add("Doctor House.");
        recomendaciones.add("Them.");
        recomendaciones.add("Homecoming");
        recomendaciones.add("Soulmates");
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     */
    @Override
    public void agregarUsuarios(Cliente usuario) {
        usuarios.add(usuario);
        mostrarBienvenida(usuario);
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario
     */
    @Override
    public void removerUsuarios(Cliente usuario) {
        usuarios.remove(usuario);
        exUsuarios.add(usuario);
    }

    /**
     * metodo que muestras las recomendaciones de los ervicios
     *
     * @return las reocomendaciones asignadas
     */
    @Override
    public String mostrarRecomendacion() {
        Random r1 = new Random();
        int numrecomendacion = r1.nextInt(recomendaciones.size());
        return "Este Mes, Nuestra Recomendacion Es: " + recomendaciones.get(numrecomendacion)+" \nEsperemos La Disfrutes :D";
    }

    /**
     * Metodo que cobrar al usuarios
     */
    @Override
    public void cobro() {
        for (Cliente a : usuarios) {
            int presupuesto = (int) a.getDinero();
            presupuesto = presupuesto - 110;
            a.setDinero(presupuesto);
            System.out.println(a.getNombre() + " pagaste $110 por el servicio de Momazon Prime Video normal.");
        }
    }

    /**
     * metodo para cancelar la subscripcion del usuario
     *
     * @param usuario cliente al que se le cancela
     */
    @Override
    public void cancelacion(Cliente usuario) {
        usuarios.remove(usuario);
        exUsuarios.add(usuario);
        System.out.println("Querido usuario " + usuario.getNombre() + " lamentamos que nos abandones :CC ");
    }

    /**
     * notifica al usuario sobre actualizaciones o recomendaciones
     */
    @Override
    public void notificar() {
        for (Cliente a : usuarios) {
            a.actualiza();
        }
    }
}
