public class ATM {
    int atmCash = 1000000;
    int userBalance;
    void withdraw( int amount){
      if(amount > userBalance){
        system.out.println('The amount required is greater than your balance')
      }
      else if (amount > atmCash){
        system.out.println('Available cash is not enough, try again later');
        return;
      }
      else {
        balance -= amount;
        userBalance -=amount;
        system.out.println('withdraw successfully');
      }
    }
    void deposit (int amount){
      userBalance+=amount;
      atmCash+=amount;
    }
    void addCash( int amount){
      atmCash+=amount;
    }
    public static void main(String args[] ) {
    }
}
