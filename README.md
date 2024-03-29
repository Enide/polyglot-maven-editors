
[![Build Status](https://secure.travis-ci.org/Enide/polyglot-maven-editors.png)](http://travis-ci.org/Enide/polyglot-maven-editors)

# Eclipse Editors for Polyglot Maven

![](images/maven-owl-groovy.png)

see [releases](https://github.com/Enide/polyglot-maven-editors/releases)

This is done to make minimalist Gradle Editor,
and play with Eclipse Editor API,
and then maybe find some foundation for Editors in Nodeclipse, but it just as it.

And now there are simple editors for .atom and .groovy/.gy for [Polyglot Maven](https://github.com/takari/polyglot-maven)


## Using

Build locally with maven `mvn package`,
then check for update site archive in `org.nodeclipse.enide.editors.pom.site/target/`

In running Eclipse IDE, choose Help -> Install and choose the update site archive.

## To Develop

- Import `org.nodeclipse.enide.editors.pom.atom` as existing Eclipse project in Eclipse with PDE (e.g. Eclipse Standard or Enide Studio)
- open `plugins.xml`
- click `Launch an Eclipse application in Debug mode`

## Possible things to consider

- Check open issues
 
## Links
 
- https://github.com/takari/polyglot-maven
- https://github.com/takari/polyglot-maven-examples
- https://github.com/jbosstools/m2e-polyglot-poc

# Minimalist .proto files Editor (for Protocol Buffers and gRPC)

[![](images/protoEditor-logo.png)](http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=3146377) <-- drop this icon on Eclipse main toolbar to install, or visit <https://marketplace.eclipse.org/node/3146377>  
see [releases](https://github.com/Enide/polyglot-maven-editors/releases)

Using [ProtoBuf proto3 version](https://developers.google.com/protocol-buffers/docs/proto3)

![](images/Minimalist-proto-files-Editor-screenshot.png)

Well, first the was an idea "I can do an Editor for that", when I looked over *.proto files in a project.
Then I did a proper research and found [protobuf-dt](https://github.com/google/protobuf-dt) plugin.
But after trying it for a few days, I found that using it (as of 2016-11-1):

- [#12](https://github.com/google/protobuf-dt/issues/12) other languages options are treated as errors,
- [#13](https://github.com/google/protobuf-dt/issues/13) imports like `import "google/protobuf/empty.proto";` cant be resolved and become errors, 
- [#11](https://github.com/google/protobuf-dt/issues/11) validation errors **turn project into red** (even if everything works fine, Eclipse will be asking confirmation for any launch within a project),
- [#14](https://github.com/google/protobuf-dt/issues/14) after disabling validation, still keeps changing `.project` file to add `org.eclipse.xtext.ui.shared.xtextBuilder`
and validates all files
- [#15](https://github.com/google/protobuf-dt/issues/15) including those inside maven `target` folder (that will find `TODO`s left by ProtoBuf creators).

Part of these issues are possibly be caused by XText approach and limitations, so they likely won't be fixed soon.

XText is not small dependency, while the whole Minimalist Editor is less than **25KB** in size.

Latest version 2.3.0 of protobuf-dt requires at least Neon, while this minimalist Editor should work from Neon downto Kepler "and beyond".

It took couples of hours to [hard]code/test from within polyglot-maven-editors,
and 2 more to release all out.

Best regards,  
Paul Verest  
Happy developing!  

See how [Automatically generate Java from .proto with maven/m2e in Eclipse IDE](http://stackoverflow.com/questions/40426366/automatically-generate-java-from-proto-with-maven-m2e-in-eclipse-ide)

PPS. There has been also [Editor plugin made in 2008 by Arno Schmidmeier](https://arno.blogger.de/stories/1191168/) (very close, no preferences, no string highlight, `rpc` and `service` from gPRC not known of course)   
and [protoclipse](https://code.google.com/archive/p/protoclipse) (not tried).


