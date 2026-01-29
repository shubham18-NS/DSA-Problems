// String builder:in this one object is made and changes made in that object only

class stringbuilder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
       for(int i=0;i<26;i++)
       {
           char ch=(char)('a'+i);
          builder.append(ch);
       }
       System.out.println(builder.toString());//out:abcdefghijklmnopqrstuvwxyz
       builder.deleteCharAt(0);
       System.out.println(builder);//out:bcdefghijklmnopqrstuvwxyz
       builder.insert(2,'2');
       System.out.println(builder);//out:bc2defghijklmnopqrstuvwxyz
       builder.reverse();
       System.out.println(builder);//out:zyxwvutsrqponmlkjihgfed2cb
    }
}
