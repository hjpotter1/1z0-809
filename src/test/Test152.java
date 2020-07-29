package test;

 class Test152 {
    public static void main(String[] args) {
        e3 eee = new e3();
        eee.op();
    }
}

abstract class e1 {
    protected void to() {
    }
    protected void doo() {
    }
}

class e2 extends e1 {
    public final void to() {
        System.out.println("111");
    }
    public final void doo() {
        System.out.println("222");
    }
}

class e3 {
    e1 m = new e2();
    public void op() {
        m.to();
        m.doo();
    }
}
