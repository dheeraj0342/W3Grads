package Class_Code.BinaryTree;

public class BinaryTree{

    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public  static Node createTree(int i,int[] arr){
        if(i>=arr.length || arr[i]==-1) return null;
        Node node = new Node(arr[i]);
        node.left = createTree(2*i+1, arr);
        node.right = createTree(2*i+2, arr);
        return node;
    }

   public static int Depth(Node root){
        if(root==null){
            return 0;
        }
        int left = Depth(root.left);
        int right = Depth(root.right);
        return Math.max(left,right)+1;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }

    // find maximum element in a binary tree
    public static int maxElement(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int left = maxElement(root.left);
        int right = maxElement(root.right);
        return Math.max(root.val,Math.max(left,right));
    }


    public static int sumOfNodes(Node root){
        if(root == null)
            return 0;
        int l = sumOfNodes(root.left);
        int r = sumOfNodes(root.right);
        return root.val + l+r;
    }

    public static boolean isIdentical(Node root1 , Node root2){
        if(root1==null && root2 ==null) return true;
        if(root1 ==null || root2==null)return false;
        if(root1.val != root2.val) return false;
       return isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);

    }

    public static void main(String[] args){
        int[] arr = {7,8,17,10,-1,5,6};
        int[] arr2 = {7,8,10,17};
        Node root = createTree(0,arr);
        Node root2 = createTree(0,arr2);
        preOrder(root);
        System.out.println();
        System.out.println(Depth(root));
        System.out.println(height(root));
        System.out.println(maxElement(root));
        System.out.println(sumOfNodes(root));
        System.out.println(isIdentical(root,root2));

    }

}
