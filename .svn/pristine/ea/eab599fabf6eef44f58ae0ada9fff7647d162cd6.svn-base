package com.bdqn.tcmp.controller;


import com.bdqn.tcmp.entity.ArticleSpider;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @create 2018-06-14 23:50
 * @desc
 **/
@Controller
@RequestMapping("spider")
public class SpiderController {
    //"https://blog.csdn.net/guolin_blog/"

    @RequestMapping("/getSpiderDate.do")
    @ResponseBody
    public List<ArticleSpider> getSpiderDate(String url) {
        System.out.println("进入SB了");
        List<ArticleSpider> resultList = new ArrayList<ArticleSpider>();
        try {
            Connection conn = Jsoup.connect("https://blog.csdn.net/guolin_blog")	//博客首页的url地址
                    .userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.64 Safari/537.11")	//http请求的浏览器设置
                    .timeout(10000)  //http连接时长
                    .method(Connection.Method.GET);  //请求类型是get请求，http请求还是post,delete等方式
            //获取页面的html文档
            Document doc = conn.get();
        /*    System.out.println("输出获取页面的html文档:"+doc);*/
            Element body = doc.body();
        /*    System.out.println("输出html文档的body部分:"+body);*/
            Elements articleListDiv = body.getElementsByClass("article-list");
            System.out.println("获取article_list中的文档:"+articleListDiv);
            Elements articleitembox = body.getElementsByClass("article-item-box");
            System.out.println("获取articleitembox中的文档:"+articleitembox);
            for (Element article : articleitembox) {
                ArticleSpider articleEntity = new ArticleSpider();
                //连接地址
                Element linkNode = (article.select("a")).get(0);
				System.out.println("a标签中的连接地址"+linkNode);
                Element desptionNode = (article.getElementsByClass("content")).get(0);
				System.out.println("获取P标签中的内容:"+desptionNode);
                Element articleManageNode = (article.getElementsByClass("date")).get(0);
			    System.out.println("获取文章的时间:"+articleManageNode);

                articleEntity.setAddress(linkNode.attr("href"));
                articleEntity.setTitle(linkNode.text());
                articleEntity.setDesption(desptionNode.text());
                articleEntity.setTime(articleManageNode.select("span:eq(0").text());
                resultList.add(articleEntity);
            }
            //遍历输出ArrayList里面的爬取到的文章
            System.out.println("文章总数:" + resultList.size());
            for(ArticleSpider article : resultList) {
                System.out.println("文章绝对路径地址:http://blog.csdn.net" + article.getAddress());
                System.out.println("文章标题:" + article.getTitle());
                System.out.println("文章内容:" + article.getDesption());
                System.out.println("文章发表时间:"+article.getTime());
                System.out.println();
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return resultList;
    }

}
