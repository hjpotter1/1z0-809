package test;

public class Test066 {
    public static void main(String[] args) {
        Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100);
        Foo<String, String> pair = Foo.twice ("Hello World!");
        //Foo<?, ?> percentage = new Foo<?, ?>(97, 32);//new Foo<?, ?>(97, 32) error
        Foo<?, ?> percentage = new Foo<>(97, 32);// right
        Foo<?, ?> percentage2 = new Foo<Integer, Integer>(97, 32);//right
        Foo<String, String> grade = new Foo<>("John", "A");
        System.out.println(pair.getValue());
    }
}
class Foo<K, V> {

    private K key;
    private V value;
    public Foo(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public static <T> Foo<T, T> twice(T value) {
        return new Foo<T, T>(value, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}