import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void insertAfterOneNodeOfSingleLinkedListTest(){
        List<Object> list = new ArrayList<Object>();
        list.add(0);
        list.add(1);
        list.add(3);
        SingleLinkedList linkedList = new SingleLinkedList(list);
        linkedList.insertAfter(1, 2);
        assertTrue(linkedList.size() == 4);
    }

    @Test
    public void deleteOneNodeOfSingleLinkedListTest(){
        List<Object> list = new ArrayList<Object>();
        list.add(0);
        list.add(1);
        list.add(2);
        SingleLinkedList linkedList = new SingleLinkedList(list);
        linkedList.delete(1);
        assertTrue(linkedList.size() == 2);
    }

    @Test
    public void getFirstNodeOfSingleLinkedListTest(){
        List<Object> list = new ArrayList<Object>();
        list.add(0);
        list.add(1);
        list.add(2);
        SingleLinkedList linkedList = new SingleLinkedList(list);
        assertTrue(Integer.parseInt(linkedList.first().toString()) == 0);
    }
}
