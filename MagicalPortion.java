public class MagicalPortion {
    public String isMagicalPotion(long power) {
        if (power <= 0) {
            return "NO";
        }

        long left = 1;
        long right = 1290;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long cube = mid * mid * mid;

            if (cube == power) {
                return "YES";
            } else if (cube < power) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        MagicalPortion magicalPortion = new MagicalPortion();
        System.out.println(magicalPortion.isMagicalPotion(132651201231L));
    }
}