package tools;

import java.util.List;





/**
 * 閸掑棝銆夊銉ュ徔缁拷
 * @author 
 *
 */
public class PageSupport {
	//瑜版挸澧犳い鐢电垳-閺夈儴鍤滄禍搴ｆ暏閹寸柉绶崗锟�	private int currentPageNo = 1;
	
	//閹粯鏆熼柌蹇ョ礄鐞涱煉绱�
	private int totalCount = 0;
	
	//妞ょ敻娼扮�褰掑櫤
	private int pageSize = 0;
	
	//閹銆夐弫锟絫otalCount/pageSize閿涳拷1閿涳拷
	private int totalPageCount = 1;

   
    
	

	private String url="";
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

	/*public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		if(currentPageNo > 0){
			this.currentPageNo = currentPageNo;
		}
	}*/

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		if(totalCount > 0){
			this.totalCount = totalCount;
			//鐠佸墽鐤嗛幀濠氥�閺侊拷
			this.setTotalPageCountByRs();
		}
	}
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if(pageSize > 0){
			this.pageSize = pageSize;
		}
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
	public void setTotalPageCountByRs(){
		if(this.totalCount % this.pageSize == 0){
			this.totalPageCount = this.totalCount / this.pageSize;
		}else if(this.totalCount % this.pageSize > 0){
			this.totalPageCount = this.totalCount / this.pageSize + 1;
		}else{
			this.totalPageCount = 0;
		}
	}
	
}