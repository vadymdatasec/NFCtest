public abstract class e.f.a.b.c.m.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.Object a ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(TT;)TT;" */
		 /* } */
	 } // .end annotation
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 1 */
	 } // :cond_0
	 /* new-instance p0, Ljava/lang/NullPointerException; */
	 final String v0 = "null reference"; // const-string v0, "null reference"
	 /* invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
} // .end method
public static java.lang.Object a ( java.lang.Object p0, java.lang.Object p1 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(TT;", */
	 /* "Ljava/lang/Object;", */
	 /* ")TT;" */
	 /* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* .line 6 */
} // :cond_0
/* new-instance p0, Ljava/lang/NullPointerException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static java.lang.String a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = android.text.TextUtils .isEmpty ( p0 );
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "Given String is empty or null"; // const-string v0, "Given String is empty or null"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static java.lang.String a ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .line 4 */
v0 = android.text.TextUtils .isEmpty ( p0 );
/* if-nez v0, :cond_0 */
/* .line 5 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( ) {
/* .locals 1 */
final String v0 = "Must not be called on the main application thread"; // const-string v0, "Must not be called on the main application thread"
/* .line 9 */
e.f.a.b.c.m.h .b ( v0 );
return;
} // .end method
public static void a ( android.os.Handler p0 ) {
/* .locals 1 */
final String v0 = "Must be called on the handler thread"; // const-string v0, "Must be called on the handler thread"
/* .line 10 */
e.f.a.b.c.m.h .a ( p0,v0 );
return;
} // .end method
public static void a ( android.os.Handler p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 11 */
android.os.Looper .myLooper ( );
(( android.os.Handler ) p0 ).getLooper ( ); // invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
/* if-ne v0, p0, :cond_0 */
return;
/* .line 12 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 8 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0, java.lang.Object p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 7 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = e.f.a.b.c.p.o .a ( );
/* if-nez v0, :cond_0 */
return;
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static void b ( Boolean p0 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 1 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
/* invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V */
/* throw p0 */
} // .end method
public static void b ( Boolean p0, java.lang.Object p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
