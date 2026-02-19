package src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects;

public class NewsData extends ObjectData{
    private String data;
    private int views;
    private int likes;

    public NewsData(String data, int views, int likes) {
        super(" News Data ");
        this.data = data;
        this.views = views;
        this.likes = likes;
    }

    public NewsData(){
        super(" News Data ");
    }

    public String toString() {
        return ("News :"+data+"\n No of likes "+likes+"\n views:"+views);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}

