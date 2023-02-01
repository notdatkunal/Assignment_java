import java.util.Scanner;
/*
* this program creates amount of accounts that user decides and allocates
* the necessary data
* and
* provide the output in table format
*  */
public class Facebook {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // here we want to create array of objects for a facebook app
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many accounts you want to create");
        Facebook[] a = new Facebook[sc.nextInt()];
//        System.out.println(a[0]);
        for(int i = 0;i<a.length;i++){
            Facebook j = new Facebook();
            a[i]=j;
            System.out.println("enter id");
            a[i].setId(sc.nextInt());
            System.out.println("enter name");
            a[i].setName(sc.next());
        }
        System.out.println("id\t name");
        for (Facebook i:a) {
            System.out.print(i.getId()+"\t");
            System.out.println(i.getName());
        }

    }
}
