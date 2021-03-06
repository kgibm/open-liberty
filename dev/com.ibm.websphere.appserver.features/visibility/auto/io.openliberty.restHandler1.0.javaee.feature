-include= ~${workspace}/cnf/resources/bnd/feature.props

symbolicName = io.openliberty.restHandler1.0.javaee
visibility = private

-bundles= com.ibm.ws.rest.handler

IBM-Provision-Capability: osgi.identity; filter:="(&(type=osgi.subsystem.feature)(osgi.identity=com.ibm.websphere.appserver.restHandler-1.0))",\
  osgi.identity; filter:="(&(type=osgi.subsystem.feature)(|(osgi.identity=com.ibm.websphere.appserver.servlet-3.0)(osgi.identity=com.ibm.websphere.appserver.servlet-3.1)(osgi.identity=com.ibm.websphere.appserver.servlet-4.0)))"

IBM-Install-Policy: when-satisfied

kind=ga
edition=core
