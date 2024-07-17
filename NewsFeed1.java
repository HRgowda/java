public class NewsFeed1 {
    
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;
  
    
    public NewsFeed1(){
      // Initialize favoriteArticles here:
      favoriteArticles=new String[10];
    }
    
    public void setFavoriteArticle(int favoriteIndex, String newArticle){
      // Add newArticle to favoriteArticles:
      favoriteArticles[favoriteIndex]=newArticle;
      
    }
      
    public static void main(String[] args){
      NewsFeed1 sampleFeed = new NewsFeed1();
      
      sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
      sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
      sampleFeed.setFavoriteArticle(0, "Oil News");
      
      for(int i=0; i<sampleFeed.favoriteArticles.length;i++){
          System.out.println(sampleFeed.favoriteArticles[i]);
      }
    }
  }
  
