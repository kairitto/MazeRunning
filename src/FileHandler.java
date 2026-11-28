import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class FileHandler {

    public int countTxtLines(String fileName) {
        int count = 0;
        try {
            Scanner fileReader = new Scanner(new File(fileName));

            while (fileReader.hasNextLine()) {
                fileReader.nextLine();
                count++;
            }

            return count;

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR - Unable to locate file: " + fileName);
        }
        return 0;
    }

    public Node[] readNodes(String fileName) {

        int count = countTxtLines(fileName);
        int index = 0;
        Node[] nodes = new Node[count];

        try {
            Scanner nodeReader = new Scanner(new File(fileName));
            while (nodeReader.hasNextLine()) {
                String line = nodeReader.nextLine();
                String[] tokens = line.split(",");
                String type;
                int id = Integer.parseInt(tokens[0]);
                int x = Integer.parseInt(tokens[1]);
                int y = Integer.parseInt(tokens[2]);

                if (tokens.length == 4) {
                    type = tokens[3];
                } else {
                    type = "Regular";
                }

                nodes[index] = new Node(id, x, y, type);
                index++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR - Unable to locate file: " + fileName);
        }
        return nodes;
    }


    public Arc[] readArcs(String fileName){

                int count = countTxtLines(fileName);
                int index = 0;
                Arc[] arcs = new Arc[count];
        try {
             Scanner arcReader = new Scanner(new File(fileName));
             while (arcReader.hasNextLine()) {
                String line = arcReader.nextLine();
                String[] tokens = line.split(",");
                int firstNode = Integer.parseInt(tokens[0]);
                int secondNode = Integer.parseInt(tokens[1]);
                double arcLength = Double.parseDouble(tokens[2]);

                arcs[index] = new Arc(firstNode,secondNode, arcLength);
                index++;

             }
        } catch (FileNotFoundException ex) {
                System.out.println("ERROR - Unable to locate file: " +fileName);
        } return arcs;
    }
}



