package g242

import grails.test.spock.IntegrationSpec

class SupportedSpec extends IntegrationSpec {

    @Delegate
    WizardSupport wizard = new WizardSupport()

    def "test method"() {
        given:
        assert sessionFactory != null

        expect:
        1 == 1
    }
}
