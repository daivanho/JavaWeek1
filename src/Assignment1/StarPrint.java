package Assignment1;

public class StarPrint {
    public static int rows=4;
    public static void main(String args[]){
        StringBuilder reverser =new StringBuilder();
        System.out.print(Star());
        reverser.append(Star());
        System.out.print(reverser.reverse());
        System.out.print(Pyramid());
        reverser= new StringBuilder();
        reverser.append(Pyramid());
        System.out.println(reverser.reverse());
    }
    public static String Star(){
        String temp="";
        for(int i=0;i<=rows;i++){
            for(int x=0;x<i;x++) {
                temp=temp+"*";
            }
            temp=temp+"\n";
        }
        return temp;
    }
    public static String Pyramid(){
        String temp="";
        for (int i =0;i<rows;i++){
            for(int x=0;x<rows-i;x++){
                temp=temp+" ";
            }
            for(int x=0;x<(i+1)*2-1;x++) {
                temp=temp+"*";
            }for(int x=0;x<rows-i;x++){
                temp=temp+" ";
            }
            temp=temp+"\n";
        }
        return temp;
    }

}

