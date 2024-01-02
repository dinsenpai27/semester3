
package semester3;

import java.util.Stack;

public class stack {
  public static void main(String[]args){
      Stack<String> games = new Stack<String>();
      games.add("yugioh");
      games.add("minecraft");
      games.add("osu");
      System.out.println(games);
      games.push("valo"); //push memasukkan
      System.out.println(games);
      games.pop(); //mengeluarkan
      System.out.println(games);
      games.pop(); 
      System.out.println(games);
      System.out.println(games.peek());
  }  
}
