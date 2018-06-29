package Ejercicio1;

public class DBUnica {

    public static int control = 0;

    public static DBUnica singletonDB;
    public static String DBName;


    private DBUnica(String name) {
        DBName = name;
    }

    public void conectarDB(){
        System.out.println("Conectando a DB...");
    }

    public static DBUnica getInstance(String name){

        if (singletonDB == null){
            singletonDB = new DBUnica(name);
        }
        return singletonDB;
    }

    public String getDBName(){
        return DBName;
    }


}
