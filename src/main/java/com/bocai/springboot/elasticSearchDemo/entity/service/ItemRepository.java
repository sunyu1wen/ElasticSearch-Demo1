package com.bocai.springboot.elasticSearchDemo.entity.service;

import com.bocai.springboot.elasticSearchDemo.entity.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author ${user}
 * @version V1.0
 * @ClassName: ${file_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @Date ${date} ${time}
 */
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {
}
