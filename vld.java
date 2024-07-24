class Main {
 
  public static boolean valid(String s, int y) {
    Stack stk = new Stack(1000);
    // stk.push(s.subString(0));
   
    for (int i = 0; i<y; i++) {
      System.out.print(stk);
      
      if (stk.isEmpty() == true) {
        return false; 
      }
      else {
        if (s.charAt(i) == ')' && stk.peekEnd()=='(') {
          stk.pop();
        }
        else if (s.charAt(i) == ']' && stk.peekEnd()=='[') {
          stk.pop();
        }
        else if (s.charAt(i) == '}' && stk.peekEnd()=='{') {
          stk.pop();
        }
        else {
          return false;
        }
      }
      
      
      if (s.charAt(i) == '(') {
        stk.push('(');
        
      }
      else if (s.charAt(i) == '[') {
        stk.push('[');
        
      }
      else if (s.charAt(i) == '{') {
        stk.push('{');
        
      }
      
      
      
      // else if (s.charAt(i) == ")"&&i!=0&&s.charAt(i-1)=="(") {
      //   stk.pop();
      //   System.out.print(stk);
      // }
      
    }
    if (stk.isEmpty()) {
      System.out.print(stk);
      return true;
    }
    else {
      System.out.print(stk);
      return false;
    }
  }
  public static void main(String[] args) {
    // Stack stack = new Stack(5);
    // stack.push(10);
    // stack.push(15);
    // stack.push(20);
    // System.out.println(stack);
    // System.out.println(stack.pop());
    // stack.push(25);
    // System.out.println(stack);
    
    
    
    
    System.out.println(valid("([])",4));
    
    // TODO: Test your Stack implementation here!
  }
}