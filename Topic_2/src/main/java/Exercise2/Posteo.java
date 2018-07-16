package Exercise2;

public class Posteo {

    private int idPost;
    private User user;
    private String title;
    private String msg;

    public Posteo(int idPost,User user, String title, String msg) {

        this.idPost  = idPost;
        this.user = user;
        this.title = title;
        this.msg = msg;

    }

    public User getUser() {
        return user;
    }

    public String getTitle() {
        return title;
    }

    public String getMsg() {
        return msg;
    }
}
