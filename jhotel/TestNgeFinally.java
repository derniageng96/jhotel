public class TestNgeFinally{  
  public static void main(String args[]){  
  try{  
   //int data=25/0;
   int data1=25/5;
   //System.out.println(data);
   System.out.println(data1);
  }  
  catch(ArithmeticException e){System.out.println(e);}  
  finally{System.out.println("Tidak bisa dibagi 0");}  
  System.out.println("rest of the code...");  
  }  
}  