 
package threadejemplo2;

/**
 *
 * @author jorge
 */
public class ThreadEjemplo2 implements Runnable {
 
      public void run(){
        for(int i = 0; i < 10 ; i++)
            System.out.println(i + " " + Thread.currentThread().getName());

        System.out.println("Termina thread " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException { 
        Thread t1 = new Thread(new ThreadEjemplo2(), "Pepe");
        Thread t2 = new Thread(new ThreadEjemplo2(), "Juan");

        t1.start();
        t1.join(); // Espera a que termine el hilo t1 antes de continuar con la ejecución

        t2.start();
        t2.join(); // Espera a que termine el hilo t2 antes de continuar con la ejecución

        System.out.println("Termina thread main");
    }
}

