public class Test028 {

    public static void main(String[] args) {
        Book1 b1 = new Book1();
        //b1.b("java");
        Book1 b2 = new Ebook();
        //b2.b("www.");
    }
}


class Book1{
    private   String b(String s){
        return "F"+s;
    }
}

class Ebook extends Book1{
    public  String b(String url){
      return "view"+url;
    }
}
