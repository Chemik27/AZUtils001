import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFMergerUtility;

import java.io.File;
import java.io.IOException;

public class Main {

    public void main(String[] args) throws IOException, COSVisitorException {

        String pathfile = "/home/kari/Descargas/VolanteDePago.pdf";
        File file = new File(pathfile);
        quitarSeguridad(file);


    }

    public void  quitarSeguridad(File file) throws IOException, COSVisitorException {

        PDDocument pdDoc = PDDocument.load(file);
        pdDoc.setAllSecurityToBeRemoved(true);
        System.out.println("SACANDO LA SEGURIDAD DEL PDF");
        pdDoc.save(String.valueOf(file));
    }


    public static void concatenar(){

                PDFMergerUtility ut = new PDFMergerUtility();

    /*  Archivos a Concatenar*/
                ut.addSource("/home/redbee/Descargas/PDFAZ/Poliza01.pdf");
                ut.addSource("/home/redbee/Descargas/PDFAZ/PolizaResult0102.pdf");

    /*       Destino FILE */
                ut.setDestinationFileName("/home/redbee/Descargas/PDFAZ/PolizaResult04.pdf");
                ut.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());

    }

    public void borrarPag(){

//        PDDocument pdDoc = PDDocument.load(file);
//        pdDoc.removePage(1);
//        pdDoc.setAllSecurityToBeRemoved(true);
//        pdDoc.save(file);

    }
    public void encode(){
        //  **ENCODE BASE64**

         /* Encode a file and write the encoded output to a text file. */
//        encode("/home/redbee/Descargas/Fotomulta-142409.pdf", "/home/redbee/Descargas/encoded.txt", IS_CHUNKED);


    }

//    private static void encode(String sourceFile, String targetFile, boolean isChunked) throws Exception {
//
//        byte[] base64EncodedData = Base64.encodeBase64(loadFileAsBytesArray(sourceFile), isChunked);
//
//        writeByteArraysToFile(targetFile, base64EncodedData);
//    }
//
//    public static void decode(String sourceFile, String targetFile) throws Exception {
//
//        byte[] decodedBytes = Base64.decodeBase64(loadFileAsBytesArray(sourceFile));
//
//        writeByteArraysToFile(targetFile, decodedBytes);
//    }
//
//     * This method loads a file from file system and returns the byte array of the content.
//    public static byte[] loadFileAsBytesArray(String fileName) throws Exception {
//
//        File file = new File(fileName);
//        int length = (int) file.length();
//        BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file));
//        byte[] bytes = new byte[length];
//        reader.read(bytes, 0, length);
//        reader.close();
//        return bytes;
//    }
//     * This method writes byte array content into a file.
//    public static void writeByteArraysToFile(String fileName, byte[] content) throws IOException {
//
//        File file = new File(fileName);
//        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));
//        writer.write(content);
//        writer.flush();
//        writer.close();
//    }

    public void decode(){


    }
}
