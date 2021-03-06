package thisisjava.genericTest;

public class UtilExample {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
        Integer childAge = Util.getValue(childPair, "홍삼순");
        System.out.println(childAge);

//        OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
//        int otherAge = Util.getValue(otherPair, "홍삼원");
//        System.out.println(otherAge);
    }

    private static class Util {
        public static <K, V> V getValue(Pair<K, V> pair, String K) {
            if (pair.getKey().equals(K)) {
                return pair.getValue();
            }

            return null;
        }
    }

    private static class OtherPair<K, V> {
        private K key;
        private V value;

        public OtherPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private static class ChildPair<K, V> extends Pair<K, V> {
        public ChildPair(K key, V value) {
            super(key, value);
        }
    }

    private static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

}
