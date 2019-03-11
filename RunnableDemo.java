package threadinginjava;


/**
 * Write a description of class RunnableDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 class RunnableDemo implements Runnable
{
   private Thread t;
   private String threadname;
   
   RunnableDemo(String threadname){
       this.threadname=threadname;
       System.out.println("Creating "+threadname);
    }
    public void run(){
        System.out.println("Running "+threadname);
        try{
            for(int i=4;i>0;i--){
                System.out.println("Thread "+threadname+" , "+i);
                //let the thread sleep for a while
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println("Thread "+threadname+" Interrupted.");
        }
        System.out.println("Thread "+threadname+" Exiting");
        
    }
    public void start(){
        System.out.println("Starting "+threadname);
        if(t==null){
            t=new Thread(this,threadname);
            t.start();
        }
    }
}
