iceScrum - Agile collaborative development
==========================================

`iceScrum`_ is a web application for using Scrum, the most popular agile
development method, while keeping the spirit of a collaborative
workspace. It also offers virtual boards with post-its for sprint
backlog, product backlog and others.

This appliance includes all the standard features in `TurnKey Core`_,
and on top of that:

- iceScrum configurations:
   
   - installed from upstream WAR to /var/lib/tomcat7/webapps
   - iceScrum base directory set to: /var/local/lib/icescrum.

- Tomcat and Java configurations
   
   - Uses OpenJDK 7 Java runtime environment
   - Configured Tomcat admin/manager roles and admin user.
   - Configured Tomcat HTTP connector to bind to port 80 (default:
     8180).
   - Configured SSL port to bind to port 443 (default: 8443).
   - Disabled AJP connector on port 8009 (security).
   - Tomcat and Java environment variables configuration system wide.

- SSL support out of the box.
- Includes postfix MTA (bound to localhost) for sending of email (e.g.
  password recovery).
- Webmin modules for configuring MySQL and Postfix.

Credentials *(passwords set at first boot)*
-------------------------------------------

-  Webmin, SSH, MySQL, phpMyAdmin: username **root**
-  iceScrum: username **admin**

.. _iceScrum: http://www.icescrum.org/en/
.. _TurnKey Core: http://www.turnkeylinux.org/core
