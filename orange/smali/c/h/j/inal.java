public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public c.h.j.b b;
	 public java.lang.Object c;
	 public Boolean d;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* monitor-enter p0 */
		 /* .line 2 */
		 try { // :try_start_0
			 /* iget-boolean v0, p0, Lc/h/j/c;->a:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
				 /* monitor-exit p0 */
				 return;
			 } // :cond_0
			 int v0 = 1; // const/4 v0, 0x1
			 /* .line 4 */
			 /* iput-boolean v0, p0, Lc/h/j/c;->a:Z */
			 /* .line 5 */
			 /* iput-boolean v0, p0, Lc/h/j/c;->d:Z */
			 /* .line 6 */
			 v0 = this.b;
			 /* .line 7 */
			 v1 = this.c;
			 /* .line 8 */
			 /* monitor-exit p0 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_3 */
			 int v2 = 0; // const/4 v2, 0x0
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 9 */
				 try { // :try_start_1
					 /* :catchall_0 */
					 /* move-exception v0 */
				 } // :cond_1
			 } // :goto_0
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 /* .line 10 */
				 /* const/16 v3, 0x10 */
				 /* if-lt v0, v3, :cond_2 */
				 /* .line 11 */
				 /* check-cast v1, Landroid/os/CancellationSignal; */
				 (( android.os.CancellationSignal ) v1 ).cancel ( ); // invoke-virtual {v1}, Landroid/os/CancellationSignal;->cancel()V
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* .line 12 */
			 } // :goto_1
			 /* monitor-enter p0 */
			 /* .line 13 */
			 try { // :try_start_2
				 /* iput-boolean v2, p0, Lc/h/j/c;->d:Z */
				 /* .line 14 */
				 (( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
				 /* .line 15 */
				 /* monitor-exit p0 */
				 /* :try_end_2 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
				 /* .line 16 */
				 /* throw v0 */
				 /* :catchall_1 */
				 /* move-exception v0 */
				 /* .line 17 */
				 try { // :try_start_3
					 /* monitor-exit p0 */
					 /* :try_end_3 */
					 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
					 /* throw v0 */
					 /* .line 18 */
				 } // :cond_2
			 } // :goto_2
			 /* monitor-enter p0 */
			 /* .line 19 */
			 try { // :try_start_4
				 /* iput-boolean v2, p0, Lc/h/j/c;->d:Z */
				 /* .line 20 */
				 (( java.lang.Object ) p0 ).notifyAll ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
				 /* .line 21 */
				 /* monitor-exit p0 */
				 return;
				 /* :catchall_2 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* :try_end_4 */
				 /* .catchall {:try_start_4 ..:try_end_4} :catchall_2 */
				 /* throw v0 */
				 /* :catchall_3 */
				 /* move-exception v0 */
				 /* .line 22 */
				 try { // :try_start_5
					 /* monitor-exit p0 */
					 /* :try_end_5 */
					 /* .catchall {:try_start_5 ..:try_end_5} :catchall_3 */
					 /* throw v0 */
				 } // .end method
				 public void a ( Object p0 ) {
					 /* .locals 1 */
					 /* .line 23 */
					 /* monitor-enter p0 */
					 /* .line 24 */
					 try { // :try_start_0
						 (( c.h.j.c ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/j/c;->c()V
						 /* .line 25 */
						 v0 = this.b;
						 /* if-ne v0, p1, :cond_0 */
						 /* .line 26 */
						 /* monitor-exit p0 */
						 return;
						 /* .line 27 */
					 } // :cond_0
					 this.b = p1;
					 /* .line 28 */
					 /* iget-boolean v0, p0, Lc/h/j/c;->a:Z */
					 if ( v0 != null) { // if-eqz v0, :cond_2
						 /* if-nez p1, :cond_1 */
						 /* .line 29 */
					 } // :cond_1
					 /* monitor-exit p0 */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 30 */
					 return;
					 /* .line 31 */
				 } // :cond_2
			 } // :goto_0
			 try { // :try_start_1
				 /* monitor-exit p0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception p1 */
				 /* .line 32 */
				 /* monitor-exit p0 */
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* throw p1 */
			 } // .end method
			 public Boolean b ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 /* monitor-enter p0 */
				 /* .line 2 */
				 try { // :try_start_0
					 /* iget-boolean v0, p0, Lc/h/j/c;->a:Z */
					 /* monitor-exit p0 */
					 /* :catchall_0 */
					 /* move-exception v0 */
					 /* .line 3 */
					 /* monitor-exit p0 */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* throw v0 */
				 } // .end method
				 public final void c ( ) {
					 /* .locals 1 */
					 /* .line 1 */
				 } // :goto_0
				 /* iget-boolean v0, p0, Lc/h/j/c;->d:Z */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 2 */
					 try { // :try_start_0
						 (( java.lang.Object ) p0 ).wait ( ); // invoke-virtual {p0}, Ljava/lang/Object;->wait()V
						 /* :try_end_0 */
						 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
						 /* :catch_0 */
						 /* nop */
					 } // :cond_0
					 return;
				 } // .end method
