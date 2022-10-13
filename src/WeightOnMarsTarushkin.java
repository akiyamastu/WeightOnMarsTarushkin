public class WeightOnMarsTarushkin {

    static final int earthWeightTarushkin = 70;
    static float marsWeightTarushkin;
    static double doubleMarsWeightTarushkin;
    static int intmarsWeightTarushkin;
    static char charmarsWeightTarushkin;

    public static void main(String[] args) {

        marsWeightTarushkin = (earthWeightTarushkin * 38F)/ 100F;
        System.out.println("Twoja waga na Marsie jest: " + marsWeightTarushkin + "kg");
        doubleMarsWeightTarushkin = marsWeightTarushkin;
        System.out.println("double: " + doubleMarsWeightTarushkin);
        System.out.format("%.4f%n", doubleMarsWeightTarushkin);
        intmarsWeightTarushkin = (int)doubleMarsWeightTarushkin;
        System.out.println("int: "  + intmarsWeightTarushkin);
        charmarsWeightTarushkin = (char)intmarsWeightTarushkin;
        System.out.println("char: " + charmarsWeightTarushkin);
        charmarsWeightTarushkin += 28;
        System.out.println(charmarsWeightTarushkin);
    }
}