package com.windsound.project.service.db2;

import com.windsound.project.entity.db2.Word;

import java.util.List;

/**
 * 词条 服务层
 *
 * @author admin
 * @date 2019-12-30
 */
public interface IWordService
{
	/**
     * 查询词条信息
     *
     * @param id 词条ID
     * @return 词条信息
     */
	public Word selectWordById(Long id);

	/**
     * 查询词条列表
     *
     * @param word 词条信息
     * @return 词条集合
     */
	public List<Word> selectWordList(Word word);

	/**
     * 新增词条
     *
     * @param word 词条信息
     * @return 结果
     */
	public int insertWord(Word word);

	/**
     * 修改词条
     *
     * @param word 词条信息
     * @return 结果
     */
	public int updateWord(Word word);

}
