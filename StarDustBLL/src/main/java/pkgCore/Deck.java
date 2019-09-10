package pkgCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {
	int numOfDraw = 0;
	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * 
	 *        cardsInDeck - attribute keeping track of the cards that are in the
	 *        deck. The attribute is valued in the Constructor for the class, and
	 *        items are removed from the collection in the 'Draw' method
	 */
	private ArrayList<Card> cardsInDeck = new ArrayList<Card>();

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * 
	 *        Default no-arg constructor. Create a single deck of cards, make sure
	 *        it's shuffled.
	 */
	public Deck() {
		this(1);
	}

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @param iNbrOfDecks - Number of decks to include in the cardsInDeck attribute.
	 * 
	 *                    One argument Constructor... If '2' is passed in, make sure
	 *                    cardsInDeck contains two 52-card decks. Make sure the deck
	 *                    is shuffled.
	 */
	public Deck(int iNbrOfDecks) {
		
		//TODO - Implement the constructor
		for(int i = 0; i < iNbrOfDecks;i++) {
			
			
			for (eSuit ES: EnumSet.range(eSuit.HEARTS, eSuit.SPADES )) {
			
				for (eRank ER: EnumSet.range(eRank.TWO, eRank.ACE)) {
				
					cardsInDeck.add(new Card(ES,ER));
					
				}
			}
			
			Collections.shuffle(this.cardsInDeck);
		}
	}
	

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @return Card object
	 * @throws DeckException
	 */
	public Card Draw() throws DeckException {
		if(numOfDraw >= cardsInDeck.size())
			throw new DeckException(this);
		return this.cardsInDeck.get(numOfDraw++);
		//FIXME - Implement this method.  Shouldn't return null, return the right value
		
	}

	/**
	 * @author BRG
	 * @version Lab #1
	 * @since Lab #1
	 * @return Number of cards remaining in the deck
	 * 
	 * getiDeckCount - Return the number of cards remaining in the deck.
	 */
	public int getiDeckCount() {
		//FIXME - Implement this method.  Shouldn't return 0, return the right value
		return this.cardsInDeck.size();
	}

 
	/**
	 * getCardsInDeck - getter for cardsInDeck.  It's private, must be invoked
	 * with reflections.
	 * 
	 * @author BRG
	 * @version Lab #3
	 * @since Lab #3
	 * @return - the cards in the deck.
	 */
	private ArrayList<Card> getCardsInDeck() {
		//FIXME - Implement this method.  Shouldn't return 0, return the right value
		return this.cardsInDeck;
	}
 
	
	
}