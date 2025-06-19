package io.github.guisso.playerdemob;

import io.github.guisso.meleeinterface.Decision;
import io.github.guisso.meleeinterface.IPlayer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Random decisions on Prisoner's Dilemma
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 * @version 0.1
 * @since 0.1, 2025-03-14
 */
public class PlayerDemoB
        implements IPlayer {

    @Override
    public String getDeveloperName() {
        return "Luis Guisso";
    }

    @Override
    public String getEngineName() {
        return "Demo: Random Strategy";
    }

    @Override
    public Decision makeMyMove(Decision opponentPreviousMove) {
        try {
            return SecureRandom.getInstanceStrong()
                    .nextBoolean() ? Decision.COOPERATE : Decision.DEFECT;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PlayerDemoB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Decision.DEFECT;
    }

}
