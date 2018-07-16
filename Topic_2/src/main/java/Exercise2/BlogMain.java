package Exercise2;

public class BlogMain {

    public static void main(String[] args) {

        Blog blog = new Blog();

        User user = new User("Franco123");

        Posteo post = new Posteo(0, user, "1st post", "Hello World!");
        Posteo post1 = new Posteo(1, user, "2nd post", "2nd msg");
        Posteo post2 = new Posteo(2, user, "3rd post", "3rd msg");
        Posteo post3 = new Posteo(3, user, "4th post", "4th msg");
        Posteo post4 = new Posteo(4, user, "5th post", "5th msg");
        Posteo post5 = new Posteo(5, user, "6th post", "6th msg");
        Posteo post6 = new Posteo(6, user, "7th post", "7th msg");
        Posteo post7 = new Posteo(7, user, "8th post", "8th msg");
        Posteo post8 = new Posteo(8, user, "9th post", "9th msg");
        Posteo post9 = new Posteo(9, user, "10th post", "10th msg");

        blog.makePOST(post);
        blog.makePOST(post1);
        blog.makePOST(post7);
        blog.makePOST(post3);
        blog.makePOST(post4);
        blog.makePOST(post5);
        blog.makePOST(post6);
        blog.makePOST(post2);
        blog.makePOST(post8);
        blog.makePOST(post9);

        blog.makePOST(post9);

        blog.Top10RecentFiles();


    }

}
