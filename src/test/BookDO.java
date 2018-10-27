package test;

public class BookDO {
		
	private Integer id;
	private String title;
	private String author;
	private Integer publisherld;
	private String publishdate;
	private String isbn;
	private Integer wordscount;
	private Float unitprice;
	private String contentdescription;
	private String aurhordescription;
	private String  editorcomment;
	private String toc;
	private Integer categoryid;
	private Integer clicks;
	public BookDO() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "BookDO [id=" + id + ", title=" + title + ", author=" + author + ", publisherld=" + publisherld
				+ ", publishdate=" + publishdate + ", isbn=" + isbn + ", wordscount=" + wordscount + ", unitprice="
				+ unitprice + ", contentdescription=" + contentdescription + ", aurhordescription=" + aurhordescription
				+ ", editorcomment=" + editorcomment + ", toc=" + toc + ", categoryid=" + categoryid + ", clicks="
				+ clicks + "]";
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPublisherld() {
		return publisherld;
	}
	public void setPublisherld(Integer publisherld) {
		this.publisherld = publisherld;
	}
	public String getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(String publishdate) {
		this.publishdate = publishdate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getWordscount() {
		return wordscount;
	}
	public void setWordscount(Integer wordscount) {
		this.wordscount = wordscount;
	}
	public Float getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(Float unitprice) {
		this.unitprice = unitprice;
	}
	public String getContentdescription() {
		return contentdescription;
	}
	public void setContentdescription(String contentdescription) {
		this.contentdescription = contentdescription;
	}
	public String getAurhordescription() {
		return aurhordescription;
	}
	public void setAurhordescription(String aurhordescription) {
		this.aurhordescription = aurhordescription;
	}
	public String getEditorcomment() {
		return editorcomment;
	}
	public void setEditorcomment(String editorcomment) {
		this.editorcomment = editorcomment;
	}
	public String getToc() {
		return toc;
	}
	public void setToc(String toc) {
		this.toc = toc;
	}
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	public Integer getClicks() {
		return clicks;
	}
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	

}
