package Ejercicio2;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choise){

        if (choise.equalsIgnoreCase("Driver")){

            return new DriverFactory();

        }else if (choise.equalsIgnoreCase("Conection")){

            return new ConectionFactory();

        }

        return null;

    }
}