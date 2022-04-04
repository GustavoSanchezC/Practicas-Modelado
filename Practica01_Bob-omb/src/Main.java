

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // AQUI CREAMOS A LOS SERVICIOS
        List<Servicio> todos = new ArrayList<Servicio>();

        Servicio momazonP = new MomazonPVPremium();
        Servicio momazon = new MomazonPV();
        Servicio spootifyP = new SpotifyPremium();
        Servicio spootify = new SpotifyFree();
        Servicio memeflix = new Memeflix();
        Servicio memeflix2 = new MemeflixDispositivos(2);
        Servicio memeflix4 = new MemeflixDispositivos(4);


        todos.add(memeflix);
        todos.add(momazon);
        todos.add(spootify);
        todos.add(spootifyP);
        todos.add(momazonP);
        todos.add(memeflix2);
        todos.add(memeflix4);
        // AQUI CREAMOS A CADA CLIENTE SIN QUE TODAVIA TENGA INTERESES EN LOS SERVICIOS, SON PERSONAS COMUNES


        System.out.println("**********************************");
        System.out.println("***************Mes 1**************");
        System.out.println("**********************************");
        System.out.print("\nAlicia");
        int contadorAli = 1;
        List<Servicio> aliciaServicios = new ArrayList<Servicio>();

        Servicio thisneyAli = new ThisneyPlus(contadorAli);
        Servicio hvoAli = new HVOMax(contadorAli);

        todos.add(thisneyAli);
        todos.add(hvoAli);
        aliciaServicios.add(memeflix4);
        aliciaServicios.add(momazonP);
        aliciaServicios.add(spootifyP);
        aliciaServicios.add(thisneyAli);
        aliciaServicios.add(hvoAli);

        Cliente alicia = new Cliente("Alicia", 15000, contadorAli, aliciaServicios);
        Contrato contratosAlicia = new Contrato(alicia, aliciaServicios);


        System.out.println("\nBob");
        int contadorBob = 1;
        List<Servicio> bobServicios = new ArrayList<Servicio>();

        Servicio thisneyBob = new ThisneyPlus(contadorBob);
        Servicio hvoBob = new HVOMax(contadorBob);

        todos.add(thisneyBob);
        todos.add(hvoBob);
        bobServicios.add(memeflix4);
        bobServicios.add(momazonP);
        bobServicios.add(spootifyP);
        bobServicios.add(thisneyBob);
        bobServicios.add(hvoBob);
        Cliente bob = new Cliente("Bob", 2400, contadorBob, bobServicios);
        Contrato contratosBob = new Contrato(bob, bobServicios);


        System.out.println("\nCesar");
        int contadorCesar = 1;
        List<Servicio> cesarServicios = new ArrayList<Servicio>();

        Servicio thisneyCesar = new ThisneyPlus(contadorCesar);
        Servicio hvoCesar = new HVOMax(contadorCesar);

        todos.add(thisneyCesar);
        todos.add(hvoCesar);
        cesarServicios.add(thisneyCesar);
        cesarServicios.add(hvoCesar);
        Cliente cesar = new Cliente("Cesar", 5000, contadorCesar, cesarServicios);
        Contrato contratosCesar = new Contrato(cesar, cesarServicios);


        System.out.println("\nDiego");
        int contadorDiego = 1;
        List<Servicio> diegoServicios = new ArrayList<Servicio>();

        Servicio hvoDiego = new HVOMax(contadorDiego);

        todos.add(hvoDiego);
        diegoServicios.add(momazonP);
        diegoServicios.add(spootifyP);
        diegoServicios.add(hvoDiego);
        Cliente diego = new Cliente("Diego", 9000, contadorDiego, diegoServicios);
        Contrato contratosDiego = new Contrato(diego, diegoServicios);


        System.out.println("\nErika");
        int contadorErika = 1;
        List<Servicio> erikaServicios = new ArrayList<Servicio>();

        Servicio hvoErika = new HVOMax(contadorErika);

        todos.add(hvoErika);
        erikaServicios.add(memeflix4);
        erikaServicios.add(spootify);
        erikaServicios.add(hvoErika);
        Cliente erika = new Cliente("Erika", 10000, contadorErika, erikaServicios);
        Contrato contratosErika = new Contrato(erika, erikaServicios);


        System.out.println("\nFausto");
        int contadorFausto = 1;
        List<Servicio> faustoServicios = new ArrayList<Servicio>();

        Servicio thisneyFausto = new ThisneyPlus(contadorFausto);
        Servicio hvoFausto = new HVOMax(contadorFausto);

        todos.add(thisneyFausto);
        todos.add(hvoFausto);
        faustoServicios.add(thisneyFausto);
        faustoServicios.add(hvoFausto);
        Cliente fausto = new Cliente("Fausto", 5000, contadorFausto, faustoServicios);
        Contrato contratosFausto = new Contrato(fausto, faustoServicios);


        System.out.println("\n");

        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }

        System.out.println("**********************************");
        System.out.println("***************Mes 2**************");
        System.out.println("**********************************");
        contadorAli++;
        contadorBob++;
        contadorCesar++;
        contadorDiego++;
        contadorErika++;
        contadorFausto++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }

        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 3**************");
        System.out.println("**********************************");

        contratosBob.cancela(thisneyBob);
        todos.remove(thisneyBob);
        contratosBob.cancela(hvoBob);
        todos.remove(hvoBob);

        contratosErika.cancela(hvoErika);
        todos.remove(hvoErika);
        int contadorThisErika = 1;
        ThisneyPlus thisneyErika = new ThisneyPlus(contadorThisErika);
        contratosErika.nuevo(thisneyErika);
        todos.add(thisneyErika);

        contratosFausto.cancela(thisneyFausto);
        todos.remove(thisneyFausto);
        contratosFausto.cancela(hvoFausto);
        todos.remove(hvoFausto);
        contratosFausto.nuevo(memeflix);

        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }


        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 4**************");
        System.out.println("**********************************");
        contratosBob.cancela(memeflix4);
        contratosBob.cancela(momazon);

        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        contadorThisErika++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }


        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 5**************");
        System.out.println("**********************************");
        contratosFausto.nuevo(thisneyFausto);
        todos.add(thisneyFausto);
        contratosFausto.nuevo(hvoFausto);
        todos.add(hvoFausto);
        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        contadorThisErika++;
        contadorFausto++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }
        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 6**************");
        System.out.println("**********************************");

        contratosFausto.cancela(hvoFausto);
        contratosFausto.cancela(thisneyFausto);
        todos.remove(hvoFausto);
        todos.remove(hvoFausto);

        contratosErika.cancela(memeflix4);
        contratosErika.cancela(spootify);
        contratosErika.cancela(thisneyErika);
        todos.remove(thisneyErika);

        int contadorThisDiego = 1;
        ThisneyPlus thisneyDiego = new ThisneyPlus(contadorThisDiego);
        contratosDiego.nuevo(thisneyDiego);
        todos.add(thisneyDiego);

        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }


        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 7**************");
        System.out.println("**********************************");
        contratosCesar.nuevo(spootifyP);
        contratosDiego.nuevo(memeflix);
        contratosDiego.cancela(spootify);
        contratosDiego.nuevo(spootifyP);
        contratosDiego.cancela(momazonP);
        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        contadorThisDiego++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }


        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 8**************");
        System.out.println("**********************************");
        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        contadorThisDiego++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }


        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 9**************");
        System.out.println("**********************************");
        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        contadorThisDiego++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }


        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 10**************");
        System.out.println("**********************************");
        contratosErika.nuevo(momazonP);
        contratosErika.nuevo(hvoErika);
        todos.add(hvoErika);
        contratosErika.nuevo(thisneyErika);
        todos.add(thisneyErika);

        contadorErika++;
        contadorThisErika++;
        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        contadorThisDiego++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }

        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 11**************");
        System.out.println("**********************************");
        contadorErika++;
        contadorThisErika++;
        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        contadorThisDiego++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }



        System.out.println("\n");
        System.out.println("**********************************");
        System.out.println("***************Mes 12**************");
        System.out.println("**********************************");
        contadorErika++;
        contadorThisErika++;
        contadorAli++;
        contadorCesar++;
        contadorDiego++;
        contadorThisDiego++;
        for (Servicio s : todos) {
            s.cobro();
            System.out.println("\n");
            s.notificar();
        }

    }
}