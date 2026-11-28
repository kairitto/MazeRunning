public class Pathfinder
{
    /*
    To run, copy/paste into main:
    Pathfinder path = new Pathfinder(1,9);
    path.findSolution(0,1);
    System.out.println(Arrays.toString(path.getSolution()));
    */
    
    private int steps;
    private int index;
    private int startNode;
    private int endNode;
    private int[] unviableNodes;
    private int[] solution;
    private boolean solutionFound;
    
    //remove, for testing
    private int[] nodes = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] arc1 = new int[]{ 1, 1, 2, 3, 4, 5, 6, 6, 8 };
    private int[] arc2 = new int[]{ 3, 2, 4, 4, 5, 6, 7, 8, 9 };
    
    public Pathfinder(int start, int end)
    {
        steps = 1;
        this.startNode = start;
        this.endNode = end;
        this.unviableNodes = new int[nodes.length];
        this.unviableNodes[0] = startNode;
        this.index = 1;
        solutionFound = false;
    }
    
    public int[] getSolution()
    {
        return solution;
    }
    
    public void findSolution(int lastNode, int currentNode)
    {
        int[] nodePossible = findNextNode(currentNode);
        for(int i = 0; i < nodePossible.length; i++)
        {
            if(isNewNode(nodePossible[i]))
            {
                unviableNodes[index++] = nodePossible[i];
                if(nodePossible[i] == endNode)
                {
                    steps++;
                    solutionFound = true;
                    solution = new int[steps];
                    steps--;
                    
                    solution[steps] = nodePossible[i];
                    steps--;
                    
                    solution[steps] = currentNode;
                    steps--;
                    return;
                }
                steps++;
                findSolution(currentNode, nodePossible[i]);
                if(solutionFound)
                {
                    solution[steps] = currentNode;
                    steps--;
                    return;
                }
            }
        }
        steps--;
        if(currentNode == startNode)
        {
            solution = new int[]{ -1 };
        }
    }
    
    public int[] findNextNode(int currentNode)
    {
        int[] index = new int[4];
        int arcIndexNum = 0;
        int indexFound = 0;
        for(int i = 0; i < arc1.length; i++) //find arcs
        {
            if(currentNode == arc1[i] || currentNode == arc2[i])
            {
                index[arcIndexNum++] = i;
                indexFound++;
            }
        }
        
        int[] possibleNodes = new int[indexFound];
        if(indexFound != 0)
        {
            for(int i = 0; i < possibleNodes.length; i++)
            {
                if(arc1[index[i]] != currentNode)
                {
                    possibleNodes[i] = arc1[index[i]];
                }
                else
                {
                    possibleNodes[i] = arc2[index[i]];
                }
            }
            return possibleNodes;
        }
        else
        {
            return new int[]{ -1 };
        }
    }
    
    public boolean isNewNode(int node)
    {
        for(int i = 0; i < unviableNodes.length; i++)
        {
            if(node == unviableNodes[i])
            {
                return false;
            }
        }
        return true;
    }
}