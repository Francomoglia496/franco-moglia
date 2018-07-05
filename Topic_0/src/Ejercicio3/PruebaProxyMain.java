package Ejercicio3;

import Ejercicio2.Conection;

public class PruebaProxyMain {

    public static void main(String[] args) {

        ConectarDB dbMySQL = (ConectarDB) ConectionProxy.newInstance(new MySQLDB());

        dbMySQL.conectarDB();

    }

}
