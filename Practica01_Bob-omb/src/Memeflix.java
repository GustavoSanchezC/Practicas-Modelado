
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Memeflix implements Servicio {

    private List<Cliente> usuarios = new ArrayList<Cliente>();
    public List<String> recomendaciones = new ArrayList<String>();
    private List<Cliente> exUsuarios = new ArrayList<Cliente>();

    /**
     * Metodo Constructor para generar el servicio Memeflix
     */
    public Memeflix() {
        agregarRecomendaciones();
    }

    /**
     * Metodo que muestra la bienvenida a usuarios nuevos y viejos
     */
    @Override
    public void mostrarBienvenida(Cliente usuario) {
        if (exUsuarios.contains(usuario)) {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido de nuevo a Memeflix, un gusto que estes de nuevo con nosotros");
            exUsuarios.remove(usuario);
        } else {
            System.out.println("Hola " + usuario.getNombre() + ":D, Bienvenido a Memeflix, un gusto que estes con nosotros");
        }
    }

    /**
     * Metodo para agregar recomendaciones a la lista
     */
    @Override
    public void agregarRecomendaciones() {
        recomendaciones.add("Estamos muertos.");
        recomendaciones.add("Cobra Kai.");
        recomendaciones.add("The Walking Dead.");
        recomendaciones.add("Arrow.");
        recomendaciones.add("The Last Kingdom.");
        recomendaciones.add("Vikingos: Valhalla");
        recomendaciones.add("Las escalofriantes aventuras de Sabrina");
        recomendaciones.add("La serpiente");
        recomendaciones.add("Ragnarok");
        recomendaciones.add("Lupin");
        recomendaciones.add("Marco Polo.");
        recomendaciones.add("The Umbrella Academy.");
        recomendaciones.add("Viajeros.");
        recomendaciones.add("The End of the Fucking World.");
        recomendaciones.add("The Fall.");
        recomendaciones.add("The Fall.");
        recomendaciones.add("The Witcher.");
        recomendaciones.add("La casa de papel.");
        recomendaciones.add("The punisher.");
        recomendaciones.add("The punisher.");
    }

    /**
     * Metodo para agregar un usuario a su lista de clientes
     * @param usuario
     */
    @Override
    public void agregarUsuarios(Cliente usuario) {
        usuarios.add(usuario);
        mostrarBienvenida(usuario);
    }

    @Override
    public void removerUsuarios(Cliente usuario) {
        usuarios.remove(usuario);
        exUsuarios.add(usuario);
    }

    /**
     * Obtenemos un random de nuestra lista de recomendaciones
     *
     * @return la recomendacion en tipo string
     */
    @Override
    public String mostrarRecomendacion() {
        Random r1 = new Random();
        int numrecomendacion = r1.nextInt(recomendaciones.size());
        return  " te recomendamos la serie " + recomendaciones.get(numrecomendacion) + ".";
    }

    /**
     * Metodo que cobrar al usuarios
     */
    @Override
    public void cobro() {
        for (Cliente a : usuarios) {
            int presupuesto = (int) a.getDinero();
            presupuesto = presupuesto - 120;
            a.setDinero(presupuesto);
            System.out.println(a.getNombre() + " pagaste $120 por el servicio de Memeflix un dispositivo.");
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
        System.out.println("Querido usuario " + usuario.getNombre() + "lamentamos que nos abandones.");
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