package com.hodpital.project.pw;
import java.math.BigInteger;
import java.security.KeyStore;
import java.util.*;

interface patientinput
{
    String np ="new patient";
    String op ="old patient";

    void patientregister();
}

class patientdetails implements patientinput
{
    public void patientregister()
    {

        String name;
        int age;
        String place;
        int phoneNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("if you are new patient enter 'new' or if you are old patient enter 'old' ");
        String patientstatus = scan.next();


        if (patientstatus.equals("new"))
        {
            System.out.println("______________________________________________________________________________________________________________________________________________________________________________________________________");
             System.out.println("Hello!! dear you are welcome to SUBHAM GROUP OF MEDICALS");
             System.out.println("please enter your name");
             name = scan.next();
             System.out.println("please enter your age");
             age = scan.nextInt();
             System.out.println("please enter your birth place");
             place = scan.next();
             System.out.println("please enter your phone number");
             phoneNum = scan.nextInt();
            System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("your name is" + name);
            System.out.println("your age is" + age);
            System.out.println("your house location is" + place);
            System.out.println("your phone number is " + phoneNum);
            app app = new app();
            app.APPHOSPITAL();
        }
        else if(patientstatus.equals("old"))
        {
            patientreg pr1 = new patientreg("subham",18,"Pattamundai",986126780);
            patientreg pr2 = new patientreg("jyoti",17,"Banki",964897123);
            patientreg pr3 = new patientreg("etina",20,"Cuttuck",961879238);
            patientreg pr4 = new patientreg("linty",24,"Bhubneswar",895623147);

            Map m = new HashMap();
            m.put(1,pr1);
            m.put(2,pr2);
            m.put(3,pr3);
            m.put(4,pr4);

            Set set =m.entrySet();
            Iterator itr = set.iterator();
            while (itr.hasNext())
            {
                Map.Entry em = (Map.Entry) itr.next();
                System.out.println(em.getKey() + " : " + em.getValue());
            }
            System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________");
            System.out.println("Do you find your details ?? in it if you find enter 'YES' or 'NO'");
            String opinion = scan.next();

            if (opinion.equals("no"))
            {
                System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________");
                Scanner sc = new Scanner(System.in);
                System.out.println("please enter your name");
                String name1 = sc.next();
                System.out.println("please enter your age");
                int age1 = sc.nextInt();
                System.out.println("please enter your city");
                String city1 = sc.next();
                System.out.println("please enter your phonenumber");
                int phoneNum1 = sc.nextInt();
                relogin rl = new relogin(name1 ,age1 ,city1 ,phoneNum1);


                HashMap hmm = new HashMap();
                hmm.put(1 , rl);

                System.out.println(hmm.entrySet());

                app app = new app();
                app.APPHOSPITAL();
            }
            else if (opinion.equals("yes"))
            {
                System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");
                System.out.println("proceed");
                app app = new app();
                app.APPHOSPITAL();
            }
            app app = new app();
            app.APPHOSPITAL();

        }
        else
        {
            System.out.println("please enter you are old or new");
            patientdetails pd = new patientdetails();
            pd.patientregister();
        }
    }
}
class patientreg extends patientdetails
{

        private String name;
        private int age;
        private String city;
        private int phoneNum;

        public patientreg(String name , int age , String city , int phoneNum)
        {
            this.name=name;
            this.age=age;
            this.city=city;
            this.phoneNum=phoneNum;
        }
        public String toString()
        {
            return name + " " + age + " " + city + " " +phoneNum;
        }
}
class relogin
{
    private String name;
    private int age;
    private String city;
    private int phoneNUM;
public relogin(String name , int age, String city , int phoneNUM)
{
    this.name=name;
    this.age=age;
    this.city=city;
    this.phoneNUM=phoneNUM;
}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public int getPhoneNUM() {
        return phoneNUM;
    }

    public String toString()
    {
        return name+ " " + age + " " + city + " " + phoneNUM;
    }
}


