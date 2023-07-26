public class k.t0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public k.f0 a;
	 public java.lang.String b;
	 public k.c0 c;
	 public k.x0 d;
	 public java.util.Map e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public k.t0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
java.util.Collections .emptyMap ( );
this.e = v0;
final String v0 = "GET"; // const-string v0, "GET"
/* .line 3 */
this.b = v0;
/* .line 4 */
/* new-instance v0, Lk/c0; */
/* invoke-direct {v0}, Lk/c0;-><init>()V */
this.c = v0;
return;
} // .end method
public k.t0 ( ) {
/* .locals 2 */
/* .line 5 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 6 */
java.util.Collections .emptyMap ( );
this.e = v0;
/* .line 7 */
v0 = this.a;
this.a = v0;
/* .line 8 */
v0 = this.b;
this.b = v0;
/* .line 9 */
v0 = this.d;
this.d = v0;
/* .line 10 */
v0 = v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 11 */
	 java.util.Collections .emptyMap ( );
	 /* .line 12 */
} // :cond_0
/* new-instance v0, Ljava/util/LinkedHashMap; */
v1 = this.e;
/* invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V */
} // :goto_0
this.e = v0;
/* .line 13 */
p1 = this.c;
(( k.d0 ) p1 ).a ( ); // invoke-virtual {p1}, Lk/d0;->a()Lk/c0;
this.c = p1;
return;
} // .end method
/* # virtual methods */
public k.t0 a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.c;
(( k.c0 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lk/c0;->b(Ljava/lang/String;)Lk/c0;
} // .end method
public k.t0 a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.c;
(( k.c0 ) v0 ).c ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lk/c0;->c(Ljava/lang/String;Ljava/lang/String;)Lk/c0;
} // .end method
public k.t0 a ( java.lang.String p0, k.x0 p1 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 9 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
if ( v0 != null) { // if-eqz v0, :cond_4
	 final String v0 = "method "; // const-string v0, "method "
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 /* .line 10 */
		 v1 = 		 k.e1.i.h .b ( p1 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 11 */
		 } // :cond_0
		 /* new-instance p2, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String p1 = " must not have a request body."; // const-string p1, " must not have a request body."
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p2 */
	 } // :cond_1
} // :goto_0
/* if-nez p2, :cond_3 */
/* .line 12 */
v1 = k.e1.i.h .e ( p1 );
/* if-nez v1, :cond_2 */
/* .line 13 */
} // :cond_2
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " must have a request body."; // const-string p1, " must have a request body."
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 14 */
} // :cond_3
} // :goto_1
this.b = p1;
/* .line 15 */
this.d = p2;
/* .line 16 */
} // :cond_4
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "method.length() == 0"; // const-string p2, "method.length() == 0"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 17 */
} // :cond_5
/* new-instance p1, Ljava/lang/NullPointerException; */
final String p2 = "method == null"; // const-string p2, "method == null"
/* invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public k.t0 a ( k.d0 p0 ) {
/* .locals 0 */
/* .line 5 */
(( k.d0 ) p1 ).a ( ); // invoke-virtual {p1}, Lk/d0;->a()Lk/c0;
this.c = p1;
} // .end method
public k.t0 a ( k.f0 p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
this.a = p1;
/* .line 2 */
} // :cond_0
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "url == null"; // const-string v0, "url == null"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public k.t0 a ( Object p0 ) {
/* .locals 2 */
/* .line 6 */
(( k.f ) p1 ).toString ( ); // invoke-virtual {p1}, Lk/f;->toString()Ljava/lang/String;
/* .line 7 */
v0 = (( java.lang.String ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z
final String v1 = "Cache-Control"; // const-string v1, "Cache-Control"
if ( v0 != null) { // if-eqz v0, :cond_0
(( k.t0 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lk/t0;->a(Ljava/lang/String;)Lk/t0;
/* .line 8 */
} // :cond_0
(( k.t0 ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
} // .end method
public k.u0 a ( ) {
/* .locals 2 */
/* .line 18 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 19 */
/* new-instance v0, Lk/u0; */
/* invoke-direct {v0, p0}, Lk/u0;-><init>(Lk/t0;)V */
/* .line 20 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "url == null"; // const-string v1, "url == null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
