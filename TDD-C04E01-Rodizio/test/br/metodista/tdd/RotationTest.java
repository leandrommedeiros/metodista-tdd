package br.metodista.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Interface - Rodizio
 * @author Leandro Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class RotationTest {
    @Test
    public void MondayTest() {
        RotationMonday dia = new RotationMonday();
        assertFalse(dia.canRun("ABC-1231"));
        assertFalse(dia.canRun("ABC-1232"));
        assertTrue(dia.canRun("ABC-1234"));
    }

    @Test
    public void TuesdayTest() {
        RotationTuesday dia = new RotationTuesday();
        assertFalse(dia.canRun("ABC-1233"));
        assertFalse(dia.canRun("ABC-1234"));
        assertTrue(dia.canRun("ABC-1231"));
    }

    @Test
    public void WednesdayTest() {
        RotationWednesday dia = new RotationWednesday();
        assertFalse(dia.canRun("ABC-1235"));
        assertFalse(dia.canRun("ABC-1236"));
        assertTrue(dia.canRun("ABC-1234"));
    }

    @Test
    public void ThursdayTest() {
        RotationThursday dia = new RotationThursday();
        assertFalse(dia.canRun("ABC-1237"));
        assertFalse(dia.canRun("ABC-1238"));
        assertTrue(dia.canRun("ABC-1231"));
    }

    @Test
    public void FridayTest() {
        RotationFriday dia = new RotationFriday();
        assertFalse(dia.canRun("ABC-1239"));
        assertFalse(dia.canRun("ABC-1230"));
        assertTrue(dia.canRun("ABC-1235"));
    }
}