public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String isbn;
    private int pages;
    private double price;
    private boolean hardcover;

    public Book(String title, String author, int year, String publisher, String isbn, int pages, double price, boolean hardcover) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pages = pages;
        this.price = price;
        this.hardcover = hardcover;
        System.out.println("Created a new book: " + title);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHardcover() {
        return hardcover;
    }

    public static class Review {
        private String reviewer;
        private String comment;
        private int rating;

        public Review(String reviewer, String comment, int rating) {
            this.reviewer = reviewer;
            this.comment = comment;
            this.rating = rating;
            System.out.println("Created a new review by " + reviewer);
        }

        public String getReviewer() {
            return reviewer;
        }

        public String getComment() {
            return comment;
        }

        public int getRating() {
            return rating;
        }
    }

    public static class Chapter {
        private String title;
        private int pageStart;
        private int pageEnd;

        public Chapter(String title, int pageStart, int pageEnd) {
            this.title = title;
            this.pageStart = pageStart;
            this.pageEnd = pageEnd;
            System.out.println("Created a new chapter: " + title);
        }

        public String getTitle() {
            return title;
        }

        public int getPageStart() {
            return pageStart;
        }

        public int getPageEnd() {
            return pageEnd;
        }
    }


    public static void main(String[] args) {
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Charles Scribner's Sons", "978-0-7432-7356-5", 180, 9.99, true);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "J. B. Lippincott & Co.", "978-0-06-112008-4", 281, 12.50, true);
        Book b3 = new Book("The Catcher in the Rye", "J. D. Salinger", 1951, "Little, Brown and Company", "978-0-316-76948-8", 224, 8.99, true);

        Book.Review r1 = new Book.Review("John Smith", "Great book, highly recommend!", 5);
        Book.Review r2 = new Book.Review("Jane Doe", "Disappointing ending, but still worth reading", 3);
        Book.Review r3 = new Book.Review("Bob Johnson", "Couldn't put it down!", 4);

        Book.Chapter c1 = new Book.Chapter("Chapter 1: The Party", 1, 10);
        Book.Chapter c2 = new Book.Chapter("Chapter 2: The Valley of Ashes", 11, 20);
        Book.Chapter c3 = new Book.Chapter("Chapter 3: The Great Gatsby", 21, 30);
    }
}


