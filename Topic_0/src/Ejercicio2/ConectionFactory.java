package Ejercicio2;

public class ConectionFactory extends AbstractFactory {

    //  ESTA FACTORY COMO SU NOMBRE INDICA SE ENCARGA DE CREAR LAS CONEXIONES
    //  A CADA BASE DE DATOS, POR LO CUAL SI SE LE PIDE UN DRIVER CON EL METODO
    //  getDriver() SOLO SE OBTENDRA UN NULL

    @Override
    Driver getDriver(String dataBase) {
        return null;
    }

    //  LA FUNCION DE ESTA FACTORY ES CREAR LA CONEXION A CADA BASE DE DATOS
    //  CREARA LA CONEXION NECESARIA SEGUN EL NOMBRE DE LA BASE DE DATOS QUE
    //  SE NECESITE.

    @Override
    Conection getConection(String dataBase) {

        if (dataBase == null){
            return null;
        }

        if (dataBase.equalsIgnoreCase("SQL")){

            return new SQLDB("userSQL", "password123", "localhost:8080/");

        }else if (dataBase.equalsIgnoreCase("MySQL")){

            return new MySQLDB("userMySQL","password123","localhost:8080/");

        }else if (dataBase.equalsIgnoreCase("Mongo")){

            return new MongoDB("userMongo","password123","localhost:8080/");

        }

        return null;
    }
}
