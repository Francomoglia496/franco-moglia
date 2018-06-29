package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        DBUnica db = DBUnica.getInstance("instancia1");

        db.conectarDB();
        System.out.println(db.getDBName());


        db = DBUnica.getInstance("asdasd");
        System.out.println(db.getDBName());
    }

}
