package Ejercicio2;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if ("driver".equalsIgnoreCase(choice)){

            return new DriverFactory();

        }else if ("Conection".equalsIgnoreCase(choice)){

            return new ConectionFactory();

        }

        return null;

    }
}