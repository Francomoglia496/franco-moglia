public class CrearConexion {

    private String user;
    private String pass;
    private String url;
    private Boolean conected = false;

    public CrearConexion(String user, String pass, String url) {
        this.user = user;
        this.pass = pass;
        this.url = url;
    }

    public void ConnectDB(){
        this.conected = true;
    }

    public void DisconnectDB(){
        this.conected = false;
    }

    public Boolean getConected(){
        return conected;
    }
}
