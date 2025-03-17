public class LcmHcf {

    static int hcf(int a, int b) {
        int ans;
        if (a == b)
            return a;
        if (a > b)
            ans = b;
        else
            ans = a;

        while (ans > 2) {
            if (a % ans == 0 && b % ans == 0) {
                break;
            }
            ans = ans - 1;
        }

        return ans;
    }

    static int lcm(int a, int b) {
        int ans;
        if (a == b)
            return a;
        if (a > b)
            ans = a;
        else
            ans = b;

        while (true) {
            if (ans % a == 0 && ans % b == 0) {
                break;
            }
            ans++;
        }
        return ans;

    }

    public static void main(String[] args) {
        int a = 12, b = 44;

        int hcf = hcf(a, b);
        int lcm = lcm(a, b);

        System.out.println("hcf : " + hcf);
        System.out.println("lcm : " + lcm);
    }
}
