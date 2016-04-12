package com.chidiemeh.week11;

import java.util.ArrayList;
import java.util.List;

class News {
    private String title;
    private String content;

    News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

interface SomeoneThatListensToNews {
    public void update(News item);
}

class NewsStation {
    private List<News> dailyNews = new ArrayList<>();
    private List<SomeoneThatListensToNews> viewers = new ArrayList<>();

    // add a Audience
    public void addViewer(SomeoneThatListensToNews viewer) {
        viewers.add(viewer);
    }

    // Update Each Viewer with current news
    public void updateViewersWithCurrentNews(News theCurrentNews) {
        for (SomeoneThatListensToNews eachPerson: viewers) {
            eachPerson.update(theCurrentNews);
        }
    }

    public void broadcastNews(News oneNews) {
    	dailyNews.add(oneNews);
    	updateViewersWithCurrentNews(oneNews);
    }

    public void broadcastNews(String title, String content) {
    	broadcastNews(new News(title, content));
    }
}

class AnyoneWatchingANews implements SomeoneThatListensToNews{
    // method called by objects that update listeners
    public void update(News item){
        System.out.println("Watching News: " + item.getTitle());
    }
}


public class WeatherReport {
    public static void main(String[] args) {
    	SomeoneThatListensToNews dad = new AnyoneWatchingANews();
    	SomeoneThatListensToNews me = new AnyoneWatchingANews();
    	
    	NewsStation cnn = new NewsStation();
    	cnn.addViewer(dad);
    	cnn.addViewer(me);

    	cnn.broadcastNews("BREAKING NEWS: ", " ...The GOP Presidential... Donald Trump has been announced the ...");
    	cnn.broadcastNews("COMMERCIAL: ", "... Get the new Toyota ... for ....");
    }
	
	
}














