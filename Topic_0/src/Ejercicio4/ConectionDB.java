package Ejercicio4;

public class ConectionDB {

    private String user;
    private String pass;
    private String url;


    public void setUser(String user){
        this.user = user;
    }

    public void setPass(String pass){
        this.pass = pass;
    }

    public void setUrl(String url){
        this.url = url;
    }

    @Override
    public String toString() {
        return "ConectionDB{" +
                "user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", url='" + url + '\'' +
                '}';
    }


}
