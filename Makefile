COMMON_OVERLAYS = tomcat
COMMON_CONF = postfix-local tomcat

include $(FAB_PATH)/common/mk/turnkey/mysql.mk
include $(FAB_PATH)/common/mk/turnkey.mk
