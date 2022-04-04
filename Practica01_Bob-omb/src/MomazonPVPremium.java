

import java.util.ArrayList;
import java.util.List;

public class MomazonPVPremium extends MomazonPV {

    private List<Cliente> usuariosPlus = new ArrayList<Cliente>();
    private List<Cliente> exUsuariosPlus = new ArrayList<Cliente>();

    public MomazonPVPremium() {
        agregarRecomendaciones();
    }

    /**
     * Metodo que muestra la bienvenida a usuarios nuevos y viejos
     */
    @Override
    public void mostrarBienvenida(Cliente usuario) {
        if (exUsuariosPlus.contains(usuario)) {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido de nuevo a Momazon PV Premium, un gusto que estes de nuevo con nosotros");
            exUsuariosPlus.remove(usuario);
        } else {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido a Momazon PV Premium, un gusto que estes con nosotros");
        }
    }

    /**
     * Metodo que cobrar al usuarios
     */
    @Override
    public void cobro() {
        for (Cliente a : usuariosPlus) {
            int presupuesto = (int) a.getDinero();
            presupuesto = presupuesto - 150;
            a.setDinero(presupuesto);
            System.out.println(a.getNombre() + " pagaste $150 por el servicio de Momazon Prime Video Premium.");
        }
    }

    /**
     * Metodo para cancelar la subscripcion del usuario
     *
     * @param usuario cliente al que se le cancela
     */
    @Override
    public void cancelacion(Cliente usuario) {
        usuariosPlus.remove(usuario);
        exUsuariosPlus.add(usuario);
        System.out.println("Querido usuario " + usuario.getNombre() + " lamentamos que nos abandones :CC");
    }

    /**
     * Notifica al usuario sobre actualizaciones o recomendaciones
     */
    @Override
    public void notificar() {
        for (Cliente a : usuariosPlus) {
            a.actualiza();
        }
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     */
    @Override
    public void agregarUsuarios(Cliente usuario) {
        usuariosPlus.add(usuario);
        mostrarBienvenida(usuario);
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario cliente eliminado
     */
    @Override
    public void removerUsuarios(Cliente usuario) {
        usuariosPlus.remove(usuario);
        exUsuariosPlus.add(usuario);
    }
}
