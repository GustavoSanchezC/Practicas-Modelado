

import java.util.Scanner;

public class Main {
    /**
     * metodo con el cual atendemos de forma automatica  y usamos recursividad para volver atender sin salir
     *
     * @param baymax robot trabajador que recibe las ordenes
     */
    public static void atiende(Robot baymax) {
        Scanner sc = new Scanner(System.in);
        baymax.asignarNuevoEstado(baymax.getModoCaminando());
        baymax.atender();
        baymax.cocinar();
        baymax.suspenderse();

        System.out.println("\nQue accion desea realizar ");
        System.out.println("1. Volver al menu principal\n" +
                "2. Volver a atender \n" +
                "3. Acceder a la consola \n" +
                "4. Salir  \n ");
        int accion2 = sc.nextInt();
        switch (accion2) {
            case 1:
                main(null);
                break;
            case 2:
                atiende(baymax);
                break;
            case 3:
                Consola(baymax);
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("Seleccione una opcion correcta");
                Consola(baymax);
                break;
        }
    }

    /**
     * Consola para el uso manual del robot , se deben de ordenar cada opcion para contuniar
     *
     * @param robot robot contralado manualmente por consola
     */
    public static void Consola(Robot robot) {
        try {
            Scanner sc = new Scanner(System.in);
            int opcion;
            System.out.println("+++ BIENVENIDO A LA CONSOLA DE BAYMAX +++\nSELECCIONE UNA DE LAS SIGUIENTES OPCIONES:\n El Robot esta en estado " + robot.getEstadoActual().toString());

            System.out.println("¿Que deseas hacer?\n" +
                    "1. Caminar\n" +
                    "2. Atender\n" +
                    "3. Cocinar\n" +
                    "4. Suspenderse\n" +
                    "5. Salir de la Consola\n" +
                    "6. Salir\n");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    robot.caminar();
                    Consola(robot);
                    break;
                case 2:
                    robot.atender();
                    Consola(robot);
                    break;
                case 3:
                    robot.cocinar();
                    Consola(robot);
                    break;
                case 4:
                    robot.suspenderse();
                    Consola(robot);
                    break;
                case 5:
                    main(null);
                    break;
                case 6:
                    System.out.println("\nNOS VEMOS, CUIDATE :D");
                    System.exit(1);
                    break;
                default:
                    System.out.println("\nElige la opcion correcta que deseas ejecutar");
                    break;
            }
        } catch (Exception e) {
            System.out.println("SELECCIONE UNA OPCION VALIDA");
            Consola(robot);
        }
    }

    /**
     * main para el programa en donde estan 3 opciones siendo estas la de funcionamiento auntomatico y control por consola
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            Robot baymax = new Robot();
            Scanner sc = new Scanner(System.in);

            System.out.println(" BIENVENIDO A El restaurante McBurguesas +++\nSELECCIONE UNA DE LAS SIGUIENTES OPCIONES:\n");
            System.out.println("1. Ordenar\n" +
                    "2. Acceder a la consola \n" +
                    "3. Salir");
            int accion = sc.nextInt();

            switch (accion) {
                case 1:
                    atiende(baymax);
                    break;
                case 2:
                    Consola(baymax);
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("\nElige la opcion correcta que deseas ejecutar");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Operacion no soportada.");
            main(args);
        }
    }
}