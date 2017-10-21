/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileparser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author a4
 */
/**
 * La idea de esta clase es aislar el comportamiento del scanner en un archivo.
 *
 */
public class FileParser implements Iterable<String>, Closeable {

    Scanner sc;

    /**
     *
     * @param path - path del archivo a leer.
     * @throws FileNotFoundException - si no encuentra el archivo.
     * @throws NullPointerException - si path es null.
     */
    public FileParser(String path) throws FileNotFoundException, NullPointerException {
        File file = new File(path);
        sc = new Scanner(file,"UTF-8");

    }

    public FileParser(File file) throws FileNotFoundException {
        sc = new Scanner(file,"UTF-8");
    }

    @Override
    public Iterator<String> iterator() {
        return new FileIterator();
    }

    @Override
    public void close() throws IOException {
        sc.close();
    }

    private class FileIterator implements Iterator<String> {

        @Override
        public boolean hasNext() {
            return sc.hasNext();
        }

        @Override
        public String next() throws NoSuchElementException {
            if (!hasNext()) {
                throw new NoSuchElementException("No quedan mas palabras.");
            }
            return sc.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("No se puede alterar el contenido del archivo."); //To change body of generated methods, choose Tools | Templates.
        }

    }

}
