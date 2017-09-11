package transactional.propagation

import grails.gorm.transactions.Transactional
import org.springframework.transaction.annotation.Propagation

@Transactional
class TransactionalService {

    def start() {
        createBook()
        createAnotherBook()
        throw new RuntimeException('foo')
    }

    def createBook() {
        new Book(name: 'one').save(failOnError: true)
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    def createAnotherBook() {
        new Book(name: 'two').save(failOnError: true)
    }

}
