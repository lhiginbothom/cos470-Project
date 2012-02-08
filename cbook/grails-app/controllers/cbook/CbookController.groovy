package cbook

class CbookController {
	
	def scaffold = true
	def cbookService

    def index() { 
		redirect(action: list)
		}
	
	def home = {
		render "<h1>Real children don't eat quiche</h1>"
	}
	def ajaxRandom = {
		def randomCbook = cbookService.getRandomCbook()
		render (view: "random", model:[cbook: randomCbook])
		//render "<q>${randomCbook.title}</q>"+"<p>${randomCbook.author}</p>"+"<p>${randomCbook.isbn}</p>"+"<p>${randomCbook.description}</p>"+"<p>${randomCbook.minLevel}</p>"+"<p>${randomCbook.maxLevel}</p>"+"<p>${randomCbook.lang}</p>"+"<p>${randomCbook.cat}</p>"
	}
	
	def random = {
		def randomCbook = cbookService.getRandomCbook()
//		def allCbooks = Cbook.list() //obtain list of quotes
//		
//		if(allCbooks.size() > 0){
//			def randomIdx = new Random().next(allCbooks.size())//selects random book
//			randomCbook = allCbooks[randomIdx]
//		}
		[cbook: randomCbook] //passes book to view
		
//		def staticTitle = "Where the Wild Things Are"
//		def staticAuthor = "Maurice Sendak"
//		def staticISBN = "0060254920"
//		def staticDescription = "Has wild whatnots in it."
//		def staticMinLevel = "2"
//		def staticMaxLevel = "6"
//		def staticLang = "English"
//		def staticCat = "General Leisure Reading"
//[title: staticTitle, author: staticAuthor, isbn: staticISBN, description: staticDescription, minLevel: staticMinLevel, maxLevel: staticMaxLevel, lang: staticLang, cat: staticCat]
	}
}
