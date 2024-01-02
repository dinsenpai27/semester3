
package semester3;

public class stack2 {
   char stack[]= new char[100];
   int top;
   
   public void push (char isi){
       stack[top]= isi;
       top++;
       
   }
   public char pop(){
       char isi;
       isi= stack[top];
       top--;
       return isi;
   }
   public void tampil(){
       System.out.println();
       for(int i= top-1;i>=0;i--)
       {
           System.out.print(stack[i]+" ");
   }
}
}
