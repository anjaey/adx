package com.bhe.business.article;

import org.springframework.stereotype.Service;

import com.bhe.dao.mybatis.model.ArticleEntity;
import com.bhe.util.common.BusinessData;

/**
 * 文章相关业务结果
 * @Description
 * @author zhangyu [2015年7月25日 上午9:54:02]
 */
@Service
public interface IArticleBusiness {
	
	/**
	 * 分页查询文章信息
	 * 提供根据文章标题进行检索
	 * zhangyu [2015年7月25日 上午9:55:47]
	 * 
	 * @param pagesize
	 * @param pageindex
	 * @param orderFile
	 * @param orderType
	 * @param title 文章标题
	 * @return
	 * @throws Exception
	 */
	public BusinessData<ArticleEntity> selectArclist(Integer pageSize,Integer pageIndex,
			String orderFile,String orderType,String title);
	
	/**
	 * 文章内容的添加
	 * zhangyu [2015年7月25日 上午9:57:25]
	 * 
	 * @param art
	 * @return
	 * @throws Exception
	 */
	public BusinessData<Boolean> insertArcinfo(ArticleEntity art);
	
	/**
	 * 根据uuid删除文章信息
	 * zhangyu [2015年7月25日 上午10:01:50]
	 * 
	 * @param uuids
	 * @return
	 * @throws Exception
	 */
	public BusinessData<Boolean> deleteArcinfo(String uuid);
	
	/**
	 * 修改文章
	 * zhangyu [2015年7月25日 上午10:02:56]
	 * 
	 * @param art
	 * @return
	 * @throws Exception
	 */
	public BusinessData<Boolean> updateArcinfo(ArticleEntity art);
	
	/**
	 * 根据主键查询文章信息   
	 * zhangyu [2015年7月25日 上午10:09:41]
	 * 
	 * @param uuid
	 * @return
	 * @throws Exception
	 */
	public BusinessData<ArticleEntity> selectArcByUuid(String uuid);
	
	/**
	* 创 建 人： zhangyu
	* 日     期：  2015年7月30日上午10:43:00
	* 描     述： 根据文章分类编号分页查询文章信息
	* -----------------------------
	* 修 改 人： 
	* 日     期： 
	* 描     述： TODO(注明修改原因) 
	* -----------------------------
	 */
	public BusinessData<ArticleEntity> selectArtByClaid(long id,Integer pageIndex,Integer pageSize,String orderType,String orderFile);
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月1日上午9:34:58
	 * 描     述：根据条件查询数据
	 * @param pageIndex				当前页数
	 * @param pageSize				每页显示数
	 * @param orderParam			排序参数
	 * @param orderRank				排序方式 [倒序(desc)还是正序(null)]
	 * @param articleType			属性[普通,图文,焦点,头条,推荐,草稿,幻灯]
	 * @param title					标题
	 * @param uuid					文章uuid
	 * @param author				作者
	 * @param dateFrom				修改时间从
	 * @param dateTo				修改时间到
	 */
	public BusinessData<ArticleEntity> selectArticleBySelective(Integer pageIndex, Integer pageSize, String orderParam, 
			String orderRank, String articleType, String title, String uuid, String author, String dateFrom, String dateTo);
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月3日上午9:27:15
	 * 描     述：根据状态查询数据
	 * @param pageIndex				当前页数
	 * @param pageSize				每页显示数
	 * @param orderParam			排序参数
	 * @param orderRank				排序方式 [倒序(desc)还是正序(null)]
	 * @param status				状态;0正常 1删除 2草稿
	 */
	public BusinessData<ArticleEntity> selectArticleByStatus(Integer pageIndex, Integer pageSize, String orderParam, 
			String orderRank, int status);
	
	/**
	 * 创 建 人：  schoff
	 * 日     期：  2015年8月3日上午9:27:15
	 * 描     述：根据状态查询不是该状态的数据
	 * @param pageIndex				当前页数
	 * @param pageSize				每页显示数
	 * @param orderParam			排序参数
	 * @param orderRank				排序方式 [倒序(desc)还是正序(null)]
	 * @param status				不包含的状态;0不包含正常 1不包含删除 2不包含草稿
	 */
	public BusinessData<ArticleEntity> selectArticleByNoStatus(Integer pageIndex, Integer pageSize, String orderParam, String orderRank,Long classId,int noStatus,String title);
	
	/**
	 * 创 建 人：  Dengpeng
	 * 日     期：  2015年8月13日下午4:34:22
	 * 描     述：根据ClassId 查询 正常所有文章
	 * @param classId
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 * <br>-----------------------------<br>
	 * 修 改 人： 
	 * 日     期： 
	 * 描     述： (注明修改原因) 
	 * <br>-----------------------------<br>
	 */
	public BusinessData<ArticleEntity> selectArticleByClassId(Long classId,Integer pageIndex, Integer pageSize);
	
}
