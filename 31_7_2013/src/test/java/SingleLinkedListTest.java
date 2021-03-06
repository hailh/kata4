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

    @Test
    public void getLastNodeOfSingleLinkedListTest(){
        List<Object> list = new ArrayList<Object>();
        list.add(0);
        list.add(1);
        list.add(2);
        SingleLinkedList linkedList = new SingleLinkedList(list);
        assertTrue(Integer.parseInt(linkedList.last().toString()) == 2);
    }

    @Test
    public void getBeforeNodeOfSingleLinkedListTest(){
        List<Object> list = new ArrayList<Object>();
        list.add(0);
        list.add(1);
        list.add(2);
        SingleLinkedList linkedList = new SingleLinkedList(list);
        assertTrue(Integer.parseInt(linkedList.before(1).toString()) == 0);
    }

    @Test
    public void getAfterNodeOfSingleLinkedListTest(){
        List<Object> list = new ArrayList<Object>();
        list.add(0);
        list.add(1);
        list.add(2);
        SingleLinkedList linkedList = new SingleLinkedList(list);
        assertTrue(Integer.parseInt(linkedList.after(1).toString()) == 2);
    }

    @Test
    public void findNodeOfSingleLinkedListTest(){
        List<Object> list = new ArrayList<Object>();
        list.add(0);
        list.add(1);
        list.add(2);
        SingleLinkedList linkedList = new SingleLinkedList(list);
        assertTrue(Integer.parseInt(linkedList.find(1).toString()) == 1);
    }

    @Test
    public void appendNodeOfSingleLinkedListTest(){
        List<Object> list = new ArrayList<Object>();
        list.add(0);
        list.add(1);
        list.add(2);
        SingleLinkedList linkedList = new SingleLinkedList(list);
        linkedList.append(3);
        assertTrue(Integer.parseInt(linkedList.last().toString()) == 3);
    }

    @Test
    public void insertFirstNodeOfSingleLinkedListTest(){
        List<Object> list = new ArrayList<Object>();
        list.add(0);
        list.add(1);
        list.add(2);
        SingleLinkedList linkedList = new SingleLinkedList(list);
        linkedList.insertFirst(-1);
        assertTrue(Integer.parseInt(linkedList.first().toString()) == -1);
    }
}
