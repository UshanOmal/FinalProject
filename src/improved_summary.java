import java.io.FileNotFoundException;
import java.io.IOException;

class improved_summary {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        SummaryTool summary = new SummaryTool();
        summary.init();
        summary.extractSentenceFromContext();
        summary.groupSentencesIntoParagraphs();
        summary.printSentences();
        summary.createIntersectionMatrix();

        //System.out.println("INTERSECTION MATRIX");
        //summary.printIntersectionMatrix();

        summary.createDictionary();
        //summary.printDicationary();

        System.out.println("FULL NOTE");
        summary.createSummary();
        summary.printSummary();

        summary.printStats();
    }
}
