import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineBreakerSession1 {

    public static String editText(String originaltext, int maxLengthForEachLine) {
        int lenghtCurrentLine = 0;
        String editedText = "";

        for (String element : breakDownTextIntoSingleElements(originaltext,maxLengthForEachLine)) {
            if(lenghtCurrentLine + element.length() <= maxLengthForEachLine) {
                editedText += element + " ";
                lenghtCurrentLine += element.length()+1;
            }else {
                editedText += "\n"+element+" ";
                lenghtCurrentLine= element.length() +1;
            }
        }
        return editedText;
    }


    public static List<String> breakDownTextIntoSingleElements(String originaltext, int maxLengthForEachLine) {
        List<String> listElements = Arrays.asList(originaltext.split(" "));
        List<String> finalList = new ArrayList<>();
        for (String element : listElements) {
            if (element.length() <= maxLengthForEachLine) {
                finalList.add(element);
            } else {
                finalList.addAll(reduceTooLongWord(element, maxLengthForEachLine));
            }
        }
        return finalList;
    }


    private static List<String> reduceTooLongWord(String word, int maxLengthForEachLine) {
        char[] wordAsCharArray = word.toCharArray();
        int counter = 0;
        String string = "";
        for (int i = 0; i < wordAsCharArray.length; i++) {
            if (counter < maxLengthForEachLine) {
                string += wordAsCharArray[i];
                counter++;
            } else {
                counter = 0;
                string += " " + wordAsCharArray[i];
                counter++;
            }
        }
        return Arrays.asList(string.split(" "));
    }

}


