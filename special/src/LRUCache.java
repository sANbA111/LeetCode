import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author sANbA111
 * @create 2021/10/14 20:28
 */
public class LRUCache {

    List<Node> cache = new CopyOnWriteArrayList<>();

    public LRUCache() {
    }

    class Node<K,V> {
        K key;
        V value;
        long score;


        public Node(K key, V value, long score) {
            this.key = key;
            this.value = value;
            this.score = score;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }



    }
    private void decrScore() {
        for (Node node : cache) {
            node.score--;
        }
    }
    public Object get(Object key){
        for (Node node : cache) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
        }
        return null;
    }


    private void delete(){
        for (Node node : cache) {
            if (node.score == 1){
                cache.remove(node);
            }
        }
    }

    public  void put(Object key,Object value){
        if (cache.size() == 10){
            delete();
            decrScore();
            Node node = new Node<>(key, value, cache.size() + 1);
            cache.add(node);
        } else {
            Node node = new Node<>(key, value, cache.size() + 1);
            cache.add(node);
        }
    }



}
