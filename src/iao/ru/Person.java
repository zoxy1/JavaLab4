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
    // здесь постарался, чтобы выводилось правильно 1 год, 2 года, 5 лет, 101 год...
    if(year%100==1){
	System.out.println("Вам "+year+" год");
    	}
    else{
    	if((year%100<=4)&&(year%100!=0)){
    	    System.out.println("Вам "+year+" года");
    	    }   
    	else{
    	    System.out.println("Вам "+year+" лет");
    	    }
    }
    
    System.out.println("Вам "+day+" дней");
    System.out.println("Вам "+second+" секунд");
    System.out.println("Вам "+minute+" minut");
    System.out.println("Вам "+millisecond+" секунд\n");
}
    
    
}
