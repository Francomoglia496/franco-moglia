package Ejercicio2;

public class ConectionFactory extends AbstractFactory {

    @Override
    Driver getDriver(String dataBase) {
        return null;
    }

    @Override
    Conection getConection(String dataBase) {

        if (dataBase == null){
            return null;
        }

        if ("SQL".equalsIgnoreCase(dataBase)){

            return new SQLDB("userSQL", "password123", "localhost:8080/");

        }else if (dataBase.equalsIgnoreCase("MySQL")){

            return new MySQLDB("userMySQL","password123","localhost:8080/");

        }else if (dataBase.equalsIgnoreCase("Mongo")){

            return new MongoDB("userMongo","password123","localhost:8080/");

        }

        return null;
    }
}
