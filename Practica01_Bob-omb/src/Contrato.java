

import java.util.List;
import java.util.ArrayList;


public class Contrato {

    public Cliente usuario;
    public List<Servicio> servicios;

    /**
     * Metodo constructor para generar un contrato entre el un cliente y un servicio.
     *
     * @param usuario   es el cliente el que desea adquirir un servicio
     * @param servicios es el servicio de entretenimiento adquirido
     *                  //* @param mes mes en el que se encuntra corriendo dicho contrato
     */
    public Contrato(Cliente usuario, List<Servicio> servicios) {
        this.usuario = usuario;
        this.servicios = servicios;
        for (Servicio s: servicios) {
            s.agregarUsuarios(usuario);

        }
    }

    /**
     * metodo para CANCELAR SUSCRIPCIONES
     * @param servicio
     */
    public void cancela(Servicio servicio){
        servicio.cancelacion(usuario);
        servicios.remove(servicio);
    }

    /**
     * Metodo que nos sirve para añadir un nuevo servicio
     * @param servicio es el servicio a agregar
     */
    public void nuevo(Servicio servicio){
        servicios.add(servicio);
        servicio.agregarUsuarios(usuario);
    }
}
