public class e.b.a.y.x.g1.j implements e.b.a.y.x.g1.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.x.g1.v a;
	 public final java.io.File b;
	 public final Long c;
	 public final e.b.a.y.x.g1.g d;
	 public e.b.a.w.f e;
	 /* # direct methods */
	 public e.b.a.y.x.g1.j ( ) {
		 /* .locals 1 */
		 /* .annotation runtime Ljava/lang/Deprecated; */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Le/b/a/y/x/g1/g; */
	 /* invoke-direct {v0}, Le/b/a/y/x/g1/g;-><init>()V */
	 this.d = v0;
	 /* .line 3 */
	 this.b = p1;
	 /* .line 4 */
	 /* iput-wide p2, p0, Le/b/a/y/x/g1/j;->c:J */
	 /* .line 5 */
	 /* new-instance p1, Le/b/a/y/x/g1/v; */
	 /* invoke-direct {p1}, Le/b/a/y/x/g1/v;-><init>()V */
	 this.a = p1;
	 return;
} // .end method
public static e.b.a.y.x.g1.c a ( java.io.File p0, Long p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Le/b/a/y/x/g1/j; */
	 /* invoke-direct {v0, p0, p1, p2}, Le/b/a/y/x/g1/j;-><init>(Ljava/io/File;J)V */
} // .end method
/* # virtual methods */
public synchronized final e.b.a.w.f a ( ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
	 v0 = this.e;
	 /* if-nez v0, :cond_0 */
	 /* .line 3 */
	 v0 = this.b;
	 /* iget-wide v1, p0, Le/b/a/y/x/g1/j;->c:J */
	 int v3 = 1; // const/4 v3, 0x1
	 e.b.a.w.f .a ( v0,v3,v3,v1,v2 );
	 this.e = v0;
	 /* .line 4 */
} // :cond_0
v0 = this.e;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public java.io.File a ( Object p0 ) {
/* .locals 4 */
/* .line 5 */
v0 = this.a;
(( e.b.a.y.x.g1.v ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/x/g1/v;->b(Le/b/a/y/n;)Ljava/lang/String;
final String v1 = "DiskLruCacheWrapper"; // const-string v1, "DiskLruCacheWrapper"
int v2 = 2; // const/4 v2, 0x2
/* .line 6 */
v2 = android.util.Log .isLoggable ( v1,v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 7 */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "Get: Obtained: "; // const-string v3, "Get: Obtained: "
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = " for for Key: "; // const-string v3, " for for Key: "
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .v ( v1,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
try { // :try_start_0
	 (( e.b.a.y.x.g1.j ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/y/x/g1/j;->a()Le/b/a/w/f;
	 (( e.b.a.w.f ) v2 ).c ( v0 ); // invoke-virtual {v2, v0}, Le/b/a/w/f;->c(Ljava/lang/String;)Le/b/a/w/e;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 9 */
		 (( e.b.a.w.e ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Le/b/a/w/e;->a(I)Ljava/io/File;
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 int v2 = 5; // const/4 v2, 0x5
		 /* .line 10 */
		 v2 = 		 android.util.Log .isLoggable ( v1,v2 );
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 final String v2 = "Unable to get from disk cache"; // const-string v2, "Unable to get from disk cache"
			 /* .line 11 */
			 android.util.Log .w ( v1,v2,v0 );
		 } // :cond_1
	 } // :goto_0
} // .end method
public void a ( Object p0, Object p1 ) {
	 /* .locals 4 */
	 final String v0 = "DiskLruCacheWrapper"; // const-string v0, "DiskLruCacheWrapper"
	 /* .line 12 */
	 v1 = this.a;
	 (( e.b.a.y.x.g1.v ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Le/b/a/y/x/g1/v;->b(Le/b/a/y/n;)Ljava/lang/String;
	 /* .line 13 */
	 v2 = this.d;
	 (( e.b.a.y.x.g1.g ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/b/a/y/x/g1/g;->a(Ljava/lang/String;)V
	 int v2 = 2; // const/4 v2, 0x2
	 /* .line 14 */
	 try { // :try_start_0
		 v2 = 		 android.util.Log .isLoggable ( v0,v2 );
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 15 */
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v3 = "Put: Obtained: "; // const-string v3, "Put: Obtained: "
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v3 = " for for Key: "; // const-string v3, " for for Key: "
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .v ( v0,p1 );
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
			 /* .line 16 */
		 } // :cond_0
		 try { // :try_start_1
			 (( e.b.a.y.x.g1.j ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/y/x/g1/j;->a()Le/b/a/w/f;
			 /* .line 17 */
			 (( e.b.a.w.f ) p1 ).c ( v1 ); // invoke-virtual {p1, v1}, Le/b/a/w/f;->c(Ljava/lang/String;)Le/b/a/w/e;
			 /* :try_end_1 */
			 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
			 if ( v2 != null) { // if-eqz v2, :cond_1
				 /* .line 18 */
				 p1 = this.d;
				 (( e.b.a.y.x.g1.g ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Le/b/a/y/x/g1/g;->b(Ljava/lang/String;)V
				 return;
				 /* .line 19 */
			 } // :cond_1
			 try { // :try_start_2
				 (( e.b.a.w.f ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Le/b/a/w/f;->b(Ljava/lang/String;)Le/b/a/w/c;
				 /* :try_end_2 */
				 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
				 if ( p1 != null) { // if-eqz p1, :cond_3
					 int v2 = 0; // const/4 v2, 0x0
					 /* .line 20 */
					 try { // :try_start_3
						 (( e.b.a.w.c ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/b/a/w/c;->a(I)Ljava/io/File;
						 p2 = 						 /* .line 21 */
						 if ( p2 != null) { // if-eqz p2, :cond_2
							 /* .line 22 */
							 (( e.b.a.w.c ) p1 ).c ( ); // invoke-virtual {p1}, Le/b/a/w/c;->c()V
							 /* :try_end_3 */
							 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
							 /* .line 23 */
						 } // :cond_2
						 try { // :try_start_4
							 (( e.b.a.w.c ) p1 ).b ( ); // invoke-virtual {p1}, Le/b/a/w/c;->b()V
							 /* :catchall_0 */
							 /* move-exception p2 */
							 (( e.b.a.w.c ) p1 ).b ( ); // invoke-virtual {p1}, Le/b/a/w/c;->b()V
							 /* .line 24 */
							 /* throw p2 */
							 /* .line 25 */
						 } // :cond_3
						 /* new-instance p1, Ljava/lang/IllegalStateException; */
						 /* new-instance p2, Ljava/lang/StringBuilder; */
						 /* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
						 final String v2 = "Had two simultaneous puts for: "; // const-string v2, "Had two simultaneous puts for: "
						 (( java.lang.StringBuilder ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
						 /* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
						 /* throw p1 */
						 /* :try_end_4 */
						 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
						 /* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
						 /* :catch_0 */
						 /* move-exception p1 */
						 int p2 = 5; // const/4 p2, 0x5
						 /* .line 26 */
						 try { // :try_start_5
							 p2 = 							 android.util.Log .isLoggable ( v0,p2 );
							 if ( p2 != null) { // if-eqz p2, :cond_4
								 final String p2 = "Unable to put to disk cache"; // const-string p2, "Unable to put to disk cache"
								 /* .line 27 */
								 android.util.Log .w ( v0,p2,p1 );
								 /* :try_end_5 */
								 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
								 /* .line 28 */
							 } // :cond_4
						 } // :goto_0
						 p1 = this.d;
						 (( e.b.a.y.x.g1.g ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Le/b/a/y/x/g1/g;->b(Ljava/lang/String;)V
						 return;
						 /* :catchall_1 */
						 /* move-exception p1 */
						 p2 = this.d;
						 (( e.b.a.y.x.g1.g ) p2 ).b ( v1 ); // invoke-virtual {p2, v1}, Le/b/a/y/x/g1/g;->b(Ljava/lang/String;)V
						 /* .line 29 */
						 /* throw p1 */
					 } // .end method
