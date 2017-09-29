package server;

import java.util.concurrent.atomic.AtomicInteger;

public class Turnstile {
  
  private static final AtomicInteger count = new AtomicInteger(0);
  private static volatile int spectators = 0;
  private int madeSpectators;
  private final int turnstileID;

  private boolean isFilled;

  public Turnstile(){
    turnstileID = count.incrementAndGet();
    madeSpectators = 0;
}
  
  public synchronized int addSpecatator(){
      spectators ++;
      madeSpectators++;
      return spectators;
  }

    public synchronized int getTurnstileID() {
        return turnstileID;
    }

    public synchronized static int getSpectators() {
        return spectators;
    }

    public int getMadeSpectators() {
        return madeSpectators;
    }
  
  
  

}
