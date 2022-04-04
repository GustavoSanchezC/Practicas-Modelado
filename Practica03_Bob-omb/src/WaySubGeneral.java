

import java.util.Scanner;

public class WaySubGeneral {

    /**
     * metodo main en donde el usuario elige lo que quiere
     *
     * @param args .
     */
    public static void main(String[] args) {
        try {
            int option;
            Scanner read = new Scanner(System.in);
            System.out.println("Seleccione el pedido que desea realizar\n" +
                    "1.Ordenar Baguette\n" +
                    "2.Ordenar Pizza\n" +
                    "3.Salir");
            option = read.nextInt();
            switch (option) {
                case 1:
                    System.out.println("****Ordenando Baguette****");
                    new WaySub();
                    System.out.println("Que desea hacer ahora");
                    main(args);
                    break;
                case 2:
                    System.out.println("****Ordenando Pizza****");
                    new PizzaDonCangrejo();
                    System.out.println("Que desea hacer ahora");
                    main(args);
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Opcion no vaida");
                    main(args);
                    break;
            }
        } catch (Exception e) {
            System.out.println("A ocurrido un error");
            main(args);
        }


    }
}
