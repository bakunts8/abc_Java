/* copy for main
        Gas gas = new Gas(2, 4);
        gas.amountOfEnergy();
        gas.enableDisable(true, true);
        gas.amountOfEnergy();
        gas.enableDisable(true, false);
        gas.amountOfEnergy();
        gas.enableDisable(false, true);
        gas.amountOfEnergy();
        gas.enableDisable(false, false);
        gas.amountOfEnergy();
 */
package Part2;

public class Gas {

    private int electricHeater;
    private int gasHeater;
    private boolean isEnableElectric = false, isEnableGas = false;

    Gas(int el, int g) {
        if (el > 0 && el < 4 && g > 2 && g < 6) {
            electricHeater = el;
            gasHeater = g;
        } else {
            System.out.println("Run again and input parameter 'el' between 1 to 3 ranges, and parameter 'g' between 3 to 5");
            System.exit(0);
        }
    }

    public void enableDisable(boolean electric, boolean gas) {
        isEnableElectric = electric;
        isEnableGas = gas;
    }

    public void amountOfEnergy() {
        int energy;
        String info;

        if (!isEnableElectric && !isEnableGas) {
            info = "Both electric and gas eyes are NOT enabled: The amount of energy equals...  ";
            energy = 0;
        } else if (isEnableElectric && isEnableGas) {
            info = "Both electric and gas eyes are enabled: The amount of energy equals...  ";
            energy = electricHeater * 100 + gasHeater * 80;
        } else if (isEnableElectric) {
            info = "Only electric eyes are enabled: The amount of energy equals...  ";
            energy = electricHeater * 100;
        } else {
            info = "Only gas eyes are enabled: The amount of energy equals...  ";
            energy = gasHeater * 80;
        }
        System.out.println(info + energy);
    }
}
