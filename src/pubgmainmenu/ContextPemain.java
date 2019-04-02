/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubgmainmenu;

/**
 *
 * @author Gerwin Jo
 */
public class ContextPemain {
    private Strategy strategy;

    public ContextPemain(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public String executeOperation(String player, int komando) {
        return strategy.doOperation(player, komando);
    }
}
