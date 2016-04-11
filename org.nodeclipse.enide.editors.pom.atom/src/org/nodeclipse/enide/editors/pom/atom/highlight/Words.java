package org.nodeclipse.enide.editors.pom.atom.highlight;

public class Words {

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
        "modelVersion",
        "groupId", "artifactId", "id", "version", "packaging",
        "name", 
        "description",
        "properties",
        "modules",
        "build", 
        "plugins", 
        "plugin",
        "repositories",
 
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
