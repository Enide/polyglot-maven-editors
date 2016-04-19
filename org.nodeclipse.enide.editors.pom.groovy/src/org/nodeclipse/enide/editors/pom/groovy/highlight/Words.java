package org.nodeclipse.enide.editors.pom.groovy.highlight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Words {
	
	  
	// from /polyglot-yaml/src/main/java/org/sonatype/maven/polyglot/yaml/ModelRepresenter.java {
	private static List<String> ORDER_MODEL = new ArrayList<String>(Arrays.asList(
			  "modelEncoding",
	          "modelVersion",
	          "parent",
	          "groupId",
	          "artifactId",
	          "version",
	          "packaging",
	          
	          "name",
	          "description",
	          "url",
	          "inceptionYear",
	          "organization",
	          "licenses",
	          "developers",
	          "contributers",
	          "mailingLists",
	          "scm",
	          "issueManagement",
	          "ciManagement",
	          
	          "properties",
	          "prerequisites",
	          "modules",
	          "dependencyManagement",
	          "dependencies",
	          "distributionManagement",
	          "repositories",
	          "pluginRepositories",
	          "build",
	          "profiles",
	          "reporting"
	          ));
	  private static List<String> ORDER_DEVELOPER = new ArrayList<String>(Arrays.asList(
			  "name", "id", "email"));
	  private static List<String> ORDER_CONTRIBUTOR = new ArrayList<String>(Arrays.asList(
			  "name", "id", "email"));
	  private static List<String> ORDER_DEPENDENCY = new ArrayList<String>(Arrays.asList(
			  "groupId", "artifactId", "version", "type", "classifier", "scope"));
	  private static List<String> ORDER_PLUGIN = new ArrayList<String>(Arrays.asList(
			  "groupId", "artifactId", "version", "inherited", "extensions", "configuration"));
	  //}	

    public static final String[] KEYWORDS = {
		// Java keywords
        "assert",
        "if", "else",
        "void",
        "new", "return",
        "try", "catch", 
        
        // Groovy stuff
        "def", 
        
        //POM
        "project",
        //ORDER_MODEL {
		  "modelEncoding",
          "modelVersion",
          "parent",
          "groupId",
          "artifactId",
          "version",
          "packaging",
          
          "name",
          "description",
          "url",
          "inceptionYear",
          "organization",
          "licenses",
          "developers",
          "contributers",
          "mailingLists",
          "scm",
          "issueManagement",
          "ciManagement",
          
          "properties",
          "prerequisites",
          "modules",
          "dependencyManagement",
          "dependencies",
          "distributionManagement",
          "repositories",
          "pluginRepositories",
          "build",
          "profiles",
          "reporting",
        //}
        //+
        "plugins", 
        "plugin",
 
    };

    public static final String[] RESERVEDWORDS = { "let", "yield",//
            "abstract", "enum", "int", "short",//
            "boolean", "export", "interface", "static",//
            "byte", "extends", "long", "super",//
            "char", "final", "native", "synchronized",//
            "class", "float", "package", "throws",//
            "const", "goto", "private", "transient",//
            "debugger", "implements", "protected", "volatile",//
            "double", "import", "public",//
            
    };

}
