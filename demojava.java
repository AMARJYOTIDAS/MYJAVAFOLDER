public class demojava {
private static demojava xx;

void dog(){
    System.err.println("bark");

}
class xyz extends demojava{}
public void cat(){
    System.out.println("meow");
}

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        demojava.xx=new demojava();
        xx.dog();
       
    }
}