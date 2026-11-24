public class Node {
    public int nodeID; 
    public int x; 
    public int y; 
    public String type; //Start, end or neither
    public enum nodeState {UNVISITED, VISITED, ELIGIBLE, INELIGIBLE};
    private nodeState state;

    public Node(int id, int x, int y, String Type) {
        this.nodeID = id;
        this.x = x;
        this.y = y;
        this.type = Type;
        this.state = nodeState.UNVISITED;
    }

    public int getnodeID(){
        return nodeID;
    }
    public String getType(){
        return type;
    }
    public nodeState getState(){
        return state;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setState(nodeState newState){
        this.state = newState;
    }
    public void setType(String newType){
        this.type = newType;
    }

//Method for deciding if start/end node or not, need maze data to finish
    /* public boolean isStartNode(){
        if (this.type == "start"){
            return true;
        }
        else{
            return false;
        }
        public boolean isEndNode(){
            if (this.type == "end"){
                return true;
            }
            else{
                return false;
            }
        }
     */
}
