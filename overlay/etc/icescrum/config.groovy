/* IceScrum configuration file */

// database configuration
dataSource.driverClassName = "com.mysql.jdbc.Driver"
dataSource.dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
dataSource.url = "jdbc:mysql://localhost:3306/DB_NAME?useUnicode=true&characterEncoding=utf8&autoReconnect=true"
dataSource.username = "DB_USER"
dataSource.password = "DB_PASS"

dataSource.pooled = true
dataSource.properties.maxActive = 50
dataSource.properties.maxIdle = 25
dataSource.properties.minIdle = 1
dataSource.properties.initialSize = 1
dataSource.properties.minEvictableIdleTimeMillis = 1800000
dataSource.properties.timeBetweenEvictionRunsMillis = 1800000
dataSource.properties.numTestsPerEvictionRun = 3
dataSource.properties.maxWait = 10000
dataSource.properties.testOnBorrow = true
dataSource.properties.testWhileIdle = true
dataSource.properties.testOnReturn = false
dataSource.properties.validationQuery = "SELECT 1"

// icescrum configuration
icescrum.createDefaultAdmin = true
icescrum.gravatar.enable = true
icescrum.baseDir = "BASE_DIR"
icescrum.log.dir = "/var/lib/tomcat8/logs"

icescrum.registration.enable = true
icescrum.invitation.enable = true
icescrum.login.retrieve.enable = true
icescrum.attachments.enable = true
icescrum.timezone.default = "UTC"

icescrum.project.import.enable = true
icescrum.project.export.enable = true
icescrum.project.creation.enable = true
icescrum.project.private.enable = true
icescrum.project.private.default = false

icescrum.serverURL="http://mytkldev.tklapp.com"

// grails configuration
grails.mail.host = "localhost"
grails.mail.port = 25

