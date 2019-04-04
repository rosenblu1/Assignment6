package assignment6;

public class Program {

  public static boolean contains(double[] dubs, double eps, double d) {
    for (int i = 0; i < dubs.length; i++) {
      if (Math.abs(dubs[i] - d) < eps) {
        return true;
      }
    } // for
    return false;
  } // contains(double[], double, double)

  public static int fastModExp(int x, int y, int m) {
    // base case
    if (y == 1) {
      return x % m;
    } else {
      if (y % 2 == 0) {
        return fastModExp((x * x % m), y / 2, m);
      } else {
        return (x * fastModExp(x, y - 1, m)) % m;
      } // if (y % 2 != 0)
    } // if (y != 0)
  } // fastModExp(int, int, int)

  public static IntPair[] allPairs(int[] arr) {
    if (arr == null) {
      throw new IllegalArgumentException();
    } else {
      int n = arr.length;
      IntPair[] pairs = new IntPair[n * n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          pairs[i * n + j] = new IntPair(arr[i], arr[j]);
        } // for
      } // for
      return pairs;
    } // else
  } // allPairs(int[])

  public static String concatAndReplicateAll(String[] arr, int n) {
    if (arr == null) {
      throw new IllegalArgumentException();
    } // if (arr == null)
    String returnMe = "";
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < n; j++) {
        returnMe = returnMe + arr[i];
      } // for
    } // for
    return returnMe;
  } // concatAndReplicateAll(String[], int)

  public static int[] interleave(int[] arr1, int[] arr2) {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] returnMe = new int[arr1.length + arr2.length];
    // main interleaving loop
    while (i < arr1.length && j < arr2.length) {
      if (k % 2 == 0) {
        returnMe[k++] = arr1[i++];
      } else {
        returnMe[k++] = arr2[j++];
      }
    } // while (i < arr1.length && j < arr2.length)
    // cleanup loops
    while (i < arr1.length) {
      returnMe[k++] = arr1[i++];
    } // while (i < arr1.length)
    while (j < arr2.length) {
      returnMe[k++] = arr2[j++];
    } // while (j < arr2.length)
    return returnMe;
  } // interleave(int[], int[])
} // class Program
