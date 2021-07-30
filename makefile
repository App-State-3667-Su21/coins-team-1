JUNIT5_JAR = junit-platform-console-standalone-1.2.0.jar 
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher

compile: Coin.java \
	Penny.java PennyTest.java \
	USDime.java USDimeTest.java \
	USNickel.java USNickelTest.java \
	USQuarter.java USQuarterTest.java \
	HalfDollar.java HalfDollarTest.java \
	Dollar.java DollarTest.java \
	CADNickel.java CADNickelTest.java \
	CADDime.java CADDimeTest.java \
	CADQuarter.java CADQuarterTest.java \
	FiftyCent.java FiftyCentTest.java \
	Loonie.java LoonieTest.java \
	Toonie.java ToonieTest.java \
	$(JUNIT5_JAR)
	@echo "Compiling..."
	javac -cp .:$(JUNIT5_JAR) *.java

clean:
	rm -f *~
	rm -f *.class

test: $(JUNIT5_JAR)
	java -cp .:$(JUNIT5_JAR) $(JUNIT5_RUNNER) --scan-class-path 
