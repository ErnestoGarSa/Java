public class RecordProject {

    public static void main(String[] args) {

        for (int i= 1; i <= 5; i++){
            Student s= new Student("S92300" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "Alex";
                case 3 -> "George";
                case 4 -> "Charles";
                case 5 -> "Frank";
                default -> "Anonymous";
                    }, "05/11/1985", "Java Master Class");
            System.out.println(s);
        }

        System.out.println();

        for (int i= 1; i <= 5; i++){
            LPAStudent s= new LPAStudent("S92300" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Alex";
                        case 3 -> "George";
                        case 4 -> "Charles";
                        case 5 -> "Frank";
                        default -> "Anonymous";
                    }, "05/11/1985", "Java Master Class");
            System.out.println(s);
        }

        Student pojoStudent= new Student("S92300", "Ernesto", "05/11/1985", "Java Master Class");
        LPAStudent recordStudent= new LPAStudent("S92300", "Alejandro", "05/11/1985", "Java Master Class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName());
        System.out.println(recordStudent.name());

        //System.out.println(pojoStudent.setClassList("Java OCP"));
        //System.out.println(recordStudent.classList()); Los records son inmutables

    }

}
