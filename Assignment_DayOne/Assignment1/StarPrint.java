package Assignment1;

public class StarPrint {
    public static int rows=4;
    public static void main(String[] args){
        StringBuilder reverser =new StringBuilder();
        System.out.print(Star());
        reverser.append(Star());
        System.out.print(reverser.reverse());
        System.out.print(Pyramid());
        reverser= new StringBuilder();
        reverser.append(Pyramid());
        System.out.println(reverser.reverse());
    }
    public static StringBuilder Star(){
        StringBuilder temp= new StringBuilder();
        for(int i=0;i<=rows;i++){
            temp.append("*".repeat(Math.max(0, i)));
            temp.append("\n");
        }
        return temp;
    }
    public static StringBuilder Pyramid(){
        StringBuilder temp= new StringBuilder();
        for (int i =0;i<rows;i++){
            temp.append(" ".repeat(rows - i));
            temp.append("*".repeat(Math.max(0, (i + 1) * 2 - 1)));
            temp.append(" ".repeat(Math.max(0, rows - i)));
            temp.append("\n");
        }
        return temp;
    }

}

