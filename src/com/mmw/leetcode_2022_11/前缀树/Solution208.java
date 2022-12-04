package src.com.mmw.leetcode_2022_11.前缀树;

//重点关注
class Trie {
    private Trie[] nextChildren;
    private boolean isEnd;

    public Trie() {
        this.nextChildren = new Trie[26];
        this.isEnd = false;
    }

    public void insert(String word) {
        //注意这里是this不是new
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            if (node.nextChildren[word.charAt(i) - 'a'] == null) {
                node.nextChildren[word.charAt(i) - 'a'] = new Trie();
            }
            node = node.nextChildren[word.charAt(i) - 'a'];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = serachPreix(word);
        return node != null && node.isEnd;

    }

    private Trie serachPreix(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            if (node.nextChildren[word.charAt(i) - 'a'] == null) {
                return null;
            }
            node = node.nextChildren[word.charAt(i) - 'a'];
        }
        return node;
    }

    public boolean startsWith(String prefix) {
        Trie node = serachPreix(prefix);
        return node != null;
    }

}
