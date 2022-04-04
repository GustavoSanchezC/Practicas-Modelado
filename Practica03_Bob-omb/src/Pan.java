
/**
 * interface en donde tenemos un pan el cual sera el nucleo
 * le damos formato a nuestro ticket desde aqui
 */
public interface Pan {
    public String getDescripcion();

    public String getPollo();

    public String getPepperoni();

    public String getJamon();

    public String getLechuga();

    public String getJitomate();

    public String getCebolla();

    public String getMostaza();

    public String getCatsup();

    public String getMayonesa();

    public int getPrecio();

    public default String getTicket() {
        return "----------------Ticket------------------\n" + getDescripcion() + "---------------------------------------\n" + "-------Total a Pagar: $" + getPrecio() + "-------";
    }

}
