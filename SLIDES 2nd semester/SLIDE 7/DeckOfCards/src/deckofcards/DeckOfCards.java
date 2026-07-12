package deckofcards;

public class DeckOfCards {
    
    public static void main(String[] args) {
        int [] cards = new int [52];
        
        String [] family = new String []{"Spade", "Heart", "Diamond", "Club"};
        
        String [] member = new String []{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        for(int i = 0; i < cards.length; i++){
            cards[i] = i;
        }
        
        
        for(int i = 0; i< cards.length; i++){
            int random = (int)(Math.random() * 52);
            int temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
      
        for (int i = 0; i < 4; i++){
            int familyis = (int)cards[i] / 13;
            int memberis = (int)cards[i] % 13;
            
            System.out.println("The card is " + member[memberis] + " of " + family[familyis]);
        }
       
    }
    
}
