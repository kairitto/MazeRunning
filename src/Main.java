public static void main(String [] args) {

    FileHandler fileHans = new FileHandler();
    Node[] nodes = fileHans.readNodes("sample_maze5.nodes.txt");
    Arc[] arcs = fileHans.readArcs("sample_maze5.arcs.txt");

    System.out.println("Nodes: " + nodes.length);
    for (int i = 0; i < nodes.length; i++) {
        System.out.println("Index: " + i + " " + nodes[i]);
    }
    System.out.println("Arcs: " + arcs.length);
    for (int i = 0; i < arcs.length; i++) {
        System.out.println("Index: " + i + " " + arcs[i]);
    }
}
