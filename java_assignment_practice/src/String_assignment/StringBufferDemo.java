package String_assignment;

public class StringBufferDemo {
    public static void main(String[] args) {

        //Assignment on string buffer
        String l="StringBuffer";
        String m="is a peer class of String";
        String n="that provides much of";
        String o="the functionality of strings";

        StringBuffer p=new StringBuffer();
        p.append(l);
        p.append(" "+m);
        p.append(" "+n);
        p.append(" "+o);
        System.out.println(p);

        //part-2
        StringBuffer in=new StringBuffer("It is used to at the specified index");
        in.insert(14,"insert text ");
        System.out.println(in);

        //part-3
        StringBuffer rev=new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println(rev.reverse());
    }
}