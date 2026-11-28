public class Arc {
    int firstNode;
    int secondNode;
    double arcLength;

    public Arc(int firstNode, int secondNode, double arcLength) {
        this.firstNode = firstNode;
        this.secondNode = secondNode;
        this.arcLength = arcLength;
    }

    public String toString() {
        return "First: " + firstNode + " Second: " + secondNode + " Length: " + arcLength;
    }

}

