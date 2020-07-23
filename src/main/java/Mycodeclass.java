public class Mycodeclass {



    public String checkprimrnum(int num)
    {
        int number=num;
        int flag=0;
        String check=null;

        int m=num/2;

        if(number==0||number==1)
        {
            System.out.println("number is not prime");
            check="notprime";

        }
        else {

            for (int i=2;i<=m;i++)
            {
                if(number%i==0)
                {
                    System.out.println("number is not prime");
                    flag=1;
                    check="notprime";
                    break;
                }

            }
        }
        if(flag==0)
        {
            System.out.println("number is prime");
            check="prime";
        }

   return check;
    }

    //////////////////even odd////////////////

    public String evenodd(int num)
    {
         String check="null";

        if(num==0)
        {
            System.out.println(num+"number is even");
             check="even";
        }
        else if(num==1)
        {
            System.out.println(num+ "number is odd");
            check="odd";
        }
          if(num%2==0)
          {
              System.out.println(num+"is even");
              check="even";
          }
          else {
              System.out.println(num+"number is odd");
              check="odd";
          }

          return check;

    }

    ///////////////////////array value average///////


    public float calculateavg(int[] values) {
        int sum=0;
        int lenth=values.length;
        for (int i=0;i<values.length;i++)
        {
            sum=sum+values[i];


        }

        float avg=sum/lenth;

        return  avg;
    }


    ////////////////////////palindrome/////////


    public boolean palindromeString(String str)
    {
       int lenth=str.length();

       boolean check=false;

       String reverse="";

       for (int i=lenth-1;i>=0;i--){

           reverse=reverse+str.charAt(i);
       }

       if(str.equals(reverse))
       {
           System.out.println("string is palindrome");
           check=true;

       }
       else {
           System.out.println("String is not palindrome");
           check=false;
       }

        return check;

    }


    /////////////////

    public float Celsius_to_Kelvin(float C)
    {
        return (float)(C + 273.15);
    }


   public float Celues_To_Fahan(float n)
    {
        return (float)((n * 9.0 / 5.0) + 32.0);
    }






}
