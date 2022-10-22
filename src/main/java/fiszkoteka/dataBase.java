package fiszkoteka;

public class dataBase {


    private String[][] dataWords = {{"scattered " , "rozsiany"},{"ordinary ","zwykly"},
            {"glaciers ", "lodowiec", } , {"pathetic" , "zalosne"}, {"courage" ,"odwaga"},
            {"deprecated ", "przestarzałe"},{"stockholders", "udzialowcy"}, {
        "handled ", "obslugiwanie"}, {"resembles", " przypomina, byc podobnym"}};
   final int WORDSARRAYRANGE = dataWords.length;

    public String getDataWords(int a, int b) {
        return dataWords[a][b];
    }
}