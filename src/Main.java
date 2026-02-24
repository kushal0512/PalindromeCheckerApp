public class Main {
    public static void main(String[] var0) {
        String var1 = "radar";
        char[] var2 = var1.toCharArray();
        int var3 = 0;
        int var4 = var2.length - 1;

        boolean var5;
        for(var5 = true; var3 < var4; --var4) {
            if (var2[var3] != var2[var4]) {
                var5 = false;
                break;
            }

            ++var3;
        }

        System.out.println("Input : " + var1);
        System.out.println("Is Palindrome? : " + var5);
    }
}