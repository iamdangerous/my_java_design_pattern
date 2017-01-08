package Dummy;

/**
 * Created by rkrde on 08-01-2017.
 */
public class Sample {
    public static void main(String[] args) {

        class Student{
            private int num = 10;
            public Student(int num){
                this.num = num;
            }
            void showNum(){
                System.out.println("Num is : "+num);
            }
            void updateNum(int num){
                this.num = num;
            }


        }

        Student s1 = new Student(1);
        s1.showNum();

        Student s2 = new Student(2);
        s2.showNum();

        s1 = new Student(11);
        s1.showNum();

        s2 = s1;
        s1.updateNum(13);
        s2.showNum();




    }


}
