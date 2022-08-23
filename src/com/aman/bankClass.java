package com.aman;

import java.util.Scanner;

public class bankClass {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();
        int atmNumber = 12345;
        int atmpin = 123;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Atm Number : ");
        int atmnumber = x.nextInt();
        System.out.println("Enter pin");
        int pin = x.nextInt();
        if ((atmNumber == atmnumber) && (atmpin == pin)){
            while(true){
                System.out.println(" 1.View Available Balance\n 2. Withdraw Amount\n 3.Deposit Amount \n 4.View Ministatement \n 5. Exit ");
                System.out.println("Enter Choice");
                int ch= x.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if (ch==2){
                    System.out.println("Enter amount to withdraw");
                    double withdrawAmount = x.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }else if (ch==3){
                    System.out.println("Enter amount to deposit");
                    double depositAmount = x.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch==4){
                    op.viewMiniStatement();
                }else if (ch==5){
                    System.out.println("Collect ATM Card \n Thanks for Using ATM");
                    System.exit(0);
                }
                else{
                    System.out.println("Please Enter Correct Choice");
                }
            }
            //System.out.println("validation Done");
    }else
            System.out.println("Incorrect Atm Number or Pin");
//        System.exit(Status: 0);

    }
}
