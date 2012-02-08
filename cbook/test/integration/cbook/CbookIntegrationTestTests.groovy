package cbook

import static org.junit.Assert.*
import org.junit.*

class CbookIntegrationTestTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {
        
		def testbook1 = new Cbook(title: "Children's Test Book", author: "Mr. Test", minLevel: "3",maxLevel:"8", lang:"Japanese", cat: "Language Learning")
		assertTrue(testbook1.validate())
		
		def testbook2 = new Cbook(author:"Mrs. Test", minLevel:"3", maxLevel:"8",lang:"Russian", cat:"Mathematics")
		assertFalse(testbook2.validate())
    }
}
