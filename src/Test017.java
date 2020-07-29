public class Test017 {
    public static void main(String[] args) {
        Baz d = new Daze();
        d.b("hello");
    }
}


class Foo{
    public  void b(String s){
        System.out.println("F"+s);
    }
}

class Bar extends Foo{
    public  void b(String s){
        System.out.println("Bar"+s);
    }
}
class Baz extends Bar{
    public  void b(String s){
        System.out.println("baz"+s);
    }
}

class Daze extends Baz{
    private Bar bb= new Bar();
    public  void b(String s){
        bb.b(s);
        super.b(s);
    }
}
