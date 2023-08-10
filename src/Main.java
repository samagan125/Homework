import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

          try {
                FileWriter fileWriter = new FileWriter("java.txt");
                fileWriter.append(": A a\n");
                fileWriter.append(": B b\n");
                fileWriter.append(": C c\n");
                fileWriter.append(": D d\n");
                fileWriter.append(": E e\n");
                fileWriter.append(": F f\n");
                fileWriter.append(": G g\n");
                fileWriter.append(": H h\n");
                fileWriter.append(": I i\n");
                fileWriter.append(": J j\n");
                fileWriter.append(": K k\n");
                fileWriter.append(": L l\n");
                fileWriter.append(": M m\n");
                fileWriter.append(": N n\n");
                fileWriter.append(": O o\n");
                fileWriter.append(": P p\n");
                fileWriter.append(": Q q\n");
                fileWriter.append(": R r\n");
                fileWriter.append(": S s\n");
                fileWriter.append(": T t\n");
                fileWriter.append(": U u\n");
                fileWriter.append(": V v\n");
                fileWriter.append(": W w\n");
                fileWriter.append(": X x\n");
                fileWriter.append(": Y y\n");
                fileWriter.append(": Z z\n");
                fileWriter.write(": "+0+"\n");
                fileWriter.write(": "+1+"\n");
                fileWriter.write(": "+2+"\n");
                fileWriter.write(": "+3+"\n");
                fileWriter.write(": "+4+"\n");
                fileWriter.write(": "+5+"\n");
                fileWriter.write(": "+6+"\n");
                fileWriter.write(": "+7+"\n");
                fileWriter.write(": "+8+"\n");
                fileWriter.write(": "+9+"\n");
                fileWriter.close();
          }catch (IOException e){
          }
          FileReader reader = new FileReader("java.txt");
          Scanner scan = new Scanner(reader);
          int a = 0;
          while (scan.hasNextLine()){
                a+=1;
                System.out.println(a+scan.nextLine());
          }reader.close();
    }
       }