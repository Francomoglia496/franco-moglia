import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class QueueSimulatorTest {

    QueueSimulator list;

    @Before
    public void setUp() throws Exception {

        list = new QueueSimulator();

    }

    @Test
    public void addFileTest() throws Exception{

        String example = "first";
        String answer = list.addFile(example);
        assertEquals("success", answer);
    }

    @Test
    public void whenTryToAddDuplicateItemThenFail() throws Exception{

        String example = "first";
        String duplicate = "first";

        String answer1 = list.addFile(example);

        String answer = list.addFile(duplicate);

        assertEquals("fail", answer);

    }


    @Test
    public void whenAddNewFileToFullListThenRemoveLast() throws Exception {

        list.addFile("15");
        list.addFile("14");
        list.addFile("13");
        list.addFile("12");
        list.addFile("11");
        list.addFile("10");
        list.addFile("9");
        list.addFile("8");
        list.addFile("7");
        list.addFile("6");
        list.addFile("5");
        list.addFile("4");
        list.addFile("3");
        list.addFile("2");
        list.addFile("1");

        String aux = list.getRecentFilesList().get(1);

        list.addFile("nuevo");

        assertEquals("nuevo", list.getRecentFilesList().get(14));

        assertEquals(aux, list.getRecentFilesList().get(0));



    }

}