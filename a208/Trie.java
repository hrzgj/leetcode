package a208;

/**
 * @author: chenyu
 * @date: 2021/2/10 11:15
 */
public class Trie {

    TrieNode root;

    class TrieNode{
        boolean isEnd;

        TrieNode[] nodes=new TrieNode[26];
    }

    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node=root;
        for(char c:word.toCharArray()){
            if(node.nodes[c-'a']==null){
                node.nodes[c-'a']=new TrieNode();
            }
            node=node.nodes[c-'a'];
        }
        node.isEnd=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node=root;
        for(char c:word.toCharArray()){
            if(node.nodes[c-'a']==null){
                return false;
            }
            node=node.nodes[c-'a'];
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node=root;
        for(char c:prefix.toCharArray()){
            if(node.nodes[c-'a']==null){
                return false;
            }
            node=node.nodes[c-'a'];
        }
        return true;
    }
}
