class TestThread extends Thread {
   private Thread t;
   private String NamaThread;
   private String NamaThread2;
   TestThread( String name) {
      NamaThread = name;
      System.out.println("Lionel, ready " +  NamaThread );
      System.out.println("Lionel, set " +  NamaThread );
      System.out.println("Andres, ready " +  NamaThread );
      System.out.println("Andres, set " +  NamaThread );
      System.out.println("Messi, ready " +  NamaThread );
      System.out.println("Mesii, set " +  NamaThread );
      
    }
   
   public void run() {
      System.out.println("Running " +  NamaThread );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + NamaThread + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  NamaThread + " interrupted.");
      }
      System.out.println("Thread " +  NamaThread + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  NamaThread );
      if (t == null) {
         t = new Thread (this, NamaThread);
         t.start ();
      }
   }
}

public class RunForYourLife {

   public static void main(String args[]) {
      TestThread T1 = new TestThread( "Thread-1");
      T1.start();
      
      TestThread T2 = new TestThread( "Thread-2");
      T2.start();
   }   
}