public class HelloWorld {
    public static void main(String[] args) {
        String secret = "It's a secret to everybody.";
        try { javax.crypto.spec.SecretKeySpec keyspec = new javax.crypto.spec.SecretKeySpec(secret.getBytes("UTF-8"), "AES"); }
        catch (Exception e) { System.out.println("Something went wrong."); }
        System.out.println("Hello World!");
    }
    public static int badidea() {
        int a = 1;
        int b = 0;
        int c = a/b;

        for (int i=0; i<a; i--) {
            System.out.println("whoops");
        }
        return c;
    }
}
