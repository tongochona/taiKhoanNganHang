public class Main {
    public static void main(String[] args){
        account kh1=new gambler(50);
        kh1.setTen("To Ngoc Hoan");
        kh1.setNumbers("11111111");
        kh1.deposit(100);
        kh1.withdraw(100);
        kh1.withdraw(10.5);
        kh1.withdraw(12);
        kh1.withdraw(13);
        kh1.withdraw(15);
        kh1.endMonth(kh1);
    }

}
