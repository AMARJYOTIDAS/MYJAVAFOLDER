import java.util.Scanner;

public class mystack {
    int top = -1;
    int []stack;
    int max = 10;
    int data;


   void push(){
    if(top==max-1){
        System.out.println("the stack is full");
        return;
    }
     System.out.println("enter your data" + data  );
    Scanner scanner = new Scanner(System.in);
    
    stack[top] = data;
    top = top+1;
}
public static void main (String[] args){
    mystack stack = new mystack();
    stack.push();

} 
   
}
