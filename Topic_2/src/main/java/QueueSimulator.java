import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSimulator {

    private ArrayList<String> recentFilesList = new ArrayList<String>();

    public QueueSimulator() {

    }

    public ArrayList<String> getRecentFilesList() {
        return recentFilesList;
    }

    public String addFile(String file){
        if (recentFilesList.size() >= 15){

            if (recentFilesList.contains(file)){

                ArrayList<String> aux = new ArrayList();
                recentFilesList.remove(file);
                aux.add(file);

                for(String item : recentFilesList){
                    aux.add(item);
                }

                recentFilesList.clear();
                recentFilesList.addAll(aux);

                return "fail";
            }else{
                recentFilesList.remove(0);
                recentFilesList.add(file);
                return "success";
            }
        }else{

            if (recentFilesList.contains(file)){
                return "fail";
            }else{
                recentFilesList.add(file);
                return "success";
            }

        }
    }

}
