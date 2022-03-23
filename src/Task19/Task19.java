package Task19;

public class Task19 {
    public static void main(String[] args) {
        int [] mass=new int[10];
        mass[0]=1;
        mass[1]=2;
        mass[2]=3;
        mass[3]=4;
        mass[4]=5;
        mass[5]=6;
        mass[6]=7;
        mass[7]=8;
        mass[8]=9;
        mass[9]=10;



        for (int i=0 ; i<mass.length; i++)
            if (i%2==0 )
                System.out.println("Элементы на четных позицях = "+mass[i]);



    }
}
