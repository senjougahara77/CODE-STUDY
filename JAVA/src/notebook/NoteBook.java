//package notebook;
//
//import javax.swing.*;
//import java.util.ArrayList;
//import java.util.HashSet;
//
//public class NoteBook {
//    private ArrayList<String> notes = new ArrayList<String>();
//    private int size = 0;
//
//    public NoteBook(ArrayList<String> notes, int size) {
//        this.notes = notes;
//        this.size = size;
//    }
//
//    public void add(String s){
//        notes.add(s);
//        size++;
//    }
//    public void add(String s, int location){
//        notes.add(location, s);
//    }
//
//    public int getSize(){
//        return notes.size();
//    }
//
//    public String getNote(int index){
//        return  notes.get(index);
//    }
//
//    public void removeNote(int index){
//        notes.remove(index);
//    }
//
//    public String[] list(){
//        String[] a = new String[notes.size()];
////        for (int i = 0; i< notes.size(); i++){
////            a[i] = notes.get(i);
////        }
//        notes.toArray(a);
//        return a;
//    }
//
////    public static void main(String[] args) {
////        NoteBook nb = new NoteBook();
////        nb.add("fffff");
////        nb.add("fffdffff");
////        nb.add("1",1);
////        System.out.println(nb.getSize());
////        System.out.println(nb.getNote(1));
////        nb.removeNote(1);
////        String[] a = nb.list();
////        for (String s: a){
////            System.out.println(s);
////        }
//
////集合，没有重复的元素
//        HashSet<String> s = new HashSet<>();
//        s.add("f");
//        s.add("s");
//        s.add("f");
//        for (String k : s){
//            System.out.println(k);
//        }
//        System.out.println(s);
//    }
//}
//
