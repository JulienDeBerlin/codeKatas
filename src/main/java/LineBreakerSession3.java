public class LineBreakerSession3 {

    public static String reduce (String originalText, int maxLenghtForEachLine){
        StringBuilder editedText = new StringBuilder();
        String textStillToBeEdited = originalText;

        while (textStillToBeEdited.length()>0){

            if ( textStillToBeEdited.length() <= maxLenghtForEachLine){
                editedText.append(textStillToBeEdited);
                textStillToBeEdited = "";
            }

            else {
                String extract = textStillToBeEdited.substring(0, maxLenghtForEachLine);
                if (textStillToBeEdited.charAt(maxLenghtForEachLine)==' '){
                    editedText.append(extract).append("\n");
                    textStillToBeEdited = textStillToBeEdited.substring(extract.length()+1);
                }

                else if (extract.contains(" ")){
                    String subExtract = extract.substring(0, extract.lastIndexOf(" "));
                    editedText.append(subExtract).append("\n");
                    textStillToBeEdited = textStillToBeEdited.substring(subExtract.length()+1);
                }

                else {
                    editedText.append(extract).append("\n");
                    textStillToBeEdited = textStillToBeEdited.substring(extract.length());
                }
            }
        }
        return editedText.toString();
    }
}
