public class fr.mbs.binary.Octets$TooBigForConversionException extends java.lang.RuntimeException {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lfr/mbs/binary/Octets; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "TooBigForConversionException" */
} // .end annotation
/* # direct methods */
public fr.mbs.binary.Octets$TooBigForConversionException ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Octets too large for conversion! value: "; // const-string v1, "Octets too large for conversion! value: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x10 */
(( java.math.BigInteger ) p2 ).toString ( v1 ); // invoke-virtual {p2, v1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = ", max value: "; // const-string p2, ", max value: "
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.math.BigInteger ) p1 ).toString ( v1 ); // invoke-virtual {p1, v1}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
return;
} // .end method
