public class TestNgeThrow{  
   static void validate(int umur){  
     if(umur<18)  
      throw new ArithmeticException("Tidak cukup umur");  
     else  
      System.out.println("Welcome!!");  
   }  
   public static void main(String args[]){  
      validate(13);    
  }  
}  