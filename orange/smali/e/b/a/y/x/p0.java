public class e.b.a.y.x.p0 implements e.b.a.y.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Object b;
	 public final Integer c;
	 public final Integer d;
	 public final java.lang.Class e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public final java.lang.Class f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.n g;
public final java.util.Map h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Le/b/a/y/v<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.r i;
public Integer j;
/* # direct methods */
public e.b.a.y.x.p0 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* "Le/b/a/y/n;", */
/* "II", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Le/b/a/y/v<", */
/* "*>;>;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Le/b/a/y/r;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
e.b.a.e0.r .a ( p1 );
this.b = p1;
final String p1 = "Signature must not be null"; // const-string p1, "Signature must not be null"
/* .line 3 */
e.b.a.e0.r .a ( p2,p1 );
/* check-cast p2, Le/b/a/y/n; */
this.g = p2;
/* .line 4 */
/* iput p3, p0, Le/b/a/y/x/p0;->c:I */
/* .line 5 */
/* iput p4, p0, Le/b/a/y/x/p0;->d:I */
/* .line 6 */
e.b.a.e0.r .a ( p5 );
/* check-cast p5, Ljava/util/Map; */
this.h = p5;
final String p1 = "Resource class must not be null"; // const-string p1, "Resource class must not be null"
/* .line 7 */
e.b.a.e0.r .a ( p6,p1 );
/* check-cast p6, Ljava/lang/Class; */
this.e = p6;
final String p1 = "Transcode class must not be null"; // const-string p1, "Transcode class must not be null"
/* .line 8 */
e.b.a.e0.r .a ( p7,p1 );
/* check-cast p7, Ljava/lang/Class; */
this.f = p7;
/* .line 9 */
e.b.a.e0.r .a ( p8 );
/* check-cast p8, Le/b/a/y/r; */
this.i = p8;
return;
} // .end method
/* # virtual methods */
public void a ( java.security.MessageDigest p0 ) {
/* .locals 0 */
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Le/b/a/y/x/p0; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Le/b/a/y/x/p0; */
/* .line 3 */
v0 = this.b;
v2 = this.b;
v0 = (( java.lang.Object ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.g;
v2 = this.g;
v0 = /* .line 4 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Le/b/a/y/x/p0;->d:I */
/* iget v2, p1, Le/b/a/y/x/p0;->d:I */
/* if-ne v0, v2, :cond_0 */
/* iget v0, p0, Le/b/a/y/x/p0;->c:I */
/* iget v2, p1, Le/b/a/y/x/p0;->c:I */
/* if-ne v0, v2, :cond_0 */
v0 = this.h;
v2 = this.h;
v0 = /* .line 5 */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.e;
v2 = this.e;
/* .line 6 */
v0 = (( java.lang.Object ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.f;
v2 = this.f;
/* .line 7 */
v0 = (( java.lang.Object ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.i;
	 p1 = this.i;
	 /* .line 8 */
	 p1 = 	 (( e.b.a.y.r ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/r;->equals(Ljava/lang/Object;)Z
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 int v1 = 1; // const/4 v1, 0x1
	 } // :cond_0
} // .end method
public Integer hashCode ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget v0, p0, Le/b/a/y/x/p0;->j:I */
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 v0 = this.b;
	 v0 = 	 (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
	 /* iput v0, p0, Le/b/a/y/x/p0;->j:I */
	 /* mul-int/lit8 v0, v0, 0x1f */
	 /* .line 3 */
	 v1 = 	 v1 = this.g;
	 /* add-int/2addr v0, v1 */
	 /* iput v0, p0, Le/b/a/y/x/p0;->j:I */
	 /* mul-int/lit8 v0, v0, 0x1f */
	 /* .line 4 */
	 /* iget v1, p0, Le/b/a/y/x/p0;->c:I */
	 /* add-int/2addr v0, v1 */
	 /* iput v0, p0, Le/b/a/y/x/p0;->j:I */
	 /* mul-int/lit8 v0, v0, 0x1f */
	 /* .line 5 */
	 /* iget v1, p0, Le/b/a/y/x/p0;->d:I */
	 /* add-int/2addr v0, v1 */
	 /* iput v0, p0, Le/b/a/y/x/p0;->j:I */
	 /* mul-int/lit8 v0, v0, 0x1f */
	 /* .line 6 */
	 v1 = 	 v1 = this.h;
	 /* add-int/2addr v0, v1 */
	 /* iput v0, p0, Le/b/a/y/x/p0;->j:I */
	 /* mul-int/lit8 v0, v0, 0x1f */
	 /* .line 7 */
	 v1 = this.e;
	 v1 = 	 (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
	 /* add-int/2addr v0, v1 */
	 /* iput v0, p0, Le/b/a/y/x/p0;->j:I */
	 /* mul-int/lit8 v0, v0, 0x1f */
	 /* .line 8 */
	 v1 = this.f;
	 v1 = 	 (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
	 /* add-int/2addr v0, v1 */
	 /* iput v0, p0, Le/b/a/y/x/p0;->j:I */
	 /* mul-int/lit8 v0, v0, 0x1f */
	 /* .line 9 */
	 v1 = this.i;
	 v1 = 	 (( e.b.a.y.r ) v1 ).hashCode ( ); // invoke-virtual {v1}, Le/b/a/y/r;->hashCode()I
	 /* add-int/2addr v0, v1 */
	 /* iput v0, p0, Le/b/a/y/x/p0;->j:I */
	 /* .line 10 */
} // :cond_0
/* iget v0, p0, Le/b/a/y/x/p0;->j:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "EngineKey{model="; // const-string v1, "EngineKey{model="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", width="; // const-string v1, ", width="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/b/a/y/x/p0;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", height="; // const-string v1, ", height="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/b/a/y/x/p0;->d:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", resourceClass="; // const-string v1, ", resourceClass="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", transcodeClass="; // const-string v1, ", transcodeClass="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.f;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", signature="; // const-string v1, ", signature="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.g;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", hashCode="; // const-string v1, ", hashCode="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/b/a/y/x/p0;->j:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", transformations="; // const-string v1, ", transformations="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.h;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", options="; // const-string v1, ", options="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.i;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
