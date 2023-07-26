public class e.f.c.l.e.m.b2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String a;
	 public final java.util.concurrent.ConcurrentHashMap b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/ConcurrentHashMap<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.l.e.m.b2 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.b = v0;
return;
} // .end method
public static java.lang.String b ( java.lang.String p0 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* .line 2 */
	 (( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
	 /* .line 3 */
	 v0 = 	 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
	 /* const/16 v1, 0x400 */
	 /* if-le v0, v1, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 4 */
	 (( java.lang.String ) p0 ).substring ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_0
} // .end method
/* # virtual methods */
public java.util.Map a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.b;
java.util.Collections .unmodifiableMap ( v0 );
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
e.f.c.l.e.m.b2 .b ( p1 );
this.a = p1;
return;
} // .end method
public java.lang.String b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
