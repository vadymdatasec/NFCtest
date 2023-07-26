public class k.y0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public k.u0 a;
	 public k.p0 b;
	 public Integer c;
	 public java.lang.String d;
	 public k.b0 e;
	 public k.c0 f;
	 public k.b1 g;
	 public k.z0 h;
	 public k.z0 i;
	 public k.z0 j;
	 public Long k;
	 public Long l;
	 /* # direct methods */
	 public k.y0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Lk/y0;->c:I */
		 /* .line 3 */
		 /* new-instance v0, Lk/c0; */
		 /* invoke-direct {v0}, Lk/c0;-><init>()V */
		 this.f = v0;
		 return;
	 } // .end method
	 public k.y0 ( ) {
		 /* .locals 2 */
		 /* .line 4 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 5 */
		 /* iput v0, p0, Lk/y0;->c:I */
		 /* .line 6 */
		 v0 = this.b;
		 this.a = v0;
		 /* .line 7 */
		 v0 = this.c;
		 this.b = v0;
		 /* .line 8 */
		 /* iget v0, p1, Lk/z0;->d:I */
		 /* iput v0, p0, Lk/y0;->c:I */
		 /* .line 9 */
		 v0 = this.e;
		 this.d = v0;
		 /* .line 10 */
		 v0 = this.f;
		 this.e = v0;
		 /* .line 11 */
		 v0 = this.g;
		 (( k.d0 ) v0 ).a ( ); // invoke-virtual {v0}, Lk/d0;->a()Lk/c0;
		 this.f = v0;
		 /* .line 12 */
		 v0 = this.h;
		 this.g = v0;
		 /* .line 13 */
		 v0 = this.i;
		 this.h = v0;
		 /* .line 14 */
		 v0 = this.j;
		 this.i = v0;
		 /* .line 15 */
		 v0 = this.k;
		 this.j = v0;
		 /* .line 16 */
		 /* iget-wide v0, p1, Lk/z0;->l:J */
		 /* iput-wide v0, p0, Lk/y0;->k:J */
		 /* .line 17 */
		 /* iget-wide v0, p1, Lk/z0;->m:J */
		 /* iput-wide v0, p0, Lk/y0;->l:J */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public k.y0 a ( Integer p0 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* iput p1, p0, Lk/y0;->c:I */
	 } // .end method
	 public k.y0 a ( Long p0 ) {
		 /* .locals 0 */
		 /* .line 19 */
		 /* iput-wide p1, p0, Lk/y0;->l:J */
	 } // .end method
	 public k.y0 a ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 this.d = p1;
	 } // .end method
	 public k.y0 a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 6 */
		 v0 = this.f;
		 (( k.c0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lk/c0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/c0;
	 } // .end method
	 public k.y0 a ( k.b0 p0 ) {
		 /* .locals 0 */
		 /* .line 5 */
		 this.e = p1;
	 } // .end method
	 public k.y0 a ( k.b1 p0 ) {
		 /* .locals 0 */
		 /* .line 8 */
		 this.g = p1;
	 } // .end method
	 public k.y0 a ( k.d0 p0 ) {
		 /* .locals 0 */
		 /* .line 7 */
		 (( k.d0 ) p1 ).a ( ); // invoke-virtual {p1}, Lk/d0;->a()Lk/c0;
		 this.f = p1;
	 } // .end method
	 public k.y0 a ( k.p0 p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 this.b = p1;
	 } // .end method
	 public k.y0 a ( k.u0 p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
	 } // .end method
	 public k.y0 a ( k.z0 p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 final String v0 = "cacheResponse"; // const-string v0, "cacheResponse"
			 /* .line 9 */
			 (( k.y0 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lk/y0;->a(Ljava/lang/String;Lk/z0;)V
			 /* .line 10 */
		 } // :cond_0
		 this.i = p1;
	 } // .end method
	 public k.z0 a ( ) {
		 /* .locals 3 */
		 /* .line 20 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 21 */
			 v0 = this.b;
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 /* .line 22 */
				 /* iget v0, p0, Lk/y0;->c:I */
				 /* if-ltz v0, :cond_1 */
				 /* .line 23 */
				 v0 = this.d;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 24 */
					 /* new-instance v0, Lk/z0; */
					 /* invoke-direct {v0, p0}, Lk/z0;-><init>(Lk/y0;)V */
					 /* .line 25 */
				 } // :cond_0
				 /* new-instance v0, Ljava/lang/IllegalStateException; */
				 final String v1 = "message == null"; // const-string v1, "message == null"
				 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
				 /* throw v0 */
				 /* .line 26 */
			 } // :cond_1
			 /* new-instance v0, Ljava/lang/IllegalStateException; */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "code < 0: "; // const-string v2, "code < 0: "
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* iget v2, p0, Lk/y0;->c:I */
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
			 /* throw v0 */
			 /* .line 27 */
		 } // :cond_2
		 /* new-instance v0, Ljava/lang/IllegalStateException; */
		 final String v1 = "protocol == null"; // const-string v1, "protocol == null"
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
		 /* .line 28 */
	 } // :cond_3
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 final String v1 = "request == null"; // const-string v1, "request == null"
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
public final void a ( java.lang.String p0, k.z0 p1 ) {
	 /* .locals 1 */
	 /* .line 11 */
	 v0 = this.h;
	 /* if-nez v0, :cond_3 */
	 /* .line 12 */
	 v0 = this.i;
	 /* if-nez v0, :cond_2 */
	 /* .line 13 */
	 v0 = this.j;
	 /* if-nez v0, :cond_1 */
	 /* .line 14 */
	 p2 = this.k;
	 /* if-nez p2, :cond_0 */
	 return;
	 /* .line 15 */
} // :cond_0
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ".priorResponse != null"; // const-string p1, ".priorResponse != null"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 16 */
} // :cond_1
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ".cacheResponse != null"; // const-string p1, ".cacheResponse != null"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 17 */
} // :cond_2
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ".networkResponse != null"; // const-string p1, ".networkResponse != null"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 18 */
} // :cond_3
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ".body != null"; // const-string p1, ".body != null"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public k.y0 b ( Long p0 ) {
/* .locals 0 */
/* .line 4 */
/* iput-wide p1, p0, Lk/y0;->k:J */
} // .end method
public k.y0 b ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
(( k.c0 ) v0 ).c ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lk/c0;->c(Ljava/lang/String;Ljava/lang/String;)Lk/c0;
} // .end method
public final void b ( k.z0 p0 ) {
/* .locals 1 */
/* .line 2 */
p1 = this.h;
/* if-nez p1, :cond_0 */
return;
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "priorResponse.body != null"; // const-string v0, "priorResponse.body != null"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public k.y0 c ( k.z0 p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = "networkResponse"; // const-string v0, "networkResponse"
/* .line 1 */
(( k.y0 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lk/y0;->a(Ljava/lang/String;Lk/z0;)V
/* .line 2 */
} // :cond_0
this.h = p1;
} // .end method
public k.y0 d ( k.z0 p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( k.y0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lk/y0;->b(Lk/z0;)V
/* .line 2 */
} // :cond_0
this.j = p1;
} // .end method
