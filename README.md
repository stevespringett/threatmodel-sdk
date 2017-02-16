[![Build Status](https://travis-ci.org/stevespringett/threatmodel-sdk.svg?branch=master)](https://travis-ci.org/stevespringett/threatmodel-sdk)
[![Coverity Status](https://img.shields.io/coverity/scan/10490.svg)](https://scan.coverity.com/projects/stevespringett-threatmodel-sdk)

ThreatModel SDK
=====================================

The ThreatModel SDK is a minimalistic Java library that provides a basic 
vendor-neutral object model along with the ability to parse reports 
generated from common threat modeling tools.

Intent and Purpose
-------------------

The intent of the ThreatModel SDK is to represent threat model data in a
normalized way, regardless of approach, tool, or vendor. The primary 
purpose of the SDK is to facilitate the automation of threat model data
by exfiltrating threat intelligence from the model so that identified 
threats can be automatically added to a teams backlog or defect tracking
system.

The goal of this project is NOT to graphically represent threat model 
data through user interfaces. 

Supported Threat Modeling Tools
-------------------

* Microsoft Threat Modeling Tool 2016

Compiling
-------------------

> $ mvn clean package

Usage Example
-------------------
```java
// Threat model file to open
File file = new File("/path/to/threatmodel.tm7");

// Creates a normalized, vender-neutral ThreatModel object
ThreatModel threatModel = ThreatModelFactory
    .parse(file, ThreatModelingTool.MICROSOFT_THREAT_MODELING_TOOL_2016);
```

```java
// Java Bean conventions
Threat threat = new Threat();
threat.setName("XSS");
threat.setRisk(risk);

// Fluent interface
Threat threat = new Threat()
  .name("XSS")
  .risk(risk);
```

Maven Usage
-------------------
The Threatmodel SDK is currently pre-release software but snapshot builds
can be used and are available on the Maven Central Repository.

```xml
<dependency>
    <groupId>us.springett</groupId>
    <artifactId>threatmodel-sdk</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

Copyright & License
-------------------

ThreatModel SDK is Copyright (c) Steve Springett. All Rights Reserved.

All other trademarks are property of their respective owners.

Permission to modify and redistribute is granted under the terms of the [Apache 2.0] license.

  [Apache 2.0]: http://www.apache.org/licenses/LICENSE-2.0.txt
