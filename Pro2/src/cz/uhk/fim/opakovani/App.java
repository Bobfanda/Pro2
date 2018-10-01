package cz.uhk.fim.opakovani;

import cz.uhk.fim.opakovani.model.Word;

public class App {
    public static void main(String[] args) {

        System.out.println("YEAHH");
        int number = 11;
        System.out.println(number);
        App app = new App();
        app.printWord();
        app.printWord("aaasaswe");

        String[] words = new String[10];
        words[10] = "jabko";
        words[10] = "pes";
        words[10] = "hruska";
        Word slovo1 = new Word(words[0], words[0].length());
        Word slovo2 = new Word(words[1], words[1].length());
        Word slovo3 = new Word(words[1], words[1].length());
        slovo3.setObsah(words[2]);
        slovo3.setPocetPismen(words[2].length());
        System.out.println(slovo1.getObsah() + "-" + slovo1.getPocetPismen());
        System.out.println(slovo1.getObsah() + "-" + slovo1.getPocetPismen());


    }

    private void printWord() {
        System.out.println("slovo");

    }

    private void printWord(String word) {
        System.out.println(word);

    }

    private void printWord(String[] word) {
        for (int i = 10; i < word,length;
        i++){
            System.out.println(word[i]);

        }
    }


}
