package co.edu.unbosque.model;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;

public class CreatePdf
{  
	
	private PDDocument documento;
	private PDPage pagina;
	private PDPageContentStream contenido;
	
	private PDDocument documento1;
	private PDPage pagina1;
	private PDPageContentStream contenido1;
	
	private PDDocument documento2;
	private PDPage pagina2;
	private PDPageContentStream contenido2;
	
	private String NombreArchivo;

	
	
	
	public CreatePdf() throws IOException 
	{
		pagina = new PDPage(PDRectangle.A6);
		documento = new PDDocument();
		contenido = new PDPageContentStream(documento, pagina);
		
		pagina1 = new PDPage(PDRectangle.A6);
		documento1 = new PDDocument();
		contenido1 = new PDPageContentStream(documento1, pagina1);
		
		pagina2 = new PDPage(PDRectangle.A6);
		documento2 = new PDDocument();
		contenido2 = new PDPageContentStream(documento2, pagina2);
			
	}
	
	public File guardarArchivo() {

		JFileChooser file = new JFileChooser();
		file.showSaveDialog(file);
		File guardar = file.getSelectedFile();
		

		return guardar;
	}
	
	
	public String Obtenernombre() 
	{
		
		NombreArchivo = guardarArchivo()+".pdf";
		
		return NombreArchivo;
		
	}
		
	public String CrearPdfConsultaClientes(String texto) throws IOException {

		
		documento.addPage(pagina);
		contenido.beginText();
		contenido.setFont(PDType1Font.COURIER, 8);
		
		contenido.newLineAtOffset(2, pagina.getMediaBox().getHeight()-20);
		contenido.showText(texto);
		contenido.endText();
		
		contenido.close();
		
		documento.save(Obtenernombre());
		
		

		
		return "PDF created";
	}
	
	public String CrearPdfConsultaDetallesClientes(String texto) throws IOException {

		
		documento1.addPage(pagina1);
		contenido1.beginText();
		contenido1.setFont(PDType1Font.COURIER, 12);
		contenido1.newLineAtOffset(20, pagina1.getMediaBox().getHeight()-52);
		contenido1.showText(texto);
		contenido1.endText();
		
		contenido1.close();
	
		documento1.save(Obtenernombre());
		
	
		return "PDF created";
	}
	
	public String CrearPdfConsultaProveedores(String texto) throws IOException {

		
		documento2.addPage(pagina2);
		contenido2.beginText();
		contenido2.setFont(PDType1Font.COURIER, 12);
		contenido2.newLineAtOffset(20, pagina2.getMediaBox().getHeight()-52);
		contenido2.showText(texto);
		contenido2.endText();
		
		contenido2.close();
		
		documento2.save(Obtenernombre()); 
		
	
		
		return "PDF created";
	}
	
	public String remove(String test) {
        
		test = test.replace("\n", "").replace("\r", "");
		return test;
		
//		StringBuilder b = new StringBuilder();
//        for (int i = 0; i < test.length(); i++) {
//            if (WinAnsiEncoding.INSTANCE.contains(test.charAt(i))) {
//                b.append(test.charAt(i));
//            }
//        }
//        return b.toString();
    
	}
	
	

	public PDDocument getDocumento() {
		return documento;
	}

	public PDPage getPagina() {
		return pagina;
	}

	public PDPageContentStream getContenido() {
		return contenido;
	}

	public void setDocumento(PDDocument documento) {
		this.documento = documento;
	}

	public void setPagina(PDPage pagina) {
		this.pagina = pagina;
	}

	public void setContenido(PDPageContentStream contenido) {
		this.contenido = contenido;
	}
	
	
	
}  
