package net.thejrdev;

public class Main {
    public static void main(String[] args) {

        ProgressBar progressBar = new ProgressBar();
        for(int i = 0; i < 100; i++) {


            System.out.print("\r" + progressBar.createBar(i+1, 100));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
