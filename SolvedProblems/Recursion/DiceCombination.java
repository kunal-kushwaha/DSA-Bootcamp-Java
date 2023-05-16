import java.util.ArrayList;

public class DiceCombination {
    public static void diceCombinations(String processed, int unprocessed){
        if(unprocessed == 0){
            System.out.println(processed);
            return;
        }
        
        for (int i = 1; i < 6 && i <= unprocessed; i++) {
            diceCombinations(processed + i, unprocessed - i);
        }
    }

    public static ArrayList<String> diceCombo(String processed, int unprocessed){
        if(unprocessed == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();        
        for (int i = 1; i < 6 && i <= unprocessed; i++) {
            list.addAll(diceCombo(processed + i, unprocessed - i));
        }
        return list;
    }

    // Die with given face value
    public static void diceComboFace(String processed, int unprocessed, int face){
        if(unprocessed == 0){
            System.out.println(processed + " ");
            return;
        }

        for (int i = 1; i < face && i <= unprocessed; i++) {
            diceComboFace(processed + i, unprocessed - i, face);
        }
    }

    public static void main(String[] args) {
        int diceValue = 14;
        int face = 6;
        // diceCombinations("", diceValue);
        // System.out.println(diceCombo("", diceValue));
        
        diceComboFace("", diceValue, face);
    }
}
