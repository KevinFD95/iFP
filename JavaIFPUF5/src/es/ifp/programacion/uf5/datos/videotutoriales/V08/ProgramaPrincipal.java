package es.ifp.programacion.uf5.datos.videotutoriales.V08;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
//import org.xml.sax.SAXEception;

/**
 * Documentos XML
 * 
 * Clase que abre un fichero XML, lo recorre y lee sus etiquetas y valores.
 * El fichero se llama alumnos.xml y se encuentra en la raiz del proyecto
 * Contiene informacion de alumnos
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		File file = new File("alumnos.xml");
		
		//Crear una instancia para trabajar con el documento
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//Creo una instancia DocumentBuilder para parsear el documento XML
		DocumentBuilder db;
		Document doc;
		
		try {
			db = dbf.newDocumentBuilder();
			doc = db.parse(file);
			
			doc.getDocumentElement().normalize();
			
			System.out.println("Elemento raiz: "+doc.getDocumentElement().getNodeName());
			
			NodeList nodeList = doc.getElementsByTagName("estudiante");
			
			int size = nodeList.getLength();
			
			Node nodo;
			
			for (int i=0;i<size;i++) {
				nodo = nodeList.item(i);
				
				if (nodo.getNodeType() == Node.ELEMENT_NODE) { //Tiene elementos hijos
					Element eElement = (Element)nodo;
					String tmp;
					
					tmp = eElement.getElementsByTagName("id").item(0).getTextContent();
					System.out.println("ID Alumno: "+tmp);
					
					tmp = eElement.getElementsByTagName("nombre").item(0).getTextContent();
					System.out.println("Nombre: "+tmp);
					
					tmp = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
					System.out.println("Apellidos: "+tmp);
					
					tmp = eElement.getElementsByTagName("nota").item(0).getTextContent();
					System.out.println("Nota: "+tmp);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Se ha producido un error al parsear el documento.");
		}
	}
}
