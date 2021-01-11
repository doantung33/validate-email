public class Main {
    public static final String[] valueEmail=new String[]{"ab@gmai.com","abc1@gmail.com","abc2a@yahoo.com"};
    public static final String[] invalueEmail=new String[]{"@gmai.com","abc1@gmail.","abc2a@.com"};

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String e:
             valueEmail) {
            boolean invalid = emailExample.valuedate(e);
            System.out.println("Email "+e+" is valid "+invalid);
        }
        for (String e:invalueEmail
             ) {
            boolean invalid= emailExample.valuedate(e);
            System.out.println("Email "+e+" is valid "+invalid);
        }
    }
}
