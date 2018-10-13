package com.morronel;

public class Main {

    public static void transfer(Account to, Account from, int howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static void main(String[] args) {
        Account mattProfile = new Account("MattProfile", 100);
        Account myProfile = new Account("Myprofile", 0);



        transfer(myProfile, mattProfile, 150);

        System.out.println(mattProfile.balance());
        System.out.println(myProfile.balance());
    }
}
