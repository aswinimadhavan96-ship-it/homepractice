package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRatingManagement {

    public static void main(String[] args) {

        HashMap<String, Double> movies = new HashMap<>();
        Scanner sc = new Scanner(System.in);
            int choice;

        do {
            System.out.println("\n--- MOVIE RATING MANAGEMENT ---");
            System.out.println("1. Add Movie");
            System.out.println("2. Search Movie");
            System.out.println("3. Update Rating");
            System.out.println("4. Delete Movie");
            System.out.println("5. Display All Movies");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

            case 1:
                System.out.print("Enter Movie Name: ");
                String movieName = sc.nextLine();

                System.out.print("Enter Rating: ");
                double rating = sc.nextDouble();
                    movies.put(movieName, rating);

                System.out.println("Movie Added Successfully");
                break;

            case 2:
                System.out.print("Enter Movie Name to Search: ");
                String searchMovie = sc.nextLine();

                if (movies.containsKey(searchMovie)) {
                    System.out.println("Movie Name : " + searchMovie);
                    System.out.println("Rating : " + movies.get(searchMovie));
                } else {
                    System.out.println("Movie Not Found");
                }
                break;

            case 3:
                System.out.print("Enter Movie Name to Update: ");
                String updateMovie = sc.nextLine();

                if(movies.containsKey(updateMovie)) {

                    System.out.print("Enter New Rating: ");
                    double newRating = sc.nextDouble();
                        movies.put(updateMovie, newRating);

                    System.out.println("Rating Updated Successfully");
                } else {
                    System.out.println("Movie Not Found");
                }
                break;

            case 4:
                System.out.print("Enter Movie Name to Delete: ");
                String deleteMovie = sc.nextLine();
             if(movies.containsKey(deleteMovie)) {

                    movies.remove(deleteMovie);

                    System.out.println("Movie Deleted Successfully");
                } else {
                    System.out.println("Movie Not Found");
                }
                break;

            case 5:
                System.out.println("\n--- ALL MOVIES ---");

            for(Map.Entry<String, Double> movie : movies.entrySet()) {

                    System.out.println("Movie Name : " + movie.getKey());
                    System.out.println("Rating : " + movie.getValue());
                    System.out.println();
                }
                break;

            case 6:
              System.out.println("Thank You");
               break;

           default:
                System.out.println("Invalid Choice");
            }
        } while (choice != 6);
    }
}