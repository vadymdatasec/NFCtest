public class k.e1.g.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Long a;
	 public final k.u0 b;
	 public final k.z0 c;
	 public java.util.Date d;
	 public java.lang.String e;
	 public java.util.Date f;
	 public java.lang.String g;
	 public java.util.Date h;
	 public Long i;
	 public Long j;
	 public java.lang.String k;
	 public Integer l;
	 /* # direct methods */
	 public k.e1.g.d ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Lk/e1/g/d;->l:I */
		 /* .line 3 */
		 /* iput-wide p1, p0, Lk/e1/g/d;->a:J */
		 /* .line 4 */
		 this.b = p3;
		 /* .line 5 */
		 this.c = p4;
		 if ( p4 != null) { // if-eqz p4, :cond_5
			 /* .line 6 */
			 (( k.z0 ) p4 ).t ( ); // invoke-virtual {p4}, Lk/z0;->t()J
			 /* move-result-wide p1 */
			 /* iput-wide p1, p0, Lk/e1/g/d;->i:J */
			 /* .line 7 */
			 (( k.z0 ) p4 ).r ( ); // invoke-virtual {p4}, Lk/z0;->r()J
			 /* move-result-wide p1 */
			 /* iput-wide p1, p0, Lk/e1/g/d;->j:J */
			 /* .line 8 */
			 (( k.z0 ) p4 ).o ( ); // invoke-virtual {p4}, Lk/z0;->o()Lk/d0;
			 int p2 = 0; // const/4 p2, 0x0
			 /* .line 9 */
			 p3 = 			 (( k.d0 ) p1 ).b ( ); // invoke-virtual {p1}, Lk/d0;->b()I
		 } // :goto_0
		 /* if-ge p2, p3, :cond_5 */
		 /* .line 10 */
		 (( k.d0 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lk/d0;->a(I)Ljava/lang/String;
		 /* .line 11 */
		 (( k.d0 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lk/d0;->b(I)Ljava/lang/String;
		 final String v2 = "Date"; // const-string v2, "Date"
		 /* .line 12 */
		 v2 = 		 (( java.lang.String ) v2 ).equalsIgnoreCase ( p4 ); // invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 13 */
			 k.e1.i.f .a ( v1 );
			 this.d = p4;
			 /* .line 14 */
			 this.e = v1;
		 } // :cond_0
		 final String v2 = "Expires"; // const-string v2, "Expires"
		 /* .line 15 */
		 v2 = 		 (( java.lang.String ) v2 ).equalsIgnoreCase ( p4 ); // invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* .line 16 */
			 k.e1.i.f .a ( v1 );
			 this.h = p4;
		 } // :cond_1
		 final String v2 = "Last-Modified"; // const-string v2, "Last-Modified"
		 /* .line 17 */
		 v2 = 		 (( java.lang.String ) v2 ).equalsIgnoreCase ( p4 ); // invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_2
			 /* .line 18 */
			 k.e1.i.f .a ( v1 );
			 this.f = p4;
			 /* .line 19 */
			 this.g = v1;
		 } // :cond_2
		 final String v2 = "ETag"; // const-string v2, "ETag"
		 /* .line 20 */
		 v2 = 		 (( java.lang.String ) v2 ).equalsIgnoreCase ( p4 ); // invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_3
			 /* .line 21 */
			 this.k = v1;
		 } // :cond_3
		 final String v2 = "Age"; // const-string v2, "Age"
		 /* .line 22 */
		 p4 = 		 (( java.lang.String ) v2 ).equalsIgnoreCase ( p4 ); // invoke-virtual {v2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( p4 != null) { // if-eqz p4, :cond_4
			 /* .line 23 */
			 p4 = 			 k.e1.i.g .a ( v1,v0 );
			 /* iput p4, p0, Lk/e1/g/d;->l:I */
		 } // :cond_4
	 } // :goto_1
	 /* add-int/lit8 p2, p2, 0x1 */
} // :cond_5
return;
} // .end method
public static Boolean a ( k.u0 p0 ) {
/* .locals 1 */
final String v0 = "If-Modified-Since"; // const-string v0, "If-Modified-Since"
/* .line 7 */
(( k.u0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v0, :cond_1 */
final String v0 = "If-None-Match"; // const-string v0, "If-None-Match"
(( k.u0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
/* # virtual methods */
public final Long a ( ) {
/* .locals 9 */
/* .line 1 */
v0 = this.d;
/* const-wide/16 v1, 0x0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget-wide v3, p0, Lk/e1/g/d;->j:J */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v5 */
/* sub-long/2addr v3, v5 */
java.lang.Math .max ( v1,v2,v3,v4 );
/* move-result-wide v1 */
/* .line 3 */
} // :cond_0
/* iget v0, p0, Lk/e1/g/d;->l:I */
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v3, :cond_1 */
/* .line 4 */
v3 = java.util.concurrent.TimeUnit.SECONDS;
/* int-to-long v4, v0 */
(( java.util.concurrent.TimeUnit ) v3 ).toMillis ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
/* move-result-wide v3 */
java.lang.Math .max ( v1,v2,v3,v4 );
/* move-result-wide v1 */
/* .line 5 */
} // :cond_1
/* iget-wide v3, p0, Lk/e1/g/d;->j:J */
/* iget-wide v5, p0, Lk/e1/g/d;->i:J */
/* sub-long v5, v3, v5 */
/* .line 6 */
/* iget-wide v7, p0, Lk/e1/g/d;->a:J */
/* sub-long/2addr v7, v3 */
/* add-long/2addr v1, v5 */
/* add-long/2addr v1, v7 */
/* return-wide v1 */
} // .end method
public final Long b ( ) {
/* .locals 7 */
/* .line 1 */
v0 = this.c;
(( k.z0 ) v0 ).l ( ); // invoke-virtual {v0}, Lk/z0;->l()Lk/f;
/* .line 2 */
v1 = (( k.f ) v0 ).d ( ); // invoke-virtual {v0}, Lk/f;->d()I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 3 */
v1 = java.util.concurrent.TimeUnit.SECONDS;
v0 = (( k.f ) v0 ).d ( ); // invoke-virtual {v0}, Lk/f;->d()I
/* int-to-long v2, v0 */
(( java.util.concurrent.TimeUnit ) v1 ).toMillis ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
/* move-result-wide v0 */
/* return-wide v0 */
/* .line 4 */
} // :cond_0
v0 = this.h;
/* const-wide/16 v1, 0x0 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 5 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v3 */
/* .line 7 */
} // :cond_1
/* iget-wide v3, p0, Lk/e1/g/d;->j:J */
/* .line 8 */
} // :goto_0
v0 = this.h;
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v5 */
/* sub-long/2addr v5, v3 */
/* cmp-long v0, v5, v1 */
/* if-lez v0, :cond_2 */
/* move-wide v1, v5 */
} // :cond_2
/* return-wide v1 */
/* .line 9 */
} // :cond_3
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.c;
/* .line 10 */
(( k.z0 ) v0 ).s ( ); // invoke-virtual {v0}, Lk/z0;->s()Lk/u0;
(( k.u0 ) v0 ).g ( ); // invoke-virtual {v0}, Lk/u0;->g()Lk/f0;
(( k.f0 ) v0 ).k ( ); // invoke-virtual {v0}, Lk/f0;->k()Ljava/lang/String;
/* if-nez v0, :cond_5 */
/* .line 11 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 12 */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v3 */
/* .line 13 */
} // :cond_4
/* iget-wide v3, p0, Lk/e1/g/d;->i:J */
/* .line 14 */
} // :goto_1
v0 = this.f;
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v5 */
/* sub-long/2addr v3, v5 */
/* cmp-long v0, v3, v1 */
/* if-lez v0, :cond_5 */
/* const-wide/16 v0, 0xa */
/* .line 15 */
/* div-long v1, v3, v0 */
} // :cond_5
/* return-wide v1 */
} // .end method
public k.e1.g.e c ( ) {
/* .locals 2 */
/* .line 1 */
(( k.e1.g.d ) p0 ).d ( ); // invoke-virtual {p0}, Lk/e1/g/d;->d()Lk/e1/g/e;
/* .line 2 */
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.b;
(( k.u0 ) v1 ).b ( ); // invoke-virtual {v1}, Lk/u0;->b()Lk/f;
v1 = (( k.f ) v1 ).j ( ); // invoke-virtual {v1}, Lk/f;->j()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* new-instance v0, Lk/e1/g/e; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1, v1}, Lk/e1/g/e;-><init>(Lk/u0;Lk/z0;)V */
} // :cond_0
} // .end method
public final k.e1.g.e d ( ) {
/* .locals 13 */
/* .line 1 */
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lk/e1/g/e; */
v2 = this.b;
/* invoke-direct {v0, v2, v1}, Lk/e1/g/e;-><init>(Lk/u0;Lk/z0;)V */
/* .line 3 */
} // :cond_0
v0 = this.b;
v0 = (( k.u0 ) v0 ).d ( ); // invoke-virtual {v0}, Lk/u0;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.c;
(( k.z0 ) v0 ).n ( ); // invoke-virtual {v0}, Lk/z0;->n()Lk/b0;
/* if-nez v0, :cond_1 */
/* .line 4 */
/* new-instance v0, Lk/e1/g/e; */
v2 = this.b;
/* invoke-direct {v0, v2, v1}, Lk/e1/g/e;-><init>(Lk/u0;Lk/z0;)V */
/* .line 5 */
} // :cond_1
v0 = this.c;
v2 = this.b;
v0 = k.e1.g.e .a ( v0,v2 );
/* if-nez v0, :cond_2 */
/* .line 6 */
/* new-instance v0, Lk/e1/g/e; */
v2 = this.b;
/* invoke-direct {v0, v2, v1}, Lk/e1/g/e;-><init>(Lk/u0;Lk/z0;)V */
/* .line 7 */
} // :cond_2
v0 = this.b;
(( k.u0 ) v0 ).b ( ); // invoke-virtual {v0}, Lk/u0;->b()Lk/f;
/* .line 8 */
v2 = (( k.f ) v0 ).h ( ); // invoke-virtual {v0}, Lk/f;->h()Z
/* if-nez v2, :cond_d */
v2 = this.b;
v2 = k.e1.g.d .a ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_3
/* goto/16 :goto_2 */
/* .line 9 */
} // :cond_3
v2 = this.c;
(( k.z0 ) v2 ).l ( ); // invoke-virtual {v2}, Lk/z0;->l()Lk/f;
/* .line 10 */
(( k.e1.g.d ) p0 ).a ( ); // invoke-virtual {p0}, Lk/e1/g/d;->a()J
/* move-result-wide v3 */
/* .line 11 */
(( k.e1.g.d ) p0 ).b ( ); // invoke-virtual {p0}, Lk/e1/g/d;->b()J
/* move-result-wide v5 */
/* .line 12 */
v7 = (( k.f ) v0 ).d ( ); // invoke-virtual {v0}, Lk/f;->d()I
int v8 = -1; // const/4 v8, -0x1
/* if-eq v7, v8, :cond_4 */
/* .line 13 */
v7 = java.util.concurrent.TimeUnit.SECONDS;
v9 = (( k.f ) v0 ).d ( ); // invoke-virtual {v0}, Lk/f;->d()I
/* int-to-long v9, v9 */
(( java.util.concurrent.TimeUnit ) v7 ).toMillis ( v9, v10 ); // invoke-virtual {v7, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
/* move-result-wide v9 */
java.lang.Math .min ( v5,v6,v9,v10 );
/* move-result-wide v5 */
/* .line 14 */
} // :cond_4
v7 = (( k.f ) v0 ).f ( ); // invoke-virtual {v0}, Lk/f;->f()I
/* const-wide/16 v9, 0x0 */
/* if-eq v7, v8, :cond_5 */
/* .line 15 */
v7 = java.util.concurrent.TimeUnit.SECONDS;
v11 = (( k.f ) v0 ).f ( ); // invoke-virtual {v0}, Lk/f;->f()I
/* int-to-long v11, v11 */
(( java.util.concurrent.TimeUnit ) v7 ).toMillis ( v11, v12 ); // invoke-virtual {v7, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
/* move-result-wide v11 */
} // :cond_5
/* move-wide v11, v9 */
/* .line 16 */
} // :goto_0
v7 = (( k.f ) v2 ).g ( ); // invoke-virtual {v2}, Lk/f;->g()Z
/* if-nez v7, :cond_6 */
v7 = (( k.f ) v0 ).e ( ); // invoke-virtual {v0}, Lk/f;->e()I
/* if-eq v7, v8, :cond_6 */
/* .line 17 */
v7 = java.util.concurrent.TimeUnit.SECONDS;
v0 = (( k.f ) v0 ).e ( ); // invoke-virtual {v0}, Lk/f;->e()I
/* int-to-long v8, v0 */
(( java.util.concurrent.TimeUnit ) v7 ).toMillis ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
/* move-result-wide v9 */
/* .line 18 */
} // :cond_6
v0 = (( k.f ) v2 ).h ( ); // invoke-virtual {v2}, Lk/f;->h()Z
/* if-nez v0, :cond_9 */
/* add-long/2addr v11, v3 */
/* add-long/2addr v9, v5 */
/* cmp-long v0, v11, v9 */
/* if-gez v0, :cond_9 */
/* .line 19 */
v0 = this.c;
(( k.z0 ) v0 ).p ( ); // invoke-virtual {v0}, Lk/z0;->p()Lk/y0;
final String v2 = "Warning"; // const-string v2, "Warning"
/* cmp-long v7, v11, v5 */
/* if-ltz v7, :cond_7 */
final String v5 = "110 HttpURLConnection \"Response is stale\""; // const-string v5, "110 HttpURLConnection \"Response is stale\""
/* .line 20 */
(( k.y0 ) v0 ).a ( v2, v5 ); // invoke-virtual {v0, v2, v5}, Lk/y0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/y0;
} // :cond_7
/* const-wide/32 v5, 0x5265c00 */
/* cmp-long v7, v3, v5 */
/* if-lez v7, :cond_8 */
/* .line 21 */
v3 = (( k.e1.g.d ) p0 ).e ( ); // invoke-virtual {p0}, Lk/e1/g/d;->e()Z
if ( v3 != null) { // if-eqz v3, :cond_8
final String v3 = "113 HttpURLConnection \"Heuristic expiration\""; // const-string v3, "113 HttpURLConnection \"Heuristic expiration\""
/* .line 22 */
(( k.y0 ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lk/y0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/y0;
/* .line 23 */
} // :cond_8
/* new-instance v2, Lk/e1/g/e; */
(( k.y0 ) v0 ).a ( ); // invoke-virtual {v0}, Lk/y0;->a()Lk/z0;
/* invoke-direct {v2, v1, v0}, Lk/e1/g/e;-><init>(Lk/u0;Lk/z0;)V */
/* .line 24 */
} // :cond_9
v0 = this.k;
final String v2 = "If-Modified-Since"; // const-string v2, "If-Modified-Since"
if ( v0 != null) { // if-eqz v0, :cond_a
final String v2 = "If-None-Match"; // const-string v2, "If-None-Match"
/* .line 25 */
} // :cond_a
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 26 */
v0 = this.g;
/* .line 27 */
} // :cond_b
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 28 */
v0 = this.e;
/* .line 29 */
} // :goto_1
v1 = this.b;
(( k.u0 ) v1 ).c ( ); // invoke-virtual {v1}, Lk/u0;->c()Lk/d0;
(( k.d0 ) v1 ).a ( ); // invoke-virtual {v1}, Lk/d0;->a()Lk/c0;
/* .line 30 */
v3 = k.e1.a.a;
(( k.e1.a ) v3 ).a ( v1, v2, v0 ); // invoke-virtual {v3, v1, v2, v0}, Lk/e1/a;->a(Lk/c0;Ljava/lang/String;Ljava/lang/String;)V
/* .line 31 */
v0 = this.b;
(( k.u0 ) v0 ).f ( ); // invoke-virtual {v0}, Lk/u0;->f()Lk/t0;
/* .line 32 */
(( k.c0 ) v1 ).a ( ); // invoke-virtual {v1}, Lk/c0;->a()Lk/d0;
(( k.t0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk/t0;->a(Lk/d0;)Lk/t0;
/* .line 33 */
(( k.t0 ) v0 ).a ( ); // invoke-virtual {v0}, Lk/t0;->a()Lk/u0;
/* .line 34 */
/* new-instance v1, Lk/e1/g/e; */
v2 = this.c;
/* invoke-direct {v1, v0, v2}, Lk/e1/g/e;-><init>(Lk/u0;Lk/z0;)V */
/* .line 35 */
} // :cond_c
/* new-instance v0, Lk/e1/g/e; */
v2 = this.b;
/* invoke-direct {v0, v2, v1}, Lk/e1/g/e;-><init>(Lk/u0;Lk/z0;)V */
/* .line 36 */
} // :cond_d
} // :goto_2
/* new-instance v0, Lk/e1/g/e; */
v2 = this.b;
/* invoke-direct {v0, v2, v1}, Lk/e1/g/e;-><init>(Lk/u0;Lk/z0;)V */
} // .end method
public final Boolean e ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
(( k.z0 ) v0 ).l ( ); // invoke-virtual {v0}, Lk/z0;->l()Lk/f;
v0 = (( k.f ) v0 ).d ( ); // invoke-virtual {v0}, Lk/f;->d()I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
v0 = this.h;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
