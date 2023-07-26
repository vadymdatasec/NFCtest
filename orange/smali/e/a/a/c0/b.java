public class e.a.a.c0.b implements e.a.a.j {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.a.a.c0.a a;
	 public final e.a.a.c0.d b;
	 /* # direct methods */
	 public e.a.a.c0.b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Le/a/a/c0/d; */
		 /* const/16 v1, 0x1000 */
		 /* invoke-direct {v0, v1}, Le/a/a/c0/d;-><init>(I)V */
		 /* invoke-direct {p0, p1, v0}, Le/a/a/c0/b;-><init>(Le/a/a/c0/a;Le/a/a/c0/d;)V */
		 return;
	 } // .end method
	 public e.a.a.c0.b ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.a.a.l a ( Object p0 ) {
		 /* .locals 18 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Le/a/a/p<", */
		 /* "*>;)", */
		 /* "Le/a/a/l;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/android/volley/VolleyError; */
	 /* } */
} // .end annotation
/* move-object/from16 v1, p0 */
/* move-object/from16 v8, p1 */
/* .line 1 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v9 */
/* .line 2 */
} // :goto_0
java.util.Collections .emptyList ( );
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
try { // :try_start_0
/* invoke-virtual/range {p1 ..p1}, Le/a/a/p;->c()Le/a/a/a; */
e.a.a.c0.j .a ( v0 );
/* .line 4 */
v3 = this.a;
(( e.a.a.c0.a ) v3 ).a ( v8, v0 ); // invoke-virtual {v3, v8, v0}, Le/a/a/c0/a;->a(Le/a/a/p;Ljava/util/Map;)Le/a/a/c0/k;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 5 */
try { // :try_start_1
	 v12 = 	 (( e.a.a.c0.k ) v3 ).d ( ); // invoke-virtual {v3}, Le/a/a/c0/k;->d()I
	 /* .line 6 */
	 (( e.a.a.c0.k ) v3 ).c ( ); // invoke-virtual {v3}, Le/a/a/c0/k;->c()Ljava/util/List;
	 /* const/16 v4, 0x130 */
	 /* if-ne v12, v4, :cond_0 */
	 /* .line 7 */
	 android.os.SystemClock .elapsedRealtime ( );
	 /* move-result-wide v4 */
	 /* sub-long/2addr v4, v9 */
	 /* .line 8 */
	 e.a.a.c0.q .a ( v8,v4,v5,v0 );
	 /* .line 9 */
} // :cond_0
(( e.a.a.c0.k ) v3 ).a ( ); // invoke-virtual {v3}, Le/a/a/c0/k;->a()Ljava/io/InputStream;
if ( v4 != null) { // if-eqz v4, :cond_1
	 /* .line 10 */
	 v5 = 	 (( e.a.a.c0.k ) v3 ).b ( ); // invoke-virtual {v3}, Le/a/a/c0/k;->b()I
	 v6 = this.b;
	 /* .line 11 */
	 e.a.a.c0.q .a ( v4,v5,v6 );
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
/* new-array v2, v4, [B */
/* .line 12 */
} // :goto_1
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v4 */
/* sub-long/2addr v4, v9 */
/* .line 13 */
e.a.a.c0.q .a ( v4,v5,v8,v2,v12 );
/* const/16 v4, 0xc8 */
/* if-lt v12, v4, :cond_2 */
/* const/16 v4, 0x12b */
/* if-gt v12, v4, :cond_2 */
/* .line 14 */
/* new-instance v4, Le/a/a/l; */
int v14 = 0; // const/4 v14, 0x0
/* .line 15 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v5 */
/* sub-long v15, v5, v9 */
/* move-object v11, v4 */
/* move-object v13, v2 */
/* move-object/from16 v17, v0 */
/* invoke-direct/range {v11 ..v17}, Le/a/a/l;-><init>(I[BZJLjava/util/List;)V */
/* .line 16 */
} // :cond_2
/* new-instance v0, Ljava/io/IOException; */
/* invoke-direct {v0}, Ljava/io/IOException;-><init>()V */
/* throw v0 */
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v7, v2 */
/* move-object v6, v3 */
/* move-object v3, v0 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v3, v0 */
/* move-object v6, v2 */
/* move-object v7, v6 */
} // :goto_2
/* move-object/from16 v2, p1 */
/* move-wide v4, v9 */
/* .line 17 */
/* invoke-static/range {v2 ..v7}, Le/a/a/c0/q;->a(Le/a/a/p;Ljava/io/IOException;JLe/a/a/c0/k;[B)Le/a/a/c0/p; */
/* .line 18 */
e.a.a.c0.q .a ( v8,v0 );
} // .end method
