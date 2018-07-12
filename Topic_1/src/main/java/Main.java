
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.DefaultConfiguration;

public class Main {

    public static void main(String[] args) {

        CrearConexion cc = new CrearConexion("user1","pass","localhost/");

        cc.connectDB();


        System.out.println("Conectado: " + cc.getConected());



    }
}
