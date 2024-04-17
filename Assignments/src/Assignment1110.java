import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Assignment1110 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var N = -1;
        while ((N = scanner.nextInt()) != 0) {
            var cards = new ArrayList<Integer>();
            for (int i = 1; i <= N; i++) {
                cards.add(i);
            }

            var discardedCards = new ArrayList<Integer>();
            boolean removeOdds = true;
            while (cards.size() > 1) {
                for(int i=0; i<cards.size(); i++) {
                    if(removeOdds) {
                        if(i%2==0){
                            discardedCards.add(cards.get(i));
                        }
                    }else{
                        if(i%2 ==1){
                            discardedCards.add(cards.get(i));
                        }
                    }
                }
                if(discardedCards.contains(cards.get(cards.size()-1))){
                    removeOdds = false;
                }else{
                    removeOdds= true;
                }
                cards.removeAll(discardedCards);
            }
            var toString = discardedCards.toString().substring(1, discardedCards.toString().length()-1);
            System.out.println(toString.isEmpty() ? "Discarded cards:": "Discarded cards: "+toString);
            System.out.println("Remaining card: "+cards.get(0));
        }
    }
}
