package competitiveCoding;
import java.util.*;

public class TrappingRainwater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int height[] = new int[n];
		for(int i = 0 ; i < n ; i++)
			height[i] = sc.nextInt();
		int prefix[] = new int[n];
		int suffix[] = new int[n];
		Arrays.fill(prefix, 0);
		Arrays.fill(suffix, 0);
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++) {
			if(max <= height[i]) {
				max = height[i];
				prefix[i] = max;
			}else
				prefix[i] = max;
		}
		max = Integer.MIN_VALUE;
		for(int i = n - 1 ; i >= 0 ; i--) {
			if(max <= height[i]) {
				max = height[i];
				suffix[i] = max;
			}else
				suffix[i] = max;
		}
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			height[i] = Math.min(prefix[i], suffix[i]) - height[i];
			sum += height[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
