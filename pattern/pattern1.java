
/*
*      *
**    **
***  ***
********
********
***  *** 
**    **
*      *
*/
class pattern1{
    public static void main(String args[]){
        int n=5;
        //upper half
            //print star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            //printing spaces
            int spaces=2 *(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n;i>=1;i--){
            //print star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //printing spaces
            int spaces=2 *(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}