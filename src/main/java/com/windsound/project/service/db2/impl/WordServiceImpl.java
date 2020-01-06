package com.windsound.project.service.db2.impl;

import java.util.List;

import com.windsound.project.entity.db2.Word;
import com.windsound.project.mapper.db2.WordMapper;
import com.windsound.project.service.db2.IWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 词条 服务层实现
 *
 * @author admin
 * @date 2019-12-30
 */
@Service
public class WordServiceImpl implements IWordService
{
	@Autowired
	private WordMapper wordMapper;

	/**
     * 查询词条信息
     *
     * @param id 词条ID
     * @return 词条信息
     */
    @Override
	public Word selectWordById(Long id)
	{
	    return wordMapper.selectWordById(id);
	}

	/**
     * 查询词条列表
     *
     * @param word 词条信息
     * @return 词条集合
     */
	@Override
	public List<Word> selectWordList(Word word)
	{
	    return wordMapper.selectWordList(word);
	}

    /**
     * 新增词条
     *
     * @param word 词条信息
     * @return 结果
     */
	@Override
	@Transactional(value = "db2TransactionManager")
	public int insertWord(Word word)
	{
	    return wordMapper.insertWord(word);
	}

	/**
     * 修改词条
     *
     * @param word 词条信息
     * @return 结果
     */
	@Override
	public int updateWord(Word word)
	{
	    return wordMapper.updateWord(word);
	}

}
