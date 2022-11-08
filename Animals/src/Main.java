//Спростив для себе, для кращого розуміння і багато коду трохи мені важко сприймати поки.

import java.util.Arrays;
public class Main implements Comparable <Main> {
    public static void main(String[] args) {
        class CountObject
        {

            public CountObject()
            {


                count++;
            }
            public static void main(String args[])
            {
//creating objects
                CountObject ob1 = new CountObject();
                CountObject ob2 = new CountObject();
                CountObject ob3 = new CountObject();
                CountObject ob4 = new CountObject();
                CountObject ob5 = new CountObject();
//prints number of objects
                System.out.print("Total Number of Objects: " + CountObject.count);
            }
        }
        class ownerinformation{
            private String ownersName;
            private String getOwnersLocality;

            public String getOwnersName() {
                return ownersName;
            }

            public void setOwnersName(String ownersName) {
                this.ownersName = ownersName;
            }

            public String getGetOwnersLocality() {
                return getOwnersLocality;
            }

            public void setGetOwnersLocality(String getOwnersLocality) {
                this.getOwnersLocality = getOwnersLocality;
            }
        }

         class Animals_life {
            private String animalsLocality;
            private int animalsLifefrom1to10;

            public String getAnimalsLocality() {
                return animalsLocality;
            }

            public void setAnimalsLocality(String animalsLocality) {
                this.animalsLocality = animalsLocality;
            }

            public int getAnimalsLifefrom1to10() {
                return animalsLifefrom1to10;
            }

            public void setAnimalsLifefrom1to10(int animalsLifefrom1to10) {
                this.animalsLifefrom1to10 = animalsLifefrom1to10;
            }
        }

        Dog dog = new Dog();
        CanRun canRun = dog;
        dog = (Dog) canRun;
        Flyable flyable = new Bird();
        flyable.fly();



        }


        @Override
    public int compareTo(Main o) {
        return 0;
    }
}