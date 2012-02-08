package cbook

class Cbook {

	String title
	String author
	int isbn
	String description
	int minLevel
	int maxLevel
	String lang
	String cat
	
    static constraints = {
		isbn(nullable:true) //one is able to not put in an ISBN number
		description(maxSize:1000,nullable:true)//one doesn't have to enter a description,
												//but if they do, it cannot exceed 1000 chars
    }
}
