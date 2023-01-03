public class gambler extends account{
    private double charge=0.0;
    private double tile;
    public gambler(double tien){
        super(tien);
    }


    @Override
    public boolean withdraw(double tien) {
        try{
            if((tien>super.balance/2))throw new OverWithdrawException();
        }
        catch(OverWithdrawException  oe){
            System.out.println(oe.getMessage());
            return false;
        }
        if(super.withdraw(tien)){
            tile=Math.random();
            System.out.println(tile);
            if(tile>0.49){
                charge+=tien;

            }
            return true;
        }
        return false;
    }

    public double endMonthCharge(){
        return charge;
    }
}
