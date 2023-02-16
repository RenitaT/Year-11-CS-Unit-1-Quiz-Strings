public class Strings {

    public static void main(String[] args) {

        // 1.

        int age = 33;

        // 2.

        String name = "T Swizzle";

        // 3.

        System.out.println(age);

        // 4.

        System.out.println(name);

        // 5.

        String description = "My name is "+name+" and I am "+age+" years old";

        // 6.

        System.out.println(description);

        // 7.

        System.out.println(description.length());

        // 8.

        String nameSubDescription = description.substring(11,20);

        System.out.println(nameSubDescription);


        // 9.

        int ageSubDescription = Integer.parseInt(description.substring(30,32));

        System.out.println(ageSubDescription);

        // 10.

        String subDescription = "My name is "+nameSubDescription+" and I am "+ageSubDesciption+" years old";

        System.out.println(subDescription);

    }

}
