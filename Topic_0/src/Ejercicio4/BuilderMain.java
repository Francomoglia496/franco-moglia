package Ejercicio4;

public class BuilderMain {

    public static void main(String[] args) {

        BuilderManager bm = new BuilderManager();

        ConectionDBBuilder conSQLBuilder = new SQLConBuilder();

        ConectionDBBuilder conMySQLBuilder = new MySQLConBuilder();

        bm.setConectionBuilder(conSQLBuilder);
        bm.MakeConection();

        ConectionDB conDB = bm.getConectionDB();

        System.out.println(conDB);

        System.out.println("-----------------------------");

        bm.setConectionBuilder(conMySQLBuilder);

        bm.MakeConection();

        System.out.println(bm.getConectionDB());

    }

}
