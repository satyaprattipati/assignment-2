package String_assignment;

public class StringBuilderDemo{

    public static void main(String[] args) {

        //Assignment on StringBuilder
        String l="StringBuffer";
        String m="is a peer class of String";
        String n="that provides much of";
        String o="the functionality of strings";

        StringBuilder q=new StringBuilder();
        q.append(l);
        q.append(" "+m);
        q.append(" "+n);
        q.append(" "+o);
        System.out.println(q);

        //part-2
        StringBuilder s1=new StringBuilder("It is used to at the specified index");
        s1.insert(14,"insert text ");
        System.out.println(s1);

        //part-3
        StringBuilder s2=new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println(s2.reverse());

    }
}
