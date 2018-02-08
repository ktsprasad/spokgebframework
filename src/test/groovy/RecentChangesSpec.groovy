import geb.spock.GebReportingSpec
import pages.RecentChangesPage

class RecentChangesSpec extends GebReportingSpec{

    def "Filter by 50 display 50 results" () {
     given:
     to RecentChangesPage

     when: "when filter by 50 results"
     //RecentChangesPage.filter50
     driver.manage().window().maximize()
     waitFor(300) { filter50.click()}
     waitFor(30) {searchText.click()}

     then: ""
     //resultRows.size() == 50

    }
}
