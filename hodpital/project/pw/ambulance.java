package com.hodpital.project.pw;

import java.util.Scanner;

class Ambulance
{
    public void AmbulanceCalling()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Phone Num");
        long PhoneNum= sc.nextInt();
        System.out.println("Enter your location");
        System.out.println("___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Enter your location name");
        String LocationName= sc.next();
        System.out.println("___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Do you want to call the Ambulance");
        System.out.println("___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Enter 1 for Calling the Ambulance");
        System.out.println("Enter 2 for Exit");
        System.out.println("___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1 :
                System.out.println("Your phone num is : " +PhoneNum+"\n"
                                   +"Your location is : " + LocationName + "\n"
                                   +"Thanks sir for calling our Ambulance and we will be reaching you in Few minutes ASAP");
                break;
            case 2 :  app app = new app();
                      app.APPHOSPITAL();
                      break;
        }
    }
}



