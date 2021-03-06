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
        List<Object> temp = new ArrayList<Object>();
        for(int i = 0; i < size(); i++){
            temp.add(list.get(i));
            if(i == node) temp.add(object);
        }
        list = temp;
    }

    public void delete(int node) {
        List<Object> temp = new ArrayList<Object>();
        for(int i = 0; i < size(); i++){
            if(i == node) continue;
            temp.add(list.get(i));
        }
        list = temp;
    }

    public Object first() {
        if(!list.isEmpty()) return list.get(0);
        return null;
    }

    public Object last() {
        if(!list.isEmpty()) return list.get(size() - 1);
        return null;
    }

    public Object before(int node) {
        if(list.isEmpty()) return null;
        if(node - 1 >= 0) return list.get(node - 1);
        return null;
    }

    public Object after(int node) {
        if(list.isEmpty()) return null;
        if(node + 1 <= size()) return list.get(node + 1);
        return null;
    }

    public Object find(Object object) {
        for(Object obj : list){
            if(obj.equals(object)) return obj;
        }
        return null;
    }

    public void append(Object object) {
        list.add(object);
    }

    public void insertFirst(Object object) {
        List<Object> temp = new ArrayList<Object>();
        temp.add(object);
        for(int i = 0; i < size(); i++){
            temp.add(list.get(i));
        }
        list = temp;
    }
}
