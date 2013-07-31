import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/31/13
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class SingleLinkedListTest {

    @Test
    public void getSizeOfSingleLinkedListTest(){
        SingleLinkedList linkedList = new SingleLinkedList();
        assertTrue(linkedList.size() == 0);
    }
}
