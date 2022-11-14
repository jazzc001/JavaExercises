package jasmine.xmlannotationwithcomponent.client;

import jasmine.xmlannotationwithcomponent.presentation.StudentPresentation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ApplicationContext springContainer = new ClassPathXmlApplicationContext("componentConfiguration.xml");


        StudentPresentation studentPresentation = (StudentPresentation) springContainer.getBean("stdPresentation");
        while(true) {
            studentPresentation.showMenu();
            System.out.println("Enter Choice :");
            int choice = scanner.nextInt();
            studentPresentation.performMenu(choice);
        }
    }
}
