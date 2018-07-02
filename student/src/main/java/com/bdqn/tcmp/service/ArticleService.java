package com.bdqn.tcmp.service;
import com.bdqn.tcmp.dto.ArticleDTO;
import com.bdqn.tcmp.entity.Article;

import java.util.List;

/**
 * 业务逻辑层接口
 * @author admin
 */
public interface ArticleService {
    /**
     * 向插入数据
     * @param entity
     *            带有要插入数据的实体
     * @return 受影响行数
     */
    int insertArticle(Article entity);
    /**
     * 根据主键查询一个数据
     * @param id
     *            表的主键
     * @return Article对象
     */
    Article selectArticleByID(int id);
    /**
     * 修改数据
     * @param entity
     *            带有要修改数据的实体
     * @return 受影响行数
     */
    int updateArticle(Article entity);

    /**
     * 修改的启用状态
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int updateArticleEnabledByID(int id, int value);
    /**
     * 删除指定主键的数据
     * @param id
     *            表的主键
     * @return 受影响行数
     */
    int deleteArticle(int id);
    /**
     * 查询全部数据
     * @return Article对象集合
     */
    List<Article> selectArticleAll();
    /**
     * 根据条件查询数据
     * @param dto
     *            实体类查询条件
     * @return Article对象集合
     */
    List<Article> selectArticleByWhere(ArticleDTO dto);

    /**
     * 根据条件查询满足条件的记录数
     * @param dto
     *            实体类查询条件
     * @return 满足条件的记录数
     */
    int selectArticleCountByWhere(ArticleDTO dto);
    /**
     * 得到数据表Article满足查询条件的分页记录
     * @param dto
     *            实体类查询条件
     * @return Article对象集合
     */
    List<Article> selectArticleByPage(ArticleDTO dto);
}




