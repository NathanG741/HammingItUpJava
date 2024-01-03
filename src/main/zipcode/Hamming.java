package zipcode;

import java.util.Objects;

public class Hamming {
    private String s;
    private String s1;


    public Hamming(String s, String s1) {
        if (!Objects.equals(s.length(), s1.length())) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        } else {
            this.s = s;
            this.s1 = s1;
        }
    }

    public int getHammingDistance() {
        String[] sSplit = s.split("");
        String[] s1Split = s1.split("");

        int hammingDistance = 0;
        for (int i = 0; i < sSplit.length; i++) {
            if (!sSplit[i].equalsIgnoreCase(s1Split[i])) {
                hammingDistance++;
            }
        }
        return hammingDistance;
    }
}
