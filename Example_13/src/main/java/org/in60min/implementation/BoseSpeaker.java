package org.in60min.implementation;

import org.in60min.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {
    public String makeSound()
    {
        return "Playing music with Bose speakers";
    }
}
