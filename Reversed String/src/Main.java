class Main{
    public static void main(String[] Args){
        System.out.println(reversed("testing"));
    }

    public static String reversed(String s){
        char[] ch = s.toCharArray();
        int right = ch.length - 1;
        int left  = 0;

        while (right > left){
            char temp = ch[right];
            ch[right] = ch[left];
            ch[left] = temp;


            right --;
            left ++;
        }
        return new String(ch);
    }
}