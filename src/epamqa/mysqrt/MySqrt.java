package epamqa.mysqrt;

public class MySqrt {
    public static void main(String[] args) {
        MySqrt ms = new MySqrt();
        System.out.println(ms.mySqrt(5));
    }

    public int mySqrt(int x) {
        if(x == 0 || x == 1)
            return x;

        long start = 0, end = x / 2;
        while(start <= end)
        {
            long mid = start + (end - start) / 2;

            if(mid * mid == x)
                return (int) mid;
            else if(mid * mid < x)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return (int) end;
    }
}