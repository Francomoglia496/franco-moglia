package Exercise2;

import javafx.geometry.Pos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlogTest {

    private Blog blog;

    @Before
    public void setUp() throws Exception {

        blog = new Blog();

    }


    @Test
    public void WhenUserIsNullThenCantCreatePost() throws Exception{

        User user1 = new User(null);

        Posteo post = new Posteo(0,user1, "question1","how can i do the 2nd exercise?");

        assertEquals("fail", blog.makePOST(post));

    }

    @Test
    public void WhenMsgIsEmptyThenCantCreatePost() throws Exception{

        User user = new User("ElMasKPOdeTodos");

        Posteo post = new Posteo(0,user, "[Topic2] Ex 1", null);

        assertEquals("fail", blog.makePOST(post));

    }

    @Test
    public void EveryPostIsUnique() throws Exception{

        User user = new User("juan123");

        Posteo post1 = new Posteo(0, user, "title1", "............");
        Posteo post2 = new Posteo(0,user,"title1",".............");

        String asw = blog.makePOST(post1);

        String ans1 = blog.makePOST(post2);

        assertEquals("fail", ans1);

    }

    @Test
    public void DeletePost() throws Exception{

        User user = new User("juan123");

        blog.makePOST(new Posteo(0,user,"title1","qwerty2020"));

        String aux = blog.deletePOST(0);

        assertEquals("success", aux);


    }
}