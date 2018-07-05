package Ejercicio4;

public class ConectionDBBuilder {

    private String user;
    private String pass;
    private String url;

    public void withUser(String user){

        this.user = user;

    }

    public void withPass(String pass){

        this.pass = pass;

    }

    public void withUrl(String url){

        this.url = url;

    }

    public ConectionDB makeConection(){

        ConectionDB conection = new ConectionDB();

        conection.setUser(this.user);
        conection.setPass(this.pass);
        conection.setUrl(this.url);

        return conection;

    }


}
