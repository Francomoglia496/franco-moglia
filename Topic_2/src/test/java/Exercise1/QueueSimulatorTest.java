package Exercise1;

import Exercise1.QueueSimulator;
import org.junit.Before;
import org.junit.Test;

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
    public void whenTryToAddDuplicateItemThenThatFileGoFirstPosition() throws Exception{

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

        String duplicate = "8";

        String answer1 = list.addFile(duplicate);

        for (int i = 0; i < list.getRecentFilesList().size(); i++) {
            System.out.println(list.getRecentFilesList().get(i));
        }

        assertEquals("8", list.getRecentFilesList().get(0));

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