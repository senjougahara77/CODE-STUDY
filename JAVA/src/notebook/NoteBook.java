package notebook;

import java.util.ArrayList;

public class NoteBook {
    private ArrayList<String> notes = new ArrayList<String>();
    private int size = 0;
    public void add(String s){
        notes.add(s);
        size++;
    }

    public int getSize(){
        return notes.size();
    }

    public String getNote(int index){
        return  "";
    }

    public boolean removeNote(){
        return true;
    }

    public String[] list(){
        return new String[10];
    }

    public static void main(String[] args) {
        NoteBook nb = new NoteBook();
        nb.add("fffff");
        nb.add("fffdffff");
        System.out.println(nb.getSize());

    }
}
