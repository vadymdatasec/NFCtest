public abstract class e.f.b.a.p {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 final String v0 = "index"; // const-string v0, "index"
		 /* .line 8 */
		 e.f.b.a.p .c ( p0,p1,v0 );
	 } // .end method
	 public static java.lang.Object a ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(TT;)TT;" */
		 /* } */
	 } // .end annotation
	 if ( p0 != null) { // if-eqz p0, :cond_0
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
	 /* .line 7 */
	 /* throw p0 */
} // .end method
public static java.lang.String a ( Integer p0, Integer p1, Integer p2 ) {
	 /* .locals 1 */
	 /* if-ltz p0, :cond_3 */
	 /* if-le p0, p2, :cond_0 */
} // :cond_0
/* if-ltz p1, :cond_2 */
/* if-le p1, p2, :cond_1 */
} // :cond_1
int p2 = 2; // const/4 p2, 0x2
/* new-array p2, p2, [Ljava/lang/Object; */
int v0 = 0; // const/4 v0, 0x0
/* .line 12 */
java.lang.Integer .valueOf ( p1 );
/* aput-object p1, p2, v0 */
int p1 = 1; // const/4 p1, 0x1
java.lang.Integer .valueOf ( p0 );
/* aput-object p0, p2, p1 */
final String p0 = "end index (%s) must not be less than start index (%s)"; // const-string p0, "end index (%s) must not be less than start index (%s)"
e.f.b.a.q .a ( p0,p2 );
} // :cond_2
} // :goto_0
final String p0 = "end index"; // const-string p0, "end index"
/* .line 13 */
e.f.b.a.p .b ( p1,p2,p0 );
} // :cond_3
} // :goto_1
final String p1 = "start index"; // const-string p1, "start index"
/* .line 14 */
e.f.b.a.p .b ( p0,p2,p1 );
} // .end method
public static java.lang.String a ( Integer p0, Integer p1, java.lang.String p2 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
int v2 = 2; // const/4 v2, 0x2
/* if-gez p0, :cond_0 */
/* new-array p1, v2, [Ljava/lang/Object; */
/* aput-object p2, p1, v1 */
/* .line 9 */
java.lang.Integer .valueOf ( p0 );
/* aput-object p0, p1, v0 */
final String p0 = "%s (%s) must not be negative"; // const-string p0, "%s (%s) must not be negative"
e.f.b.a.q .a ( p0,p1 );
} // :cond_0
/* if-ltz p1, :cond_1 */
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [Ljava/lang/Object; */
/* aput-object p2, v3, v1 */
/* .line 10 */
java.lang.Integer .valueOf ( p0 );
/* aput-object p0, v3, v0 */
java.lang.Integer .valueOf ( p1 );
/* aput-object p0, v3, v2 */
final String p0 = "%s (%s) must be less than size (%s)"; // const-string p0, "%s (%s) must be less than size (%s)"
e.f.b.a.q .a ( p0,v3 );
/* .line 11 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* const/16 p2, 0x1a */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p2 = "negative size: "; // const-string p2, "negative size: "
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 1 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0, java.lang.Object p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0, java.lang.String p1, Object p2 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 3 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
java.lang.Character .valueOf ( p2 );
/* aput-object p2, v0, v1 */
e.f.b.a.q .a ( p1,v0 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0, java.lang.String p1, Integer p2 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 4 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
java.lang.Integer .valueOf ( p2 );
/* aput-object p2, v0, v1 */
e.f.b.a.q .a ( p1,v0 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0, java.lang.String p1, Long p2 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 5 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
java.lang.Long .valueOf ( p2,p3 );
/* aput-object p2, v0, v1 */
e.f.b.a.q .a ( p1,v0 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Boolean p0, java.lang.String p1, java.lang.Object p2 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 6 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p2, v0, v1 */
e.f.b.a.q .a ( p1,v0 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Integer b ( Integer p0, Integer p1 ) {
/* .locals 1 */
final String v0 = "index"; // const-string v0, "index"
/* .line 3 */
e.f.b.a.p .d ( p0,p1,v0 );
} // .end method
public static java.lang.String b ( Integer p0, Integer p1, java.lang.String p2 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
int v2 = 2; // const/4 v2, 0x2
/* if-gez p0, :cond_0 */
/* new-array p1, v2, [Ljava/lang/Object; */
/* aput-object p2, p1, v1 */
/* .line 4 */
java.lang.Integer .valueOf ( p0 );
/* aput-object p0, p1, v0 */
final String p0 = "%s (%s) must not be negative"; // const-string p0, "%s (%s) must not be negative"
e.f.b.a.q .a ( p0,p1 );
} // :cond_0
/* if-ltz p1, :cond_1 */
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [Ljava/lang/Object; */
/* aput-object p2, v3, v1 */
/* .line 5 */
java.lang.Integer .valueOf ( p0 );
/* aput-object p0, v3, v0 */
java.lang.Integer .valueOf ( p1 );
/* aput-object p0, v3, v2 */
final String p0 = "%s (%s) must not be greater than size (%s)"; // const-string p0, "%s (%s) must not be greater than size (%s)"
e.f.b.a.q .a ( p0,v3 );
/* .line 6 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* const/16 p2, 0x1a */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p2 = "negative size: "; // const-string p2, "negative size: "
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void b ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* if-ltz p0, :cond_0 */
/* if-lt p1, p0, :cond_0 */
/* if-gt p1, p2, :cond_0 */
return;
/* .line 7 */
} // :cond_0
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
e.f.b.a.p .a ( p0,p1,p2 );
/* invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static void b ( Boolean p0, java.lang.Object p1 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 1 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void b ( Boolean p0, java.lang.String p1, java.lang.Object p2 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p2, v0, v1 */
e.f.b.a.q .a ( p1,v0 );
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Integer c ( Integer p0, Integer p1, java.lang.String p2 ) {
/* .locals 1 */
/* if-ltz p0, :cond_0 */
/* if-ge p0, p1, :cond_0 */
/* .line 1 */
} // :cond_0
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
e.f.b.a.p .a ( p0,p1,p2 );
/* invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static Integer d ( Integer p0, Integer p1, java.lang.String p2 ) {
/* .locals 1 */
/* if-ltz p0, :cond_0 */
/* if-gt p0, p1, :cond_0 */
/* .line 1 */
} // :cond_0
/* new-instance v0, Ljava/lang/IndexOutOfBoundsException; */
e.f.b.a.p .b ( p0,p1,p2 );
/* invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
