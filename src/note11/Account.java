package note11;

import java.util.Random; 
      public class Account{
      protected int accNo; protected int pin;
      protected Customer customer; protected double balance;
      protected double overDraftLimit; protected boolean isSuspended; protected boolean isActive;
      protected boolean noticeNeeded;
      public Account(int accNo,Customer customer) {
        this.accNo= accNo;
        this.customer=customer; 
        this.balance =0.0; 
        this.isActive = true;
        generatePin();
      }
      private void generatePin() {
        Random r = new Random();
        pin = (100000 + r.nextInt(900000));
      }
      public int getAccNo() {
        return accNo;
      }
      public Customer getCustomer() {
        return customer;
      }

      public double getBalance() {
        return balance;
      }
      public int getPin() {
        return pin;
      }
      public boolean isSuspended() {
        return this.isSuspended;
      }
}
