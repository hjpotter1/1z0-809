package test;

public class Test124 {
    public static <res1> void main(String[] args) throws Exception {

        try(Resouse res1 = new Resouse();) {
            res1.open();
            res1.close();
        }catch (Exception e){
            System.out.println("e1");
        }
/*        try(Resouse res2 = new Resouse()){
            res1.open();
        }catch (Exception e){
            System.out.println("e2");
        }*/
    }
}

class Resouse implements AutoCloseable{

    public void close() throws Exception {
        System.out.println("close");
    }
    public  void open(){
        System.out.println("open");
    }
}