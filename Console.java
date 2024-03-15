class Console{
    public static void main(String[] args) {
        Ex1 FirstExercise = new Ex1();
        Ex2 SecondExercise = new Ex2();
        Ex3 ThirdExercise = new Ex3();
        //Exercise 1
        System.out.println("-------------/Exercise 1/-------------");
        FirstExercise.Print();
        //Exercise2
        System.out.println("-------------/Exercise 2/-------------");
        //Bug info on both Ex2 and Ex3, when you input Double values, even though the Nota variables are doubles, it still reads as an integer. So for some reason this is not working correctly
        SecondExercise.Input();
        SecondExercise.Print();
        //Exercise2
        System.out.println("-------------/Exercise 3/-------------");
        ThirdExercise.Input();
        ThirdExercise.Print();        
    }
}