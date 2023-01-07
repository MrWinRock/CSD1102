import javax.swing.*;

public class JTextArea1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(null);
        JTextArea textarea = new JTextArea();
        textarea.setText("Hello");
        textarea.append(" World");
        textarea.insert("Java", 0);
        JScrollPane textareaScroll = new JScrollPane(textarea);
        textareaScroll.setLocation(10, 10);
        textareaScroll.setSize(240, 120);
        f.add(textareaScroll);
        f.setTitle("ปฏิวัฒน์ กฤษฏิ์สุภารัตน์");
        f.setSize(500, 300);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
