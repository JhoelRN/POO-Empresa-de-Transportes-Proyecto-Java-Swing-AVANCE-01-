/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;




//librerias para XML
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;



public class ColeccionPersonas {
    
    public static List<Persona> listaPersonas = new ArrayList<Persona>();
    //CONSTRUCTOR STATIC
    static{
        //recordar que         public Administrador(int dni, String nombre, String apellido, String username, String correo, String password, int accesibilidad) 
        listaPersonas.add(new Administrador(73653000,"Jhoel Rene","Mamani Huanca","jhoelrn","","",1));//0
        listaPersonas.add(new Administrador(73653000,"Jhoel Rene","Mamani Huanca","jhoelrn","u17106156@utp.edu.pe","jhoelrn123",1));//1
        listaPersonas.add(new Administrador(73653001,"Alonso","Huayta Fuentes","alonso","U18103716@utp.edu.pe","alonso123",1));//2
        listaPersonas.add(new Administrador(73653002,"Kevin Antony","Samillan Yupanqui","kevin","kevin@hotmail.com","kevin123",1));//3
        listaPersonas.add(new Administrador(73653003,"Alexander","Gutierrez Maldonado","alexander","alexander@hotmail.com","alexander123",1));//4
        listaPersonas.add(new Administrador(73653004,"Johan Edson","Castañeda Ponce","johan","johan@outlook.com","johan123",1));//5
        listaPersonas.add(new Administrador(73653005,"Jean","Perez Quijia","jean","jean@ieee.org.pe","jean123",1));//6
        
    }
    
    
    
    public void GenerarXMLpersonas(){ //METODO PARA GENERAR A LA LISTA DE PERSONAS AGREGADAS QUE SE TIENE EN LA APLICACIÓN A XML
        
        String nomArchivo = "Personas";
        
        try{
            crearXML(nomArchivo,listaPersonas);
            //leerXML();
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    
    public void crearXML(String nomArchivo, List<Persona> listaUsuarios) throws ParserConfigurationException, TransformerException{ //metodo 1: 
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            
            Document document = implementation.createDocument(null, nomArchivo, null);
            
            //NODO RAIZ
            Element raiz = document.getDocumentElement();
            
            for (int i = 0; i < listaPersonas.size(); i++) {
                Element itemNode = document.createElement("PERSONA");
                
                Element nombreNode = document.createElement("NOMBRE");
                Text nodeNombreValue = document.createTextNode("" + listaPersonas.get(i).getNombre());
                nombreNode.appendChild(nodeNombreValue);
                
                Element apellidoNode = document.createElement("APELLIDO");
                Text nodeApellidoValue = document.createTextNode(listaPersonas.get(i).getApellido());
                apellidoNode.appendChild(nodeApellidoValue);
                
                Element dniNode = document.createElement("DNI");
                Text nodeDniValue = document.createTextNode(Integer.toString(listaPersonas.get(i).getDni()));
                dniNode.appendChild(nodeDniValue);
                
                Element usernameNode = document.createElement("USERNAME");
                Text nodeUsernameValue = document.createTextNode(listaPersonas.get(i).getUsername());
                usernameNode.appendChild(nodeUsernameValue);
                
                Element correoNode = document.createElement("CORREO");
                Text nodeCorreoValue = document.createTextNode(listaPersonas.get(i).getCorreo());
                correoNode.appendChild(nodeCorreoValue);
                
                Element passwordNode = document.createElement("PASSWORD");
                Text nodePasswordValue = document.createTextNode(listaPersonas.get(i).getPassword());
                passwordNode.appendChild(nodePasswordValue);
                
                itemNode.appendChild(nombreNode);
                itemNode.appendChild(apellidoNode);
                itemNode.appendChild(dniNode);
                itemNode.appendChild(usernameNode);
                itemNode.appendChild(correoNode);
                itemNode.appendChild(passwordNode);
                
                raiz.appendChild(itemNode);
     
            }
            
            // GENERAR XML
            Source source = new DOMSource(document);
            
            //LUGAR DONDE SE GUARDA
            Result result = new StreamResult(new java.io.File(nomArchivo + ".xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
        
        } catch(ParserConfigurationException e){
            Logger.getLogger(ColeccionPersonas.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    
    
    
    
    
    
    
    
    
}
