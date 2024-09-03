package org.example;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PDDocument documento = new PDDocument();
        PDPage pagina = new PDPage();

        documento.addPage(pagina);


        PDPageContentStream stream = new PDPageContentStream(documento, pagina);
        stream.beginText();
        stream.setFont(new PDType1Font(Standard14Fonts.FontName.TIMES_ROMAN), 16);
        stream.newLineAtOffset(200,500);
        stream.showText("Olá mundo!");
        stream.newLineAtOffset(0, -30);
        stream.showText("Teste!");
        stream.endText();
        stream.close();

        documento.save("Teste.pdf");
    }
}