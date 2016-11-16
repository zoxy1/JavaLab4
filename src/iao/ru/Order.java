package iao.ru;

public class Order {
    private long orderValue = 0; // цена заказа
    private int itemQuantity = 100_000_00; // количество экземпляров товара
    private int itemPrice = 215; // цена одного экземпляра
    public Order() {
	
    }
    /* без приведения типа увеличиваем itemPrice, получаем при itemPrice>214,
    orderValue подсчитывается не правильно, потому что выходит за пределы 
    максимального значения int (2 147 483 647), для того чтобы подсчитывалось правильно 
    нужно привести хотя бы один из множителей к типу long*/
public void calculateTotal(){
    orderValue=itemPrice*(long)itemQuantity;   
System.out.println(orderValue);
}
}
