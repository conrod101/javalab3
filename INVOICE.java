public class INVOICE{
  private static int counter;
  private static double accumulator;
  private int invoiceNo;
  private double amount;

    public INVOICE(double amount){
       this.amount=amount;
       invoiceNo=nextcounter();
       accumulator+=amount;    
    }

    private int nextcounter(){
      counter++;
      return counter;

    }
    
    public int getCounter(){
      return counter;
    }

    public double getAccumulator(){
		     
		return accumulator;
    }

    public String toString(){
       return "Invoive :" + invoiceNo + " of "+ nextcounter()+" in the amount of " + amount+" ( Total "+accumulator+")";
    }
}
