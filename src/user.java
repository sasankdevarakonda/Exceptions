public class user {
    public static void main(String[]args)  {

        Atm atm =new Atm();
        try{
            atm.atm(1234,75);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
