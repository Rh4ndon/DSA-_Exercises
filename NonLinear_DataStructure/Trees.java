class Trees{
    

   // tree node
   static class node  {
       public int data;
       public node left, right;
       public node(){
           data = 0;
           left = right = null;
       }

   }

// Function to get the count of nodes
// in complete binary tree
   static int totalNodes(node root)  {
       if (root == null)
           return 0;
    
       int l = totalNodes(root.left);
       int r = totalNodes(root.right);
    
       return 1 + l + r;
   }

// Helper function to allocate a new node
// with the given data
static node newNode(int data)
{
    node temp = new node();
    temp.data = data;
    temp.left = temp.right = null;
    return temp;
}


// Driver Code
public static void main(String args[])
{
    node root = newNode(1);
    root.left = newNode(2);
    root.right = newNode(3);
    root.left.left = newNode(4);
    root.left.right = newNode(5);
    root.right.left = newNode(9);
    root.right.right = newNode(8);
    root.left.left.left = newNode(6);
    root.left.left.right = newNode(7);
    System.out.println(totalNodes(root));
     
}

}
