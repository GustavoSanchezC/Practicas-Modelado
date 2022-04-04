

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThisneyPlus implements Servicio {

    private List<Cliente> usuarios = new ArrayList<Cliente>();
    private List<Cliente> usuarios130cost = new ArrayList<Cliente>();
    private List<String> recomendaciones = new ArrayList<String>();
    private List<Cliente> exUsuarios = new ArrayList<Cliente>();
    private List<Cliente> exUsuarios130cost = new ArrayList<Cliente>();
    int mesUsuario;

    /**
     * contructor para ThisneyPlus
     * @param mesUsuario meses del usuario
     */
    public ThisneyPlus(int mesUsuario) {
        this.mesUsuario = mesUsuario;
        agregarRecomendaciones();
    }

    /**
     * Metodo que muestra la bienvenida a usuarios nuevos y viejos
     */
    @Override
    public void mostrarBienvenida(Cliente usuario) {
        if (exUsuarios.contains(usuario)) {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido de nuevo a Thisney+, un gusto que estes de nuevo con nosotros");
            exUsuarios.remove(usuario);
        } else {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido a Thisney+, un gusto que estes con nosotros");
        }
    }

    /**
     * Metodo que muestras las recomendaciones de los servicios
     * @return las reocomendaciones asignadas
     */
    @Override
    public String mostrarRecomendacion() {
        Random r1 = new Random();
        int numrecomendacion = r1.nextInt(recomendaciones.size());
        return "Te recomendamos la serie " + recomendaciones.get(numrecomendacion);
    }

    /**
     * Metodo que cobra al usuarios
     * @return costrpo del servicio
     */
    @Override
    public void cobro() {
        for (Cliente c:usuarios130cost) {
            if (mesUsuario <= 3) {
                int presupuesto = (int) c.getDinero();
                if (presupuesto >= 130) { /** Verifica que el usuario tenga fondos suficientes */
                    presupuesto = presupuesto - 130;
                    c.setDinero(presupuesto);
                    System.out.println(c.getNombre() + " pagaste $130 por el servicio de Thisney+ .");
                    mesUsuario++;
                }
            }else {
                usuarios.add(c);
            }
        }
        for (Cliente a : usuarios) {
            int presupuesto = (int) a.getDinero();
            if (presupuesto >= 160) {
                presupuesto = presupuesto - 160;
                a.setDinero(presupuesto);
                System.out.println(a.getNombre() + " pagaste $160 por el servicio de Thisney+ .");
            } else {
                System.out.println("usted no puede pagar el servicio");
            }
            if (usuarios130cost.contains(a)){
                usuarios130cost.remove(a);
            }
        }
    }

    /**
     * metodo para cancelar la subscripcion del usuario
     * @param usuario cliente al que se le cancela
     */
    @Override
    public void cancelacion(Cliente usuario) {
        if (usuarios130cost.contains(usuario)) {
            usuarios130cost.remove(usuario);
            exUsuarios130cost.add(usuario);
        }
        if (usuarios.contains(usuario)) {
            usuarios.remove(usuario);
            exUsuarios.add(usuario);
        }
        System.out.println("Querido usuario " + usuario.getNombre() + " lamentamos que nos abandones ");
    }

    /**
     * Eetodo para agregar recomendaciones a una lista
     */
    @Override
    public void agregarRecomendaciones() {
        recomendaciones.add("Marvel’s Daredevil");
        recomendaciones.add("Brain Games: On The Road");
        recomendaciones.add("The Book of Boba Fett");
        recomendaciones.add("The Mandalorian");
        recomendaciones.add("The World According to Jeff Goldblum");
        recomendaciones.add("The Beatles: Get Back");
        recomendaciones.add("Hawkeye");
        recomendaciones.add("Just Beyond");
        recomendaciones.add("Socios y sabuesos");
        recomendaciones.add("Hannah Montana");
        recomendaciones.add("Behind the Attraction");
        recomendaciones.add("The Imagineering Story");
        recomendaciones.add("Loki");
        recomendaciones.add("WandaVision");
        recomendaciones.add("The Falcon and The Winter Soldier");
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     */
    @Override
    public void agregarUsuarios(Cliente usuario) {
        if (mesUsuario <= 3){
            usuarios130cost.add(usuario);
        }else{
            usuarios.add(usuario);
            mostrarBienvenida(usuario);
        }

    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario
     */
    @Override
    public void removerUsuarios(Cliente usuario) {
        usuarios.remove(usuario);
    }

    /**
     * Notifica al usuario sobre actualizaciones o recomendaciones
     */
    @Override
    public void notificar() {
        for (Cliente b : usuarios130cost) {
            b.actualiza();
        }
        for (Cliente c : usuarios) {
            c.actualiza();
        }
    }
}