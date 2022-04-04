

import java.util.ArrayList;
import java.util.List;

public class SpotifyPremium extends SpotifyFree {

    private List<Cliente> usuariosPlus = new ArrayList<Cliente>();
    private List<Cliente> exUsuariosPlus = new ArrayList<Cliente>();

    /**
     * Constructor para la version premium de Spotify
     */
    public SpotifyPremium() {
        agregarRecomendaciones();
    }

    /**
     * metodo que muestra la bienvenida a usuarios nuevos y viejos
     */
    @Override
    public void mostrarBienvenida(Cliente usuario) {
        if (exUsuariosPlus.contains(usuario)) {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido de nuevo a Spootify Premium, un gusto que estes de nuevo con nosotros");
            usuariosPlus.remove(usuario);
        } else {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido a Spootify Premium, un gusto que estes con nosotros");
        }
    }

    /**
     * metodo que conbra al usuarios
     *
     * @return costrpo del servicio
     */
    @Override
    public void cobro() {
        for (Cliente a : usuariosPlus) {
            int presupuesto = (int) a.getDinero();
            presupuesto = presupuesto - 80;
            a.setDinero(presupuesto);
            System.out.println(a.getNombre() + " pagaste $80 por el servicio de Spootify Premium.");
        }
    }

    /**
     * metodo para cancelar la subscripcion del usuario
     *
     * @param usuario cliente al que se le cancela
     */
    @Override
    public void cancelacion(Cliente usuario) {
        usuariosPlus.remove(usuario);
        exUsuariosPlus.add(usuario);
        System.out.println("Querido usuario " + usuario.getNombre() + " lamentamos que nos abandones ");
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     *
     * @param usuario
     */
    @Override
    public void agregarUsuarios(Cliente usuario) {
        usuariosPlus.add(usuario);
        mostrarBienvenida(usuario);
    }

    /**
     * Metodo para remover un usuario de su lista de clientes
     *
     * @param usuario
     */
    @Override
    public void removerUsuarios(Cliente usuario) {
        usuariosPlus.remove(usuario);
        exUsuariosPlus.add(usuario);
    }

    /**
     * notifica al usuario sobre actualizaciones o recomendaciones
     */
    @Override
    public void notificar() {
        for (Cliente a : usuariosPlus) {
            a.actualiza();
        }
    }
}
