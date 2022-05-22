public class MyRunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_CYAN + "Hello from MyRunnable Implementation of run()");
    }
}
