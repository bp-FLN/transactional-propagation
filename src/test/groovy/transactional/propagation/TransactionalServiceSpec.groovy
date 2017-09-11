package transactional.propagation

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class TransactionalServiceSpec extends Specification implements ServiceUnitTest<TransactionalService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
