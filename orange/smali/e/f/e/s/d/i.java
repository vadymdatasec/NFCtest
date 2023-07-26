public class e.f.e.s.d.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.e.s.d.c a;
	 public final e.f.e.s.d.d b;
	 /* # direct methods */
	 public e.f.e.s.d.i ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Le/f/e/s/d/c; */
		 /* invoke-direct {v0, p1}, Le/f/e/s/d/c;-><init>(Le/f/e/s/d/c;)V */
		 this.a = v0;
		 /* .line 3 */
		 v0 = 		 (( e.f.e.s.d.c ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/e/s/d/c;->e()I
		 p1 = 		 (( e.f.e.s.d.c ) p1 ).g ( ); // invoke-virtual {p1}, Le/f/e/s/d/c;->g()I
		 /* sub-int/2addr v0, p1 */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* new-array p1, v0, [Le/f/e/s/d/d; */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final e.f.e.s.d.c a ( ) {
		 /* .locals 1 */
		 /* .line 3 */
		 v0 = this.a;
	 } // .end method
	 public final e.f.e.s.d.d a ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = this.b;
		 p1 = 		 (( e.f.e.s.d.i ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/s/d/i;->c(I)I
		 /* aget-object p1, v0, p1 */
	 } // .end method
	 public final void a ( Integer p0, Object p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 p1 = 		 (( e.f.e.s.d.i ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/s/d/i;->c(I)I
		 /* aput-object p2, v0, p1 */
		 return;
	 } // .end method
	 public final e.f.e.s.d.d b ( Integer p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 (( e.f.e.s.d.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/s/d/i;->a(I)Le/f/e/s/d/d;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
	 int v1 = 5; // const/4 v1, 0x5
	 /* if-ge v0, v1, :cond_3 */
	 /* .line 2 */
	 v1 = 	 (( e.f.e.s.d.i ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/s/d/i;->c(I)I
	 /* sub-int/2addr v1, v0 */
	 /* if-ltz v1, :cond_1 */
	 /* .line 3 */
	 v2 = this.b;
	 /* aget-object v1, v2, v1 */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 4 */
	 } // :cond_1
	 v1 = 	 (( e.f.e.s.d.i ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/s/d/i;->c(I)I
	 /* add-int/2addr v1, v0 */
	 /* .line 5 */
	 v2 = this.b;
	 /* array-length v3, v2 */
	 /* if-ge v1, v3, :cond_2 */
	 /* .line 6 */
	 /* aget-object v1, v2, v1 */
	 if ( v1 != null) { // if-eqz v1, :cond_2
	 } // :cond_2
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final e.f.e.s.d.d b ( ) {
/* .locals 1 */
/* .line 7 */
v0 = this.b;
} // .end method
public final Integer c ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( e.f.e.s.d.c ) v0 ).g ( ); // invoke-virtual {v0}, Le/f/e/s/d/c;->g()I
/* sub-int/2addr p1, v0 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 10 */
/* .line 1 */
/* new-instance v0, Ljava/util/Formatter; */
/* invoke-direct {v0}, Ljava/util/Formatter;-><init>()V */
/* .line 2 */
v1 = this.b;
/* array-length v2, v1 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v4, v2, :cond_1 */
/* aget-object v6, v1, v4 */
int v7 = 1; // const/4 v7, 0x1
/* if-nez v6, :cond_0 */
/* new-array v6, v7, [Ljava/lang/Object; */
/* add-int/lit8 v7, v5, 0x1 */
/* .line 3 */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v6, v3 */
final String v5 = "%3d: | %n"; // const-string v5, "%3d: | %n"
(( java.util.Formatter ) v0 ).format ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
/* move v5, v7 */
} // :cond_0
int v8 = 3; // const/4 v8, 0x3
/* new-array v8, v8, [Ljava/lang/Object; */
/* add-int/lit8 v9, v5, 0x1 */
/* .line 4 */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v8, v3 */
v5 = (( e.f.e.s.d.d ) v6 ).c ( ); // invoke-virtual {v6}, Le/f/e/s/d/d;->c()I
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v8, v7 */
int v5 = 2; // const/4 v5, 0x2
v6 = (( e.f.e.s.d.d ) v6 ).e ( ); // invoke-virtual {v6}, Le/f/e/s/d/d;->e()I
java.lang.Integer .valueOf ( v6 );
/* aput-object v6, v8, v5 */
final String v5 = "%3d: %3d|%3d%n"; // const-string v5, "%3d: %3d|%3d%n"
(( java.util.Formatter ) v0 ).format ( v5, v8 ); // invoke-virtual {v0, v5, v8}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;
/* move v5, v9 */
} // :goto_1
/* add-int/lit8 v4, v4, 0x1 */
/* .line 5 */
} // :cond_1
(( java.util.Formatter ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/Formatter;->toString()Ljava/lang/String;
/* .line 6 */
(( java.util.Formatter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/util/Formatter;->close()V
} // .end method
