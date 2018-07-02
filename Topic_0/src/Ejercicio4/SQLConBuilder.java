package Ejercicio4;

public class SQLConBuilder extends ConectionDBBuilder {

    public SQLConBuilder(){
        super.con = new ConectionDB();
    }

    @Override
    public void buildUser() {
        con.setUser("user");
    }

    @Override
    public void buildPass() {

        con.setPass("pass123");

    }

    @Override
    public void buildUrl() {

        con.setUrl("localhost:8080/SQL/");

    }
}
