package competitiveCoding;
import java.util.*;

public class CoinChangeProblem {
	
	public static int Change(int coins[],int amount)
	{
		Arrays.sort(coins);
		int[] dp = new int[amount+1];
		Arrays.fill(dp, amount+1);
		dp[0] = 0;
		for(int i = 0 ; i<=amount;i++)
		{
			for(int j = 0 ; j<coins.length ; j++)
			{
				if(coins[j]<=i)
				{
					dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
				}
			}
		}
		return dp[amount] > amount ? -1:dp[amount];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int amount = sc.nextInt();
		int[] coins = new int[n];
		for(int i = 0 ; i<coins.length ; i++)
		{
			coins[i] = sc.nextInt();
		}
		System.out.println(Change(coins, amount));
	}
}
