package Ejercicio1;

public class DBUnica {

    private static DBUnica singletonDB;
    public static String dbName;


    private DBUnica(String name) {
        dbName = name;
    }

    public void conectarDB(){
        System.out.println("Conectando a DB...");
    }

    public static synchronized DBUnica getInstance(String name){

        if (singletonDB == null){
            singletonDB = new DBUnica(name);
        }
        return singletonDB;
    }

    public String getDBName(){
        return dbName;
    }


}
