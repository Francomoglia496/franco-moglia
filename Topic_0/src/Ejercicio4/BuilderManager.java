package Ejercicio4;

public class BuilderManager {

    private ConectionDBBuilder conectionBuilder;

    public void setConectionBuilder(ConectionDBBuilder conBuilder){
        conectionBuilder = conBuilder;
    }

    public ConectionDB getConectionDB(){
        return conectionBuilder.getCon();
    }

    public void MakeConection(){
        conectionBuilder.buildUser();
        conectionBuilder.buildPass();
        conectionBuilder.buildUrl();
    }


}
