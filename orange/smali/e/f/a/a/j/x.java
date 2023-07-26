public abstract class e.f.a.a.j.x {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Lcom/google/auto/value/AutoValue; */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Le/f/a/a/j/x$a; */
/* } */
} // .end annotation
/* # direct methods */
public e.f.a.a.j.x ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static e.f.a.a.j.x$a d ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Le/f/a/a/j/h; */
/* invoke-direct {v0}, Le/f/a/a/j/h;-><init>()V */
v1 = e.f.a.a.d.b;
(( e.f.a.a.j.h ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/a/j/h;->a(Le/f/a/a/d;)Le/f/a/a/j/x$a;
} // .end method
/* # virtual methods */
public e.f.a.a.j.x a ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
e.f.a.a.j.x .d ( );
/* .line 2 */
(( e.f.a.a.j.x ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/a/j/x;->a()Ljava/lang/String;
(( e.f.a.a.j.x$a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/a/j/x$a;->a(Ljava/lang/String;)Le/f/a/a/j/x$a;
/* .line 3 */
(( e.f.a.a.j.x$a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/a/j/x$a;->a(Le/f/a/a/d;)Le/f/a/a/j/x$a;
/* .line 4 */
(( e.f.a.a.j.x ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/a/j/x;->b()[B
(( e.f.a.a.j.x$a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/a/j/x$a;->a([B)Le/f/a/a/j/x$a;
/* .line 5 */
(( e.f.a.a.j.x$a ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/a/j/x$a;->a()Le/f/a/a/j/x;
} // .end method
public abstract java.lang.String a ( ) {
} // .end method
public abstract b ( ) {
} // .end method
public abstract e.f.a.a.d c ( ) {
} // .end method
public final java.lang.String toString ( ) {
/* .locals 3 */
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
(( e.f.a.a.j.x ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/a/j/x;->a()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
/* .line 2 */
(( e.f.a.a.j.x ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
/* .line 3 */
(( e.f.a.a.j.x ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/a/j/x;->b()[B
int v2 = 2; // const/4 v2, 0x2
/* if-nez v1, :cond_0 */
final String v1 = ""; // const-string v1, ""
} // :cond_0
(( e.f.a.a.j.x ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/a/j/x;->b()[B
android.util.Base64 .encodeToString ( v1,v2 );
} // :goto_0
/* aput-object v1, v0, v2 */
final String v1 = "TransportContext(%s, %s, %s)"; // const-string v1, "TransportContext(%s, %s, %s)"
/* .line 4 */
java.lang.String .format ( v1,v0 );
} // .end method
