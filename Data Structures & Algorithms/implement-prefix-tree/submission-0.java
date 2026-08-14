class PrefixTree {
    private TrieNode root = new TrieNode();

    public PrefixTree() {
         
    }

    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            int index = word.charAt(i) - 'a';
            if(curr.child[index] == null){
                curr.child[index] = new TrieNode();
            }
            curr = curr.child[index];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
            TrieNode curr = root;
            for(int i = 0; i < word.length(); i++){
                int index = word.charAt(i) - 'a';
                if(curr.child[index] == null){
                    return false;
                }
                curr = curr.child[index];
            }
            return curr.isWord;
    }

    public boolean startsWith(String prefix) {
            TrieNode curr = root;
            for(int i = 0; i < prefix.length(); i++){
                int index = prefix.charAt(i) - 'a';
                if(curr.child[index] == null){
                    return false;
                }
                curr = curr.child[index];
            }
            return true;
    }

    private class TrieNode{
            TrieNode[] child = new TrieNode[26];
            boolean isWord; 
    }
}
