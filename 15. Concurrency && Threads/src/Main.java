public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE+ "Hello from the main thread!!!");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

//        Creating anonymous class
        Thread myRunnableThread = new Thread(new MyRunnableThread() {
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN +  "Hello from anonymous thread");
                try {
                    anotherThread.join(2000);
                    System.out.println(ThreadColor.ANSI_RED + " Another thread terminated, so I'm running");
                } catch (InterruptedException e) {
                    System.out.println(ThreadColor.ANSI_RED + " I couldn't wait, I was interrupted!");
                }
            }
        });

//        Calling the runnable thread here:
//        Thread myRunnableThread = new Thread(new MyRunnableThread());
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ThreadColor.ANSI_RED + "Hello from main thread again");
    }
}
