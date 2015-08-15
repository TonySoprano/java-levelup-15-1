package main.java.lecture13;

import java.io.IOException;

public interface Comand {
    public boolean check(String t);

    public String comand(String t) throws IOException;
}
