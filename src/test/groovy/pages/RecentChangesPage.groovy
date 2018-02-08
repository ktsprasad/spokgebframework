package pages

import geb.Page;

class RecentChangesPage extends Page {
    static url="https://en.wikipedia.org/wiki/Special:RecentChanges"

    static at={heading.isDisplayed()}
    static content = {
        heading { $("h1#firstHeading") }
        filter50 { $("span", class: "mw-changeslist-date") }
        searchText { $("div#simpleSearch") }
        resiltsRows {$("li.mw-changeslist-line-not-watched")}
    }
}
