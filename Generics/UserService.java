package Generics;

import java.util.*;

public class UserService<T extends Account,K extends User>{

    private Map<K,T> usersAccount= new TreeMap<>();

    public UserService() {

    }

    public UserService(Map<K, T> usersAccount) {
        this.usersAccount = usersAccount;
    }

    public Map<K, T> getUsersAccount() {
        return usersAccount;
    }

    public void setUsersAccount(Map<K, T> usersAccount) {
        this.usersAccount = usersAccount;
    }



    public void addPerson(K person,T account){
        usersAccount.put(person,account);

    }
    public void printAllUsers(){
        System.out.println("Print all users:");
Set<K> users = usersAccount.keySet();
for(K one:users){

    System.out.println(one);
}

    }
    public void printAllAccounts(){
        System.out.println("All accounts:");
        Collection<T> accounts=usersAccount.values();
        for(T account:accounts){
    System.out.println(account);
}

    }
    public double getCharge(K user){
        if(usersAccount.containsKey(user)){
            System.out.println(usersAccount.get(user).getSum()+ " charge sum for user "+user);
            return usersAccount.get(user).getSum()*0.5;
        }else{
            return 0;
        }

    }





}

