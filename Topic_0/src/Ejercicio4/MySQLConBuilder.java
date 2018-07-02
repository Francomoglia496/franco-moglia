package Ejercicio4;

public class MySQLConBuilder extends ConectionDBBuilder {

    public MySQLConBuilder(){
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
        con.setUrl("localhost:8080/MySQL/");
    }
}
