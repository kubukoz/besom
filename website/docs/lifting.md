---
title: Lifting
---

Pulumi supports a feature called _lifting_ which allows the user to access properties of data structures held by an Output as if the value was not inside of the asynchronous datatype. Let's look at our handy S3 bucket again:
```scala
import besom.*
import besom.api.aws
​
@main def main = Pulumi.run {
  val s3Bucket: Output[aws.s3.Bucket] = aws.s3.Bucket("my-bucket")
​
  Output(Pulumi.exports(s3Url = s3Bucket.map(_.websiteEndpoint)))
}
```
As you can see here we're accessing the property `websiteEndpoint` on `aws.s3.Bucket` class by first `map`ping over the Output. This syntax can be replaced in Besom thanks to first class support of _lifting_ (via Scala 3 extension methods generated in packages for Besom):
```scala
extension (o: Output[aws.s3.Bucket])
  def url: Output[String] = o.map(_.websiteEndpoint) 
```
This allows for this syntax:


```scala
Output(Pulumi.exports(s3Url = s3Bucket.websiteEndpoint))
```


These lifted syntaxes cover more cases and work recursively so you can access even the properties on nested data structures like `a.b.c.d` with a direct syntax.
