package Ejercicio2;

public class MySQLDB implements Conection {

    private String user;
    private String pass;
    private String url;

    public MySQLDB(String user, String pass, String url) {
        this.user = user;
        this.pass = pass;
        this.url = url;
    }

    @Override
    public void ConectarDB() {

        System.out.println("Conectando a MySQL DB...");
        System.out.println("user: " + user + ", pass: " + pass + ", url: " + url);

    }

}
