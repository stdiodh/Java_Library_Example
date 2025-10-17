package exClass;

public class BirthDay {
    int day;
    int month;
    int year;

    public void getYear(int year){
        this.year = year;
    }

    public void printThis(){
        System.out.println(this);
    }


    public static void main(String[] args){
        BirthDay bDay = new BirthDay();
        bDay.getYear(2000);
        System.out.println(bDay);
        bDay.printThis();
    }
}