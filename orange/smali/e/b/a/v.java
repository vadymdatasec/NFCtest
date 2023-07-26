public abstract class e.b.a.v implements java.lang.Cloneable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<CHI", */
	 /* "LD:Le/b/a/v<", */
	 /* "TCHI", */
	 /* "LD;", */
	 /* "TTranscodeType;>;TranscodeType:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Cloneable;" */
	 /* } */
} // .end annotation
/* # instance fields */
public e.b.a.c0.p.e b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/c0/p/e<", */
/* "-TTranscodeType;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.v ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
e.b.a.c0.p.b .a ( );
this.b = v0;
return;
} // .end method
/* # virtual methods */
public final e.b.a.c0.p.e a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/b/a/c0/p/e<", */
/* "-TTranscodeType;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
} // .end method
public final e.b.a.v clone ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TCHI", */
/* "LD;" */
/* } */
} // .end annotation
/* .line 2 */
try { // :try_start_0
/* invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object; */
/* check-cast v0, Le/b/a/v; */
/* :try_end_0 */
/* .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public java.lang.Object clone ( ) { //bridge//synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/CloneNotSupportedException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.b.a.v ) p0 ).clone ( ); // invoke-virtual {p0}, Le/b/a/v;->clone()Le/b/a/v;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Le/b/a/v; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Le/b/a/v; */
/* .line 3 */
v0 = this.b;
p1 = this.b;
p1 = e.b.a.e0.t .b ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
