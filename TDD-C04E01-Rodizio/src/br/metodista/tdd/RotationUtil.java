package br.metodista.tdd;


/**
 * Classe - Rodizio Utils
 * @author Leandro Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class RotationUtil {
    public static boolean plateCanRunOnDay(RotationDay day, String licencePlate) {
        return day.canRun(licencePlate);
    }
}
