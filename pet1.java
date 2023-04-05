/*
input=4

op= 1
    2 3
    4  5 6
    7 8 9 10
 */

 class pet1{
    public static void main(String args[]){
        int n=4;
         int i,j,k=1;
         for(i=0;i<n;i++){
            System.out.println();
            for(j=0;j<=i;j++){
                System.out.print(k);
                System.out.print("\t");
                k++;

            }
         }
           
    }
}