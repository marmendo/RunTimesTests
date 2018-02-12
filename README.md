# RunTimesTests

NOTE: This is just a draft and will require some effort to configure it on your own environment

  * Install Apache JMeter 3.3 in RuntTimeTests/apache-jmeter-3.3 folder (see JMDIR var in run script)
  * Decompress apache-jmeter-3.zip contents (gui, run and Tests folder) check gui and run scripts.

  * Install JBoss EAP 7.1 in RuntTimeTests/jboss-eap-test/jboss-eap-7.1 folder 
  * Adjust bin/standalone.conf to use a maximum of 256Mb heap and reduced Metaspace: 
    JAVA_OPTS="-Xms32m -Xmx256m -XX:MetaspaceSize=16m -XX:MaxMetaspaceSize=256m...

  * Adjust the repositories folder in env.sh: REPO_BASE=/home/marmendo/Software/AMM/RHOAR/APPS/maven-repos
  * Check and run the "do" script inside each RuntTimeTests/xxxx-test folder

  * Adjust the test using RuntTimeTests/apache-jmeter-3.3/gui to edit the project in Tests/SimpleHttp-speedtest.jmx

  * Finally execute the tests running the **run** script
