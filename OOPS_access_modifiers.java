public class OOPS_access_modifiers {
    public static void main(String[] args) {
    // yaha hm object banate hai 
    BankAccount B1 = new BankAccount();
    System.out.println("B1 is created..");
    B1.username = "srijalGupta";
    // B1.password = "xyz"; 
    // this is not possible because password is private property 
    // if we want to access the pasword you can make a function 
    B1.setpassword("srijal0901");
    // here we can only set password but cannot update password 
    // also we can change password but cannot se password 
    // this is private concept 
    }
}
class BankAccount {
    public String username;
    @SuppressWarnings("unused")
    private String password;
    // yaha pe yeh posible hai kyu ki class k andar hi password ko acses kar rahe hai 
    void setpassword (String pswd){
    password = pswd;
    }
    void setusername (String setusername){
        username = setusername;
    }
}