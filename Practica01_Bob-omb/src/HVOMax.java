

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HVOMax implements Servicio {

    private List<Cliente> usuarios = new ArrayList<Cliente>();
    private List<Cliente> usuariosfree = new ArrayList<Cliente>();
    private List<String> recomendaciones = new ArrayList<String>();
    private List<Cliente> exUsuarios = new ArrayList<Cliente>();
    private List<Cliente> exUsuariosfree = new ArrayList<Cliente>();
    int mesUsuario;

    /**
     * metodo contructor para HVOMax
     * @param mesUsuario nunmero de meses suscrito
     */
    public HVOMax(int mesUsuario) {
        this.mesUsuario = mesUsuario;
        agregarRecomendaciones();
    }

    /**
     * Metodo que muestra la bienvenida a usuarios nuevos y viejos
     */
    @Override
    public void mostrarBienvenida(Cliente usuario) {
        if (exUsuarios.contains(usuario)) {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido de nuevo a HVOMax, un gusto que estes de nuevo con nosotros");
            exUsuarios.remove(usuario);
        } else if (mesUsuario ==1){
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido a HVOMax, un gusto que estes con nosotros");
        }
        if (exUsuariosfree.contains(usuario)) {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido de nuevo a HVOMax, un gusto que estes de nuevo con nosotros");
            exUsuariosfree.remove(usuario);
        }

    }

    /**
     * metodo que muestras las recomendaciones de los servicios
     * @return las reocomendaciones asignadas
     */
    @Override
    public String mostrarRecomendacion() {
        Random r1 = new Random();
        int numrecomendacion = r1.nextInt(recomendaciones.size());
        return "Te recomendamos la serie " + recomendaciones.get(numrecomendacion);
    }

    /**
     * metodo que conbra al usuarios
     * @return costrpo del servicio
     */
    @Override
    public void cobro() {
        for (Cliente a : usuariosfree) {
            if (mesUsuario <= 3) {
                System.out.println(a.getNombre() + " pagaste $0 por el servicio de HVOmax .");
                mesUsuario++;
            }
            int presupuesto = (int) a.getDinero();
            if (presupuesto >= 140) {
                presupuesto = presupuesto - 140;
                a.setDinero(presupuesto);
                System.out.println(a.getNombre() + " pagaste $140 por el servicio de HVoMax .");
            } else
                System.out.println("usted no puede pagar el servicio");
        }

    }

    /**
     * metodo para cancelar la subscripcion del usuario
     * @param usuario cliente al que se le cancela
     */
    @Override
    public void cancelacion(Cliente usuario) {
        if (usuariosfree.contains(usuario)) {
            usuariosfree.remove(usuario);
            exUsuariosfree.add(usuario);
        }
        if (usuarios.contains(usuario)) {
            usuarios.remove(usuario);
            exUsuarios.add(usuario);
        }
        System.out.println("Querido usuario " + usuario.getNombre() + "lamentamos que nos abandones ");
    }

    /**
     * metodo para agregar recomendaciones a una lista
     */
    @Override
    public void agregarRecomendaciones() {
        recomendaciones.add("Euphoria");
        recomendaciones.add("El pacificador");
        recomendaciones.add("Somebody Somewhere");
        recomendaciones.add("La edad dorada");
        recomendaciones.add("Raised by Wolves");
        recomendaciones.add("La amiga estupenda");
        recomendaciones.add("Killing Eve");
        recomendaciones.add("Tiempo de victoria: La dinastía de Los Lakers");
        recomendaciones.add("Blade Runner: Black Lotus\n");
        recomendaciones.add("Our Flag Means Death");
        recomendaciones.add("True Detective");
        recomendaciones.add("Big Little Lies");
        recomendaciones.add("Westworld");
        recomendaciones.add("Game of Thrones");
        recomendaciones.add("The Undoing");
        recomendaciones.add("Chernobyl");
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     */
    @Override
    public void agregarUsuarios(Cliente usuario) {
        usuariosfree.add(usuario);
        mostrarBienvenida(usuario);
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario
     */
    @Override
    public void removerUsuarios(Cliente usuario) {
        if(usuarios.contains(usuario)){
            removerUsuarios(usuario);
            exUsuarios.add(usuario);
        }
        if (usuariosfree.contains(usuario)){
            usuariosfree.remove(usuario);
            exUsuariosfree.add(usuario);
        }
    }

    /**
     * notifica al usuario sobre actualizaciones o recomendaciones
     */
    @Override
    public void notificar() {
        for (Cliente b : usuariosfree) {
            b.actualiza();
        }
        for (Cliente c : usuarios) {
            c.actualiza();
        }
    }
}