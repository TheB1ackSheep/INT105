/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week_12;

/**
 *
 * @author INT105
 */
public class WordCount implements Comparable<WordCount>{
    private String word;
    private int count = 1;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    public void inc(){
        count++;
    }

    @Override
    public String toString() {
        return word+" "+count;
    }

    @Override
    public int compareTo(WordCount o) {
        return o.count - this.count;
    }
    
    
    
    
}
