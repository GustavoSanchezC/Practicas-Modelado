

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Observer {

    private String nombre;
    private double dinero;
    private List<Servicio> servicios = new ArrayList<>();// para notificaciones de multiples servicios
    int mesesSuscrito;

    /**
     * Contructor para un nuevo cliente
     * @param nombre nombre del cliente
     * @param dinero dinero del cliente
     * @param mesesSuscrito meses del usuario suscrito
     */
    public Cliente(String nombre, double dinero, int mesesSuscrito, List<Servicio> servicios) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.mesesSuscrito = mesesSuscrito;
        this.servicios= servicios;
    }

    /**
     * Contructor para un nuevo cliente
     * @param nombre nombre del cliente
     * @param dinero dinero del cliente
     */
    public Cliente(String nombre, double dinero,List<Servicio> servicios) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.servicios= servicios;
    }


    /**
     * Metodo sobreescrito para que el cliente reciba notificaciones
     * se conecta con el tipo de servicio al que se sucribio el cliente
     */
    @Override
    public void actualiza() {
        for (Servicio a : servicios) {
            System.out.println(nombre + a.mostrarRecomendacion());
        }
    }

    /**
     * Getter para obtener el nombre del usuario
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter pora obtener el dinero que tiene el usuario
     * @return dinero
     */
    public double getDinero() {
        return dinero;
    }

    /**
     * Setter para asignar dinero, lo usamos para cobrar
     * @param dinero nueva cantidad de dinero
     */
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
}