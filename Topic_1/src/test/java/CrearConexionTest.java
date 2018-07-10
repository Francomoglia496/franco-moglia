import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.DefaultConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CrearConexionTest{

    @Test
    public void getConected() throws Exception {


        Configurator.initialize(new DefaultConfiguration());
        Logger log = LogManager.getLogger();


        CrearConexion cc = new CrearConexion("user1","pass123","localhost:8080/");

        cc.connectDB();

        assertTrue(cc.getConected());
        log.fatal("Conection Established after method connectDB was runned");

        cc.disconnectDB();
        assertFalse(cc.getConected());
        log.error("Conection Losed after method disconnectDB was runned");
    }

}