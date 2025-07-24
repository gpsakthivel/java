package interfaces.types;

import java.io.*;

// Serializable
class Save implements Serializable {
    int i;
}

public class MarkerInterfaceDemo {
    public static void main(String[] args) throws Exception {
        Save obj1 = new Save();
        obj1.i = 10;
        System.out.println(obj1.i);

        File f = new File("myfile.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj1);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj2 = (Save) ois.readObject();
    }
}
