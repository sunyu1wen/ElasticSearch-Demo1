package com.bocai.springboot.elasticSearchDemo;

import com.bocai.springboot.elasticSearchDemo.entity.Item;
import com.bocai.springboot.elasticSearchDemo.entity.service.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ${user}
 * @version V1.0
 * @ClassName: ${file_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @Date ${date} ${time}
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EsTest {

    //spring data 自己的测试模板
    @Autowired
    ElasticsearchTemplate template;  //template适合做原生的复杂查询 一般的增删改查使用一个接口即可

    /**
     * 实体类上创建索引的测试
     */
    @Test
    public void testCteate() {
        //创建索引库
        template.createIndex(Item.class);
        //映射关系
        template.putMapping(Item.class);
    }

    @Autowired
    private ItemRepository repository;

    @Test

    public Integer saveAll() {
        List<Item> list = new ArrayList<Item>();
        list.add(new Item(1L, "小米手机7", "手机", "小米", 3299.00, "http://image.leyou.com/13123.jpg"));
        list.add(new Item(2L, "坚果手机R1", "手机", "锤子", 3699.00, "http://image.leyou.com/13123.jpg"));
        list.add(new Item(3L, "华为META10", "手机", "华为", 4499.00, "http://image.leyou.com/13123.jpg"));
        list.add(new Item(4L, "小米Mix2S", "手机", "小米", 4299.00, "http://image.leyou.com/13123.jpg"));
        list.add(new Item(5L, "荣耀V10", "手机", "华为", 2799.00, "http://image.leyou.com/13123.jpg"));
        repository.saveAll(repository.saveAll(list));
    return  1;
    }

    @Test
    public void deleteItem() {
//        repository.repository
    }
}