griffon.project.dependency.resolution = {
    inherits "global"
    log "warn"
    repositories {
        griffonHome() 
        mavenCentral()
        mavenRepo 'http://repository.sonatype.org/content/groups/public'
    }
    dependencies {
        compile('com.amazonaws:aws-java-sdk:1.3.17',
                'org.apache.httpcomponents:httpcore:4.1.3',
                'org.apache.httpcomponents:httpcomponents-client:4.1.3',
                'commons-codec:commons-codec:1.6') {
            excludes 'commons-logging'        
        }
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (@griffon.version@)"
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}