public class PlaceHolder {

  public static void holdingPlaces() {}}

    
    /*    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    double sum = 0;

    for (int i = 0; i < N; i++) {
      sum += input.nextDouble();
    }
    double[] array = new double[50];
    for (int j = 1; j < array.length; j++) {
      while (sum > 10000000000L) {
        sum /= 10;
        array[j] = sum;
      }
    }
    System.out.println((long) sum);
    input.close();
  }*/


/*
 * Scanner input = new Scanner(System.in); ArrayList<Long> arrayList = new
 * ArrayList<Long>(); long first = 0; long previous = 1; long current = first +
 * previous; long sum = 0; int kount = 0; long iterations = input.nextLong();
 * long maxSize = input.nextLong(); while(kount < iterations){ for(int i = 0;
 * sum<maxSize; i++){ arrayList.add(first); arrayList.add(previous);
 * arrayList.add(current); first = previous + current; previous = current +
 * first; current = first + previous;
 * 
 * sum += arrayList.get(0 + 3*i); } System.out.println(sum + " sum"); kount++;
 * sum = 0; first = 0; previous = 1; current = first + previous;
 * arrayList.clear(); maxSize = input.nextLong(); } input.close(); } }
 */