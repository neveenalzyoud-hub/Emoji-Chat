/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emojichatapp;
public class Emoji implements ChatAsse {
    private final String symbol;
    
    public Emoji(String symbol){
            this.symbol = symbol;
    }
    @Override
    public void display(String username, String massageText) {
       System.out.println("[" + username + "]:" + massageText + " " + symbol);
    }
    
}
