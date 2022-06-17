class ThreadA extends Thread{
   public void run()
   {
       for(int i=50; i<=100; i++)
       {
           if(i%2 == 0)
           System.out.println("ThreadA "+i+" is Even");
       }
   }
}
class ThreadB extends Thread{
    public void run()
    {
        for(int i=50; i<=100; i++)
        {
            if(i%2 != 0)
            System.out.println("ThreadB "+i+" is Odd");
        }
    }
 }

 class thread_Prg{
     public static void main(String args[]){
         ThreadA t1 = new ThreadA();
         ThreadB t2 = new ThreadB();
         t1.start();
         t2.start();
     }
 }