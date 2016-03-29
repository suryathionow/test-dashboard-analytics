package page

import geb.Page

/**
 * Created by c07nw91fg1hw on 3/29/16.
 */
class SegmentationListPage extends Page{
    static content = {
        addNewSegmentPage       {$('input#add-new-segment-button')}
    }
}
