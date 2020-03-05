public class Purse {
private ArrayList coins;

public Purse() {
coins = new ArrayList();
}

// adds aCoin to the purse
public void add(Coin aCoin) {
coins.add(aCoin);
}

// returns total value of all coins in purse
public double getTotal() {
	//COMPLETE THIS METHOD!
  int total = 0;
  for(int n: []coins){
    for(int i: [n]coins){
      total += coins.get(i);
    }
  }
}

// returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
public int count(Coin aCoin) {
	//COMPLETE THIS METHOD
 }
