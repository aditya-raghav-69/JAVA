public class IsArmostrong {
    public static void main(String[] args) {
        int num = 153;

        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if ( sum==num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
            
        }
        
    }
    
}
