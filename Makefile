FILENAME=letinit.kt

build:
	@kotlinc ${FILENAME} -include-runtime -d output.jar 2</dev/null
	@java -jar output.jar

debug:
	kotlinc ${FILENAME} -include-runtime -d output.jar
	java -jar output.jar

run:
	@java -jar output.jar
	
clean:
	@rm *.jar