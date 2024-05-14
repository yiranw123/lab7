package note11;

import java.util.Calendar;

public class Customer {
   private String name;
   private String address;
   private Calendar dateofBirth;
   private boolean creditStatus;

   public Customer(String name, String address, Calendar dateofBirth) {
      this.name = name;
      this.address = address;
      this.dateofBirth = dateofBirth;
      creditStatus = false;
   }

   public String getName() {
      return this.name;
   }

   public String getAddress() {
      return this.address;
   }

   public Calendar getDateofBirth() {
      return this.dateofBirth;
   }

   public boolean getCreditStatus() {
      return this.creditStatus;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public void setCreditstatus(boolean cresitstatus){ 
      this.creditStatus=creditStatus;
   }
}