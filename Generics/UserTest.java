package Generics;

public class UserTest {

    public static void main(String[] args) {

        User user1 =new User("Taras",12);
        User user2 =new User("Ivan",22);
        User user3 =new User("Oleg",29);
        Account user1CreditAccount = new CreditAccount(3212,3312);
        Account user2CreditAccount = new CreditAccount(32123,3312);
        Account user3DebitAccount = new DebitAccount("7823",3312);

        UserService<Account,User> userService = new UserService< Account,User>();
        userService.addPerson(user1,user1CreditAccount);
        userService.addPerson(user2,user2CreditAccount);
        userService.addPerson(user3,user3DebitAccount);

userService.printAllUsers();
userService.printAllAccounts();
        System.out.println(userService.getCharge(user1));





    }
}
