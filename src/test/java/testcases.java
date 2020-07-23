
import  org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class testcases {


    Mycodeclass mycodeclass;
    @BeforeAll
    public  void initilize()
    {
       mycodeclass=new Mycodeclass();

    }

    @BeforeEach
    public void  beforeeachtest()
    {
        System.out.println("test is starting");
    }

    @AfterEach
    public void aftereachtestcase()
    {
        System.out.println("test end");
    }

///////////////////////////////////////////////////////////////////////////////////////////





    @Test
    public void prime1()
    {
        int num=6;

        String result;
        result=mycodeclass.checkprimrnum(num);
       String expected="notprime";
        Assertions.assertEquals(expected,result);

    }



    @Test
    public void prime2()
    {
        int num=3;

        String result;
        result=mycodeclass.checkprimrnum(num);
        String expected="prime";
        Assertions.assertEquals(expected,result);

    }




///////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void eveodd1()
    {
        int num=3;

        String result;
        result=mycodeclass.evenodd(num);
        String expected="odd";
        Assertions.assertEquals(expected,result);

    }


    @Test
    public void eveodd2()
    {
        int num=2;

        String result;
        result=mycodeclass.evenodd(num);
        String expected="even";
        Assertions.assertEquals(expected,result);

    }

////////////////////////////////////////////////////////////////////////////////////////////////


    @Test
    public void avgtest1()
    {
        int[] arr=new  int[3];
        arr[0]=4;
        arr[1]=4;
        arr[2]=4;

        float result;
        result=mycodeclass.calculateavg(arr);
        float expected = (float) 4.0;
        Assertions.assertEquals(expected,result);

    }


    @Test
    public void avgtest2()
    {
        int[] arr=new  int[3];
        arr[0]=10;
        arr[1]=10;
        arr[2]=10;

        float result;
        result=mycodeclass.calculateavg(arr);
        float expected = (float) 10.0;
        Assertions.assertEquals(expected,result);

    }


    /////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void palindromeStringtest1()
    {
        String str="poop";

       boolean result;
        result=mycodeclass.palindromeString(str);
       boolean expected=true;
        Assertions.assertEquals(expected,result);

    }


    @Test
    public void palindromeStringtest2()
    {
        String str="pakistan";

        boolean result;
        result=mycodeclass.palindromeString(str);
        boolean expected=false;
        Assertions.assertEquals(expected,result);

    }

    ///////////////////////////////////////////////////////////////////////////////////



    @Test
    public void temp1()
    {
       int num=20;


        float result;
        result=mycodeclass.Celsius_to_Kelvin(num);
        float expected = (float)293.15  ;
        Assertions.assertEquals(expected,result);

    }

    @Test
    public void temp2()
    {
        int num=20;


        float result;
        result=mycodeclass.Celues_To_Fahan(num);
        float expected = (float)68.0;
        Assertions.assertEquals(expected,result);

    }
}


/////////////////////////////////////////////////////////////////////////////////////////////