FROM jboss/wildfly:10.1.0.Final

ARG username
ARG password

RUN /opt/jboss/wildfly/bin/add-user.sh $username $password --silent

ADD org/ /opt/jboss/wildfly/modules/org
ADD standalone.xml /opt/jboss/wildfly/standalone/configuration/