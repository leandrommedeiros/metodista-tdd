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
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationMonday(), "ABC-1231"));
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationMonday(), "ABC-1232"));
        assertTrue(RotationUtil.plateCanRunOnDay(new RotationMonday(), "ABC-1234"));
    }

    @Test
    public void TuesdayTest() {
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationTuesday(), "ABC-1233"));
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationTuesday(), "ABC-1234"));
        assertTrue(RotationUtil.plateCanRunOnDay(new RotationTuesday(), "ABC-1231"));
    }

    @Test
    public void WednesdayTest() {
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationWednesday(), "ABC-1235"));
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationWednesday(), "ABC-1236"));
        assertTrue(RotationUtil.plateCanRunOnDay(new RotationWednesday(), "ABC-1234"));
    }

    @Test
    public void ThursdayTest() {
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationThursday(), "ABC-1237"));
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationThursday(), "ABC-1238"));
        assertTrue(RotationUtil.plateCanRunOnDay(new RotationThursday(), "ABC-1231"));
    }

    @Test
    public void FridayTest() {
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationFriday(), "ABC-1239"));
        assertFalse(RotationUtil.plateCanRunOnDay(new RotationFriday(), "ABC-1230"));
        assertTrue(RotationUtil.plateCanRunOnDay(new RotationFriday(), "ABC-1235"));
    }
}