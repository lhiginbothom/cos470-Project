package cbook

class CbookService {
	boolean transactional = false

   def getRandomCbook(){
	   
	   def allCbooks = Cbook.list()
	   def randomCbook = null
	   if(allCbooks.size() > 0){
		   def randomIdx = new Random().nextInt(allCbooks.size())
		   randomCbook = allCbooks[randomIdx]
	   }
	   return randomCbook   
	}
}
