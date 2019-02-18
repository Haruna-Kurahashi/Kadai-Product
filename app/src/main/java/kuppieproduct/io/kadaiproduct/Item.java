package kuppieproduct.io.kadaiproduct;

public class Item {
    String title;
    String content;
    int likeCount;
    boolean isLiked;

    Item(String title, String content, int likeCount) {
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
        this.isLiked = false;
    }
}
