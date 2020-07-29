package test;

public class Test150 {
}

 class Test1<T> {
    private T t;
    public T get() {
        return t;
    }
     @Override
     public String toString() {
         return super.toString();
     }
     @Override
     public boolean equals(Object obj) {
         return super.equals(obj);
     }

     @Override
     protected Object clone() throws CloneNotSupportedException {
         return super.clone();
     }

     public void set(T t) {
        this.t = t;
    }
    public static void main(String args[]) {
        Test1<String> type = new Test1<>();
        Test1 type1 = new Test1(); //line n1
        type.set("Java");
        type1.set(100); //line n2
        System.out.print(type.get() + " " + type1.get());
    }
}
