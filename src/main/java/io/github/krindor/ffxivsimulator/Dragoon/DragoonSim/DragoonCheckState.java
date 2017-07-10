package io.github.krindor.ffxivsimulator.Dragoon.DragoonSim;

import io.github.krindor.ffxivsimulator.OverallClassesForSim.Timers.BuffsDebuffs;

/**
 * Created by andre on 2017-05-09.
 */
public class DragoonCheckState {
    public BuffsDebuffs checkState(BuffsDebuffs state, String specialType, String type2) {
        if (specialType.equals("Bootshine")) {
            state.setBootshine(false);
        }
        if (type2.equals("Weapon Skill") && state.isDuality()) {
            state.setDuality(false);
        }
        return state;
    }
}
