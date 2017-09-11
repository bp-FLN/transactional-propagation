package transactional.propagation

class BookController {

    def transactionalService

    def index() {
        transactionalService.start()
    }
}
