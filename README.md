# Besom
**Besom** - a broom made of twigs tied round a stick. Brooms and besoms are used for protection, to ward off evil spirits, and cleansing of ritual spaces. Also, an experimental pulumi-scala implementation, incidentally.

## Getting started
1. Prerequisites: Pulumi, Just, Java, scala-cli, go
2. Set scala-cli power to true `scala-cli config power true`
3. Publish locally and install necessary Besom Packages:
```bash
just publish-local-sdk
just publish-local-compiler-plugin
just install-language-plugin
```
4. Generate and publish k8s provider:
```bash
just generate-provider-sdk kubernetes
just publish-local-provider-sdk kubernetes
```
3. Write your own infrastructure. You can use the template available in this repository:
```shell
pulumi new ${path_to_the_besom_template_folder}
```
for example:
```shell
cd ..
mkdir infra
cd infra
pulumi new ../besom/template
```
## Explaining the file structure
`Pulumi.yaml` is your main pulumi file, explained [here](https://www.pulumi.com/docs/concepts/projects/project-file/). 

`project.scala` is the file containing your dependencies.

`Main.scala` is the entrypoint for your pulumi infrastructre as code. Resources created in `Pulumi.run{ ... }` block will be created by pulumi.

## Setting up the code editor

If you are using IntelliJ: 
1. install scala plugin
2. use bsp - [how to](https://www.jetbrains.com/help/idea/bsp-support.html)  

If you are using VSCode:
1. install Metals
2. open folder with your infra and start Metals.

This might not be enough if infra is just a part (a module) of your existing scala project. For this to work you have to make your build tool aware of infra code, for **sbt** create a corresponding module: 
   ```scala
lazy val infra = project.in(file("infrastructure")).settings(
   libraryDependencies ++= Seq(
   "org.virtuslab" %% "besom-kubernetes" % "0.0.1-SNAPSHOT",
   "org.virtuslab" %% "besom-core" % "0.0.1-SNAPSHOT"
   ))
   ```
This just informs your IDE about the existence of infrastructure module DO NOT REMOVE DEPENDENCIES FROM `project.scala` they are necessary in both places.

## Tips
- Pass `Context` everywhere you are using pulumi, for example when you are creating a resource.
- Don't be afraid to split your code into different files. You can easily import them back into `Main`
- Call your functions and use your variables. If the code is unused it will not be processed by pulumi and some resources might be missing.
- Listen to the compiler. On your `pulumi up` the code will be compiled it will show you issues in your code.
- Use whatever scala concepts you are familiar with, infrastructure as code in Besom is still a scala program, so you have the full potential of the language to work with.
- Pay attention to the types. You will be instantiating case classes to pass parameters, note their package of origin.