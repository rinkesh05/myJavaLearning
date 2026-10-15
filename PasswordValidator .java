 class PasswordValidator {
    public static void main(String[] args) {
        int passwordLength = 6;

        if (passwordLength >= 8) {
            System.out.println("Password strength: Strong");
        } else {
            System.out.println("Password strength: Too Short");
        }
    }
}
