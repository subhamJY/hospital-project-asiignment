package com.hodpital.project.pw;
import java.util.Scanner;
import java.time.*;
import java.util.logging.SocketHandler;

class app
{
    public void APPHOSPITAL()
    {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("                                  ");System.out.println("WELCOME TO SUBHAM GROUP OF MEDICALS");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("_____________________________________________________________________________________________");
        LocalDate ld = LocalDate.now();
        int day = ld.getDayOfMonth();
        Month month = ld.getMonth();
        int year = ld.getYear();
        System.out.println(day + " : " + month + " : " + year);
        LocalTime lt = LocalTime.now();
        int hour = lt.getHour();
        int minute = lt.getMinute();
        int second = lt.getSecond();
        System.out.println(hour + " : " + minute + " : " + second);
        System.out.println("_____________________________________________________________________________________________________________________________________________________________________");
        System.out.println("ENTER 1 FOR PATIENT SECTION");
        System.out.println("ENTER 2 FOR DOCTOR SECTION");
        System.out.println("ENTER 3 FOR MEDICINE SECTION");
        System.out.println("ENTER 4 FOR TEST REPORTS SECTION");
        System.out.println("ENTER 5 FOR CALLING OF AMBULANCE");
        System.out.println("ENTER 6 FOR EXIT");
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter your choice");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1 : //patient details file
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print("                                  ");System.out.println("PATIENT SECTION");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                try {
                    patientdetails pd = new patientdetails();
                    pd.patientregister();
                    System.out.println("________________________________________________________________________________________________________________________________________________________________________________________________________");
                }catch (Exception e)
                {
                    System.out.println("you have entered wrong inputType");
                    System.out.println("please Reenter the choice");
                    patientdetails pd = new patientdetails();
                    pd.patientregister();
                }
                break;
            case 2 :  //doctor mangement file
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print("                                  ");System.out.println("DOCTOR  SECTION");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                try {
                    doctormangement dm = new doctormangement();
                    dm.Doctorsection();
                    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
                }catch (Exception e)
                {
                    System.out.println("you have entered wrong inputType");
                    System.out.println("please Reenter the choice");
                    doctormangement dm = new doctormangement();
                    dm.Doctorsection();
                }
                break;
            case 3 :  //medchine magement file
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print("                                  ");System.out.println("MEDICINE SECTION");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                try {
                    MEDSECTION ms = new MEDSECTION();
                    ms.MEDMANAGEMENT();
                    System.out.println("___________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
                }catch (Exception e)
                {
                    System.out.println("you have entered wrong inputType");
                    System.out.println("please Reenter the choice");
                    MEDSECTION ms = new MEDSECTION();
                    ms.MEDMANAGEMENT();

                }
                break;
            case 4 : //test section file
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print("                                  ");System.out.println("TEST REPORT SECTION");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                try {
                    MEDREPORT mds = new MEDREPORT();
                    mds.testreport();
                }catch (Exception e)
                {
                    System.out.println("you have entered wrong inputType");
                    System.out.println("please Reenter the choice");
                    MEDREPORT mds = new MEDREPORT();
                    mds.testreport();

                }
                break;
            case 5 : //ambulance calling file
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print("                                  ");System.out.println("AMBULANCE SECTION");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                try{
                    Ambulance am= new Ambulance();
                    am.AmbulanceCalling();
                }catch (Exception e)
                {
                    System.out.println("you have entered wrong inputType");
                    System.out.println("please Reenter the choice");
                    Ambulance am= new Ambulance();
                    am.AmbulanceCalling();
                }
                break;
            case 6 : //Exit option
                System.out.println("Thanks for visiting our app\n Exeting.....Thank you!!!!");
                break;
        }
    }
}


public class hospital
{
    public static void main(String[] args) {
        app app = new app();
        app.APPHOSPITAL();
    }
}
