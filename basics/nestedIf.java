public class nestedIf {
    public static void main(String[] args) {
        int age =19;
        if(age >0){
            if(age>18){
                System.out.println("Welcome to the website");
            } else {
                System.out.println("You are too young to register");
            } 
        }else {
            System.out.println("Invalid age");
        }
    }
}
