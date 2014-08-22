package g242

import grails.converters.JSON

class PersonController {

    static scaffold = true

    def testPost(Person person){
        log.debug "JSONning ${person}"
        render person as JSON
    }
}
