import java.io.*;

class Output {
    static void output() {
      // output
    OutputStream os = System.out;
    // os.write(😍); // range is exceeded

    try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
      osw.write("Hello World");
      osw.write(97);
      osw.write(10);
      osw.write('A');
      osw.write('\n');
      char[] arr = "hello world".toCharArray();
      osw.write(arr);
      // osw.write(😍);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    try (FileWriter fw = new FileWriter("note.txt", true)) {
      fw.write("this should be appended");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
      bw.write("Hare Krishna");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    }
}