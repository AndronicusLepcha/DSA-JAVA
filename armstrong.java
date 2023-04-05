class armstrong{
    public static void main(String args[]){
       int num=150;
       //System.out.println(num.length);
       int x,y,z;
       x=num/100;
       y=(num/10)%10;
       z=(num%10);
       if((x*x*x+y*y*y+z*z*z)==num){
        System.out.println("Number is Armstong");
       }
       else{
        System.out.println("Number is Not Armstong");
       }
        
           
    }
}