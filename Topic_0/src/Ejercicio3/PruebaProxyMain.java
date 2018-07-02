package Ejercicio3;

import Ejercicio2.Conection;

public class PruebaProxyMain {

    public static void main(String[] args) {

        IConectarDB dbMySQL = (IConectarDB) ConectionProxy.newInstance(new MySQLDB());

        dbMySQL.conectarDB();

    }

}
