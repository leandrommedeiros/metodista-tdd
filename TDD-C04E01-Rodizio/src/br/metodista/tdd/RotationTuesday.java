package br.metodista.tdd;

/**
 * Interface - Rodizio
 * @author Leandro Medeiros <leandro.medeiros.br@gmail.com> - R.A. 250544
 */
public class RotationTuesday implements RotationDay{
    @Override
    public boolean canRun(String inLicencePlate) {
        return (!inLicencePlate.endsWith("3") &&
                !inLicencePlate.endsWith("4"));
    }
}