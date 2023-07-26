public class m.a.b.h.q implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final m.a.b.h.r b; //synthetic
	 /* # direct methods */
	 public m.a.b.h.q ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public m.a.b.h.q ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1}, Lm/a/b/h/q;-><init>(Lm/a/b/h/r;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 8 */
	 } // :goto_0
	 /* const-wide/16 v0, 0x3e8 */
	 /* .line 1 */
	 try { // :try_start_0
		 java.lang.Thread .sleep ( v0,v1 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 2 */
		 /* :catch_0 */
		 v0 = this.b;
		 m.a.b.h.r .a ( v0 );
		 /* monitor-enter v0 */
		 /* .line 3 */
		 try { // :try_start_1
			 v1 = this.b;
			 v1 = 			 m.a.b.h.r .b ( v1 );
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 4 */
				 /* monitor-exit v0 */
				 /* .line 5 */
			 } // :cond_0
			 v1 = this.b;
			 m.a.b.h.r .c ( v1 );
			 int v2 = 0; // const/4 v2, 0x0
			 int v3 = 1; // const/4 v3, 0x1
			 int v4 = 0; // const/4 v4, 0x0
			 int v5 = 1; // const/4 v5, 0x1
			 /* .line 6 */
		 v6 = 		 } // :goto_1
		 if ( v6 != null) { // if-eqz v6, :cond_4
			 /* .line 7 */
			 /* check-cast v6, Lm/a/b/h/j; */
			 /* .line 8 */
			 v7 = this.b;
			 m.a.b.h.r .d ( v7 );
			 if ( v5 != null) { // if-eqz v5, :cond_1
				 /* .line 9 */
				 v5 = this.b;
				 m.a.b.h.r .d ( v5 );
				 /* if-ne v6, v5, :cond_1 */
				 int v5 = 1; // const/4 v5, 0x1
			 } // :cond_1
			 int v5 = 0; // const/4 v5, 0x0
		 } // :goto_2
		 /* if-nez v4, :cond_3 */
		 /* .line 10 */
		 v4 = this.b;
		 v4 = 		 m.a.b.h.r .a ( v4,v6 );
		 if ( v4 != null) { // if-eqz v4, :cond_2
		 } // :cond_2
		 int v4 = 0; // const/4 v4, 0x0
	 } // :cond_3
} // :goto_3
int v4 = 1; // const/4 v4, 0x1
/* .line 11 */
} // :cond_4
v1 = this.b;
m.a.b.h.r .c ( v1 );
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 12 */
v1 = this.b;
m.a.b.h.r .a ( v1,v5 );
/* .line 13 */
} // :cond_5
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v1 */
} // .end method
