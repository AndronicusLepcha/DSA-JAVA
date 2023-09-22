class perfect_square_problem{
    public static void main(String args[]){
         System.out.println((24/10)%10);
        int i; //32 x 32 = 1024 least 4 digit no
        for(i=32;i<100;i+=2){
            int num= i*i;
            if(num>=1000 && num<10000){
                int d1=num/1000;
                int d2=(num/100)%10;
                int d3=(num/10)%10;
                int d4=(num%3);

                if(d1%2==0 && d2%2==0 && d3%2==0 && d4%2==0){
                    System.out.println(num);
                }
                
            }
        }
    }
}