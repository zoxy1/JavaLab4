package iao.ru;

public class Person {
    private int year;
    private long day;
    private long minute;
    private long second;
    private long millisecond;
    public Person() {	
    }
public void calculateAge(int year){
    this.year=year;
    day=this.year*365;
    minute=day*24*60;
    second=minute*60;
    millisecond=second*1000;
    // ����� ����������, ����� ���������� ��������� 1 ���, 2 ����, 5 ���, 101 ���...
    if(year%100==1){
	System.out.println("��� "+year+" ���");
    	}
    else{
    	if((year%100<=4)&&(year%100!=0)){
    	    System.out.println("��� "+year+" ����");
    	    }   
    	else{
    	    System.out.println("��� "+year+" ���");
    	    }
    }
    
    System.out.println("��� "+day+" ����");
    System.out.println("��� "+second+" ������");
    System.out.println("��� "+minute+" minut");
    System.out.println("��� "+millisecond+" ������\n");
}
    
    
}
