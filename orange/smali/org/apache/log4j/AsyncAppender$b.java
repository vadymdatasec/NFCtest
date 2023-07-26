public class org.apache.log4j.AsyncAppender$b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/AsyncAppender; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # instance fields */
public final org.apache.log4j.AsyncAppender b;
public final java.util.List c;
public final java.util.Map d;
public final org.apache.log4j.helpers.AppenderAttachableImpl e;
/* # direct methods */
public org.apache.log4j.AsyncAppender$b ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
this.c = p2;
/* .line 4 */
this.e = p4;
/* .line 5 */
this.d = p3;
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 8 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_4
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
try { // :try_start_0
	 v2 = this.c;
	 /* monitor-enter v2 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 2 */
	 try { // :try_start_1
		 v3 = 		 v3 = this.c;
		 /* .line 3 */
		 v4 = this.b;
		 /* iget-boolean v4, v4, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
	 } // :goto_1
	 /* xor-int/2addr v4, v0 */
	 /* if-nez v3, :cond_0 */
	 if ( v4 != null) { // if-eqz v4, :cond_0
		 /* .line 4 */
		 v3 = this.c;
		 (( java.lang.Object ) v3 ).wait ( ); // invoke-virtual {v3}, Ljava/lang/Object;->wait()V
		 /* .line 5 */
		 v3 = 		 v3 = this.c;
		 /* .line 6 */
		 v4 = this.b;
		 /* iget-boolean v4, v4, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
	 } // :cond_0
	 /* if-lez v3, :cond_2 */
	 /* .line 7 */
	 v1 = 	 v1 = this.d;
	 /* add-int/2addr v1, v3 */
	 /* new-array v1, v1, [Lorg/apache/log4j/spi/LoggingEvent; */
	 /* .line 8 */
	 v5 = this.c;
	 /* .line 9 */
	 v5 = this.d;
	 /* .line 10 */
v6 = } // :goto_2
if ( v6 != null) { // if-eqz v6, :cond_1
	 /* add-int/lit8 v6, v3, 0x1 */
	 /* .line 11 */
	 /* check-cast v7, Lorg/apache/log4j/AsyncAppender$a; */
	 (( org.apache.log4j.AsyncAppender$a ) v7 ).a ( ); // invoke-virtual {v7}, Lorg/apache/log4j/AsyncAppender$a;->a()Lorg/apache/log4j/spi/LoggingEvent;
	 /* aput-object v7, v1, v3 */
	 /* move v3, v6 */
	 /* .line 12 */
} // :cond_1
v3 = this.c;
/* .line 13 */
v3 = this.d;
/* .line 14 */
v3 = this.c;
(( java.lang.Object ) v3 ).notifyAll ( ); // invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V
/* .line 15 */
} // :cond_2
/* monitor-exit v2 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
if ( v1 != null) { // if-eqz v1, :cond_3
int v2 = 0; // const/4 v2, 0x0
/* .line 16 */
} // :goto_3
try { // :try_start_2
/* array-length v3, v1 */
/* if-ge v2, v3, :cond_3 */
/* .line 17 */
v3 = this.e;
/* monitor-enter v3 */
/* :try_end_2 */
/* .catch Ljava/lang/InterruptedException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 18 */
try { // :try_start_3
	 v5 = this.e;
	 /* aget-object v6, v1, v2 */
	 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v5 ).appendLoopOnAppenders ( v6 ); // invoke-virtual {v5, v6}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->appendLoopOnAppenders(Lorg/apache/log4j/spi/LoggingEvent;)I
	 /* .line 19 */
	 /* monitor-exit v3 */
	 /* add-int/lit8 v2, v2, 0x1 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v3 */
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 try { // :try_start_4
		 /* throw v0 */
		 /* :try_end_4 */
		 /* .catch Ljava/lang/InterruptedException; {:try_start_4 ..:try_end_4} :catch_0 */
	 } // :cond_3
	 /* move v1, v4 */
	 /* :catchall_1 */
	 /* move-exception v0 */
	 /* .line 20 */
	 try { // :try_start_5
		 /* monitor-exit v2 */
		 /* :try_end_5 */
		 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
		 try { // :try_start_6
			 /* throw v0 */
			 /* :try_end_6 */
			 /* .catch Ljava/lang/InterruptedException; {:try_start_6 ..:try_end_6} :catch_0 */
			 /* .line 21 */
			 /* :catch_0 */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
		 } // :cond_4
		 return;
	 } // .end method
