import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/31/13
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class SingleLinkedList {
    private List<Object> list;
    public SingleLinkedList(){
        list = new ArrayList<Object>();
    }

    public SingleLinkedList(List<Object> list){
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public void insertAfter(int node, int object) {

    }
}
