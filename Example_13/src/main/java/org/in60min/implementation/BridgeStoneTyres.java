package org.in60min.implementation;

import org.in60min.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres
{
    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
