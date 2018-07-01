package Ejercicio2;

public abstract class AbstractFactory {

    abstract Driver getDriver(String dataBase);
    abstract Conection getConection(String dataBase);

}
