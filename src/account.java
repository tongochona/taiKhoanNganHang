public abstract class account {
    protected String ten;
    protected String numbers;
    protected double balance;
    protected int transactions;
    protected double charge;
    public void check(double tien)throws InValidAmountException{
        if(tien<=0) {
            throw new InValidAmountException();

        }

    }
    public void check2(double tien) throws InValidAmountException{
        if(tien>balance) throw new OverWithdrawException();
    }
    public account(double sodu){
        try{
            check(sodu);
        }
        catch(InValidAmountException ie){
            System.out.println(ie.getMessage());
            return;
        }
        balance=sodu;
        ten="";
        numbers="";
        System.out.println("Tao tai khoan thanh cong!");
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setNumbers(String maso){
        this.numbers=maso;
    }
    public boolean deposit(double tien) {
        if (tien > 0) {
            balance += tien;
            transactions++;
            return true;
        } else return false;
    }
    public boolean withdraw(double tien){
        try{
            check(tien);
            check2(tien);
        }
        catch(OverWithdrawException oe){
            oe.getMessage();
        }
        catch(InValidAmountException ie){
            ie.getMessage();
        }
        balance-=tien;
        transactions++;
        return true;
    }

    public String getTen() {
        return ten;
    }

    public String getNumbers() {
        return numbers;
    }
    public double getBalance(){
        return balance;
    }

    public int getTransactions() {
        return transactions;
    }

    public void resetTrasactions(){
        transactions=0;
    }
    public void setBalance(){
        balance-=endMonthCharge();
    }
    public abstract double endMonthCharge();
    public static void endMonth(account kh){
        System.out.println("Ten tai khoan:"+ kh.getTen());
        System.out.println("So tai khoan: "+kh.getNumbers());
        System.out.println("So du: "+kh.getBalance());
        System.out.println("So lan giao dich trong thang: "+kh.getTransactions());
        System.out.println("Phi hang thang: "+kh.endMonthCharge());
        kh.setBalance();
        kh.resetTrasactions();
        System.out.println("So du: "+kh.getBalance());
    }
}

