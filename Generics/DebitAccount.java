package Generics;

public class DebitAccount extends Account<String>{

    public DebitAccount(String id, int sum) {
        super(id, sum);
    }
}
