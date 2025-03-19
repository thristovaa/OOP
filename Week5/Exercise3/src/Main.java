public class Main {
    public static void main(String[] args) {
        // Create a couple of users
        User tristan = new User("T-POtje", "Tristan Pothoven");
        User evert = new User("EduudE", "Evert Duipmans");
        User ruud = new User("Greevmeister", "Ruud Greven");

        // Add some posts
        Post post1 = new Post("Currently teaching object oriented programming.");
        Post post2 = new ImagePost("Look! My cat ate my programming book :-)", "cat.jpg", "Clarendon");
        Post post3 = new VideoPost("Inheritance explained in 1 minute...", "inheritance.mp4", 60);
        tristan.addPost(post1);
        tristan.addPost(post2);
        evert.addPost(post3);

        // Add some likes
//        post2.like(evert);
//        post2.like(ruud);
//        post3.like(tristan);
//        post3.like(ruud);
//        post3.like(evert);

        // Add some comments
        post2.addComment(new Comment(evert, "That's a very nice cat."));
        post3.addComment(new Comment(ruud, "Awesome video! I finally understand inheritance."));
        post3.addComment(new Comment(tristan, "Let's add this to the materials of the course!"));

        //Print
        System.out.println(tristan);
        System.out.println("------------------");
        System.out.println(evert);
        System.out.println("------------------");
        System.out.println(ruud);
    }
}