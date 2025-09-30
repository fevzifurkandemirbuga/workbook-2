package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName=scan.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date=scan.nextLine();

        System.out.print("How may tickets would you like?");
        int quantity= scan.nextInt();

        fullName=fullName.split(" ")[1]+", "+fullName.split(" ")[0];
        date=date.split("/")[2]+"-"+date.split("/")[1]+"-"+date.split("/")[0];

        String ticket="ticket";
        if(quantity>1){
            ticket+="s";
        }

        System.out.println(quantity+" "+ticket+" reserved for "+date+" under "+fullName);




    }



}
