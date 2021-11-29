package co.edu.unbosque.model;

import java.io.IOException;  
import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class CreatePdf
{  
	
	private PDDocument documento;
	private PDPage pagina;
	private PDPageContentStream contenido;

	
	public CreatePdf() throws IOException 
	{
		pagina = new PDPage(PDRectangle.A6);
		documento = new PDDocument();
		contenido = new PDPageContentStream(documento, pagina);
	}
		
	public String CrearPdfConsultaClientes(String texto) throws IOException {

		
		documento.addPage(pagina);
		contenido.beginText();
		contenido.setFont(PDType1Font.COURIER, 12);
		contenido.newLineAtOffset(20, pagina.getMediaBox().getHeight()-52);
		contenido.showText(texto);
		contenido.endText();
		
		contenido.close();
		
		documento.save("//D:\\\\Desktop\\\\DetalleClientes.pdf");  
		
		
		System.out.println("PDF created");
		
		return "PDF created";
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
