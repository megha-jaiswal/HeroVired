class TreeNode
{
    String word;
    TreeNode left;
    TreeNode right;
    int frequency;

    public TreeNode(String word) {
        this.word = word;
        this.frequency =1;
        this.left=null;
        this.right=null;
    }
}

class WordCounter{
    TreeNode root;

    public WordCounter() {
        this.root = null;
    }

    public TreeNode insert(String word, TreeNode root)
    {
//        TreeNode newnode = new TreeNode(word);
        if(root==null)
        {
            return new TreeNode(word);
        }
        int result = word.compareTo(root.word);
        if(result>0)
        {
            root.right=insert(word,root.right);
        }else if(result<0){
            root.left=insert(word,root.left);
        }else{
            root.frequency ++;
        }
        return root;
    }

    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.println(root.word + ": " + root.frequency);
            inOrderTraversal(root.right);
        }
    }
    public void splittingLine(String text){
        String [] arr = text.split("[\\s.,;]+");
        for (String i :arr) {
            if(!i.isEmpty()){
                root= insert(i.toLowerCase(),root);
            }
        }
    }
    public void printingTree()
    {
        inOrderTraversal(root);
    }


}
public class FrequencyCounter {

    public static void main(String[] args) {
        String text= "Hi We hi are in FSD in";

        WordCounter wordCounter = new WordCounter();
        wordCounter.splittingLine(text);

        wordCounter.printingTree();

    }
}