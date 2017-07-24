package storage;


import com.codingdie.analyzer.spider.model.tieba.PostDetailTask;
import com.codingdie.analyzer.spider.slave.CrawlPostDetailActor;
import com.google.gson.GsonBuilder;
import junit.framework.TestCase;

/**
 * Created by xupeng on 17-7-18.
 */
public class CrawlPostDetailActorTest extends TestCase {
    public void testA() {
        PostDetailTask postDetailTask = new PostDetailTask(5234422711L);

        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(CrawlPostDetailActor.crawlPostDetail(postDetailTask)));
    }

}