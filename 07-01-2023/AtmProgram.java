//Day-33
//Number Program
//ATM PROGRAM
import java.util.Scanner;
class AtmProgram{
	public static void main(String[] args) {
		int balance=100000,withdraw,deposit;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Automated Teller Machine ");
			System.out.println("Choose 1 for withdraw :");
			System.out.println("Choose 2 for deposit :");
			System.out.println("Choose 3 for Check balance :");
			System.out.println("Choose 4 for Exit :");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					System.out.print("Enter Money to be Withdrawn :");
					withdraw = sc.nextInt();
					if(balance>=withdraw){
						balance=balance-withdraw;
						System.out.println("Collet your Money ");
					}
					else{
						System.out.println("Insufficient Balance");
					}
					System.out.println("");
					break;
				}
				case 2:{
					System.out.print("Enter Money to be Deposit :");
					deposit=sc.nextInt();
					balance=balance+deposit;
					System.out.println("your Money has been deposit ");
					System.out.println("");
					break;
				}	
				case 3:{
					System.out.println("Balance "+balance);
					System.out.println("");
					break;
				}
				case 4:{
					System.exit(0);
				}

			}
		}
	}
}
/*
OUTPUT
Automated Teller Machine
Choose 1 for withdraw :
Choose 2 for deposit :
Choose 3 for Check balance :
Choose 4 for Exit :
1
Enter Money to be Withdrawn :1000
Collet your Money

Automated Teller Machine
Choose 1 for withdraw :
Choose 2 for deposit :
Choose 3 for Check balance :
Choose 4 for Exit :
3
Balance 99000

Automated Teller Machine
Choose 1 for withdraw :
Choose 2 for deposit :
Choose 3 for Check balance :
Choose 4 for Exit :
2
Enter Money to be Deposit :9
your Money has been deposit

Automated Teller Machine
Choose 1 for withdraw :
Choose 2 for deposit :
Choose 3 for Check balance :
Choose 4 for Exit :
3
Balance 99009

Automated Teller Machine
Choose 1 for withdraw :
Choose 2 for deposit :
Choose 3 for Check balance :
Choose 4 for Exit :
4
*/