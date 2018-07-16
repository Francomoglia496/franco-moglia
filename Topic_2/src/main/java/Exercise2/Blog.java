package Exercise2;

import java.util.ArrayList;

public class Blog {

    private ArrayList posts = new ArrayList();

    public Blog(){

    }

    public ArrayList getPosts() {
        return posts;
    }


    public String makePOST(Posteo post){

        if (post.getUser().getUserName() == null || post.getMsg() == null){
            return "fail";
        }else{
            posts.add(post);
            return "success";
        }

    }
}
