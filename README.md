Selenium-cucumber-java
This repository contains selenium-cucumber-java framework for http://automationpractice.com/index.php? with 3 following features. 
1. SignUp
2. Login
3. Cart

Installation (pre-requisites)
JDK 1.8+ (make sure Java class path is set)
Maven (make sure .m2 class path is set)
Eclipse
Eclipse Plugins for
Maven
Cucumber
Browser driver (make sure you have your desired browser driver and class path is set)

Framework set up
Fork / Clone repository from here or download zip and set it up in your local workspace.

Project structure:
The framework consists of following section
1. Feature: Where BDD's or feature files are written using Gherkin language
2. StepDefinition: Step definition is a binding class between feature file and the other page classes. It contains various step class where actual BDD syntax is understood by machine language.
3. Page - Acutal selenium code is written in page class, where this class is designed using page factory design.
4. Manager - Contains FileReaderManager, PageObjectManager and WebDriverManager each classes are self-explainatory.
5. Configuration.properties - where url, environment, browser type etc are mentioned for easy of use.

How to run?

There is a TestRunner.java file, right click on it, select run as Junit. Below is the structure of runner file where @Cart, @Login and @Signup are the tag name used in the respective feature file. 

@CucumberOptions(
		features = "src/test/resources/Feature",
				glue= {"StepDefinition"},
				plugin = { "pretty", "html:target/cucumber-reports" },
				tags = {"@Cart"},
				//tags = {"@Login"},
				//tags = {"@Signup"}
				monochrome = true
		)
		
Other ways to run the test by -  mvn test from the location where is pom.xml is located. Before running make sure you have set the classpath for JDK and Maven.

Reports: This framework generates simple html report under project target folder :automationpractice\target.

Why did I pick this tool and framework:

I have picked Java, Cucumber, Selenium WebDriver, Maven, Junit and Eclipse IDE.
As we all know BDD give good representation of acceptance criteria and human readable form.
Java cucumber Maven project is JVM based and, it's Page Factory design is easy to follow, maintain and add new pages.