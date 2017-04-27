@echo -----------------------------------------------------------------------------
@echo PRODUCTION
@echo -----------------------------------------------------------------------------
mvn clean package -Dmaven.test.skip=true -Pprodjuction
@pause