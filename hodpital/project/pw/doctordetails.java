package com.hodpital.project.pw;

import java.util.*;
interface doctor1
{
    void Doctorsection();
}
class doctormangement implements doctor1
{
    public void Doctorsection()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Doctor Details");
        System.out.println("Enter 2 for Doctor Login");
        System.out.println("Enter 3 for Exit");
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Please!! enter your choice");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1 : doctordetails dd = new doctordetails();
                     dd.doctormangement();
                     System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
                     doctormangement dm = new doctormangement();
                     dm.Doctorsection();
                break;
            case 2 :

                    doctorinput di = new doctorinput();
                    di.Doctorid();
                    System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
                    doctormangement dm1 = new doctormangement();
                    dm1.Doctorsection();
                break;
            case 3 :
                    System.out.println("exiting");
                    System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");
                    app app = new app();
                    app.APPHOSPITAL();
            default :
                    System.out.println(" ");
        }

    }
}
class doctor
{
    private String name;
    private int age;
    private String specialization;

    public doctor(String name , int age , String specialization)
    {
        this.name=name;
        this.age=age;
        this.specialization=specialization;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getSpecialization()
    {
        return specialization;
    }
    public String toString()
    {
        return name+ " " + age + " " + specialization;
    }
}

class doctordetails
{
   public void doctormangement()
   {
       System.out.println("NAME : AGE : SPECIALIZATION");
       doctor d1= new doctor("Subham" , 18 , "Neurology");
       doctor d2 = new doctor("jyoti" , 17 , "urology");
       doctor d3 = new doctor("Harish",45,"Surgeon");
       doctor d4 = new doctor("surender",46 ,"Radiology");
       doctor d5 = new doctor("Sukhish" , 39 ,"cardiologist");
       doctor d6 = new doctor("ravindra", 42 ,"Dean");

       HashMap hm = new HashMap();
       hm.put(1,d1);
       hm.put(2,d2);
       hm.put(3,d3);
       hm.put(4,d4);
       hm.put(5,d5);
       hm.put(6,d6);

       Set s = hm.entrySet();
       Iterator itr =s.iterator();
       while (itr.hasNext())
       {
           Map.Entry em =(Map.Entry) itr.next();
           System.out.println(em.getKey() + " : "+ em.getValue());


       }
   }
}
class doctorinput
{
    public void Doctorid()
    {
        Scanner sc = new Scanner(System.in);
        String username = "Subham";
        int password = 123;
        System.out.println("please enter your user name : ");
        String user = sc.next();
        System.out.println("please enter your password :");
        int pass = sc.nextInt();
        if (password==pass)
        {
            System.out.println("Do you want to change or add your details");
            System.out.println("Enter yes or no");
            String choice = sc.next();
            if (choice.equals("yes"))
            {
                System.out.println("Sir please enter your name");
                String name = sc.next();
                System.out.println("Sir please enter your age");
                int age = sc.nextInt();
                System.out.println("please enter your Specialization");
                String specialization = sc.next();

                ArrayList arr = new ArrayList();
                arr.add(name);
                arr.add(age);
                arr.add(specialization);

                System.out.println(arr);
            }else
            {
                System.out.println("Alright going back to main menu");
                System.out.println("________________________________________________________________________________________________________________________________________________________________________________________");
                //main menu
            }
        }
        else
        {
            System.out.println("Retry");
            System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________");
            doctorinput di = new doctorinput();
            di.Doctorid();
        }
    }
}
