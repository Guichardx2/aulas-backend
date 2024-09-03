package br.net.venson.spring_semana05.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/olaMundo")
    public String olaMundo(@RequestParam String aluno){
        return "Olá, " + aluno + "!";
    } //?aluno={nome}

    @GetMapping("/gerarPDF")
    public String gerarPDF() throws IOException {
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

        return "Olá mundo!";
    }
}