

import java.util.ArrayList;
import java.util.List;

public class MemeflixDispositivos extends Memeflix {

    private List<Cliente> usuariosplus = new ArrayList<Cliente>();
    private List<Cliente> exUsuariosplus = new ArrayList<Cliente>();
    int dispositivos;

    /**
     * contructor para memeflix con mas dispositivos
     * @param dispositivos
     */
    public MemeflixDispositivos(int dispositivos) {
        this.dispositivos = dispositivos;
        agregarRecomendaciones();
    }

    /**
     * Metodo que muestra una bienvenida al usuario
     */
    @Override
    public void mostrarBienvenida(Cliente usuario) {
        if (exUsuariosplus.contains(usuario)) {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido de nuevo a Memeflix, un gusto que estes de nuevo con nosotros , tienes la version de "+ dispositivos +" dispositivos");
            exUsuariosplus.remove(usuario);
        } else {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido a Memeflix, un gusto que estes con nosotros, tienes la version de "+ dispositivos +" dispositivos");
        }
    }

    /**
     * metodo que cobra al usuarios dependiendo del servicio
     * @return costo del servicio
     */
    @Override
    public void cobro() {
        for (Cliente c: usuariosplus) {
            switch (dispositivos) {
                case 2:
                    int presupuesto = (int) c.getDinero();
                    if (presupuesto >= 170) {
                        presupuesto = presupuesto - 170;
                        c.setDinero(presupuesto);
                        System.out.println(c.getNombre() + " pagaste $170 por el servicio de Memeflix dos dispositivo.");
                    }
                    break;
                case 4:
                    int presupuesto2 = (int) c.getDinero();
                    if (presupuesto2 >= 200) {
                        presupuesto2 = presupuesto2 - 200;
                        c.setDinero(presupuesto2);
                        System.out.println(c.getNombre() + " pagaste $200 por el servicio de Memeflix cuatro dispositivo.");
                    }
                    break;
                default:
                    System.out.println("no ingreso la cantidad de dispositivos");
                    break;
            }
        }
    }

    /**
     * metodo para cancelar la subscripcion del usuario
     * @param usuario cliente al que se le cancela
     */
    @Override
    public void cancelacion(Cliente usuario) {
        usuariosplus.remove(usuario);
        exUsuariosplus.add(usuario);
        System.out.println("Querido usuario " + usuario.getNombre() + " lamentamos que nos abandones.");
    }

    /**
     * notifica al usuario sobre actualizaciones o recomendaciones
     */
    @Override
    public void notificar() {
        for (Cliente b : usuariosplus) {
            b.actualiza();
        }
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario se agrega a la lista
     */
    @Override
    public void agregarUsuarios(Cliente usuario) {
        usuariosplus.add(usuario);
        mostrarBienvenida(usuario);
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario se cambia de lista
     */
    @Override
    public void removerUsuarios(Cliente usuario) {
        usuariosplus.remove(usuario);
        exUsuariosplus.add(usuario);
    }
}