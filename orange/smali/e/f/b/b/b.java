public abstract class e.f.b.b.b implements java.util.Map$Entry {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<K:", */
	 /* "Ljava/lang/Object;", */
	 /* "V:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Map$Entry<", */
	 /* "TK;TV;>;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.f.b.b.b ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public abstract java.lang.Object getKey ( ) {
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()TK;" */
	 /* } */
} // .end annotation
} // .end method
public abstract java.lang.Object getValue ( ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TV;" */
/* } */
} // .end annotation
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .line 1 */
(( e.f.b.b.b ) p0 ).getKey ( ); // invoke-virtual {p0}, Le/f/b/b/b;->getKey()Ljava/lang/Object;
java.lang.String .valueOf ( v0 );
(( e.f.b.b.b ) p0 ).getValue ( ); // invoke-virtual {p0}, Le/f/b/b/b;->getValue()Ljava/lang/Object;
java.lang.String .valueOf ( v1 );
java.lang.String .valueOf ( v0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x1 */
java.lang.String .valueOf ( v1 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/2addr v2, v3 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "="; // const-string v0, "="
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
