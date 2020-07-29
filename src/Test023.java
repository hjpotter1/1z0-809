public class Test023 {
}

interface Doable {

    public void doSomething(String s);
}

abstract class Task implements Doable {

    public void doSomethingElse(String s) {
    }
}

class Do implements Doable {

    public void doSomething(Integer i) {
    }

    public void doSomething(String s) {
    }

    public void doThat(String s) {
    }
}

