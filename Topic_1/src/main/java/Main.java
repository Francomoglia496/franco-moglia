public class Main {

    public static void main(String[] args) {

        CrearConexion cc = new CrearConexion("user1","pass","localhost/");

        cc.connectDB();

        System.out.println("Conectado: " + cc.getConected());
    }
}
