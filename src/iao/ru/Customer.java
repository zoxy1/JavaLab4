package iao.ru;

public class Customer {

   private int identifier=1;
   private char status='C';
   private int quantity=5;
   
   public Customer() {
   }

   public void displayCustomerInfo(){
	System.out.println("������������� ������� = "+identifier);   
	System.out.println("������ ������� = "+status);  
	System.out.println("����� ������� = "+quantity);  
   }
    
    
}
