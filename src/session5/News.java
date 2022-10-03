package session5;

public class News implements INews{
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;

    public News(int ID, String title, String publishDate, String author, String content) {
        this.ID = ID;
        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }


    @Override
    public void display() {
        System.out.println(Title);
        System.out.println(PublishDate);
        System.out.println(ID);
        System.out.println(Author);
        System.out.println(AverageRate );
    }

    int [] RateList = new int[3];
    public float Calculate( int x,int y,int z ) {
        float a = (float) (x+y+z) / 3;
        return a;
    }
}
