package Generics;

public class CreditAccount extends Account<Integer>{
    public CreditAccount(Integer id, int sum) {
        super(id, sum);
    }
}
