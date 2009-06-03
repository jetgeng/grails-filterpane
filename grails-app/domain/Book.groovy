class Book {
	Author author
	String title
    BookType bookType
	Date releaseDate
	Boolean inStock
	BigDecimal price
	Date lastUpdated
    String readPriority
    BigDecimal cost
	
	static constraints = {
		title(blank:false)
		author()
        bookType(nullable:true)
		releaseDate()
		price()
		inStock()
		lastUpdated(nullable:true)
        readPriority(inList:['Low','Normal','High'])
        cost(min:0.00)
	}
	
	static mapping = {
		author lazy:false
	}
	
	String toString() {
		return title
	}
}