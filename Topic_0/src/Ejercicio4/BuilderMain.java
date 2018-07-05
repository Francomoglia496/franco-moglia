package Ejercicio4;

public class BuilderMain {

    public static void main(String[] args) {

        ConectionDBBuilder builder = new ConectionDBBuilder();

        builder.withUser("user");
        builder.withPass("pass123");
        builder.withUrl("localhost:8080/MySQL/");

        ConectionDB con = builder.makeConection();

        System.out.println(con);
    }

}
