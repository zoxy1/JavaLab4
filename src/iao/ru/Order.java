package iao.ru;

public class Order {
    private long orderValue = 0; // ���� ������
    private int itemQuantity = 100_000_00; // ���������� ����������� ������
    private int itemPrice = 215; // ���� ������ ����������
    public Order() {
	
    }
    /* ��� ���������� ���� ����������� itemPrice, �������� ��� itemPrice>214,
    orderValue �������������� �� ���������, ������ ��� ������� �� ������� 
    ������������� �������� int (2 147 483 647), ��� ���� ����� �������������� ��������� 
    ����� �������� ���� �� ���� �� ���������� � ���� long*/
public void calculateTotal(){
    orderValue=itemPrice*(long)itemQuantity;   
System.out.println(orderValue);
}
}
