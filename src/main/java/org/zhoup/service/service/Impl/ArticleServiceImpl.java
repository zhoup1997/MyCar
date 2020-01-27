package org.zhoup.service.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhoup.service.dto.ArticleDTO;
import org.zhoup.service.dto.DataGridResult;
import org.zhoup.service.dto.QueryDTO;
import org.zhoup.service.entity.Article;
import org.zhoup.service.mapper.ArticleMapper;
import org.zhoup.service.service.ArticleService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    //分页查询
    @Override
    public DataGridResult findArticleByPage(QueryDTO queryDTO) {
        PageHelper.offsetPage(queryDTO.getOffset(), queryDTO.getLimit());
        Example example = new Example(Article.class);
        if(queryDTO.getSort()!=null&&!queryDTO.getSort().equals("")){
            example.setOrderByClause("id"+" "+queryDTO.getOrder());
        }
        List<Article> articles = articleMapper.selectByExample(example);
        PageInfo<Article> pageInfo = new PageInfo<>();
        long total = pageInfo.getTotal();
        DataGridResult dataGridResult = new DataGridResult(total,articles);
        return dataGridResult;
    }

    @Override
    public int addArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        BeanUtils.copyProperties(articleDTO,article);
        byte allowUp = (byte)(articleDTO.getAllowUp() == null ? 0 : 1);
        article.setAllowUp(allowUp);
        byte allowFav = (byte)(articleDTO.getAllowFav() == null ? 0 : 1);
        article.setAllowFav(allowFav);

        return articleMapper.insert(article);
    }

    @Override
    public int delArticles(String ids) {
        return articleMapper.deleteByIds(ids);
    }

    @Override
    public Article findArticleById(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        BeanUtils.copyProperties(articleDTO,article);
        byte allowUp = (byte)(articleDTO.getAllowUp() == null ? 0 : 1);
        article.setAllowUp(allowUp);
        byte allowFav = (byte)(articleDTO.getAllowFav() == null ? 0 : 1);
        article.setAllowFav(allowFav);
        return articleMapper.updateByPrimaryKey(article);
    }
}
