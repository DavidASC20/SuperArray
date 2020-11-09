public class Demo{
    public static void removeDuplicates(SuperArray s){ 
        for(int i = s.size()-1; i >= 0; i--){
            if(s.indexOf(s.get(i)) != i){
                s.remove(i);
            }
        }
     }

     public static SuperArray findOverlap(SuperArray a, SuperArray b){
      SuperArray c = new SuperArray();
      for (int i=0; i<a.size(); i++) {
        String str = a.get(i);
        if (b.contains(str)) c.add(str);
      }
      removeDuplicates(c);
      return c;
     }

     public static SuperArray zip(SuperArray a, SuperArray b) {
        SuperArray arr = new SuperArray();
        if (a.size() >= b.size()) {
          for (int i=0; i<b.size(); i++) {
            arr.add(a.get(i));
            arr.add(b.get(i));
          }
          for (int i=b.size(); i<a.size(); i++) {
            arr.add(a.get(i));
          }
        }
        if (b.size() > a.size()) {
          for (int i=0; i<a.size(); i++) {
            arr.add(a.get(i));
            arr.add(b.get(i));
          }
          for (int i=a.size(); i<b.size(); i++) {
            arr.add(b.get(i));
          }
        }
        return arr;
    }





    public static void main(String[]args){
      SuperArray words = new SuperArray();
      //grouped to save vertical space
      words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
      words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
      words.add("una");    words.add("ebi");     words.add("toro"); 
  
      System.out.println(words);
      removeDuplicates(words);
      System.out.println(words);  }
  }

