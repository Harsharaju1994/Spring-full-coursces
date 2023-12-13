package org.in60min.implementation;

import org.in60min.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers
{
    public String makeSound(){
        return "Playing music with Sony speakers";
    }
}
