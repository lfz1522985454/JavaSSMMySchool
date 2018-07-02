package com.bdqn.tcmp.service.impl;

import com.bdqn.tcmp.dto.ArticleDTO;
import com.bdqn.tcmp.entity.Article;
import com.bdqn.tcmp.mapper.ArticleMapper;
import com.bdqn.tcmp.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务逻辑层接口实现类
 * @author admin
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体类
     * @return 受影响行数
     */
    public int insertArticle(Article entity){
        return articleMapper.insertArticle(entity);
    }
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Article对象
     */
    public Article selectArticleByID(int id){
        return articleMapper.selectArticleByID(id);
    }

    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体类
     * @return 受影响行数
     */
    public int updateArticle(Article entity){
        return articleMapper.updateArticle(entity);
    }
    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int updateArticleEnabledByID(int id,int value){
        return articleMapper.updateArticleEnabledByID(id,value);
    }
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    public int deleteArticle(int id){
        return articleMapper.deleteArticle(id);
    }
    /**
     * 查询全部数据
     * @return Article对象集合
     */
    public List<Article> selectArticleAll(){
        return articleMapper.selectArticleAll();
    }

    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Article对象集合
     */
    public List<Article> selectArticleByWhere(ArticleDTO dto){
        return articleMapper.selectArticleByWhere(dto);
    }

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    public int selectArticleCountByWhere(ArticleDTO dto){
        return articleMapper.selectArticleCountByWhere(dto);
    }
    /**
     * 得到数据表Article满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Article对象集合
     */
    public List<Article> selectArticleByPage(ArticleDTO dto){
        return articleMapper.selectArticleByPage(dto);
    }
}



