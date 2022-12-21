import java.util.Scanner;

class Automorphic {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sq = N * N;

    // Start Comparing digits
    while (N > 0) {

      if (N % 10 != sq % 10) {
        System.out.println("not autormorphic");
        return;
      }

      // Reduce N and square
      N /= 10;
      sq /= 10;
    }
    System.out.println("autormorphic");

  }
}
