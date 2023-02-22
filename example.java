public class Main{
    public static void main(String args){
        int n=2;
        int number=1232256;

        int count=0;
        int ud;
        while(number>0){
            ud=number%10;
            if(ud==n){
                count++;
            }
            number/=10;
        }
        System.out.println(count);
    }
}