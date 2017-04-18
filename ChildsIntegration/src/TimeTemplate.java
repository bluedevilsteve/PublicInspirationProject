public class TimeTemplate {
   private long duration;
   private String runTime;
   private long sT;
   private long eT;

   public String getRunTime(long startTime, long endTime) {
      return runTime;
   }

   public void setTimer(long startTime, long endTime) { // PSI2 goal: 4, 11;
                                                        // startTime and endTime
                                                        // are both parameters,
                                                        // sT and eT are
                                                        // arguments
      sT = System.nanoTime();
      eT = System.nanoTime();
      duration = eT - sT;
      runTime = ("Run Time: " + duration + " ms");
   }
}