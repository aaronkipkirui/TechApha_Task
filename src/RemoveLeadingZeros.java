
public class RemoveLeadingZeros {
    public static void main(String[] args) {
//        initializing input and output variables
        String input = "0000012789";
        String output = removeLeadingZeros(input);
//      print input and output after removing zeros
        System.out.println("Original string: " + input);
        System.out.println("Output after removing zeros: " + output);

    }
//  removeLeadingZeros method
    public static String removeLeadingZeros(String input) {
//        find index of first non-zero character
        int i = 0;
        while (i < input.length() && input.charAt(i) == '0'){
            i++;
        }
//        if characters are zero return "0"
        if (i == input.length()){
            return "0";
        }
//        return substring starting from the first non-zero character
        return input.substring(i);
    }
}
