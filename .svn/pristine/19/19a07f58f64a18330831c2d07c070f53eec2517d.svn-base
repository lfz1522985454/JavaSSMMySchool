
package com.bdqn.tcmp.controller;

import com.bdqn.tcmp.dto.ArticleDTO;
import com.bdqn.tcmp.entity.Article;
import com.bdqn.tcmp.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("article")
public class ArticleController {
    @Resource
    private ArticleService articleService;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping("/add.do")
    public int insertArticle(Article entity){
        return articleService.insertArticle(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Article对象
     */
    @ResponseBody
    @RequestMapping( "/byid.do")
    public Article selectArticleByID(int id){
        return articleService.selectArticleByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping("/edit.do")
    public int updateArticle(Article entity){
        return articleService.updateArticle(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping("/isen.do")
    public int updateArticleEnabledByID(int id,int value){
        return articleService.updateArticleEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    @ResponseBody
    @RequestMapping("/del.do")
    public int deleteArticle(int id){
        return articleService.deleteArticle(id);
    }
    /**
     * 查询全部数据
     * @return Article对象集合
     */
    @ResponseBody
    @RequestMapping("/all.do")
    public List<Article> selectArticleAll(){
        return articleService.selectArticleAll();
    }
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Article对象集合
     */
    @ResponseBody
    @RequestMapping("/where.do")
    public List<Article> selectArticleByWhere(ArticleDTO dto){
        return articleService.selectArticleByWhere(dto);
    }


    /**
     * 得到数据表Article满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Article对象集合
     */
    @ResponseBody
    @RequestMapping("/page.do")
    public Map<String, Object> selectArticleByPage(ArticleDTO dto){
        Map<String, Object> map = new HashMap<String, Object>();
        dto.setPageSize(5);
        dto.setPageIndex(1);
        dto.setRowCount(articleService.selectArticleCountByWhere(dto));
        map.put("page", dto);
        map.put("articleList", articleService.selectArticleByPage(dto));
        return map;
    }
}
