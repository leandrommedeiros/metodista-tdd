package br.metodista.tdd;

/**
 * Interface - Rodizio
 * @author Leandro Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class RotationFriday implements Rotation{
    @Override
    public boolean canRun(String inLicencePlate) {
        return (!inLicencePlate.endsWith("9") &&
                !inLicencePlate.endsWith("0"));
    }
}