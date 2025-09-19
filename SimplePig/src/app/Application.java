package app;


import com.atlas.tiere.Schwein;


public class Application {

    public static void main(String[] args) {
        new Application().run();

   }

    private void run() {
        // Deklaration (Piggy ist nur eine Referenz)




        System.out.println( Schwein.getCounter() );

        Schwein piggy;

        piggy = new Schwein();
        System.out.println( Schwein.getCounter());
    }
}
