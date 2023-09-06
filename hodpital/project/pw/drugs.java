package com.hodpital.project.pw;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

interface med
{
    void medDetails();

}
interface checkout
{
    void billing();
}
class MedBilling implements checkout
{
    public void billing()
    {
        System.out.println("Enter 1 to buy insulin");
        System.out.println("Enter 2 to buy Paracetamol");
        System.out.println("Enter 3 to buy VitaminD");
        System.out.println("Enter 4 to buy Aspirin");
        System.out.println("Enter 5 to buy Polio");
        System.out.println("Enter 6 to Exit");
        System.out.println("_______________________________________________________________________________________________________________");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your choice");
        int Choice = scan.nextInt();
        switch (Choice)
        {
            case 1 : insulinprice ip = new insulinprice();
                     ip.INSULINPRICE();
                     System.out.println("_____________________________________________________________________________________________________");
                     PHONEPAY PP1 = new PHONEPAY();
                     PP1.UPI();
                     break;
            case 2 : paracetamolprice pp = new paracetamolprice();
                     pp.PARACETMOLPRICE();
                     System.out.println("_____________________________________________________________________________________________________");
                     PHONEPAY PP2 = new PHONEPAY();
                     PP2.UPI();
                     break;
            case 3 : vitamindprice vp = new vitamindprice();
                     vp.PRICEFORVITAMIND();
                     System.out.println("_____________________________________________________________________________________________________");
                     PHONEPAY PP = new PHONEPAY();
                     PP.UPI();
                     break;
            case 4 : aspirinprice ap = new aspirinprice();
                     ap.PRICEFORASPIRIN();
                     System.out.println("_____________________________________________________________________________________________________");
                     PHONEPAY PP3 = new PHONEPAY();
                     PP3.UPI();
                     break;
            case 5 : polioprice pp1 = new polioprice();
                     pp1.PRICEFORPOLIO();
                     System.out.println("_____________________________________________________________________________________________________");
                     PHONEPAY PP4 = new PHONEPAY();
                     PP4.UPI();
                     break;
            case 6 :  MEDSECTION ms6 = new MEDSECTION();
                      ms6.MEDMANAGEMENT();
                      break;
        }

    }
}


class insulinprice  // price for insulin
{
    public void INSULINPRICE()
    {
        Scanner sc = new Scanner(System.in);
        int priceofinsulin = 120;
        System.out.println("price of one insulin is :" + priceofinsulin);
        System.out.println("ENter the Quantity you need");
        int Quantity = sc.nextInt();
        System.out.println("Your total ammount is :" + priceofinsulin*Quantity);
    }
}

class paracetamolprice //billing for paracetamol
{
    public void PARACETMOLPRICE()
    {
        Scanner sc = new Scanner(System.in);
        int Priceforparacetamol = 10;
        System.out.println("price of one Paracetamol is :" + Priceforparacetamol);
        System.out.println("ENter the Quantity you need");
        int Quantity = sc.nextInt();
        System.out.println("Your total ammount is :" + Priceforparacetamol*Quantity);
    }
}

class vitamindprice //billing for vitamin-d
{
    public void PRICEFORVITAMIND()
    {
        Scanner sc = new Scanner(System.in);
        int priceforvitamind = 399;
        System.out.println("price of one Vitamin-D is :" + priceforvitamind);
        System.out.println("ENter the Quantity you need");
        int Quantity = sc.nextInt();
        System.out.println("Your total ammount is :" + priceforvitamind*Quantity);
    }
}

class aspirinprice //billing for asirin
{
    public void PRICEFORASPIRIN()
    {
        Scanner sc = new Scanner(System.in);
        int priceforaspirin = 20;
        System.out.println("price of one ASPIRIN is :" + priceforaspirin);
        System.out.println("ENter the Quantity you need");
        int Quantity = sc.nextInt();
        System.out.println("Your total ammount is :" + priceforaspirin*Quantity);
    }
}

class polioprice //billin for polio
{
    public void PRICEFORPOLIO()
    {
        Scanner sc = new Scanner(System.in);
        int priceforpolio = 233;
        System.out.println("price of one POLIO is :" + priceforpolio);
        System.out.println("ENter the Quantity you need");
        int Quantity = sc.nextInt();
        System.out.println("Your total ammount is :" + priceforpolio*Quantity);
    }
}


class insulin
{
  public void Insulin()
   {
       System.out.println("Insulin is a hormone produced by the pancreas that plays a crucial role" + "\n" +"in regulating blood sugar levels. It allows cells in the body to take in glucose (sugar) from the " + "\n" +"bloodstream and use it as a source of energy. Insulin is primarily used in the " + "\n" + "treatment of diabetes, a condition characterized by insufficient insulin production or the body's inability to effectively use insulin.\n" +
               "\n");
   }
}

class paracetamol
{
    public void Paracetamol()
    {
        System.out.println("Paracetamol is a widely used over-the-counter pain reliever and fever " + "\n " + "reducer with analgesic and antipyretic properties. It is commonly used for mild to moderate pain and fever");
    }
}

