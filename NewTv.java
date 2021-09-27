class tv{
    private String company;
    private int year;
    private int inch;

    public tv(String company, int year,int inch){
        this.company = company;
        this.year = year;
        this.inch = inch;
    }
    public void show(){
        System.out.println(company+" 에서 만든"+year+"년형"+inch+"인치  tv");
    }
}
public class NewTv {
    public static void main(String[] args){
        tv myTV = new tv("LG",2017,32);
        myTV.show();
    }
}
