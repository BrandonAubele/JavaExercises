public class Hamming {
    int counter = 0;

    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.isEmpty()){
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if(rightStrand.isEmpty()){
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if(leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        for(int i = 0; i < leftStrand.length(); i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i)){
                counter++;
            }
        }
    }

    public int getHammingDistance() {
            return counter;
    }
}