class vitamind
{
    public void VitaminD()
    {
        System.out.println(" Vitamin D capsules are dietary supplements that provide an essential nutrient " + "\n for the body. They help maintain healthy bones, support immune function,\n regulate calcium absorption, and may have other potential health benefits.");
    }
}

class aspirin
{
    public void Aspirin()
    {
        System.out.println("Aspirin is a commonly used medication that belongs to the class of nonsteroidal\n anti-inflammatory drugs (NSAIDs). It is primarily used to relieve pain, reduce inflammation,\n lower fever, and prevent blood clotting.\n" );
    }
}

class polio
{
    public void POLIO()
    {
        System.out.println("Polio, or poliomyelitis, is a highly infectious viral disease that primarily affects children.\n It can cause paralysis, muscle weakness, and even death. Vaccination efforts have significantly \nreduced the global incidence of polio.");
    }
}

class MEDDETAILS implements med //class for details of medichine
{
    @Override
    public void medDetails()
    {
        System.out.println("Enter 1 to know about Insulin");
        System.out.println("Enter 2 to know about Paracetamol");
        System.out.println("Enter 3 to know about Vitamin-D");
        System.out.println("Enter 4 to know about Aspirin");
        System.out.println("Enter 5 to know about Polio");
        System.out.println("Enter 6 to Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Please enter your Choice");
        int Choice = sc.nextInt();
        switch (Choice)
        {
            case 1 : insulin i = new insulin();
                     i.Insulin();
                System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
                MEDSECTION ms6 = new MEDSECTION();
                ms6.MEDMANAGEMENT();
                break;
            case 2 : paracetamol p = new paracetamol();
                     p.Paracetamol();
                System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
                MEDSECTION ms5 = new MEDSECTION();
                ms5.MEDMANAGEMENT();
                break;
            case 3 : vitamind vd = new vitamind();
                     vd.VitaminD();
                System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
                MEDSECTION ms4 = new MEDSECTION();
                ms4.MEDMANAGEMENT();
                break;
            case 4 : aspirin a = new aspirin();
                     a.Aspirin();
                     System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
                MEDSECTION ms3 = new MEDSECTION();
                ms3.MEDMANAGEMENT();
                break;
            case 5 : polio pol = new polio();
                     pol.POLIO();
                System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
                MEDSECTION ms2 = new MEDSECTION();
                ms2.MEDMANAGEMENT();
                break;
            case 6 :
                MEDSECTION ms1 = new MEDSECTION();
                ms1.MEDMANAGEMENT();
                     break;
        }
    }
}

class MEDSECTION //main section for calling all methods
{
    void MEDMANAGEMENT()
    {
        System.out.println("Enter 1 to See medicine details");
        System.out.println("Enter 2 to Buy Medicine");
        System.out.println("Enetr 3 to Exit");
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Pease enter your choice");
        int Choice = sc.nextInt();
        switch (Choice)
        {
            case 1 : MEDDETAILS md = new MEDDETAILS();
                     md.medDetails();
                     MEDSECTION ms4 = new MEDSECTION();
                     ms4.MEDMANAGEMENT();
                     break;
            case 2 : MedBilling mb = new MedBilling();
                     mb.billing();
                     MEDSECTION ms7 = new MEDSECTION();
                     ms7.MEDMANAGEMENT();
                     break;
            case 3 : System.out.println("exiting....");
                     app app = new app();
                     app.APPHOSPITAL();
                     break;
        }
    }
}

class debitcard
{
    public void DEBIT()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your debit card number");
        int debitcardNUM = sc.nextInt();
        System.out.println("please enter your debit card pin");
        int cardPin = sc.nextInt();
        System.out.println("your debit card num is :" + debitcardNUM);
        System.out.println("Thanks for payment");
    }
}
class phonepay1
{
    public void upi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your Phone pay number");
        int phonePayNum = sc.nextInt();
        System.out.println("please enter your phone pay pin");
        int cardPin = sc.nextInt();
        System.out.println("your Phonepay num is :" + phonePayNum);
        System.out.println("Thanks for payment");
    }
}
class PHONEPAY
{
    public void UPI()
    {
        System.out.println("enter 1 for debit card");
        System.out.println("Enter 2 for phone pay");
        System.out.println("Enter 3 for Exit");
        Scanner sc = new Scanner(System.in);
        int Choice = sc.nextInt();
        switch (Choice)
        {
            case 1 : debitcard d = new debitcard();
                     d.DEBIT();
                     app app = new app();
                     app.APPHOSPITAL();
                     break;
            case 2 : phonepay1 p1 = new phonepay1();
                     p1.upi();
                     app app1 = new app();
                     app1.APPHOSPITAL();
                     break;
            case 3 : MEDSECTION ms4 = new MEDSECTION();
                     ms4.MEDMANAGEMENT();
                     break;
        }
    }
}
