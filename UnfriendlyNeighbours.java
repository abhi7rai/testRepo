package difficultQues;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import org.apache.commons.lang3.ArrayUtils;

public class UnfriendlyNeighbours {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		for(int i=0;i<testCases;i++) {
			int numberOfTickets = Integer.parseInt(sc.nextLine());
			
			int[] tickets = Stream.of(sc.nextLine().split(" "))
                    .mapToInt(token -> Integer.parseInt(token))
                    .toArray();
			int max1 = Arrays.stream(tickets).max().getAsInt();
			tickets = ArrayUtils.removeElement(tickets, max1);
			int max2=0;
			max2 = Arrays.stream(tickets).max().getAsInt();
			String winningNumber="";
			if(max1-max2 == 1) {
				tickets = ArrayUtils.removeElement(tickets, max1);
				max2 = Arrays.stream(tickets).max().getAsInt();
				if(max2<=0) {
					max2=0;
				}
			}
			if(max2!=0) {
				winningNumber = String.valueOf(max2)+ String.valueOf(max1);
			}else {
				winningNumber = String.valueOf(max1);
			}
			System.out.println(winningNumber);
		}
		
		
	}
}
