/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emojichatapp;
import java.util.HashMap;
import java.util.Map;
public class EmojiFactory {
    private static final Map<String, ChatAsse> emojiMap = new HashMap<>();
    
    public static ChatAsse getEmoji(String symbol) {
        if (!emojiMap.containsKey(symbol)){
            emojiMap.put(symbol, new Emoji(symbol));
            System.out.println("==>[New Emoji object created in memory for: " + symbol + "]");
        }
        return emojiMap.get(symbol);
    }
    public static int getCount() {
        return emojiMap.size();
    }
    
}
