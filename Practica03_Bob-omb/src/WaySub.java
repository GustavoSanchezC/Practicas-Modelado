

import java.util.Scanner;

/**
 * Clase Menu Baguette que despliega las diferentes opciones de ingredientes para preparar
 * un baguette; no hay limite por ingrediente
 */
public class WaySub {

    public WaySub() {
        Scanner read = new Scanner(System.in);
        Pan panSemillas = new PanSemillas();
        Pan panIntegral = new PanIntegral();
        Pan panBlanco = new PanBlanco();
        Pan panNuez = new PanNuez();
        System.out.println("****Seleccione el Tipo Pan****\n" +
                "1.Pan Blanco\n" +
                "2.Pan Integral\n" +
                "3.Pan Nuez\n" +
                "4.Pan de Semillas\n");
        int tipopan = read.nextInt();

        switch (tipopan) {
            case 1:
                ing(panBlanco);
                break;
            case 2:
                ing(panIntegral);
                break;
            case 3:
                ing(panNuez);
                break;
            case 4:
                ing(panSemillas);
                break;
            default:
                System.out.println("Opcion no Disponible");
                new WaySub();
                break;
        }
    }

    public void ing(Pan tipodePan) {
        Scanner read = new Scanner(System.in);
        System.out.println("****Ingredientes****\n" +
                "1.Pollo -$30\n" +
                "2.Pepperoni -$20\n" +
                "3.Jamon -$15\n" +
                "4.Lechuga -$15\n" +
                "5.Jitomate -$15\n" +
                "6.Cebolla -$15\n" +
                "7.Mostaza -$10\n" +
                "8.Catsup -$10\n" +
                "9.Mayonesa -$10\n" +
                "10.Terminar pedido\n");
        int option;
        option = read.nextInt();


        switch (option) {
            case 1:
                tipodePan = new Pollo(tipodePan);
                ing(tipodePan);
                break;
            case 2:
                tipodePan = new Pepperoni(tipodePan);
                ing(tipodePan);
                break;
            case 3:
                tipodePan = new Jamon(tipodePan);
                ing(tipodePan);
                break;
            case 4:
                tipodePan = new Lechuga(tipodePan);
                ing(tipodePan);
                break;
            case 5:
                tipodePan = new Jitomate(tipodePan);
                ing(tipodePan);
                break;
            case 6:
                tipodePan = new Cebolla(tipodePan);
                ing(tipodePan);
                break;
            case 7:
                tipodePan = new Mostaza(tipodePan);
                ing(tipodePan);
                break;
            case 8:
                tipodePan = new Catsup(tipodePan);
                ing(tipodePan);
                break;
            case 9:
                tipodePan = new Mayonesa(tipodePan);
                ing(tipodePan);
                break;
            case 10:
                System.out.println(tipodePan.getTicket());
                System.out.println("Pedido terminado");
                break;
            default:
                System.out.println("Opcion no valida");
                ing(tipodePan);
                break;
        }
    }
}
