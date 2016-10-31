package org.nodeclipse.enide.editors.proto.highlight;

public class Words {
	
    public static final String[] KEYWORDS = {
    	//https://developers.google.com/protocol-buffers/docs/proto3	
    		
        "double",
        "float",
        "int32",
        "int64",
        "uint32",
        "uint64",
        "sint32",
        "sint64",
        "fixed32",
        "fixed64",
        "sfixed32",
        "sfixed64",
        "bool",
        "string",
        "bytes",
        
        "syntax",
        "option",
        "package",
        "import",
        
        "message",
        "enum",
        "repeated",
        
        //gRPC only?
        "stream",
        "service",
        "rpc",
        "returns",
        
        "reserved",
        "true",
        "false",
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
