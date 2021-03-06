import java.math.BigDecimal;
import java.util.HashMap;

/***
 * A singleton class for finding the Price of a given item.
 * @author Joseph Whitten.
 *
 */
public class PriceFinder {
	
    private static PriceFinder singletonInstance = null; 

    //The mapping.
    private HashMap<Item, BigDecimal> prices = new HashMap<Item, BigDecimal>(); 
    
   //The item prices.
    private final BigDecimal APPLE_PRICE = new BigDecimal(0.6); 
    private final BigDecimal ORANGE_PRICE = new BigDecimal(0.25); 
    
    /***
     * Create the mapping.
     */
    private PriceFinder() 
    { 
        prices.put(Item.APPLE, APPLE_PRICE);
        prices.put(Item.ORANGE, ORANGE_PRICE);
    } 
  
    /***
     * Static method to create instance of Singleton class.
     * @return The Price finder.
     */
    public static PriceFinder getInstance() 
    { 
        if (singletonInstance == null) 
        	singletonInstance = new PriceFinder(); 
  
        return singletonInstance; 
    }

    /***
     * Get the item mapping.
     * @return The item hash map.
     */
	public HashMap<Item, BigDecimal> getPrices() {
		return prices;
	}
	
	/***
	 * Get an item given an item name.
	 * @param name
	 * @return The item enum constant.
	 */
	public BigDecimal getPrice(Item item){
		return prices.get(item);
	}

}
