package aplicacion;

import entidades.*;

/**
 * Created by NACHZEHER on 24/10/2017.
 */
public class Main {

    public static void main(String[] args) {

        CentroComercial cc = new CentroComercial("Maquinista");

        Local bar =new Bar("CAÑITAS", "9 AM - 1 AM", 3,625F);
        Local ropMix = new RopaMixta("PULL&BEAR", "9 AM - 8 PM", 6, 1200F);
        Local lib = new Libreria("Casa del libro", "9 AM - 8 PM", 10, 1500F);
        Local rest = new Restaurante("La quinta", "11 AM - 10 PM", 8, 1350f);
        Local rest2 = new Restaurante("La nona", "11 AM - 10 PM", 10, 1100f);

        Local dep = new TiendaDeportes("Deportes Rojas", "9 AM - 8 PM", 20, 3000F );

        cc.addLocal(bar);
        cc.addLocal(ropMix);
        cc.addLocal(lib);
        cc.addLocal(rest);
        cc.addLocal(rest2);
        cc.addLocal(dep);

        System.out.println(cc.toString());
    }
}
