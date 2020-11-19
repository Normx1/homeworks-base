package HomeWork4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void main() {
        Computer Comp = new Computer("Ryzen 3", "Kingston", "HITACHI 1000GB", 3);
        Comp.dyspalayInfo();
        int numSource = 4;
        while (numSource != 0) {
            numSource--;
            Comp.source(numSource);
        }
    }
}