public class LineBreakerSession2 {

    public static String reduce(String originalText, int maxLineLenght) {

        String textStillToBeEdited = originalText;
        String editedText = "";

        while (textStillToBeEdited.length() > 0) {

            if (textStillToBeEdited.length() <= maxLineLenght) {
                editedText += textStillToBeEdited + "\n";
                textStillToBeEdited = "";
            } else {

                String extract = textStillToBeEdited.substring(0, maxLineLenght);

                if (textStillToBeEdited.charAt(maxLineLenght) == ' ' || !extract.contains(" ")) {
                    editedText += extract + "\n";
                    textStillToBeEdited = textStillToBeEdited.substring(maxLineLenght+1);

                } else {
                    editedText += extract.substring(0, extract.lastIndexOf(" ")) + "\n";
                    textStillToBeEdited = textStillToBeEdited.substring(extract.lastIndexOf(" ")+1);
                }
            }
        }
        return editedText;

    }

}
