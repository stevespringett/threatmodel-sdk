[![Build Status](https://github.com/stevespringett/threatmodel-sdk/workflows/Maven%20CI/badge.svg)](https://github.com/stevespringett/threatmodel-sdk/actions?workflow=Maven+CI)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/a70de450d92041cf8966b88ab35230c2)](https://www.codacy.com/app/stevespringett/threatmodel-sdk?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=stevespringett/threatmodel-sdk&amp;utm_campaign=Badge_Grade)
[![License](https://img.shields.io/badge/license-Apache%202.0-brightgreen.svg)][Apache 2.0]

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
The Threatmodel SDK is available on the Maven Central Repository.

```xml
<dependency>
    <groupId>us.springett</groupId>
    <artifactId>threatmodel-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

Copyright & License
-------------------

ThreatModel SDK is Copyright (c) Steve Springett. All Rights Reserved.

All other trademarks are property of their respective owners.

Permission to modify and redistribute is granted under the terms of the [Apache 2.0] license.

  [Apache 2.0]: http://www.apache.org/licenses/LICENSE-2.0.txt
