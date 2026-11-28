public class Node {
    private int id;
    private int x;
    private int y;
    private String type;

    public Node(int id, int x, int y, String type) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public String toString() {
        return "Node ID: " + id + " Location: " + x + "," + y + " Type: " + type;
        }
    }
