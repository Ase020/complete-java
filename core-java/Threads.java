class ThreadA extends Thread{
    public void run(){
        for (int i = 1; i <=10  ; i++) {
            System.out.println(i + ". Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadB extends Thread{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + ". Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Threads {
    public static void main(String[] args){
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        System.out.println("A " + threadA.getPriority());
        threadB.setPriority(Thread.MAX_PRIORITY);

        System.out.println("B " + threadB.getPriority());


        threadA.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadB.start();
    }
}
