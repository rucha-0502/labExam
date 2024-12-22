public class largestnum{
    public static void main(String[] args) {
        int num = 0;
        for(int i=1000;i<10000;i++){
            if(i%10==0 && i%13==0 && i>num){
                num = i;
            }
        }
        System.out.println("Largest 4 digit number : " + num);
    }
}
