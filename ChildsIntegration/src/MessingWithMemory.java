import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MessingWithMemory {
   static Map<Integer, MessingWithMemory> map = new HashMap<Integer, MessingWithMemory>();

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      long duration;
      long totalTime = 0;
      long averageTime = 0;
      long endTime;
      System.out.println("Enter number of objects to instantiate per trial: ");
      long iterations = input.nextLong();
      System.out.println("How many trials would you like to simulate?");
      long howMany = input.nextLong();
      Runtime rt = Runtime.getRuntime();
      float prevTotal = 0;
      float prevI = 0;
      float prevFree = rt.freeMemory() / 1000000;
      for (int j = 0; j < howMany; j++) {
         long startTime = System.nanoTime();
         for (int i = 0; i < iterations; i++) {
            float totalMem = rt.totalMemory() / 1000000;
            float freeMem = rt.freeMemory() / 1000000;
            if (totalMem != prevTotal || freeMem != prevFree) {
               float usedMem = totalMem - freeMem;
               float prevUsed = (prevTotal - prevFree);
               System.out
                  .println("#" + i + ", Total: " + totalMem + ", Used: " + usedMem + ", ∆Used: " + (usedMem - prevUsed)
                     + ", Free: " + freeMem + ", ∆Free: " + (freeMem - prevFree) + ", ∆Count: " + (i - prevI));
               prevTotal = totalMem;
               prevFree = freeMem;
               prevI = i;
            }
            map.put(i, new MessingWithMemory());
         }
         endTime = System.nanoTime();
         duration = endTime - startTime;
         totalTime += duration;
         System.out.println("-------------------------------------------\nRun Time: " + duration / 1000000. + " ms\n");
         prevI = 0;
      }
      averageTime = totalTime / howMany;
      System.out.println(">>>>>>>>>>>>>>>>\nNumber of Trials: " + howMany + "\n<<<<<<<<<<<<<<<");
      System.out.println("Objects instantiated per trial: " + iterations);
      System.out.println(">>>>>>>>>>>>>>>>\nTotal objects instantiated: " + iterations * howMany + "\n<<<<<<<<<<<<<<<");
      System.out.println("Total Run Time: " + totalTime / 1000000. + " ms");
      System.out.println(">>>>>>>>>>>>>>>>\nAverage Run Time: " + averageTime / 1000000. + " ms\n<<<<<<<<<<<<<<<");

   }
}