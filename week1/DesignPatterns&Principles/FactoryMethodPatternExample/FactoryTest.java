public class FactoryTest {
    public static void main(String args[]){
        DocumentFactory wordfactory = new WordFactory();
        Document word = wordfactory.createDocument();
        word.open();

        DocumentFactory pdffactory = new PdfFactory();
        Document pdf = pdffactory.createDocument();
        pdf.open();

        DocumentFactory excelfactory = new ExcelFactory();
        Document excel = excelfactory.createDocument();
        excel.open();
    }
}
