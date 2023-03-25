//Day-104
//HackerRank (Basic Program)
/*Given a double-precision number,Payment, denoting an amount of money, use the NumberFormat class' 
getCurrencyInstance method to convert Payment into the US, Indian, Chinese, and French currency formats. 
Then print the formatted values as follows:
			US: formattedPayment
			India: formattedPayment
			China: formattedPayment
			France: formattedPayment
*/
import java.util.*;
import java.text.*;
class Solution7{    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Money:");
        double payment = scanner.nextDouble();
       
        NumberFormat usFormat= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        
        String us = usFormat.format(payment);
        String india =inFormat.format(payment);
        String china=cnFormat.format(payment);
        String france=frFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        scanner.close();
    }
}
/*
OUTPUT
Enter Money:12324.134
US: $12,324.13
India: ?12,324.13
China: ¥12,324.13
France: 12?324,13 ?
*/