public class CreditCard implements Comparable<CreditCard>{
    private String name;
    private double apr;
    private double balance; 

    public CreditCard(String name, double apr, double balance){
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    public String getName(){return name;}

    @Override
    public String toString(){
        String aprString = String.format("%.2f%%", apr);
        String balanceString = String.format("$%.2f", balance);
        return name + ": " + "APR: " + aprString + " Balance: " + balanceString;
    }

    public int compareTo(CreditCard other){
        // if(apr > other.apr)return 1;
        // if(apr < other.apr)return -1;
        // return 0;

        return Double.valueOf(apr).compareTo(other.apr);
    }
}