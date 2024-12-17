import java.util.stream.Stream;
class Patterns {
    public void dig1(int n) {
        // Rows
        for (int i = 1; i <= n; i++) {
            // columns
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // new line
            System.out.println("");
        }
    }
    public void digi2(int n)
    {
      // rows
      for(int i=0;i<n;i++)
      {
        // colums
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
    }
    public void digi3(int n)
    {
        //rows
        for(int i=1;i<=n;i++)
        {
            //col
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void digi4(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void digi5(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void digi6(int n)
    {
     for(int i=0;i<n;i++)
     {
        for(int j=1;j<n-i+1;j++)
        {
            System.out.print(j);
        }
        System.out.println();
     }
    }
    public void digi7(int n)
    {
        for(int i=0;i<n;i++)
        {
            //Space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            //Star 
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void digi8(int n)
    {
        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            //Star
            for(int j=0;j<2*n-(2*i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void digi9(int n)
    {
        digi7(n);
        digi8(n);
    }
    public void digi10(int n)
    {
        for(int i=0;i<=n;i++)
        {

            for(int j=0;j<i;j++)
            {
                System.out.print("*");
        
            }

            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void digi11(int n)
    {
        for(int i=0;i<n;i++)
        {
         int d=i%2==0? 0:1;
            for(int j=0;j<=i;j++)
            {
             System.out.print(d); 
             d=d^1;
            }
            System.out.println();
        }
    }
    public void digi12(int n)
    {
        for(int i=1;i<=n;i++)
        {
            //digit
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            //space
            for(int j=1;j<(n-i)*2+1;j++)
            {
                System.out.print(" ");
            }
            // digit
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void digi13(int n)
    {
        int number=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(number+++" ");
            }
            System.out.println();
        }

    }
    public void digi14(int n)
    {
        for(int i=0;i<=n;i++)
        {
            char A='A';
            for(int j=0;j<i;j++)
            {
                System.out.print(A++);
            }
            System.out.println();
        }
    }
    public void digi15(int n)
    {
        for(int i=0;i<n;i++)
        {
            char A='A';
            for(int j=0;j<n-i;j++)
            {
                System.out.print(A++);
            }
            System.out.println();
        }
    }
    public void digi16(int n)
    {char A='A';
        for(int i=0;i<=n;i++)
        {
            
            for(int j=0;j<=i;j++){

            System.out.print(A);
            }
            A++;
            System.out.println();
        }
    }
    public void digi17(int n)
    {
        for(int i=0;i<n;i++)
        {
            char A='A';
            // space
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
           // char
           for(int j=0;j<2*i+1;j++)
           {
            System.out.print( j<i? A++ : A--);
           }
      System.out.println();
        }
    }
    public void digi18(int n)
    {
        for(int i=0;i<=n;i++)
        {
        char A=(char) ('A'+n);

         for(int j=i;j>=0;j--)
         {
          System.out.print((char)(A-j));
         }
         System.out.println();
        }}
    public void digi19(int n)
    {
        for(int i=0;i<n;i++)
        {
          //star  
          for(int j=0;j<n-i;j++)
          {
System.out.print("*");
          }
          //space
          for(int j=0;j<2*i;j++)
          {
            System.out.print(" ");
          }
         // star
          for(int j=0;j<n-i;j++)
          {
System.out.print("*");
          }
          System.out.println();
        }

        for(int i=n-1;i>=0;i--)
        {
          //star  
          for(int j=0;j<n-i;j++)
          {
         System.out.print("*");
          }
          //space
          for(int j=0;j<2*i;j++)
          {
            System.out.print(" ");
          }
         // star
          for(int j=0;j<n-i;j++)
          {
          System.out.print("*");
          }
          System.out.println();
        }
    
    }
    public void digi20(int n)
    {
        for(int i=0;i<=n;i++)
        {
            // star
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            //Space
            for(int j=0;j<2*n-2*i;j++)
            {
                System.out.print(" ");
            }
             // star
             for(int j=0;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            // star
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            //Space
            for(int j=0;j<2*n-2*i;j++)
            {
                System.out.print(" ");
            }
             // star
             for(int j=0;j<=i;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
            }
    }
    public void digi21(int n)
    {
      for(int i=0;i<=n;i++)
      {
        for(int j=0;j<=n;j++)
        {
            if(i==0|| i==n || j==n || j== 0)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
           
        } System.out.println();
      }
    }
    public void digi22(int n)
    {
        for(int i=0;i<2*n-1;i++)
       {
        for(int j=0;j<2*n-1;j++)
        {
            int top=i;
            int left=j;
            int bottom=(2*n-2)-i;
            int right=(2*n-2)-j;

           int min = Stream.of(top, bottom, right, left).min(Integer::compare).get();

        System.out.print(min);
        }
        System.out.println();
       }
    }
   
    public static void main(String[] args) {
        Patterns p = new Patterns();
        p.digi22(4);
    }
}