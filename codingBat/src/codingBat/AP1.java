package codingBat;

import java.util.ArrayList;


public class AP1 {
	public boolean scoresIncreasing(int[] scores) {
		  for(int i = 0; i < scores.length - 1; i++){
		    if(scores[i] > scores[i+1]){
		      return false;
		    }
		  }
		  return true;
		}
	public boolean scores100(int[] scores) {
		  for(int i = 0; i < scores.length - 1; i++){
		    if(scores[i] == scores[i+1] && scores[i] == 100){
		      return true;
		    }
		  }
		  return false;
		}
	public boolean scoresClump(int[] scores) {
		  for(int i = 0; i < scores.length - 2; i++){
		    if(Math.abs(scores[i] - scores[i+2]) <= 2){
		      return true;
		    }
		  }
		  return false;
		}
	public int scoresAverage(int[] scores) {
		  int half = scores.length/2;
		  int fr = 0;
		  int sc = 0;
		  for(int i = 0; i < scores.length; i++){
		    if(i < half){
		      fr = fr + scores[i];
		    } else{
		      sc = sc + scores[i];
		    }
		  }
		  int large = Math.max(fr,sc);
		  return large/half;
		}
	public int wordsCount(String[] words, int len) {
		  int count = 0;
		  for(int i = 0; i < words.length; i++){
		    if(words[i].length() == len){
		      count++;
		    }
		  }
		  return count;
		}
	public String[] wordsFront(String[] words, int n) {
		  String[] ret = new String[n];
		  for(int i = 0; i < n; i++){
		    ret[i] = words[i];
		  }
		  return ret;
		}
	public ArrayList wordsWithoutList(String[] words, int len) {
		  ArrayList<String> ret = new ArrayList<String>();
		  for(int i = 0; i < words.length; i++){
		    if(words[i].length() != len){
		      ret.add(words[i]);
		    }
		  }
		  return ret;
		}
}
