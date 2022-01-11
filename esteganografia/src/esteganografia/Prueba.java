package esteganografia;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Prueba {
    //Variable que permite conocer el nombre de usuario de cada pc
    static String path = System.getProperty("user.home");
    
    public static void main(String[] args) throws IOException {
        //Se hace visible la interfaz
        VentanaPrincipal a = new VentanaPrincipal();
        a.setVisible(true);
    }

    public static void encriptacion(String file, String image) throws IOException, Exception {
        String message = readMessage(file);

        BufferedImage bufferedImage = ImageIO.read(new File(image));

        if(((bufferedImage.getWidth()*bufferedImage.getHeight())/8) -1 < message.length()){
            throw new IOException();
        }else {
            BufferedImage bufferedImageARGB = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
            String binary = encriptar(message);
            int cont = 0;

            for (int i = 0; i < bufferedImage.getWidth(); i++) {
                for (int j = 0; j < bufferedImage.getHeight(); j++) {
                    Color color = new Color(bufferedImage.getRGB(i, j));
                    Color newColor;
                    if (cont == binary.length()) {
                        newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 253);
                    } else if (cont < binary.length()) {
                        int aux = Integer.parseInt(binary.substring(cont, cont + 1));
                        newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255 - aux);
                    } else {
                        newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
                    }
                    bufferedImageARGB.setRGB(i, j, newColor.getRGB());
                    cont++;
                }
            }
           
            File encrypt = new File(nameFile(image));

            ImageIO.write(bufferedImageARGB, "png", encrypt);
        }
        
    }
    
    public static String nameFile(String direccionImagen){
        String direccionTxt = "";
        String[] path = direccionImagen.split("\\\\");
        String[] nameFile = path[path.length-1].split("\\.");
        String aux = nameFile[0] + "Encriptado.png"; 
        path[path.length-1] = aux;
        for(String auxPath : path){
            direccionTxt += auxPath + "/";
        }
        direccionTxt = direccionTxt.substring(0, direccionTxt.length()-1);
        return direccionTxt;
    }

    public static String encriptar(String message){

        byte[] bytes = message.substring(0,message.length()-1).getBytes(StandardCharsets.US_ASCII);

        java.util.List<String> listASCII = new ArrayList<String>();

        for (byte i : bytes) {
            listASCII.add(Integer.toBinaryString(i));
        }

        return binario(listASCII);

    }


    public static String binario(List<String> list){

        StringBuilder message = new StringBuilder();
        for (String ascii : list) {
            int aux = 8-ascii.length();
            for(int i = 0; i < aux; i++) {
                ascii = "0"+ascii;
            }
            message.append(ascii);
        }
        return message.toString();
    }

    public static void desencriptacion(String imagen, String archivo) throws IOException {
        System.out.println("Oaaaa");
        if(imagen == null || archivo == null){
            throw new NullPointerException();
        }
        BufferedImage bufferedImage = ImageIO.read(new File(imagen));
        String message = "";
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < bufferedImage.getWidth(); i++) {
            for(int j = 0; j < bufferedImage.getHeight(); j++){
                Color color = new Color(bufferedImage.getRGB(i,j), true);
                if(color.getAlpha() == 253){
                    desencriptar(list,archivo);
                    //System.out.println(list);
                    return;
                }
                
                message += 255- color.getAlpha();
                
                if((j+1)%8==0){
                    list.add(message);
                    message = "";
                }
            }
            
        }
       
        
    }

    
    public static void desencriptar(List<String> message, String ruta) throws IOException{
        String mensaje = convertBinary(message);
        
        //Se escribe el archivo con el texto desencriptado
        FileWriter archivo = null;
        PrintWriter escritor = null;
        try{
            archivo = new FileWriter(ruta);
            escritor = new PrintWriter(archivo);
            
            escritor.println(mensaje);
        }catch(IOException e){
            System.out.println("Ha ocurrido un error, revise los datos proporcionados");
        }finally{
            archivo.close();
        }
        
    }

    public static String convertBinary(List<String> list){
        StringBuilder message = new StringBuilder();

        for(String character : list){
            message.append((char) Integer.parseInt(character.substring(0,8), 2));
        }
        return message.toString();
    }


    public static String readMessage(String name) throws Exception{
        String message = "";
        String line;
        if(name == null){
            throw new NullPointerException();
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(name))){
            while((line = reader.readLine()) != null){
                message += line + " ";
            }
        }catch (IOException e) {
        }
        return message;
    }

}
