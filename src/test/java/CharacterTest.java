import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CharacterTest {

    @Test
    public void testCreationCharacter() {
        fr.epsi.cap2425.Character mage = new fr.epsi.cap2425.Character("Gandalf", "Mage", 1);
        fr.epsi.cap2425.Character archer = new fr.epsi.cap2425.Character("Legolas", "Archer", 1);

        assertEquals("Gandalf", mage.getName());
        assertEquals("Mage", mage.getClassType());
        assertEquals(1, mage.getLevel());

        assertEquals("Legolas", archer.getName());
        assertEquals("Archer", archer.getClassType());
        assertEquals(1, archer.getLevel());
    }
}
