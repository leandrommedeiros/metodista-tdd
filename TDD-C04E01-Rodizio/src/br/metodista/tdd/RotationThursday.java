package br.metodista.tdd;

/**
 * Interface - Rodizio
 * @author Leandro Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class RotationThursday implements Rotation{
    @Override
    public boolean canRun(String inLicencePlate) {
        return (!inLicencePlate.endsWith("7") &&
                !inLicencePlate.endsWith("8"));
    }
}