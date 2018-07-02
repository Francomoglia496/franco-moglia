package Ejercicio4;

public abstract class ConectionDBBuilder {

    protected ConectionDB con;

    public ConectionDB getCon(){
        return con;
    }

    public abstract void buildUser();

    public abstract void buildPass();

    public abstract void buildUrl();

}
