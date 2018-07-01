package Ejercicio2;

public class DriverFactory extends AbstractFactory {


    // EL METODO getDriver() SE ENCARGA DE RETORNAR EL DRIVER NECESARIO
    // SEGUN EL NOMBRE DE LA BASE DE DATOS A LA CUAL QUERAMOS ACCEDER.

    @Override
    public Driver getDriver(String dataBase) {

        if (dataBase == null){

            return null;

        }

        if (dataBase.equalsIgnoreCase("SQL")){

            return new DriverSQL();

        }else if (dataBase.equalsIgnoreCase("MySQL")){

            return new DriverMySQL();

        }else if (dataBase.equalsIgnoreCase("Mongo")){

            return new DriverMongo();

        }

        return null;



    }

    // ESTA FACTORY SOLO SE ENCARGA DE CREAR LOS DRIVERS
    // POR ESO EL METODO getConection() RETURNA NULL.
    @Override
    Conection getConection(String dataBase) {
        return null;
    }

}
