import java.util.Arrays;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// create list of all accounts 
		List<Account> accounts = Arrays.asList(new Account(5, 13, "Frank"), new Account(5, 13, "David"), new Account(0, 4, "Karen"));
		Collections.sort(accounts);
		
		// if there are multiple accounts with greatest expenditure
		List<Account> maxAccounts = new ArrayList<>();
		int maxCost = accounts.get(accounts.size() - 1).monthlyCost();
		for (int i = accounts.size() - 1; i >= 0; i--) {
			if (accounts.get(i).monthlyCost() == maxCost) {
				maxAccounts.add(accounts.get(i));
			}
		}
		
		
		// printing details of all accounts with greatest expenditures 
		for (Account acc: maxAccounts) {
			System.out.println(acc.toString());
		}
		
	}

}
