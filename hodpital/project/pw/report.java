package com.hodpital.project.pw;
import java.util.Scanner;

class MEDREPORT
{
    public void testreport()
    {
        int staffID =123;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your staff Id");
        int staffId = sc.nextInt();
        if (staffId==123)
        {
            System.out.println("Enter 1 for Blood pressure Report");
            System.out.println("Enter 2 for Hemoglobin Report");
            System.out.println("Enter 3 for Dibeteas Report");
            System.out.println("Enter 4 for Blood Oxygen test");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bloodpressure bp = new bloodpressure();
                    bp.bpdisp();
                case 2:
                    blood b = new blood();
                    b.hemoglobin();
                case 3:
                    dibeteas db = new dibeteas();
                    db.dp();
                case 4:
                    BloodOxygen bo = new BloodOxygen();
                    bo.BO();
            }
        }
        else
        {
            app app = new app();
            app.APPHOSPITAL();
        }
    }
}

class BloodOxygen
{
    public void BO()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the patient name");
        String name= sc.next();
        System.out.println("Enter patient Oxygen Level");
        int oxygen = sc.nextInt();
       if (oxygen<90)
       {
           System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           System.out.println("Report :"+ name + "\n"+ "Your blood oxygen level is :" + oxygen +"\n" +"Patient exhibits low blood oxygen levels (below normal range),\npresenting with symptoms of shortness of breath, cyanosis, and confusion.\n Urgent evaluation and intervention required to improve oxygenation and address \nunderlying cause.");
           System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           app app = new app();
           app.APPHOSPITAL();
       }
       else if (oxygen>90)
       {
           System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           System.out.println("report :" + name + "\n" +"Your blood oxygen Report is :" + oxygen + "YOu are completly right and your blood oxygen report is also normal\nif you are felling unwell then yiu must take some rest");
           System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           app app = new app();
           app.APPHOSPITAL();
       }
    }
}

class blood
{
    public void hemoglobin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the patient name :");
        String name=sc.next();
        System.out.println("enter the hemoglobin rate :");
        int Hemoglobin = sc.nextInt();
        if (Hemoglobin>13)
        {
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("your Hemoglobin rate is okay");
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            app app = new app();
            app.APPHOSPITAL();
        }
        else if (Hemoglobin<12)
        {
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("Medical report :" + name + "\n" + "Your Hemoglobin rate is :" + Hemoglobin + "Patient presents with low hemoglobin levels (below reference range), \nexperiencing fatigue, weakness, and pallor. Further investigation and appropriate\nmanagement recommended to address anemia and associated symptoms.");
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            app app = new app();
            app.APPHOSPITAL();
        }
    }
}

class dibeteas
{
    public void dp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the patient name");
        String name= sc.next();
        System.out.println("Enter patient Sugar Level");
        int sugarlevel = sc.nextInt();
        if (sugarlevel>120 && sugarlevel < 140)
        {
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("your Dibeteas is in control");
            //back
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            app app = new app();
            app.APPHOSPITAL();
        } else if (sugarlevel<120)
        {
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("Medical report : " + name +"\n" + "Your dibetis in the report :" + sugarlevel + "\n" + "Patient presented with low blood glucose levels (hypoglycemia) due to diabetes.\nSymptoms resolved with prompt administration of glucose. Advised on prevention\nand management strategies. Further monitoring recommended.\n" );
            //back
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            app app = new app();
            app.APPHOSPITAL();
        } else if (sugarlevel>140)
        {
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("Medical Report: " + name + "\n" + "Your dibetis in the report is " + sugarlevel + "\n" +"Patient presents with high diabetes, exhibiting elevated blood glucose levels,\nuncontrolled weight loss, frequent urination, and excessive thirst.\nUrgent intervention required to regulate glucose levels and manage \nsymptoms effectively.");
            //back
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            app app = new app();
            app.APPHOSPITAL();
        }
    }
}



class bloodpressure
{
   public void bpdisp()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the patient name");
       String name = sc.next();
       System.out.println("Enter the blood pressure");
       int Bloodpresure = sc.nextInt();
       if (Bloodpresure>90 && Bloodpresure<120)
       {
           System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           System.out.println("No need to worry your blood presuree is normal");
           System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           app app = new app();
           app.APPHOSPITAL();
       }
       else if (Bloodpresure<90)
       {
           System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           System.out.println("Blood presure Report of :" + name + "\n" +
                   "\n" + "The patient have a low blood presure of " + Bloodpresure + "\n" +
                   "Patient presents with symptoms of low blood pressure, including dizziness, fatigue, \nand fainting. Blood pressure reading consistently below normal range.\nFurther investigations and treatment recommended.");
           System.out.println("You need some rest");
           System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           app app = new app();
           app.APPHOSPITAL();

       }
       else if (Bloodpresure>140)
       {
           System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           System.out.println("BloodPressure Report of :" + name + "\n" +
                   "\n" + "The patient have high blood presurre of " + Bloodpresure + "\n" +
                   "Patient presents with high blood pressure, consistently measuring above normal \nlevels. Further evaluation and monitoring required to assess the extent \nof hypertension and determine appropriate treatment plan.");
           System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
           app app = new app();
           app.APPHOSPITAL();
       }
   }

}

