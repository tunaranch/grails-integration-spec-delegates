package g242


class WizardSupport {

    def wizardService

    def grailsApplication

    def sessionFactory

    def dataSource

    def codecLookup

    def grailsUrlConverter

    def messageSource


    public void cease() {
        wizardService.cease()
    }
}