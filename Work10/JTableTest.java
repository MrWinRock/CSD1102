import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class JTableTest {

    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {

            public void run() {
                new JTableTest().createUI();
            }
        };

        EventQueue.invokeLater(r);
    }

    private void createUI() {

        try {
            JFrame frame = new JFrame();
            frame.setLayout(new BorderLayout());

            JTable table = new JTable();

            String readLine = null;

            File file = new File("JTableTest.txt");

            FileReader reader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(reader); // Need to close this

            List<Dentry> studentList = new ArrayList<Dentry>();
            while ((readLine = bufReader.readLine()) != null) {
                String[] splitData = readLine.split(";");

                Dentry dentry = new Dentry();
                dentry.setName(splitData[0]);
                dentry.setNumbers(Arrays.copyOfRange(splitData, 1, splitData.length));
                studentList.add(dentry);
            } // End While

            bufReader.close();

            DatabaseTableModel tableModel = new DatabaseTableModel();
            tableModel.setList(studentList);////////////
            table.setModel(tableModel);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new JScrollPane(table));
            frame.setTitle("File to JTable");
            frame.pack();
            frame.setVisible(true);

        } catch (IOException ex) {
        }
    }

    class Dentry {

        private String name;
        private String[] number;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber(int index) {
            String value = null;
            if (index >= 0 && index < number.length) {
                value = number[index];
            }
            return value;
        }

        public void setNumbers(String... number) {
            this.number = number;
        }
    }

    class DatabaseTableModel extends AbstractTableModel {

        private List<Dentry> list = new ArrayList<Dentry>();
        private String[] columnNames = { "TH1", "TH2", "TH3", "TH4", "TH5", "TH6" };

        public void setList(List<Dentry> list) {
            this.list = list;
            fireTableDataChanged();
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        public int getRowCount() {
            return list.size();
        }

        public int getColumnCount() {
            return columnNames.length;
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return list.get(rowIndex).getName();

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return list.get(rowIndex).getNumber(columnIndex - 1);

                default:
                    return null;
            }
        }
    }
}