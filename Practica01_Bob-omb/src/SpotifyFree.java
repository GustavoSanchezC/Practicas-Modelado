

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpotifyFree implements Servicio {

    private List<Cliente> usuariosFree = new ArrayList<Cliente>();
    public List<String> recomendaciones = new ArrayList<String>();
    private List<Cliente> exUsuariosfree = new ArrayList<Cliente>();

    /**
     * constructor para la version gratis de Spotify
     */
    public SpotifyFree(){
        agregarRecomendaciones();
    }

    /**
     * metodo que muestra la bienvenida a usuarios nuevos y viejos
     */
    @Override
    public void mostrarBienvenida(Cliente usuario) {
        if (exUsuariosfree.contains(usuario)) {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido de nuevo a Spootify, un gusto que estes de nuevo con nosotros");
            usuariosFree.remove(usuario);
        } else {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido a Spootify, un gusto que estes con nosotros");
        }
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
        return " te recomendamos la cancion " + recomendaciones.get(numrecomendacion);
    }

    /**
     * metodo que conbra al usuarios
     *
     * @return costo del servicio
     */
    @Override
    public void cobro() {
        for (Cliente a : usuariosFree) {
            int presupuesto = (int) a.getDinero();
            a.setDinero(presupuesto);
            System.out.println(a.getNombre() + " pagaste $0 por el servicio de Spootify gratis.");
        }
    }

    /**
     * metodo para cancelar la subscripcion del usuario
     *
     * @param usuario cliente al que se le cancela
     */
    @Override
    public void cancelacion(Cliente usuario) {
        usuariosFree.remove(usuario);
        exUsuariosfree.add(usuario);
        System.out.println("Querido usuario " + usuario.getNombre() + " lamentamos que nos abandones ");
    }

    /**
     * metodo para agregar recomendaciones a una lista
     */
    @Override
    public void agregarRecomendaciones() {
        recomendaciones.add("Shape of You");
        recomendaciones.add("Blinding Lights");
        recomendaciones.add("Dance Monkey");
        recomendaciones.add("Rockstar");
        recomendaciones.add("Someone You Loved");
        recomendaciones.add("One Dance");
        recomendaciones.add("Closer");
        recomendaciones.add("Sunflower");
        recomendaciones.add("Señorita");
        recomendaciones.add("Believer");
        recomendaciones.add("Bad Guy");
        recomendaciones.add("Perfect");
        recomendaciones.add("Thinking Out Loud");
        recomendaciones.add("God's Plan");
        recomendaciones.add("Lucid Dreams");
        recomendaciones.add("Bohemian Rhapsody");
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     */
    @Override
    public void agregarUsuarios(Cliente usuario) {
        usuariosFree.add(usuario);
        mostrarBienvenida(usuario);
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario
     */
    @Override
    public void removerUsuarios(Cliente usuario) {
        usuariosFree.remove(usuario);
        exUsuariosfree.add(usuario);
    }

    /**
     * notifica al usuario sobre actualizaciones o recomendaciones
     */
    @Override
    public void notificar() {
        for (Cliente a : usuariosFree) {
            a.actualiza();
        }
    }
}
