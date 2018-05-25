### @SerializedName

Java class example,

```java
public class Person {

    @SerializedName("name")
    private String personName;

    @SerializedName("bd")
    private String birthDate;

}
```

This class has two fields that represent the person name and birth date of a person. These fields are annotated with the @SerializedName annotation. The parameter (value) of this annotation is the name to be used when serialising and deserialising objects. For example, the Java field personName is represented as name in JSON.

JSON Example,
```json
{
    "name":"chintan",
    "bd":"01-01-1990"
}
```
