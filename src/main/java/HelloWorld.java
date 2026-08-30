public class HelloWorld {
    public static void main(String[] args) {
        String secret = "It's a secret to everybody.";
        try { javax.crypto.spec.SecretKeySpec keyspec = new javax.crypto.spec.SecretKeySpec(secret.getBytes("UTF-8"), "AES"); }
        catch (Exception e) { System.out.println("Something went wrong."); }
        // INTENTIONALLY WEAK CIPHER - SAST fixture for CWE-327 (broken/risky crypto). Do not use DES in real code.
        try { javax.crypto.Cipher weak = javax.crypto.Cipher.getInstance("DES"); }
        catch (Exception e) { System.out.println("Something went wrong."); }
        System.out.println("Hello World!");
        while (true) {
            System.out.println("Are we there yet?");
            try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); break; }
        }
    }
}
