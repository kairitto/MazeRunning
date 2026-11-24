public class Arc {
    public int nodeID1; 
    public int nodeID2;
    public int arcLength; 

    public Arc(int id1, int id2, int length) {
        this.nodeID1 = id1;
        this.nodeID2 = id2;
        this.arcLength = length;
    }

    public int getnodeID1(){
        return nodeID1;
    }

    public int getnodeID2(){
        return nodeID2;
    }

    public int getarcLength(){
        return arcLength;
    }

    public void setnodeID1(int newID){
        this.nodeID1 = newID;
    }

    public void setnodeID2(int newID){
        this.nodeID2 = newID;
    }
    
    public void setarcLength(int newLength){
        this.arcLength = newLength;
    }

}
