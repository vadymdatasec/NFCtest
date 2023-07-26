public class e.f.a.b.c.c extends e.f.a.b.c.m.j.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Le/f/a/b/c/c;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public final java.lang.String b;
public final Integer c;
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
} // .end field
public final Long d;
/* # direct methods */
public static e.f.a.b.c.c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/a/b/c/s; */
/* invoke-direct {v0}, Le/f/a/b/c/s;-><init>()V */
return;
} // .end method
public e.f.a.b.c.c ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Le/f/a/b/c/m/j/a;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
/* iput p2, p0, Le/f/a/b/c/c;->c:I */
/* .line 4 */
/* iput-wide p3, p0, Le/f/a/b/c/c;->d:J */
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Long b ( ) {
/* .locals 5 */
/* .line 1 */
/* iget-wide v0, p0, Le/f/a/b/c/c;->d:J */
/* const-wide/16 v2, -0x1 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_0 */
/* iget v0, p0, Le/f/a/b/c/c;->c:I */
/* int-to-long v0, v0 */
} // :cond_0
/* return-wide v0 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 6 */
/* .line 1 */
/* instance-of v0, p1, Le/f/a/b/c/c; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
/* check-cast p1, Le/f/a/b/c/c; */
/* .line 3 */
(( e.f.a.b.c.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->a()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
(( e.f.a.b.c.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->a()Ljava/lang/String;
(( e.f.a.b.c.c ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/c/c;->a()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 4 */
} // :cond_0
(( e.f.a.b.c.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->a()Ljava/lang/String;
/* if-nez v0, :cond_2 */
(( e.f.a.b.c.c ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/c/c;->a()Ljava/lang/String;
/* if-nez v0, :cond_2 */
/* .line 5 */
} // :cond_1
(( e.f.a.b.c.c ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->b()J
/* move-result-wide v2 */
(( e.f.a.b.c.c ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/b/c/c;->b()J
/* move-result-wide v4 */
/* cmp-long p1, v2, v4 */
/* if-nez p1, :cond_2 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
(( e.f.a.b.c.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->a()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
(( e.f.a.b.c.c ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->b()J
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
v0 = e.f.a.b.c.m.g .a ( v0 );
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
e.f.a.b.c.m.g .a ( p0 );
/* .line 2 */
(( e.f.a.b.c.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->a()Ljava/lang/String;
final String v2 = "name"; // const-string v2, "name"
(( e.f.a.b.c.m.f ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;
/* .line 3 */
(( e.f.a.b.c.c ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->b()J
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
final String v2 = "version"; // const-string v2, "version"
(( e.f.a.b.c.m.f ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;
/* .line 4 */
(( e.f.a.b.c.m.f ) v0 ).toString ( ); // invoke-virtual {v0}, Le/f/a/b/c/m/f;->toString()Ljava/lang/String;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
p2 = e.f.a.b.c.m.j.b .a ( p1 );
/* .line 2 */
(( e.f.a.b.c.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->a()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
e.f.a.b.c.m.j.b .a ( p1,v1,v0,v2 );
/* .line 4 */
/* iget v0, p0, Le/f/a/b/c/c;->c:I */
int v1 = 2; // const/4 v1, 0x2
/* .line 5 */
e.f.a.b.c.m.j.b .a ( p1,v1,v0 );
/* .line 6 */
(( e.f.a.b.c.c ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/c/c;->b()J
/* move-result-wide v0 */
int v2 = 3; // const/4 v2, 0x3
/* .line 7 */
e.f.a.b.c.m.j.b .a ( p1,v2,v0,v1 );
/* .line 8 */
e.f.a.b.c.m.j.b .a ( p1,p2 );
return;
} // .end method
