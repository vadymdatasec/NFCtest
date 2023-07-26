public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a;
	 public final java.util.List b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/a/a/i;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final Integer c;
public final java.io.InputStream d;
public final e;
/* # direct methods */
public inal ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;)V" */
/* } */
} // .end annotation
int v0 = -1; // const/4 v0, -0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, p2, v0, v1}, Le/a/a/c0/k;-><init>(ILjava/util/List;ILjava/io/InputStream;)V */
return;
} // .end method
public inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;I", */
/* "Ljava/io/InputStream;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* iput p1, p0, Le/a/a/c0/k;->a:I */
/* .line 4 */
this.b = p2;
/* .line 5 */
/* iput p3, p0, Le/a/a/c0/k;->c:I */
/* .line 6 */
this.d = p4;
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
this.e = p1;
return;
} // .end method
/* # virtual methods */
public final java.io.InputStream a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
/* new-instance v0, Ljava/io/ByteArrayInputStream; */
v1 = this.e;
/* invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Integer b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/a/a/c0/k;->c:I */
} // .end method
public final java.util.List c ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
java.util.Collections .unmodifiableList ( v0 );
} // .end method
public final Integer d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/a/a/c0/k;->a:I */
} // .end method
