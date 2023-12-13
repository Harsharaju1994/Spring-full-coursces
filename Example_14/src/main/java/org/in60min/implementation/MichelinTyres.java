package org.in60min.implementation;

import org.in60min.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres
{
    public String rotate(){
        return "Vehicle moving with Michelin tyres";
    }
}
