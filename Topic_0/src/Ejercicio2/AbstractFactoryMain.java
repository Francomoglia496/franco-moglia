package Ejercicio2;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        AbstractFactory driverFactory = FactoryProducer.getFactory("Driver");

        Driver dSQL = driverFactory.getDriver("SQL");

        dSQL.getDriverDB();
        System.out.println("--------------------------------------------");

        Driver dMySQL = driverFactory.getDriver("MySQL");

        dMySQL.getDriverDB();
        System.out.println("--------------------------------------------");

        Driver dMongo = driverFactory.getDriver("Mongo");

        dMongo.getDriverDB();
        System.out.println("--------------------------------------------");

        // ------------------------------------------------
        System.out.println("--------------------------------------------");

        AbstractFactory conectionFactory = FactoryProducer.getFactory("Conection");

        Conection conSQL = conectionFactory.getConection("SQL");

        conSQL.ConectarDB();
        System.out.println("--------------------------------------------");

        Conection conMySQL = conectionFactory.getConection("MySQL");

        conMySQL.ConectarDB();
        System.out.println("--------------------------------------------");

        Conection conMongo = conectionFactory.getConection("Mongo");

        conMongo.ConectarDB();
        System.out.println("--------------------------------------------");
    }
}
