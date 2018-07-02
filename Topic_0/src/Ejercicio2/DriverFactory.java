package Ejercicio2;

public class DriverFactory extends AbstractFactory {

    @Override
    public Driver getDriver(String dataBase) {

        if (dataBase == null){

            return null;

        }

        if ("SQL".equalsIgnoreCase(dataBase)){

            return new DriverSQL();

        }else if ("MySQL".equalsIgnoreCase(dataBase)){

            return new DriverMySQL();

        }else if ("Mongo".equalsIgnoreCase(dataBase)){

            return new DriverMongo();

        }

        return null;



    }

    @Override
    Conection getConection(String dataBase) {
        return null;
    }

}
