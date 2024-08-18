class Solution {

    class TrieNode 
    {
        TrieNode children[];
        boolean isWord;

        public TrieNode()
        {
            children=new TrieNode[26];
        }
    }

    TrieNode root;

    public void insert(String word)
    {
        TrieNode node=root;

        for(char c:word.toCharArray())
        {
            if(node.children[c-'a']==null)
            {
                node.children[c-'a']=new TrieNode();
            }

            node=node.children[c-'a'];
        }

        node.isWord=true;
    }

    public String replaceWords(List<String> dictionary, String sentence) 
    {
        root=new TrieNode();

        for(String word:dictionary)
        {
            insert(word);
        }

        return replaceWords(sentence);
    }

    public String replaceWords(String sentence) 
    {
        StringBuilder sb=new StringBuilder();

        for(String word:sentence.split(" "))
        {
            sb.append(getShortestWord(word)).append(" ");
        }
        
        return sb.toString().trim();
    }

    public String getShortestWord(String s)
    {
        TrieNode node=root;
        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray())
        {
            sb.append(c);
            if(node.children[c-'a']==null)
            {
                return s;
            }

            if(node.children[c-'a'].isWord)
            {
                return sb.toString();
            }

            node=node.children[c-'a'];
        }

        return s;
    }
}