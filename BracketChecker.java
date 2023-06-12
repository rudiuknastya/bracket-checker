package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BracketChecker {
    List<Character> brackets = new ArrayList<>();
    private void check(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == ')'){
                brackets.add(s.charAt(i));
            }
        }
        double pair = 0.0;
        for(int i = 0; i < brackets.size(); i++){
            if(i%2 == 0 && brackets.get(i) == '('){
                pair += 0.5;
            } else if(i%2 != 0 && brackets.get(i) == ')'){
                pair += 0.5;
            } else {
                System.out.println("wrong");
                break;
            }
        }
        if(pair%1 != 0.0){
            System.out.println("wrong");
        }
    }
    public void check(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter equation: ");
        String equation = scanner.nextLine();
        check(equation);
    }
}
