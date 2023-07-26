public class c.b.p.o.g implements c.b.q.q1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.p.o.i b; //synthetic
	 /* # direct methods */
	 public c.b.p.o.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, android.view.MenuItem p1 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = this.h;
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.os.Handler ) v0 ).removeCallbacksAndMessages ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
		 /* .line 2 */
		 v0 = this.b;
		 v0 = 		 v0 = this.j;
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 int v3 = -1; // const/4 v3, -0x1
	 /* if-ge v2, v0, :cond_1 */
	 /* .line 3 */
	 v4 = this.b;
	 v4 = this.j;
	 /* check-cast v4, Lc/b/p/o/h; */
	 v4 = this.b;
	 /* if-ne p1, v4, :cond_0 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int v2 = -1; // const/4 v2, -0x1
} // :goto_1
/* if-ne v2, v3, :cond_2 */
return;
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
/* .line 4 */
v0 = this.b;
v0 = v0 = this.j;
/* if-ge v2, v0, :cond_3 */
/* .line 5 */
v0 = this.b;
v0 = this.j;
/* move-object v1, v0 */
/* check-cast v1, Lc/b/p/o/h; */
/* .line 6 */
} // :cond_3
/* new-instance v0, Lc/b/p/o/f; */
/* invoke-direct {v0, p0, v1, p2, p1}, Lc/b/p/o/f;-><init>(Lc/b/p/o/g;Lc/b/p/o/h;Landroid/view/MenuItem;Lc/b/p/o/m;)V */
/* .line 7 */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v1 */
/* const-wide/16 v3, 0xc8 */
/* add-long/2addr v1, v3 */
/* .line 8 */
p2 = this.b;
p2 = this.h;
(( android.os.Handler ) p2 ).postAtTime ( v0, p1, v1, v2 ); // invoke-virtual {p2, v0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z
return;
} // .end method
public void b ( Object p0, android.view.MenuItem p1 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.b;
p2 = this.h;
(( android.os.Handler ) p2 ).removeCallbacksAndMessages ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
return;
} // .end method
