

import java.util.Scanner;

/**
 * Clase Menu para las Pizzas del cangrejo que despliega las diferentes opciones de pizzas
 */
public class PizzaDonCangrejo {
    /**
     * metodo constructor en donde se hace todo el proceso de seleccion
     * se adaptan las pizzas a el ticket usado en baguette , generado en el nucleo Pan
     */
    public PizzaDonCangrejo() {
        Scanner read = new Scanner(System.in);
        System.out.println("Elija la pizza de su Preferencia \n" +
                "1.Pizza caprichosa\n" +
                "2.Pizza Carbonara\n" +
                "3.Pizza Lahmacun\n" +
                "4.Pizza Margarita\n" +
                "5.Pizza Napolitana\n");

        AdapterPizza temp;
        int opcion = read.nextInt();
        switch (opcion) {
            case 1:
                temp = new AdapterPizza(new Caprichosa());
                System.out.println(temp.getTicket());
                System.out.println("Pedido Terminado");
                break;
            case 2:
                temp = new AdapterPizza(new Carbonara());
                System.out.println(temp.getTicket());
                System.out.println("Pedido Terminado");
                break;
            case 3:
                temp = new AdapterPizza(new Lahmacun());
                System.out.println(temp.getTicket());
                System.out.println("Pedido Terminado");
                break;
            case 4:
                temp = new AdapterPizza(new Margarita());
                System.out.println(temp.getTicket());
                System.out.println("Pedido Terminado");
                break;
            case 5:
                temp = new AdapterPizza(new Napolitana());
                System.out.println(temp.getTicket());
                System.out.println("Pedido Terminado");
                break;
            default:
                System.out.println("Opcion no disponible");
                new PizzaDonCangrejo();
                break;

        }


    }


}
