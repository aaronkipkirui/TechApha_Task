import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RemoveDuplicates {
    public static void main(String[] args) {
//        initialize array
        int [] array = {1,2,2,3,3,4,5};

//        convert array to ArrayList
        List<Integer> list = new ArrayList<>();
        for (int value : array){
            list.add(value);
        }

//        convert ArrayList back to array after duplicates are removed
        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);

//        convert back to array if necessary
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
//        print array without duplicates
        System.out.println("Output: ");
        for (int value : newArray){
            System.out.println(value + "");
        }
    }
}