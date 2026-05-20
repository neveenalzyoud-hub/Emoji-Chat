/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emojichatapp;
public class EmojiChatApp {
    public static void main(String[] args) {
       System.out.println("-----\n");
       ChatAsse asset1 = EmojiFactory.getEmoji("😊");
       asset1.display("Ahmad", "Hello everyone" );
       
       ChatAsse asset2 = EmojiFactory.getEmoji("❤️");
       asset2.display("Sara", "Welcom Ahmad" );
    
       ChatAsse asset3 = EmojiFactory.getEmoji("😊");
       asset3.display("Ahmad", "How are you today?" );
    
       ChatAsse asset4 = EmojiFactory.getEmoji("❤️");
       asset4.display("Sara", "fine, thank you" );
       
       
       System.out.println("\n------------------------");
       System.out.println("Total message sent in chat: 4");
       System.out.println("Total actual emoji objects in memory: " + EmojiFactory.getCount());
       System.out.println("--------------------------");
    }
}
