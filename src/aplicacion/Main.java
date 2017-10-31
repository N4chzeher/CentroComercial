package aplicacion;

import entidades.*;

import java.security.acl.LastOwnerException;

/**
 * Created by NACHZEHER on 24/10/2017.
 */
public class Main {

    public static void main(String[] args) {

        CentroComercial cc = new CentroComercial("Maquinista");

        Local loc = new RopaMasc("Springfild", "10 AM - 9PM", 20, 1200f);
        Local local = new RopaFem("NAF NAF", "9 am - 7 pm", 5, 900f);
        Local rm = new RopaMixta("PULL&BEAR", "9 AM - 8 PM", 6, 1200F);



        cc.addLocal(loc);
        cc.addLocal(rm);
        cc.addLocal(local);

        float tot = loc.totalImpuestos();



        System.out.println(cc.toString());
    }
}
