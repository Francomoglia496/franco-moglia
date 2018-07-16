package Exercise2;

import java.io.PipedOutputStream;
import java.util.ArrayList;

public class Blog {

    private ArrayList<Posteo> posts = new ArrayList();
    private ArrayList<Posteo> recentFiles = new ArrayList<Posteo>();


    public Blog(){

    }

    public ArrayList getPosts() {
        return posts;
    }


    public String makePOST(Posteo post){

        if (idExist(post)){
            return "fail";
        }else {

            if (post.getUser().getUserName() == null || post.getMsg() == null) {
                return "fail";
            } else {
                posts.add(post);
                addRecentFile(post);
                return "success";
            }
        }

    }

    public String deletePOST(int index){

        Posteo post = posts.get(index);

        if (post == null){
            return "fail";
        }else {
            posts.remove(index);
            return "success";
        }

    }


    public Boolean idExist(Posteo post){

        for (Posteo aux : posts){
            if (aux.getIdPost() == post.getIdPost()){
                return true;
            }else return false;
        }
        return false;
    }

    public void Top10RecentFiles(){

        for (Posteo post : recentFiles){

            System.out.println(post);

        }

    }


    public String addRecentFile(Posteo post){

        if (recentFiles.size() == 10){

            if (recentFiles.contains(post)){

                ArrayList<Posteo> aux = new ArrayList();
                recentFiles.remove(post);
                aux.add(post);

                for(Posteo item : recentFiles){
                    aux.add(item);
                }

                recentFiles.clear();
                recentFiles.addAll(aux);

                return "success";
            }else{
                recentFiles.remove(0);
                recentFiles.add(post);
                return "success";
            }
        }else{

            if (recentFiles.contains(post)){

                ArrayList<Posteo> aux = new ArrayList();
                recentFiles.remove(post);
                aux.add(post);

                for(Posteo item : recentFiles){
                    aux.add(item);
                }

                recentFiles.clear();
                recentFiles.addAll(aux);

                return "success";
            }else{
                recentFiles.add(post);
                return "success";
            }

        }
    }

    @Override
    public String toString() {
        return "Blog{" +
                "posts=" + posts +
                ", recentFiles=" + recentFiles +
                '}';
    }
}
