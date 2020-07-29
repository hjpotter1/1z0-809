public class Test044 {
    public static void main(String[] args) {
        for(Course a:Course.values()){
            System.out.println(a+"f"+a.getCost());
        }
    }
}

enum Course{
    Java(100),J2me(150);
    private  int cost;

     private Course(int i) {
        this.cost=i;
        }
     int getCost(){
        return cost;
    }
}
