package competitiveCoding;
import java.util.*;

public class PrimeSieve {
	
	public static void prime(int n) {
		boolean isPrime[] = new boolean[n + 1];
		for(int i = 0 ; i < n ; i++)
			isPrime[i] = true;
		for(int i = 2 ; i * i <= n ; i++) {
			if(isPrime[i] == true) {
				for(int j = i * i ; j <= n ; j += i)
					isPrime[j] = false;
			}
		}
		for(int i = 2 ; i <= n ; i++) {
			if(isPrime[i])
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		prime(n);
		sc.close();
	}

}
