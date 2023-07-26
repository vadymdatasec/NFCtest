public class e.b.a.z.x {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.Set a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Le/b/a/c0/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.Set b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Le/b/a/c0/d;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean c;
/* # direct methods */
public e.b.a.z.x ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/WeakHashMap; */
/* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
/* .line 3 */
java.util.Collections .newSetFromMap ( v0 );
this.a = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 4 */
v0 = this.a;
e.b.a.e0.t .a ( v0 );
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Le/b/a/c0/d; */
/* .line 5 */
(( e.b.a.z.x ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/b/a/z/x;->a(Le/b/a/c0/d;)Z
/* .line 6 */
} // :cond_0
v0 = this.b;
return;
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* if-nez p1, :cond_0 */
/* .line 1 */
} // :cond_0
v1 = v1 = this.a;
/* .line 2 */
v2 = v2 = this.b;
/* if-nez v2, :cond_2 */
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 3 */
} // :cond_3
} // .end method
public void b ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
/* iput-boolean v0, p0, Le/b/a/z/x;->c:Z */
/* .line 9 */
v0 = this.a;
e.b.a.e0.t .a ( v0 );
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Le/b/a/c0/d; */
v2 = /* .line 10 */
v2 = /* if-nez v2, :cond_1 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 11 */
} // :cond_1
/* .line 12 */
v2 = this.b;
} // :cond_2
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* .line 2 */
/* iget-boolean v0, p0, Le/b/a/z/x;->c:Z */
/* if-nez v0, :cond_0 */
/* .line 3 */
/* .line 4 */
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
final String v1 = "RequestTracker"; // const-string v1, "RequestTracker"
/* .line 5 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "Paused, delaying request"; // const-string v0, "Paused, delaying request"
/* .line 6 */
android.util.Log .v ( v1,v0 );
/* .line 7 */
} // :cond_1
v0 = this.b;
} // :goto_0
return;
} // .end method
public void c ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/b/a/z/x;->c:Z */
/* .line 2 */
v0 = this.a;
e.b.a.e0.t .a ( v0 );
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/b/a/c0/d; */
v2 = /* .line 3 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 4 */
/* .line 5 */
v2 = this.b;
} // :cond_1
return;
} // .end method
public void d ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
e.b.a.e0.t .a ( v0 );
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Le/b/a/c0/d; */
v2 = /* .line 2 */
v2 = /* if-nez v2, :cond_0 */
/* if-nez v2, :cond_0 */
/* .line 3 */
/* .line 4 */
/* iget-boolean v2, p0, Le/b/a/z/x;->c:Z */
/* if-nez v2, :cond_1 */
/* .line 5 */
/* .line 6 */
} // :cond_1
v2 = this.b;
} // :cond_2
return;
} // .end method
public void e ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Le/b/a/z/x;->c:Z */
/* .line 2 */
v0 = this.a;
e.b.a.e0.t .a ( v0 );
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/b/a/c0/d; */
v2 = /* .line 3 */
v2 = /* if-nez v2, :cond_0 */
/* if-nez v2, :cond_0 */
/* .line 4 */
/* .line 5 */
} // :cond_1
v0 = this.b;
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "{numRequests="; // const-string v1, "{numRequests="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", isPaused="; // const-string v1, ", isPaused="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Le/b/a/z/x;->c:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
